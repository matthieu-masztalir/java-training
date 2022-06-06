package com.training.java.datetime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class LocalDateTimeExampleTest {
    private LocalDateTimeExample localDateTimeExample;

    @BeforeEach
    void setUp() {
        localDateTimeExample = new LocalDateTimeExample();
    }

    @Test
    void addOneHour() {
        // Given
        final LocalDateTime localDateTime = LocalDateTime.of(2022, 5, 1, 2, 0);

        // When
        final LocalDateTime localDateTimePlusDays = localDateTimeExample.addOneDay(localDateTime);

        // Then
        final LocalDateTime localDateTimeExpected = LocalDateTime.of(2022, 5, 2, 2, 0);
        Assertions.assertEquals(localDateTimeExpected, localDateTimePlusDays);
    }
}