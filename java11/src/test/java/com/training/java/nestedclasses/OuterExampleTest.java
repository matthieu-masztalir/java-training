package com.training.java.nestedclasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

class OuterExampleTest {
    @Test
    void useReflection() throws NoSuchMethodException {
        // Given
        final OuterExample outerExample = new OuterExample();
        final Method method = outerExample.getClass().getDeclaredMethod("outerPrivate");

        // When
        Assertions.assertThrows(IllegalAccessException.class, () -> method.invoke(outerExample));
    }
}