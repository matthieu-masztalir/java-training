package com.training.java.optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class OptionalExampleTest {
    @Test
    void useOptionalOr_shouldReturnOptionalValue_whenValueIsPresent() {
        // Given
        final String expected = "properValue";
        Optional<String> valuePossible = Optional.of(expected);
        Optional<String> defaultValuePossible = Optional.of("default");

        // When
        Optional<String> result = valuePossible.or(() -> defaultValuePossible);

        // Then
        Assertions.assertEquals(expected, result.get());
    }

    @Test
    void useOptionalOr_shouldReturnOptionalEmpty_whenValueIsEmpty() {
        // Given
        final String defaultValue = "default";
        Optional<String> valuePossible = Optional.empty();
        Optional<String> defaultValuePossible = Optional.of(defaultValue);

        // When
        Optional<String> result = valuePossible.or(() -> defaultValuePossible);

        // Then
        Assertions.assertEquals(defaultValue, result.get());
    }

    @Test
    void useOptionalIfPresentOrElse_shouldReturnOptionalValue_whenValueIsPresent() {
        // Given
        Optional<String> value = Optional.of("properValue");
        AtomicInteger successCounter = new AtomicInteger(0);
        AtomicInteger emptyOptionalCounter = new AtomicInteger(0);

        // When
        value.ifPresentOrElse(v -> successCounter.incrementAndGet(), emptyOptionalCounter::incrementAndGet);

        // Then
        Assertions.assertEquals(1, successCounter.get());
        Assertions.assertEquals(0, emptyOptionalCounter.get());
    }

    @Test
    void useOptionalIfPresentOrElse_shouldReturnCallback_whenValueIsEmpty() {
        // Given
        Optional<String> value = Optional.empty();
        AtomicInteger successCounter = new AtomicInteger(0);
        AtomicInteger emptyOptionalCounter = new AtomicInteger(0);

        // When
        value.ifPresentOrElse(v -> successCounter.incrementAndGet(), emptyOptionalCounter::incrementAndGet);

        // Then
        Assertions.assertEquals(1, emptyOptionalCounter.get());
        Assertions.assertEquals(0, successCounter.get());
    }

    @Test
    void useOptionalStreamToApplyFunction() {
        // Given
        final Optional<String> valuePossible = Optional.of("a");

        // When
        List<String> collectOptionalValues = valuePossible.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Then
        Assertions.assertEquals(List.of("A"), collectOptionalValues);
    }
}
