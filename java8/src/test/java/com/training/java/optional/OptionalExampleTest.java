package com.training.java.optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OptionalExampleTest {
    private OptionalExample optionalExample;

    @BeforeEach
    void setUp() {
        optionalExample = new OptionalExample();
    }

    @Test
    void shouldReturnEmptyValue_whenValueIsNull() {
        Assertions.assertFalse(optionalExample.useOfNullableIfValueIsNull(null).isPresent());
    }

    @Test
    void shouldReturnOptionalValue_whenValueIsNotNull() {
        Assertions.assertTrue(optionalExample.useOfNullableIfValueIsNull("value").isPresent());
    }

    @Test
    void getUserAddressStreetWithNullUser() {
        // When
        final String address = optionalExample.getUserAddressStreetWithNullUser(null);

        // Then
        Assertions.assertEquals("not specified", address);
    }

    @Test
    void getUserStreet_whenStreetIsSpecified() {
        // Given
        final User user = new User();
        user.setAddress(user.new Address("my street"));

        // When
        final String address = optionalExample.getUserAddressStreetWithNullUser(user);

        // Then
        Assertions.assertEquals("my street", address);
    }

    @Test
    void shouldThrowException_whenUserIsNull() {
        // Then
        Assertions.assertThrows(Exception.class,
                () -> optionalExample.getUserAddressStreetOrThrowException(null),
                "not specified");
    }
}