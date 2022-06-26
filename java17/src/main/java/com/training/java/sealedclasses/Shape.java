package com.training.java.sealedclasses;


public sealed abstract class Shape permits Circle, Triangle, Rectangle {
    abstract int getSides();
}
