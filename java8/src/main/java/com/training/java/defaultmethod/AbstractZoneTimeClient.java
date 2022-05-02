package com.training.java.defaultmethod;

import java.time.ZonedDateTime;

public interface AbstractZoneTimeClient extends TimeClient{
    ZonedDateTime getZoneDateTime(String zoneString);
}
