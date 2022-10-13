package com.training.java.structuredconcurrency;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

class StructuredConcurrencyExampleTest {
    private StructuredConcurrencyExample structuredConcurrencyExample;

    @BeforeEach
    void setUp() {
        structuredConcurrencyExample = new StructuredConcurrencyExample();
    }

    @Test
    void useStructuredTaskScope() throws ExecutionException, InterruptedException {
        Assertions.assertEquals(10, structuredConcurrencyExample.useStructuredTaskScope());
    }

    @Test
    void shouldThrowException_whenOneOfThreadFailedInStructuredScope() {
        final var exceptionMessage = Assertions.assertThrows(ExecutionException.class,
                        () -> structuredConcurrencyExample.useStructuredTaskScopeFailedThread())
                .getCause().getMessage();

        Assertions.assertEquals(exceptionMessage, "an exception");
    }

    @Test
    void shouldReturnTheFirstResultThread_whenUseShutdownOnSuccess() throws ExecutionException, InterruptedException {
        Assertions.assertEquals(10, structuredConcurrencyExample.useStructureTaskScopeSuccessThread());
    }

    @Test
    void shouldReturnThreadResult_whenOneThreadSuccessAndAnOtherFail() throws ExecutionException, InterruptedException {
        Assertions.assertEquals(10, structuredConcurrencyExample.useStructureTaskScopeSuccessAndThreadException());
    }
}