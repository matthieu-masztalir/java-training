package com.training.java.optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class OptionalExampleTest {
    @Test
    void useOrElseThrow() {
        // Given
        final List<Integer> oddEvenList = Arrays.asList(2, 3, 5);

        // When
        final Integer firstOddEven = oddEvenList.stream()
                .filter(oddeven -> oddeven % 2 == 0)
                .findFirst()
                .orElseThrow();

        // Then
        Assertions.assertEquals(2, firstOddEven);
    }
}
