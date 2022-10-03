package com.training.java.switchpatternmatching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwitchExampleTest {
    private SwitchExample switchExample;

    @BeforeEach
    void setUp() {
        switchExample = new SwitchExample();
    }

    @Test
    void shouldReturnMessageTriangle_whenUseConditionInCase() {
        final String joke = "Yes of course. My name's Triangle and i have three sides";
        Assertions.assertEquals(joke, switchExample.useConditionInCase(new Triangle()));
    }

    @Test
    void shouldReturnOtherShape_whenUseConditionWhenInCase() {
        final var message = "It's an other shape";
        Assertions.assertEquals(message, switchExample.useConditionInCase(new Rectangle()));
    }

    @Test
    void shouldReturnOtherShape_whenUseTriangleSpecialShape() {
        final var message = "It's an other shape";
        Assertions.assertEquals(message, switchExample.useConditionInCase(new TriangleSpecialShape()));
    }
}