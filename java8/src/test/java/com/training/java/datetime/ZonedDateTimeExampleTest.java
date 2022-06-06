package com.training.java.datetime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Set;

class ZonedDateTimeExampleTest {
    private ZonedDateTimeExample zonedDateTimeExample;

    @BeforeEach
    void setUp() {
        zonedDateTimeExample = new ZonedDateTimeExample();
    }

    @Test
    void getAllZoneId() {
        // When
        final Set<String> allZonesId = zonedDateTimeExample.getAllZoneId();

        // Then
        Assertions.assertTrue(allZonesId.size() > 0);
    }

    @Test
    void convertFromLocalDateTimeWithEuropeZoneId() {
        // Given
        final LocalDateTime localDateTime = LocalDateTime.now();

        // When Then
        Assertions.assertEquals("Europe/Paris",
                zonedDateTimeExample.convertFromLocalDateTimeWithEuropeZoneId(localDateTime).getZone().getId());
    }

    @Test
    void createZoneOffset() {
        // When
        final OffsetDateTime zoneOffset = zonedDateTimeExample.createZoneOffset(LocalDateTime.now());

        // Then
        Assertions.assertEquals("+02:00", zoneOffset.getOffset().getId());
    }
}