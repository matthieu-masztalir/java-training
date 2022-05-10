package com.training.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public Stream<String> createStreamFromString() {
        return Stream.of("a", "b", "c");
    }

    public Stream<String> createStreamFromArray() {
        String[] arr = new String[]{"a", "b", "c"};
        return Stream.of(arr);
    }

    public List<String> executeParallelStream() {
        final List<String> list = Arrays.asList("a", "b", "c");
        return list.parallelStream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public long countDistinctElements() {
        final List<String> list = Arrays.asList("a", "b", "a");

        return list.stream()
                .distinct()
                .count();
    }

    public boolean searchContainsInList() {
        final List<String> list = Arrays.asList("a", "b", "c");
        return list.stream().anyMatch("b"::equals);
    }

    public List<String> filterElements() {
        final List<String> list = Arrays.asList("France", "Italie", "Japon");
        return list.stream()
                .filter(s -> s.contains("on"))
                .collect(Collectors.toList());
    }

    public List<String> mapToUpperCase() {
        final List<String> list = Arrays.asList("a", "b", "c");
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public boolean matchWithAnyElement() {
        final List<String> list = Arrays.asList("a", "b", "c");
        return list.stream().anyMatch("a"::equals);
    }

    public boolean matchWithAllElements() {
        final List<String> list = Arrays.asList("a", "b", "c");
        return list.stream().allMatch("a"::equals);
    }

    public boolean matchWithNoneElement() {
        final List<String> list = Arrays.asList("a", "b", "c");
        return list.stream().noneMatch("d"::equals);
    }

    public int countWithReduce() {
        final List<Integer> list = Arrays.asList(1, 2, 3);
        return list.stream().reduce(10, Integer::sum);
    }

    public List<Integer> generateAndLimitStream() {
        return Stream.generate(() -> 1)
                .limit(3)
                .collect(Collectors.toList());
    }

    public Integer createIntStreamAndExecuteSum() {
        return IntStream.range(1, 4).sum();
    }
}
