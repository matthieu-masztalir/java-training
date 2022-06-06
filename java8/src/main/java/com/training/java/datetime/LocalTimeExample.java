package com.training.java.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
    public LocalTime createWithNow() {
        return LocalTime.now();
    }

    public LocalTime createWithOf() {
        return LocalTime.of(1, 15, 7);
    }

    public LocalTime createWithParse() {
        return LocalTime.parse("06:30");
    }

    public LocalTime addOneHour(final LocalTime localTime) {
        return localTime.plus(1, ChronoUnit.HOURS);
    }

    public boolean isBefore(LocalTime firstTime, LocalTime secondTime) {
        return firstTime.isBefore(secondTime);
    }

    public boolean isAfter(LocalTime secondTime, LocalTime firstTime) {
        return secondTime.isAfter(firstTime);
    }
}
