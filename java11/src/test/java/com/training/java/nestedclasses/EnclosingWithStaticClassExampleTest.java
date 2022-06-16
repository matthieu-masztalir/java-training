package com.training.java.nestedclasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Define a static nested classe
 */
class EnclosingWithStaticClassExampleTest {

    @Test
    void useStaticNestedClasse() {
        EnclosingWithStaticClassExample.StaticNested staticNested = new EnclosingWithStaticClassExample.StaticNested();

        Assertions.assertEquals("Hello world default", staticNested.sayHello());
    }
}