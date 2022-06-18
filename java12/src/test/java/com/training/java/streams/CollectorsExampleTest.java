package com.training.java.streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExampleTest {
    @Test
    void useTeeing() {
        double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(Collectors.summingDouble(value -> value),
                        Collectors.counting(), (sum, count) -> sum / count));

        Assertions.assertEquals(3.0, mean);
    }
}
