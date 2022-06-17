package com.training.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringExampleTest {
    @Test
    void shouldIndentStringWithPositiveNumberLeading() {
        // Given
        final String message = "Hello world";

        // When
        final String messageIndent = message.indent(2);

        // Then
        Assertions.assertEquals("  Hello world\n", messageIndent);
    }

    @Test
    void shouldIndentStringWithNegativeNumberLeading() {
        // Given
        final String message = "  Hello world";

        // When
        final String messageIndent = message.indent(-2);

        // Then
        Assertions.assertEquals("Hello world\n", messageIndent);
    }

    /**
     * Affect only whitespaces, not characters
     */
    @Test
    void shouldIndentStringWithNumberLeadingGreatherThanNumberOfSpaces() {
        // Given
        final String message = "  Hello world";

        // When
        final String messageIndent = message.indent(-10);

        // Then
        Assertions.assertEquals("Hello world\n", messageIndent);
    }

    @Test
    void shouldTransformString() {
        // Given
        final String message = "5c,4e";

        // When
        final String messageTransformed = message.transform(s ->
                new StringBuilder(s).reverse().toString()
        );

        // Then
        Assertions.assertEquals("e4,c5", messageTransformed);
    }
}
