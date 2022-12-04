package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testSum() {
        int a = Main.getAdd(10, 5);
        assertEquals(15, a);
    }
    @Test
    public void testMultiply() {
        int a = Main.getMultiply(10, 5);
        assertEquals(50, a);
    }
    @Test
    public void testDiv() {
        int a = Main.getDivide(10, 5);
        assertEquals(2, a);
    }
    @Test
    public void testSub() {
        int a = Main.getSubtract(10,5);
        assertEquals( 5,a);
    }
}
