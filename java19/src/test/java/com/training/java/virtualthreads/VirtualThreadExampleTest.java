package com.training.java.virtualthreads;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class VirtualThreadExampleTest {
    private VirtualThreadExample virtualThreadExample;

    @BeforeEach
    void setUp() {
        virtualThreadExample = new VirtualThreadExample();
    }

    @Test
    void useVirtualThread() throws InterruptedException, ExecutionException {
        // When
        final var futures = virtualThreadExample.useVirtualThreadPerTask();

        // Then
        final var totalPricePossible = futures.stream().reduce(Integer::sum);

        Assertions.assertTrue(totalPricePossible.isPresent());
        Assertions.assertEquals(10, totalPricePossible.get());
    }

    @Test
    void getFutureResultNow() {
        // When
        final var futureResultNowPossible = virtualThreadExample.getFutureResultNow();

        // Then
        Assertions.assertTrue(futureResultNowPossible.isPresent());
        Assertions.assertEquals(10, futureResultNowPossible.get());
    }

    @Test
    void getFutureState() throws InterruptedException {
        Assertions.assertEquals(Future.State.SUCCESS, virtualThreadExample.getStateFuture());
    }

    @Test
    void shouldReturnVirtualThread_whenCreateVirtualThreadAndStart() {
        Assertions.assertTrue(virtualThreadExample.createVirtualThreadAndStart().isVirtual());
    }

    @Test
    void shouldReturnPlatformThread_whenCreatePlatformThreadAndStart() {
        Assertions.assertFalse(virtualThreadExample.createPlatformThreadAndStart().isVirtual());
    }

    @Test
    void shouldReturnVirtualThread_whenStartVirtualThread() {
        Assertions.assertTrue(virtualThreadExample.startVirtualThread().isVirtual());
    }

    @Test
    void getNormalThreadPriority_withGetPriority() {
        Assertions.assertEquals(Thread.NORM_PRIORITY, virtualThreadExample.getNormalPriority());
    }
}