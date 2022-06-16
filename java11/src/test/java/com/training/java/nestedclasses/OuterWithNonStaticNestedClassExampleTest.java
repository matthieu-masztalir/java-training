package com.training.java.nestedclasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OuterWithNonStaticNestedClassExampleTest {
    @Test
    void useNonStaticNestedClass() {
        // Given
        final OuterWithNonStaticNestedClassExample outerClass = new OuterWithNonStaticNestedClassExample();
        final OuterWithNonStaticNestedClassExample.Inner inner = outerClass.new Inner();

        // When Then
        Assertions.assertEquals("Hello world", inner.sayHello());
    }
}