package com.training.java.streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class CollectorExampleTest {
    @Test
    void collectStreamJoiningToString() {
        final CollectorExample collectorExample = new CollectorExample();
        String joiningToString = collectorExample.collectStreamJoiningToString();

        Assertions.assertEquals("[a,b,c]", joiningToString);
    }

    @Test
    void averagingInt() {
        final CollectorExample collectorExample = new CollectorExample();
        Assertions.assertEquals(4.0, collectorExample.averagingInt());
    }

    @Test
    void summingInt() {
        final CollectorExample collectorExample = new CollectorExample();
        Assertions.assertEquals(12, collectorExample.summingInt());
    }

    @Test
    void collectorWithMaxBy() {
        final CollectorExample collectorExample = new CollectorExample();
        collectorExample.collectorWithMaxBy()
                .ifPresent(integer -> Assertions.assertEquals(10, integer));
    }

    @Test
    void collectorWithMinBy() {
        final CollectorExample collectorExample = new CollectorExample();
        collectorExample.collectorWithMinBy()
                .ifPresent(integer -> Assertions.assertEquals(4, integer));
    }

    @Test
    void groupByAndCount() {
        final CollectorExample collectorExample = new CollectorExample();

        Map<Integer, List<Integer>> groupingInteger = collectorExample.groupByAndCount();
        Assertions.assertEquals(3, groupingInteger.size());

        Assertions.assertEquals(3, groupingInteger.get(4).size());
    }

    @Test
    void partitioningByEvenOddInteger() {
        final CollectorExample collectorExample = new CollectorExample();
        final Map<Boolean, List<Integer>> partitioningMap =
                collectorExample.partitioningByEvenOddInteger();

        Assertions.assertEquals(2, partitioningMap.size());
        Assertions.assertEquals(2, partitioningMap.get(Boolean.TRUE).size());
    }

    @Test
    void collectToSet() {
        final CollectorExample collectorExample = new CollectorExample();
        final Set<String> setWithoutDuplicateValues = collectorExample.collectToSet();

        Assertions.assertIterableEquals(Arrays.asList("bb", "a", "c", "d"), setWithoutDuplicateValues);
    }

    @Test
    void collectToMapWithStringLength() {
        final CollectorExample collectorExample = new CollectorExample();

        final Map<String, Integer> mapStringLength = collectorExample.collectToMapWithStringLength();

        final Map<String, Integer> mapExpexted = new HashMap<>();
        mapExpexted.put("a", 1);
        mapExpexted.put("bb", 2);
        mapExpexted.put("ccc", 3);

        Assertions.assertEquals(mapExpexted, mapStringLength);
    }
}