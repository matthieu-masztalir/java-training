package com.training.java.nestedclasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnonymousAbstractClassExampleTest {
    @Test
    void useAnonymousClass() {
        AnonymousAbstractClassExample anonymousAbstractClassExample = new AnonymousAbstractClassExample() {
            @Override
            String sayHello() {
                return "Hello world";
            }
        };

        Assertions.assertEquals("Hello world", anonymousAbstractClassExample.sayHello());
    }
}