package com.training.java.recordpattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecordPatternExampleTest {
    @Test
    void shouldReturnTheSameColor() {
        // Given
        final var coloredPoint = new ColoredPoint(new Point(2, 2), Color.RED);
        final var rectangle = new Rectangle(coloredPoint, coloredPoint);

        // When Then
        assertTrue(new RecordPatternExample().isSameColoredPoint(rectangle, Color.RED));
    }

    @Test
    void shouldReturnDifferentColorPoint() {
        // Given
        final var coloredFirstPoint = new ColoredPoint(new Point(2, 2), Color.RED);
        final var coloredSecondPoint = new ColoredPoint(new Point(5, 5), Color.BLUE);
        final var rectangle = new Rectangle(coloredFirstPoint, coloredSecondPoint);

        // When Then
        assertFalse(new RecordPatternExample().isSameColoredPoint(rectangle, Color.BLUE));
    }

    @Test
    void shouldReturnFalse_whenShapeIsNotRectangle() {
        // Given
        final var triangle = new Triangle(new Point(4, 4), new Point(2, 2), new Point(4, 2));

        // When Then
        assertFalse(new RecordPatternExample().isSameColoredPoint(triangle, Color.BLUE));
    }

    @Test
    void shouldReturnMatchRecordGeneric_whenUseGenericRecord() {
        // Given
        final Box<String> box = new Box<>("test");

        // When
        assertEquals(new RecordPatternExample().matchRecordGeneric(box), "match generic : String");
    }

    @Test
    void shouldReturnUnMatchRecordGeneric_whenUseGenericRecord() {
        // When
        assertEquals(new RecordPatternExample().matchRecordGeneric(null), "");
    }
}