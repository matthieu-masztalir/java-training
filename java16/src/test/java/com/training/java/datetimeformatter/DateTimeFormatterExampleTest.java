package com.training.java.datetimeformatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterExampleTest {
    @Test
    void usePeriodOfDay() {
        // Given
        final LocalTime localTime = LocalTime.parse("15:25:08");
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("h B")
                .withLocale(Locale.US);

        // When Then
        Assertions.assertEquals("3 in the afternoon", localTime.format(dateTimeFormatter));
    }
}
