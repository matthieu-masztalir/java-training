package com.training.java.interfacewithprivatemethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InterfaceWithPrivateMethodImplTest {
    private InterfaceWithPrivateMethodImpl interfaceWithPrivateMethod;

    @BeforeEach
    void setUp() {
        interfaceWithPrivateMethod = new InterfaceWithPrivateMethodImpl();
    }

    @Test
    void callInterfacePrivateMethod() {
        Assertions.assertEquals("GM from private method :)",
                interfaceWithPrivateMethod.callInterfacePrivateMethod());
    }

}