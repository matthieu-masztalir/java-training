package com.training.java.functionalinterface.supplier;

import java.time.LocalDate;

public class Developer {
    private String name;

    private LocalDate start;

    public Developer() {
    }

    public Developer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }
}
