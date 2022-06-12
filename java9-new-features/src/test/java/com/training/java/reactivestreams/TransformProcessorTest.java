package com.training.java.reactivestreams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

class TransformProcessorTest {
    @Test
    void useTransformProcessor() throws InterruptedException {
        // Given
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        TransformProcessor<String, Integer> transformProcessor =
                new TransformProcessor<>(Integer::parseInt);
        EndSubscriber<Integer> subscriber = new EndSubscriber<>();

        List<String> items = List.of("1", "2", "3");

        // When
        publisher.subscribe(transformProcessor);
        transformProcessor.subscribe(subscriber);
        items.forEach(publisher::submit);
        publisher.close();

        do {
            // wait for subscribers to complete all processing.
            Thread.sleep(100);
        } while (!subscriber.isCompleted());

        // Then
        final List<Integer> expectedResult = List.of(1, 2, 3);
        Assertions.assertEquals(expectedResult, subscriber.getConsumeElements());
    }
}