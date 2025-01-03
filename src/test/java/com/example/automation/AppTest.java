package com.example.automation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testAdd() {
        App obj = new App();
        int result = obj.add(5, 10);
        assertEquals(15, result, "The add method should return the sum of two numbers.");
    }

    @Test
    public void testMultiply() {
        App obj = new App();
        int result = obj.multiply(5, 10);
        assertEquals(50, result, "The multiply method should return the product of two numbers.");
    }

    @Test
    public void testIsEven() {
        App obj = new App();
        assertTrue(obj.isEven(4), "4 should be considered even.");
        assertFalse(obj.isEven(5), "5 should not be considered even.");
    }
}
