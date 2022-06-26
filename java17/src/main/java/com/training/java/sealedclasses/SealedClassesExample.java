package com.training.java.sealedclasses;

public class SealedClassesExample {
    public int getSides(Shape shape) {
        int sides = 0;
        if (shape instanceof Circle circle) {
            sides = circle.getSides();
        } else if (shape instanceof Rectangle rectangle) {
            sides = rectangle.getSides();
        } else if (shape instanceof Triangle triangle) {
            sides = triangle.getSides();
        }

        return sides;
    }
}
