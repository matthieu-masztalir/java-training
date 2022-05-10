package com.training.java.functionalinterface.supplier;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public List<Developer> create(){
        Developer d1 = factory(Developer::new);
        Developer d2 = factory(()-> new Developer("John"));

        return Arrays.asList(d1, d2);
    }

    private Developer factory(Supplier<? extends Developer> devSupplier){
        final Developer dev = devSupplier.get();
        if(dev.getName() == null){
            dev.setName("default");
        }

        dev.setStart(LocalDate.now());

        return dev;
    }
}
