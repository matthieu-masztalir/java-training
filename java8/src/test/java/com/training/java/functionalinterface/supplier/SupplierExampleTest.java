package com.training.java.functionalinterface.supplier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SupplierExampleTest {
    @Test
    void shoudReturnTwoDevelopers() {
        final SupplierExample supplierExample = new SupplierExample();

        // When
        final List<Developer> developers = supplierExample.create();

        // Then
        Assertions.assertEquals(2, developers.size());
    }
}