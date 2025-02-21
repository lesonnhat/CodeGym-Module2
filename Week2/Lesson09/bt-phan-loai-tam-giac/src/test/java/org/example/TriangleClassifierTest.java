package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleClassifierTest {

    private TriangleClassifier classifier = new TriangleClassifier();

    @Test
    public void testEquilateralTriangle() {
        assertEquals("tam giác đều", classifier.classifyTriangle(2, 2, 2));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("tam giác cân", classifier.classifyTriangle(2, 2, 3));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("tam giác thường", classifier.classifyTriangle(2, 3, 4));
    }

    @Test
    public void testNotTriangle() {
        assertEquals("không phải là tam giác", classifier.classifyTriangle(0, 1, 1));
        assertEquals("không phải là tam giác", classifier.classifyTriangle(1, 2, 3));
        assertEquals("không phải là tam giác", classifier.classifyTriangle(-1, 1, 1));
    }
}