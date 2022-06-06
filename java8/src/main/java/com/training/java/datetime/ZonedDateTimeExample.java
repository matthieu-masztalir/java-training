package com.training.java.datetime;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeExample {
    public Set<String> getAllZoneId() {
        return ZoneId.getAvailableZoneIds();
    }

    public ZonedDateTime convertFromLocalDateTimeWithEuropeZoneId(final LocalDateTime localDateTime) {
        return ZonedDateTime.of(localDateTime, ZoneId.of("Europe/Paris"));
    }

    public ZonedDateTime createWithParse() {
        return ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");
    }

    public OffsetDateTime createZoneOffset(final LocalDateTime localDateTime) {
        final ZoneOffset offset = ZoneOffset.ofHours(2);

        return OffsetDateTime.of(localDateTime, offset);
    }
}
