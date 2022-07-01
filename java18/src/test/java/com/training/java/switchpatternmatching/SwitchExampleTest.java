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
    void shouldReturnSidesOfRectangle() {
        Assertions.assertEquals(4, switchExample.usePatterMatching(new Rectangle()));
    }

    @Test
    void shouldReturnSidesOfTriangle() {
        Assertions.assertEquals(3, switchExample.usePatterMatching(new Triangle()));
    }

    @Test
    void shouldReturnDefaultValue_whenShapeIsNull() {
        Assertions.assertEquals(-1, switchExample.usePatterMatching(null));
    }

    @Test
    void useConditionInCase() {
        final String joke = "Yes of course. My name's Triangle and i have three sides";
        Assertions.assertEquals(joke, switchExample.useConditionInCase(new Triangle()));
    }

    @Test
    void shouldReturnNegativeSide_whenUsePatternMatchingWithDominanceType() {
        Assertions.assertEquals(-1, switchExample.usePatterMatchingWithDominanceType(null));

    }

    @Test
    void shouldReturnSideOfRectangle_whenUsePatterMatchingWithDominanceType() {
        Assertions.assertEquals(4, switchExample.usePatterMatchingWithDominanceType(new Rectangle()));
    }

    @Test
    void shouldReturnSideOfTriangle_whenUsePatterMatchingWithDominanceType() {
        Assertions.assertEquals(3, switchExample.usePatterMatchingWithDominanceType(new Triangle()));
    }
}