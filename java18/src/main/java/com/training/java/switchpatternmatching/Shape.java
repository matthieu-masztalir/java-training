package com.training.java.switchpatternmatching;


public abstract sealed class Shape permits Triangle, Rectangle {
    int getSides() {
        return -1;
    }
}
