package com.training.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringExample {
    @Test
    void useIsBlankEmpty() {
        Assertions.assertTrue("".isBlank());
    }

    /**
     * Implementation of isBlank method removes all whitespaces
     */
    @Test
    void useIsBlankWithWhitespaces() {
        Assertions.assertTrue(" ".isBlank());
    }

    @Test
    void useLines() {
        // Given
        final String multilines = "Hello \n World";

        // When
        final List<String> collectMultilines = multilines.lines()
                .collect(Collectors.toList());

        // Then
        Assertions.assertEquals(2, collectMultilines.size());
    }

    @Test
    void useStripLeadingWhitespace() {
        Assertions.assertEquals("abc", " abc".strip());
    }

    @Test
    void useStripTrailingWhitespace() {
        Assertions.assertEquals("abc", "abc ".strip());
    }

    @Test
    void useStrip() {
        Assertions.assertEquals("a b c", "a b c".strip());
    }

    @Test
    void useStripLeading() {
        Assertions.assertEquals("abc", " abc".stripLeading());
    }

    @Test
    void useStripTrailing() {
        Assertions.assertEquals("abc", "abc ".stripTrailing());
    }

    @Test
    void useRepeat() {
        Assertions.assertEquals("0000", "0".repeat(4));
    }

    @Test
    void useNewFeatureString() {
        // Given
        final String multilines = "Hello world \n developers !";

        // When
        List<String> collectMultilines = multilines.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());

        // Then
        Assertions.assertEquals(2, collectMultilines.size());
        Assertions.assertEquals(Arrays.asList("Hello world", "developers !"), collectMultilines);
    }
}
