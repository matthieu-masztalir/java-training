package com.training.java.functionalinterface.bifunction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

class BifunctionExampleTest {
    @Test
    void countWithReduce() {
        final BifunctionExample bifunctionExample = new BifunctionExample();
        Assertions.assertEquals(16, bifunctionExample.countWithReduce());
    }

    @Test
    void listCombiner() {
        final List<String> listString = Arrays.asList("a", "b", "c");
        final List<Integer> listInteger = Arrays.asList(1, 2, 3);

        final BiFunction<String, Integer, String> biFunction = ((s, integer) -> s + integer);

        final BifunctionExample bifunctionExample = new BifunctionExample();
        List<String> result = bifunctionExample.listCombiner(listString, listInteger, biFunction);

        Assertions.assertIterableEquals(Arrays.asList("a1", "b2", "c3"), result);
    }

    /**
     * Use andThen(...) on a BiFunction
     */
    @Test
    void listCombinerAndThenGreatherThanZero() {
        // Given
        final List<Integer> list1 = Arrays.asList(1, 1, 1);
        final List<Integer> list2 = Arrays.asList(0, 0, 2);

        final BiFunction<Integer, Integer, Integer> biFunction = Integer::compareTo;

        // When
        final BifunctionExample bifunctionExample = new BifunctionExample();
        List<Boolean> result = bifunctionExample.listCombiner(list1, list2, biFunction.andThen(integer -> integer > 0));

        // Then
        Assertions.assertIterableEquals(Arrays.asList(true, true, false), result);
    }
}