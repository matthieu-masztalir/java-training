package com.training.java.functionalinterface.consumer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumerExample {
    /**
     * Use Consumer
     */
    public void printArray(){
        final List<String> ages = Arrays.asList("John", "Freddy");
        // ages.foreach(consumer)
        ages.forEach(System.out::println);
    }

    /**
     * Use BiConsumer
     */
    public void printMap(){
        final Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 24);

        ages.forEach((name, age)-> System.out.println(name + " " + age));
    }
}
