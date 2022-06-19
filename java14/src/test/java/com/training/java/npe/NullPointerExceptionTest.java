package com.training.java.npe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NullPointerExceptionTest {
    /**
     * More details in {@link NullPointerException}
     */
    @Test
    void seeDetailsInNullPointerException() {
        int[] arr = null;

        try {
            arr[0] = 1;
        } catch (Exception exception) {
            final String message = "Cannot store to int array because \"arr\" is null";
            Assertions.assertEquals(message, exception.getMessage());
        }
    }
}
