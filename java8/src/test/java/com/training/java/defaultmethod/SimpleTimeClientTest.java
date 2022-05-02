package com.training.java.defaultmethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

class SimpleTimeClientTest {
    private TimeClient simpleTimeClient;

    @BeforeEach
    void setUp() {
        this.simpleTimeClient = new SimpleTimeClient();
    }

    @Test
    void shoudReturnTrue_whenGetCurrentDate() {
        Assertions.assertEquals(LocalDateTime.now().toLocalDate(), simpleTimeClient.getLocalDateTime().toLocalDate());
    }
}