package com.training.java.records;

public record User(int id, String password) {
    public User {
        if (password.length() < 8) {
            throw new IllegalArgumentException("little pass");
        }
    }

    public User(final int id) {
        this(id, "default");
    }
}
