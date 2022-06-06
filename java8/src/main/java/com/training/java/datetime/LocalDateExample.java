package com.training.java.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public LocalDate createWithNow() {
        return LocalDate.now();
    }

    public LocalDate createWithOf() {
        return LocalDate.of(2022, 05, 01);
    }

    public LocalDate createWithParse() {
        return LocalDate.parse("2022-05-01");
    }

    public LocalDate getTomorrow(final LocalDate localDate) {
        return localDate.plusDays(1);
    }

    public LocalDate getPreviousMonth(LocalDate localDate) {
        return localDate.minus(1, ChronoUnit.MONTHS);
    }

    public boolean isBefore(LocalDate firstDate, LocalDate secondDate) {
        return firstDate.isBefore(secondDate);
    }

    public boolean isAfter(LocalDate secondDate, LocalDate firstDate) {
        return secondDate.isAfter(firstDate);
    }

    public LocalDate getFirstDayOfMonth(final LocalDate localDate) {
        return localDate.with(TemporalAdjusters.firstDayOfMonth());
    }
}
