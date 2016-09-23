package com.example.eduardomatos.shapenumbers;

import org.junit.Test;

import static org.junit.Assert.*;


public class ShapeNumberTest {

    @Test
    public void triangularNumber () throws Exception {
        ShapeNumber s = new ShapeNumber();

        assertTrue(s.isTriangular(1));
        assertTrue(s.isTriangular(3));
        assertTrue(s.isTriangular(6));
        assertTrue(s.isTriangular(10));
        assertTrue(s.isTriangular(15));
        assertTrue(s.isTriangular(21));
        assertTrue(s.isTriangular(28));

        assertFalse(s.isTriangular(-1));
        assertFalse(s.isTriangular(0));
        assertFalse(s.isTriangular(2));
        assertFalse(s.isTriangular(100));
        assertFalse(s.isTriangular(9999));
    }

    @Test
    public void squareNumber () throws Exception {
        ShapeNumber s = new ShapeNumber();

        assertTrue(s.isSquare(0));
        assertTrue(s.isSquare(1));
        assertTrue(s.isSquare(4));
        assertTrue(s.isSquare(9));
        assertTrue(s.isSquare(100));

        assertFalse(s.isSquare(2));
        assertFalse(s.isSquare(5));
        assertFalse(s.isSquare(48));
        assertFalse(s.isSquare(101));
    }
}
