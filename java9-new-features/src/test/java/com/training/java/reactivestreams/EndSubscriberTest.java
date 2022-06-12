package com.training.java.reactivestreams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

class EndSubscriberTest {
    @Test
    void whenSubscribeToIt_thenShouldConsumeAll() throws InterruptedException {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        EndSubscriber<String> subscriber = new EndSubscriber<>();
        publisher.subscribe(subscriber);

        List<String> items = List.of("1", "x", "2", "x", "3", "x");

        // When
        Assertions.assertEquals(1, publisher.getNumberOfSubscribers());
        items.forEach(publisher::submit);
        publisher.close();

        do {
            // wait for subscribers to complete all processing.
            Thread.sleep(100);
        } while (!subscriber.isCompleted());

        // Then
        Assertions.assertEquals(6, subscriber.getConsumeElements().size());
    }
}