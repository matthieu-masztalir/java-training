package com.training.java.functionalinterface.bifunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BifunctionExample {
    /**
     * reduce(...) method have two parameters here and
     * more specifically a {@link java.util.function.BinaryOperator} and
     * that extends {@link java.util.function.BiFunction}
     *
     * @return sum of Integer
     */
    public int countWithReduce() {
        final List<Integer> list = Arrays.asList(1, 2, 3);
        return list.stream().reduce(10, Integer::sum);
    }

    public <T, U, R> List<R> listCombiner(List<T> list1, List<U> list2, BiFunction<T, U, R> combiner) {
        final List<R> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            result.add(combiner.apply(list1.get(i), list2.get(i)));
        }

        return result;
    }
}
