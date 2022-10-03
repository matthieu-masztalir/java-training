package com.training.java.switchpatternmatching;

public class SwitchExample {
    /**
     * use switch case and conditions in the case instruction
     *
     * @param shape {@link Shape}
     * @return a joke
     */
    String useConditionInCase(final Shape shape) {
        switch (shape) {
            case Triangle triangle when triangle.getSides() == 3 -> {
                return "Yes of course. My name's Triangle and i have three sides";
            }
            default -> {
                return "It's an other shape";
            }
        }
    }
}
