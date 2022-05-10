package com.training.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorExample {
    /**
     * Joining strings with {@link Collectors#joining(CharSequence, CharSequence, CharSequence)}
     *
     * @return Unique string with all characters and delimiter
     */
    public String collectStreamJoiningToString() {
        final List<String> list = Arrays.asList("a", "b", "c");
        return list.stream()
                .collect(Collectors.joining(",", "[", "]"));
    }

    /**
     * Calculating the average of integers with a {@link Collectors}
     *
     * @return Average of Integers
     */
    public Double averagingInt() {
        final List<Integer> list = Arrays.asList(2, 4, 6);
        return list.stream()
                .collect(Collectors.averagingInt(value -> value));
    }

    /**
     * Calculating the sum of Integers with a {@link Collectors}
     *
     * @return Sum of Integers
     */
    public int summingInt() {
        final List<Integer> list = Arrays.asList(2, 4, 6);

        return list.stream()
                .collect(Collectors.summingInt(value -> value));
    }

    /**
     * {@link Collectors}.maxBy has been replaced by stream().min
     *
     * @return Min value in list
     */
    public Optional<Integer> collectorWithMaxBy() {
        final List<Integer> list = Arrays.asList(2, 10, 6);
        return list.stream().max(Comparator.naturalOrder());
    }

    /**
     * {@link Collectors}.minBy has been replaced by stream().min
     *
     * @return Min value in list
     */
    public Optional<Integer> collectorWithMinBy() {
        final List<Integer> list = Arrays.asList(6, 10, 4);
        return list.stream().min(Comparator.naturalOrder());
    }

    public Map<Integer, List<Integer>> groupByAndCount() {
        final List<Integer> list = Arrays.asList(2, 4, 6, 2, 4, 4, 6);
        return list.stream()
                .collect(Collectors.groupingBy(value -> value));
    }

    public Map<Boolean, List<Integer>> partitioningByEvenOddInteger() {
        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        return list.stream()
                .collect(Collectors.partitioningBy(o -> o % 2 == 0));
    }

    public Set<String> collectToSet() {
        final List<String> listWithDuplicateValues = Arrays.asList("a", "bb", "c", "d", "bb");
        return listWithDuplicateValues.stream()
                .collect(Collectors.toSet());
    }

    public Map<String, Integer> collectToMapWithStringLength() {
        final List<String> listToMap = Arrays.asList("a", "bb", "ccc");
        return listToMap.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
    }
}
