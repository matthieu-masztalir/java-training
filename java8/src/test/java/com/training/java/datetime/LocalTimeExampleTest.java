package com.training.java.datetime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

class LocalTimeExampleTest {

    private LocalTimeExample localTimeExample;

    @BeforeEach
    void setUp() {
        localTimeExample = new LocalTimeExample();
    }

    @Test
    void addOneHour() {
        // Given
        final LocalTime localTime = LocalTime.of(6, 30);

        // When Then
        Assertions.assertEquals(LocalTime.of(7, 30), localTimeExample.addOneHour(localTime));
    }

    @Test
    void isBefore() {
        // Given
        final LocalTime firstTime = LocalTime.now();
        final LocalTime secondTime = firstTime.plusHours(1);

        // When Then
        Assertions.assertTrue(localTimeExample.isBefore(firstTime, secondTime));
    }

    @Test
    void isAfter() {
        // Given
        final LocalTime firstTime = LocalTime.now();
        final LocalTime secondTime = firstTime.plusHours(1);

        // When Then
        Assertions.assertTrue(localTimeExample.isAfter(secondTime, firstTime));
    }
}