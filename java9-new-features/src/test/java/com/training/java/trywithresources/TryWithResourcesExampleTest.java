package com.training.java.trywithresources;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class TryWithResourcesExampleTest {
    private TryWithResourcesExample tryWithResourcesExample;

    @BeforeEach
    void setUp() {
        tryWithResourcesExample = new TryWithResourcesExample();
    }

    @Test
    void readMessage() throws IOException {
        // When
        final String message = tryWithResourcesExample.readMessage("Hello world");

        // Then
        Assertions.assertEquals("Hello world", message);
    }
}