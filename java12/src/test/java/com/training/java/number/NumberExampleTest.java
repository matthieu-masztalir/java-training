package com.training.java.number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberExampleTest {
    @Test
    void useCompactNumberShortFormat() {
        // Given
        final NumberFormat shortFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        shortFormat.setMaximumFractionDigits(2);

        // When Then
        Assertions.assertEquals("2.5K", shortFormat.format(2500));
    }

    @Test
    void useCompactNumberLongFormat() {
        // Given
        final NumberFormat longFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        longFormat.setMaximumFractionDigits(2);

        // When Then
        Assertions.assertEquals("2.59 thousand", longFormat.format(2594));
    }

    @Test
    void useCompactNumberLongFormatRounded() {
        // Given
        final NumberFormat longFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        longFormat.setMaximumFractionDigits(2);

        // When Then
        Assertions.assertEquals("2.6 thousand", longFormat.format(2595));
    }
}
