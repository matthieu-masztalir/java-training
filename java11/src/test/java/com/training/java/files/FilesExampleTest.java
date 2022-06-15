package com.training.java.files;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesExampleTest {
    @Test
    void useReadWriteStringFromFile() throws IOException {
        CharSequence message = "read/write string from/to a file";
        String pathFile = "src/test/resources/com/training/java/files/";
        Path path = Files.writeString(Files.createTempFile(Path.of(pathFile), "readwritestring", ".txt"), message);

        // Then
        final String content = Files.readString(path);
        Assertions.assertEquals(message, content);
    }
}
