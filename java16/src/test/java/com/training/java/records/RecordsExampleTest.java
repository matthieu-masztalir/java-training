package com.training.java.records;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecordsExampleTest {
    @Test
    void useRecord() {
        final User user = new User(123, "pwd");

        // Then
        Assertions.assertEquals(123, user.id());
        Assertions.assertEquals("pwd", user.password());
    }

    @Test
    void useEqualsRecord() {
        // Given
        final User user = new User(123, "pwd");
        final User userExpected = new User(123, "pwd");

        // When Then
        Assertions.assertEquals(userExpected, user);
    }

    @Test
    void useToStringRecord() {
        // Given
        final User user = new User(123, "pwd");

        // When Then
        Assertions.assertTrue(user.toString().contains("pwd"));
    }
}
