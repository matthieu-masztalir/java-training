package com.training.java.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class StreamExampleTest {
    private StreamExample streamExample;

    @BeforeEach
    void setUp() {
        streamExample = new StreamExample();
    }

    @Test
    void useTakeWhile() {
        // When
        final List<Integer> result = streamExample.useTakeWhile();

        // Then
        // Result : 1, 2, 4
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals(Arrays.asList(2, 2, 4), result);
    }

    @Test
    void useDropWhile() {
        // When
        final List<Integer> result = streamExample.useDropWhile();

        // Then
        // Result : 1, 3
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(Arrays.asList(1, 3), result);
    }

    @Test
    void useIterate() {
        // When
        final List<Integer> result = streamExample.useIterate();

        // Then
        Assertions.assertEquals(Arrays.asList(0, 1), result);
    }

    @Test
    void useOfNullable_withEmptyOptional() {
        // When
        final List<Integer> result = streamExample.useOfNullable(Optional.empty());

        // Then
        Assertions.assertEquals(0, result.size());
    }

    @Test
    void useOfNullable_withOptionalValuePresent() {
        // When
        final List<Integer> result = streamExample.useOfNullable(Optional.of(1));

        // Then
        Assertions.assertEquals(List.of(1), result);
    }
}