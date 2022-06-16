package com.training.java.nestedclasses;

public class EnclosingWithStaticClassExample {
    private static String defaultName = "default";

    public static class StaticNested {
        public String sayHello() {
            return "Hello world " + defaultName;
        }
    }
}
