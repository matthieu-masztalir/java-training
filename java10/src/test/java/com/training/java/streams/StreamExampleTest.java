package com.training.java.streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleTest {
    @Test
    void useToModifiableList() {
        List<String> alpha = List.of("e4", "e5");

        List<String> alphaCopy = alpha.stream()
                .collect(Collectors.toUnmodifiableList());

        Assertions.assertThrows(UnsupportedOperationException.class, () -> alphaCopy.add("Kf3"));
    }
}
