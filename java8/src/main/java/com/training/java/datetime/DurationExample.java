package com.training.java.datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
    public LocalTime addSecond(final LocalTime localTime) {
        return localTime.plus(Duration.ofSeconds(30));
    }

    public long betweenTwoDays(final LocalTime initialTime, final LocalTime finalTime, ChronoUnit chronoUnit) {
        return chronoUnit.between(initialTime, finalTime);
    }
}
