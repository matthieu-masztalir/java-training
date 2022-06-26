package com.training.java.sealedclasses;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SealedClassesExampleTest {
    private SealedClassesExample sealedClassesExample;

    @BeforeEach
    void setUp() {
        sealedClassesExample = new SealedClassesExample();
    }

    @Test
    void shouldReturnSidesOfCircle() {
        Assertions.assertEquals(0, sealedClassesExample.getSides(new Circle()));
    }

    @Test
    void shouldReturnSidesOfRectangle() {
        Assertions.assertEquals(4, sealedClassesExample.getSides(new Rectangle()));
    }

    @Test
    void shouldReturnSidesOfTriangle() {
        Assertions.assertEquals(3, sealedClassesExample.getSides(new Triangle()));
    }
}