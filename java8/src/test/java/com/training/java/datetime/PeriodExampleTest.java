package com.training.java.datetime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class PeriodExampleTest {
    private PeriodExample periodExample;

    @BeforeEach
    void setUp() {
        periodExample = new PeriodExample();
    }

    @Test
    void betweenTwoDays() {
        // Given
        final LocalDate pastDate = LocalDate.now();
        final LocalDate futurDate = LocalDate.now().minusDays(2);

        // When
        final int daysBetween = periodExample.betweenTwoDays(futurDate, pastDate);

        // Then
        Assertions.assertEquals(2, daysBetween);
    }

    @Test
    void addDays() {
        // Given
        final LocalDate initialDate = LocalDate.now();

        // When
        final LocalDate localDateFuture = periodExample.addDays(initialDate, 5);

        // Then
        Assertions.assertEquals(initialDate.plusDays(5), localDateFuture);
    }

    @Test
    void betweenTwoDaysWithChronoUnit() {
        // Given
        final LocalDate pastDate = LocalDate.now();
        final LocalDate futurDate = LocalDate.now().minusDays(2);

        // When
        final long daysBetween = periodExample.betweenTwoDays(futurDate, pastDate, ChronoUnit.DAYS);

        // Then
        Assertions.assertEquals(2, daysBetween);
    }
}