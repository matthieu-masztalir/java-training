package com.training.java.recordpattern;

public class RecordPatternExample {
    boolean isSameColoredPoint(final Object rectangle, final Color color) {
        return rectangle instanceof Rectangle(final ColoredPoint firstColorPoint,final ColoredPoint secondColorPoint)
                && firstColorPoint.color() == color
                && secondColorPoint.color() == color;
    }

    <T> String matchRecordGeneric(Box<String> box) {
        String matchRecordGeneric = "";

        if (box instanceof Box<String>(String s)) {
            matchRecordGeneric += "match generic : " + s.getClass().getSimpleName();
        }

        return matchRecordGeneric;
    }
}
