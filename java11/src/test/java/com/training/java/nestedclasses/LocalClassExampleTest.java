package com.training.java.nestedclasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LocalClassExampleTest {
    @Test
    void useLocalClass() {
        final LocalClassExample localClassExample = new LocalClassExample();
        Assertions.assertEquals("Hello world", localClassExample.sayHello());
    }
}