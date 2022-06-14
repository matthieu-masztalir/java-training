package com.training.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    /**
     * Use takeWhile method.
     *
     * @return Result list : 2, 2, 4
     */
    List<Integer> useTakeWhile() {
        final List<Integer> list = Arrays.asList(2, 2, 4, 3, 6);
        return list.stream()
                .takeWhile(s -> s % 2 == 0)
                .collect(Collectors.toList());
    }

    /**
     * Use dropWhile method.
     *
     * @return Result list : 1,3
     */
    List<Integer> useDropWhile() {
        final List<Integer> list = Arrays.asList(1, 3, 4, 3, 6);
        return list.stream()
                .dropWhile(integer -> integer % 2 == 0)
                .collect(Collectors.toList());
    }

    List<Integer> useIterate() {
        return Stream.iterate(0, i -> i < 2, i -> i + 1)
                .collect(Collectors.toList());
    }

    List<Integer> useOfNullable(final Optional<Integer> optional) {
        return Stream.ofNullable(optional)
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
    }
}
