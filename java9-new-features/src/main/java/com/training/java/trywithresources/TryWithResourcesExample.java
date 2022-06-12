package com.training.java.trywithresources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class TryWithResourcesExample {
    public String readMessage(final String message) throws IOException {
        final StringReader stringReader = new StringReader(message);

        final BufferedReader bufferedReader = new BufferedReader(stringReader);
        try (bufferedReader) {
            return bufferedReader.readLine();
        }
    }
}
