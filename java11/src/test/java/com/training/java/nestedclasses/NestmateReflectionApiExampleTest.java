package com.training.java.nestedclasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class NestmateReflectionApiExampleTest {
    @Test
    void whenGetNestHostFromOuter_thenGetNestHost() {
        final String nestHostName = "com.training.java.nestedclasses.OuterExample";
        Assertions.assertEquals(OuterExample.class.getNestHost().getName(), nestHostName);
    }

    @Test
    void whenGetNestHostFromInner_thenGetNestHost() {
        final String nestHostName = "com.training.java.nestedclasses.OuterExample";
        Assertions.assertEquals(OuterExample.Inner.class.getNestHost().getName(), nestHostName);
    }

    @Test
    void whenCheckNestmatesForNestedClasses_thenGetTrue() {
        Assertions.assertTrue(OuterExample.Inner.class.isNestmateOf(OuterExample.class));
    }

    @Test
    void shouldReturnAllMembers_whenGetNestMembers() {
        // Given
        Set<String> members = Arrays.stream(OuterExample.Inner.class.getNestMembers())
                .map(Class::getName)
                .collect(Collectors.toSet());

        // When Then
        Assertions.assertEquals(2, members.size());

        final String referenceOuter = "com.training.java.nestedclasses.OuterExample";
        final String referenceInner = "com.training.java.nestedclasses.OuterExample$Inner";

        final Set<String> membersExpected = Set.of(referenceOuter, referenceInner);
        Assertions.assertEquals(members, membersExpected);
    }
}
