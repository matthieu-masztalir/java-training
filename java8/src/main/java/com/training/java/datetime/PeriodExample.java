package com.training.java.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {
    /**
     * Days between two dates.
     * Example :
     * futurDate : j+2
     * pasDate : now()
     * Result : 2
     *
     * @param futurDate future date
     * @param pastDate  present date
     * @return Number of days
     */
    public int betweenTwoDays(final LocalDate futurDate, final LocalDate pastDate) {
        return Period.between(futurDate, pastDate).getDays();
    }

    public LocalDate addDays(final LocalDate localDate, final int days) {
        return localDate.plus(Period.ofDays(days));
    }

    public long betweenTwoDays(final LocalDate futurDate, final LocalDate pastDate, ChronoUnit chronoUnit) {
        return chronoUnit.between(futurDate, pastDate);
    }
}
