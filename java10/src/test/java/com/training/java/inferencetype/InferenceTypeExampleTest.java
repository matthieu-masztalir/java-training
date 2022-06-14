package com.training.java.inferencetype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InferenceTypeExampleTest {

    @Test
    void useInferenceType() {
        var message = "Hello world";
        Assertions.assertTrue(message instanceof String);
    }

    @Test
    void useAnonymClass() {
        var obj = new Object() {
        };
        Assertions.assertNotEquals(Object.class, obj.getClass());
    }
}