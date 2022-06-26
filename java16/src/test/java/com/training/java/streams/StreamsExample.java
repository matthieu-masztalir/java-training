package com.training.java.streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    @Test
    void useStreamsToList() {
        final List<String> ages = Arrays.asList("1", "2", "3");

        // When Then
        final List<Integer> agesOldString = ages.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Assertions.assertIterableEquals(Arrays.asList(1, 2, 3), agesOldString);

        // When Then
        final List<Integer> agesString = ages.stream()
                .map(Integer::parseInt)
                .toList();

        Assertions.assertIterableEquals(Arrays.asList(1, 2, 3), agesString);
    }
}
