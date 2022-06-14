package com.training.java.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionExampleTest {
    @Test
    void useCOpyOfInList() {
        List<String> alpha = Arrays.asList("a", "b", "c");
        List<String> alphaCopy = List.copyOf(alpha);

        Assertions.assertThrows(UnsupportedOperationException.class, () -> alphaCopy.add("d"));
    }

    @Test
    void useCopyOfInMap() {
        Map<String, Integer> alphaMap = Map.of("e", 4, "c", 5);
        Map<String, Integer> alphaMapCopy = Map.copyOf(alphaMap);

        Assertions.assertThrows(UnsupportedOperationException.class, () -> alphaMapCopy.remove("e"));
    }

    @Test
    void useCopyOfInSet() {
        Set<String> alpha = Set.of("e4", "e5");
        Set<String> alphaCopy = Set.copyOf(alpha);

        Assertions.assertThrows(UnsupportedOperationException.class, () -> alphaCopy.remove("e4"));
    }

    @Test
    void useToUnmodifiable() {
        List<String> alpha = Arrays.asList("a", "b", "c");
        List<String> alphaCollect = alpha.stream()
                .collect(Collectors.toUnmodifiableList());

        Assertions.assertThrows(UnsupportedOperationException.class, () -> alphaCollect.add("d"));
    }
}
