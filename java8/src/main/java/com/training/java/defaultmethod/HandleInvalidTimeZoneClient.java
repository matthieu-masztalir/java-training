package com.training.java.defaultmethod;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Any class that implements the interface HandleInvalidTimeZoneClient will use the implementation of getZonedDateTime
 * specified by this interface instead of the one specified by the interface TimeClient.
 */
public interface HandleInvalidTimeZoneClient extends TimeClient {
    default ZonedDateTime getZonedDateTime(String zoneString) {
        return ZonedDateTime.of(getLocalDateTime(), ZoneId.systemDefault());
    }
}
