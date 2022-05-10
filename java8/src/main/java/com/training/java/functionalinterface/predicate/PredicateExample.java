package com.training.java.functionalinterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateExample {
    public List<String> filterNameByFirstLetter() {
        final List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");

        return names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
    }
}
