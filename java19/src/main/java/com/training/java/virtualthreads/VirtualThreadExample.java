package com.training.java.virtualthreads;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class VirtualThreadExample {
    List<Integer> useVirtualThreadPerTask() throws ExecutionException, InterruptedException {
        final List<Integer> sumsPrice = new ArrayList<>();
        try (final var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            var rangeLeftFuture = executor.submit(() -> IntStream.range(1, 3).sum());
            var rangeRightFuture = executor.submit(() -> IntStream.range(3, 5).sum());

            sumsPrice.add(rangeLeftFuture.get());
            sumsPrice.add(rangeRightFuture.get());
        }

        return sumsPrice;
    }

    public Thread createVirtualThreadAndStart() {
        return Thread.ofVirtual().start(() -> IntStream.range(1, 3).forEach(System.out::println));
    }

    public Thread createPlatformThreadAndStart() {
        return Thread.ofPlatform().start(() -> IntStream.range(1, 3).forEach(System.out::println));
    }

    public Thread startVirtualThread() {
        return Thread.startVirtualThread(() -> IntStream.range(1, 3).forEach(System.out::println));
    }

    Optional<Integer> getFutureResultNow() {
        final List<Future<Integer>> futures = new ArrayList<>();
        try (final var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            futures.add(executor.submit(() -> IntStream.range(1, 3).sum()));
            futures.add(executor.submit(() -> IntStream.range(3, 5).sum()));
        }

        return futures.stream()
                .filter(future -> Future.State.SUCCESS == future.state())
                .map(Future::resultNow)
                .reduce(Integer::sum);
    }

    public Future.State getStateFuture() throws InterruptedException {
        Future<Integer> future;
        try (final var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            future = executor.submit(() -> IntStream.range(1, 3).sum());
        }

        return future.state();
    }

    public Integer getNormalPriority() {
        final var thread = Thread.startVirtualThread(() -> IntStream.range(1, 3).forEach(System.out::println));
        return thread.getPriority();
    }
}
