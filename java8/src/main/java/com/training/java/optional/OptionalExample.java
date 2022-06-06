package com.training.java.optional;

import java.util.Optional;

public class OptionalExample {
    public Optional<String> createEmptyOptional() {
        return Optional.empty();
    }

    public Optional<String> createOptionalWithPresentValue() {
        return Optional.of("value");
    }

    public Optional<String> useOfNullableIfValueIsNull(final String value) {
        return Optional.ofNullable(value);
    }

    public String getUserAddressStreetWithNullUser(final User user) {
        final Optional<User> userPossible = Optional.ofNullable(user);

        return userPossible.map(User::getAddress)
                .map(User.Address::getStreet)
                .orElse("not specified");
    }

    public String getUserAddressStreetOrThrowException(final User user) throws Exception {
        final Optional<User> userPossible = Optional.ofNullable(user);

        return userPossible.map(User::getAddress)
                .map(User.Address::getStreet)
                .orElseThrow(() -> new Exception("not specified"));
    }
}
