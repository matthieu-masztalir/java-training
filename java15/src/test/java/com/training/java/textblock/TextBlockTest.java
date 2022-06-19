package com.training.java.textblock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextBlockTest {
    @Test
    void useTextBlock() {
        final String multilines = """
                It's a multilines \
                introduce in Java 15
                    """;

        Assertions.assertTrue(multilines.length() > 0);
        Assertions.assertTrue(multilines.startsWith("It's"));
    }
}
