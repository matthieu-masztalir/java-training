package com.training.java.functionalinterface.predicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PredicateExampleTest {
    @Test
    void filterNameByFirstLetter() {
        PredicateExample predicateExample = new PredicateExample();

        // When
        final List<String> names = predicateExample.filterNameByFirstLetter();

        // Then
        Assertions.assertEquals(2, names.size());
    }
}