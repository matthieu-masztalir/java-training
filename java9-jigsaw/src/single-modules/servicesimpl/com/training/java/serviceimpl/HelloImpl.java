package com.training.java.serviceimpl;

import com.training.java.hello.Hello;

public class HelloImpl implements Hello {
    public String sayHello() {
        return "Hello world !";
    }

    public static void main(String... args) {
        var helloImpl = new HelloImpl();
        System.out.println(helloImpl.sayHello());
    }
}