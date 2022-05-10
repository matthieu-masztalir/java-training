package com.training.java.streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamExampleTest {
    @Test
    void createStreamFromString() {
        final StreamExample streamExample = new StreamExample();
        final Stream<String> streamsFromString = streamExample.createStreamFromString();

        final List<String> expected = Arrays.asList("a", "b", "c");

        final List<String> collect = streamsFromString.collect(Collectors.toList());
        Assertions.assertEquals(expected, collect);
    }

    @Test
    void createStreamFromArray() {
        final StreamExample streamExample = new StreamExample();
        Stream<String> streamFromArray = streamExample.createStreamFromArray();

        final List<String> expected = Arrays.asList("a", "b", "c");

        final List<String> collect = streamFromArray.collect(Collectors.toList());
        Assertions.assertEquals(expected, collect);
    }

    @Test
    void executeParallelStream() {
        final StreamExample streamExample = new StreamExample();
        List<String> stringList = streamExample.executeParallelStream();

        final List<String> expected = Arrays.asList("A", "B", "C");
        Assertions.assertEquals(expected, stringList);
    }

    @Test
    void countDistinctElements() {
        final StreamExample streamExample = new StreamExample();
        long count = streamExample.countDistinctElements();

        Assertions.assertEquals(2, count);
    }

    @Test
    void searchContainsInList() {
        final StreamExample streamExample = new StreamExample();
        Assertions.assertTrue(streamExample.searchContainsInList());
    }

    @Test
    void filterElements() {
        final StreamExample streamExample = new StreamExample();
        Assertions.assertEquals("Japon", streamExample.filterElements().get(0));
    }

    @Test
    void mapToUpperCase() {
        final StreamExample streamExample = new StreamExample();
        List<String> stringList = streamExample.mapToUpperCase();

        final List<String> expected = Arrays.asList("A", "B", "C");
        Assertions.assertEquals(expected, stringList);
    }

    @Test
    void matchWithAnyElement() {
        final StreamExample streamExample = new StreamExample();
        Assertions.assertTrue(streamExample.matchWithAnyElement());
    }

    @Test
    void matchWithAllElements() {
        final StreamExample streamExample = new StreamExample();
        Assertions.assertFalse(streamExample.matchWithAllElements());
    }

    @Test
    void matchWithNoneElement() {
        final StreamExample streamExample = new StreamExample();
        Assertions.assertTrue(streamExample.matchWithNoneElement());
    }

    @Test
    void countWithReduce() {
        final StreamExample streamExample = new StreamExample();
        Assertions.assertEquals(16, streamExample.countWithReduce());
    }

    @Test
    void generateAndLimitStream() {
        final StreamExample streamExample = new StreamExample();
        final List<Integer> generateList = streamExample.generateAndLimitStream();

        Assertions.assertEquals(3, generateList.size());
        Assertions.assertTrue(generateList.stream().allMatch(element -> element.equals(1)));
    }

    @Test
    void createIntStreamAndExecuteSum() {
        final StreamExample streamExample = new StreamExample();
        Assertions.assertEquals(6, streamExample.createIntStreamAndExecuteSum());
    }
}