package com.training.java.datetime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class LocalDateExampleTest {
    private LocalDateExample localDateExample;

    @BeforeEach
    void setUp() {
        localDateExample = new LocalDateExample();
    }

    @Test
    void getTomorrow() {
        final LocalDate tomorrow = localDateExample.getTomorrow(LocalDate.of(2022, 5, 1));
        Assertions.assertEquals(LocalDate.of(2022, 5, 2), tomorrow);
    }

    @Test
    void getPreviousDate() {
        final LocalDate previousMonth = localDateExample.getPreviousMonth(LocalDate.of(2022, 5, 1));
        Assertions.assertEquals(LocalDate.of(2022, 4, 1), previousMonth);
    }

    @Test
    void isBefore() {
        // Given
        final LocalDate firstDate = LocalDate.now();
        final LocalDate secondDate = firstDate.plusMonths(1);

        // When Then
        Assertions.assertTrue(localDateExample.isBefore(firstDate, secondDate));
    }

    @Test
    void isAfter() {
        // Given
        final LocalDate firstDate = LocalDate.now();
        final LocalDate secondDate = firstDate.plusMonths(1);

        // When Then
        Assertions.assertTrue(localDateExample.isAfter(secondDate, firstDate));
    }

    @Test
    void getFirstDayOfMonth() {
        // Given
        final LocalDate localDate = LocalDate.of(2022, 5, 15);

        // When Then
        Assertions.assertEquals(LocalDate.of(2022, 5, 1), localDateExample.getFirstDayOfMonth(localDate));
    }
}