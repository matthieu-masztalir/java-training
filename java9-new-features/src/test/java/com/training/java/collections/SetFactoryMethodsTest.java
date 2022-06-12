package com.training.java.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class SetFactoryMethodsTest {
    @Test
    void shouldCompareSuccessfullySets() {
        final Set<String> traditionalSet = new HashSet<>();
        traditionalSet.add("a");
        traditionalSet.add("b");
        traditionalSet.add("c");

        final Set<String> setOf = Set.of("a", "b", "c");

        Assertions.assertEquals(setOf, traditionalSet);
    }

    @Test
    void shouldThrowException_whenDuplicationElement() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Set.of("foo", "bar", "foo"));
    }

    @Test
    void shouldThrowException_whenAddElement() {
        // Given
        final Set<String> initialSet = Set.of("foo", "bar");

        // When Then
        Assertions.assertThrows(UnsupportedOperationException.class, () -> initialSet.add("foobar"));
    }

    @Test
    void shouldThrowException_whenRemoveElement() {
        // Given
        final Set<String> initialSet = Set.of("foo", "bar");

        // When Then
        Assertions.assertThrows(UnsupportedOperationException.class, () -> initialSet.remove("foo"));
    }

    @Test
    void shouldThrowException_whenAddNullElement() {
        Assertions.assertThrows(NullPointerException.class, () -> Set.of("foo", "bar", null));
    }
}
