package com.training.java.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {
    public LocalDateTime createWithNow() {
        return LocalDateTime.now();
    }

    public LocalDateTime createWithOf() {
        return LocalDateTime.of(2022, 5, 1, 2, 0);
    }

    public LocalDateTime createWithLocalDateAndLocalTime() {
        return LocalDateTime.of(LocalDate.now(), LocalTime.now());
    }

    public LocalDateTime createWithParse() {
        return LocalDateTime.parse("2022-05-01T07:30:00");
    }

    public LocalDateTime addOneDay(final LocalDateTime localDateTime) {
        return localDateTime.plusDays(1);
    }
}
