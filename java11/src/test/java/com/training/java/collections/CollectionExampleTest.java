package com.training.java.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CollectionExampleTest {

    @Test
    void useToArray() {
        // Given
        final List<String> words = Arrays.asList("Hello", "world");

        // When
        final String[] wordsArr = words.toArray(String[]::new);

        // Then
        final String[] expected = {"Hello", "world"};
        Assertions.assertArrayEquals(expected, wordsArr);
    }
}
