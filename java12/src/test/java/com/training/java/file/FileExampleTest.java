package com.training.java.file;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExampleTest {
    @Test
    void shouldNotFindMismatch_whenCompareTwoFiles() throws IOException {
        // Given
        final Path filePathInit = Files.createTempFile("file1", ".txt");
        final Path filePathSecond = Files.createTempFile("file2", ".txt");

        Files.writeString(filePathInit, "Java 12");
        Files.writeString(filePathSecond, "Java 12");

        // When
        long mismatch = Files.mismatch(filePathInit, filePathSecond);

        // Then
        Assertions.assertEquals(-1, mismatch);
    }

    @Test
    void shouldReturnMismatch_whenCompareTwoFiles() throws IOException {
        // Given
        final Path filePathInit = Files.createTempFile("file1", ".txt");
        final Path filePathSecond = Files.createTempFile("file2", ".txt");

        Files.writeString(filePathInit, "Java 12");
        Files.writeString(filePathSecond, "Java 12 in progress");

        // When
        long mismatch = Files.mismatch(filePathInit, filePathSecond);

        // Then
        Assertions.assertEquals(7, mismatch);
    }
}
