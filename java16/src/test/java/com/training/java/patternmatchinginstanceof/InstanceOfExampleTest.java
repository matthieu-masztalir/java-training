package com.training.java.patternmatchinginstanceof;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InstanceOfExampleTest {
    @Test
    void usePatternMatchingWithInstanceOf() {
        Object obj = "TEST";
        if (obj instanceof String str) {
            Assertions.assertEquals("TEST", str);
        }
    }
}
