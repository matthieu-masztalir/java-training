package com.training.java.diamond;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiamondOperatorExampleTest {
    private DiamondOperatorExample diamondOperatorExample;

    @BeforeEach
    void setUp() {
        diamondOperatorExample = new DiamondOperatorExample();
    }

    @Test
    void useDiamondWithInnerClass() {
        // When
        final DiamondOperatorExample.Referentiel<String> referentiel =
                diamondOperatorExample.useDiamondWithInnerClass();

        // Then
        Assertions.assertEquals("Hello world :)", referentiel.format());
    }

}