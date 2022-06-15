package com.training.java.lamdas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasExampleTest {
    @Test
    void useVarLocalVariable() {
        // Given
        final List<String> words = Arrays.asList("e4", "e5");

        // When
        final List<String> collectWords = words.stream()
                .map((var word) -> word.toUpperCase())
                .collect(Collectors.toList());

        // Then
        Assertions.assertEquals(Arrays.asList("E4", "E5"), collectWords);
    }
}
