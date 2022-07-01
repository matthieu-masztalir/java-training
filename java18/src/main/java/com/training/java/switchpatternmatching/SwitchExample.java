package com.training.java.switchpatternmatching;

public class SwitchExample {
    int usePatterMatching(final Shape shape) {
        return switch (shape) {
            case null -> -1;
            case Rectangle rectangle -> rectangle.getSides();
            case Triangle triangle -> triangle.getSides();
        };
    }

    /**
     * use switch case and conditions in the case instruction
     *
     * @param shape {@link Shape}
     * @return a joke
     */
    String useConditionInCase(final Shape shape) {
        switch (shape) {
            case Triangle triangle && triangle.getSides() == 3 -> {
                return "Yes of course. My name's Triangle and i have three sides";
            }
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        }
    }

    /**
     * Imcompatible type between Shape and String
     *
     * @param shape {@link Shape}
     * @return Compilation error
     */
    /*int usePatterMatchingWrongType(final Shape shape) {
        return switch (shape) {
            case String s -> -1;
            case Rectangle rectangle -> rectangle.getSides();
            case Triangle triangle -> triangle.getSides();
        };
    }*/

    int usePatterMatchingWithDominanceType(final Shape shape) {
        return switch (shape) {
            case Rectangle rectangle -> rectangle.getSides();
            case Triangle triangle -> triangle.getSides();
            case null, Object ignored -> -1;
        };
    }
}
