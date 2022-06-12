package com.training.java.interfacewithprivatemethod;

public interface InterfaceWithPrivateMethod {
    default String callInterfacePrivateMethod() {
        return sayHelloFromPrivateMethod();
    }

    private String sayHelloFromPrivateMethod() {
        return "GM from private method :)";
    }
}
