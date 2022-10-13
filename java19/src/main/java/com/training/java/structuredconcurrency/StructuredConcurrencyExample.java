package com.training.java.structuredconcurrency;

import jdk.incubator.concurrent.StructuredTaskScope;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class StructuredConcurrencyExample {
    Integer useStructuredTaskScope() throws InterruptedException, ExecutionException {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            Future<Integer> futureSumFirstThread = scope.fork(() -> IntStream.range(0, 3).sum());

            // time-consuming task
            Future<Integer> futureSumSecondThread = scope.fork(() -> IntStream.range(3, 5).sum());

            scope.join();
            scope.throwIfFailed();

            return futureSumFirstThread.resultNow() + futureSumSecondThread.resultNow();
        }
    }

    public void useStructuredTaskScopeFailedThread() throws InterruptedException, ExecutionException {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            Future<Integer> futureSumFirstThread = scope.fork(() -> {
                throw new InterruptedException("an exception");
            });

            // time-consuming task to view state = 4 CANCELLED
            Future<Integer> futureSumSecondThread = scope.fork(() -> IntStream.range(5, 10000000).sum());

            scope.join();
            scope.throwIfFailed();

            // It doesn't execute because an exception is thrown by one of task in the scope
            futureSumFirstThread.resultNow();
            futureSumSecondThread.resultNow();
        }
    }

    /**
     * Use shoutdownOnSuccess method to return the first thread result on success
     *
     * @return The first thread for this example
     * @throws InterruptedException If a thread is interrupted when join
     * @throws ExecutionException   If the scope execution fail when get result
     */
    public Integer useStructureTaskScopeSuccessThread() throws InterruptedException, ExecutionException {
        try (var scope = new StructuredTaskScope.ShutdownOnSuccess<Integer>()) {
            scope.fork(() -> IntStream.range(0, 5).sum());
            scope.fork(() -> IntStream.range(5, 10000000).sum());

            scope.join();
            return scope.result();
        }
    }

    Integer useStructureTaskScopeSuccessAndThreadException() throws InterruptedException, ExecutionException {
        try (var scope = new StructuredTaskScope.ShutdownOnSuccess<Integer>()) {
            scope.fork(() -> {
                throw new Exception("an exception");
            });
            
            scope.fork(() -> IntStream.range(0, 5).sum());

            scope.join();
            return scope.result();
        }
    }
}
