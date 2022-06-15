package com.training.java.predicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExampleTest {
    @Test
    void useNotPredicate() {
        // Given
        final List<String> words = Arrays.asList("e4", "e5", "\n \n");

        // When
        final List<String> collectNotBlankWords = words.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());

        // Then
        Assertions.assertEquals(Arrays.asList("e4", "e5"), collectNotBlankWords);
    }
}
