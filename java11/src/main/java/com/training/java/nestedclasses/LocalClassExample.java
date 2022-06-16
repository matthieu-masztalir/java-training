package com.training.java.nestedclasses;

public class LocalClassExample {
    public String sayHello() {
        class Local {
            String sayHello() {
                return "Hello world";
            }
        }

        final Local local = new Local();
        return local.sayHello();
    }
}
