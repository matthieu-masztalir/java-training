package com.training.java.datetime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class DurationExampleTest {
    private DurationExample durationExample;

    @BeforeEach
    void setUp() {
        durationExample = new DurationExample();
    }

    @Test
    void addSecond() {
        final LocalTime localTime = LocalTime.of(1, 10, 0);

        // When
        final LocalTime localTimeResult = durationExample.addSecond(localTime);

        // Then
        final LocalTime localTimeExpected = LocalTime.of(1, 10, 30);

        Assertions.assertEquals(localTimeExpected, localTimeResult);
    }

    @Test
    void betweenTwoTimesWithChronoUnit() {
        // Given
        final LocalTime initialTime = LocalTime.of(6, 30);
        final LocalTime finalTime = initialTime.plus(30, ChronoUnit.SECONDS);

        // When
        final long secondsBetween = durationExample.betweenTwoDays(initialTime, finalTime, ChronoUnit.SECONDS);

        // Then
        Assertions.assertEquals(30, secondsBetween);
    }
}