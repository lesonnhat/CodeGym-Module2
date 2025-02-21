package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTranslateTest {

    private FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate();

    @Test
    public void testFizz() {
        assertEquals("Fizz", fizzBuzzTranslate.translate(3));
        assertEquals("Fizz", fizzBuzzTranslate.translate(6));
        assertEquals("Fizz", fizzBuzzTranslate.translate(9));
        assertEquals("Fizz", fizzBuzzTranslate.translate(13)); // Chứa số 3
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", fizzBuzzTranslate.translate(5));
        assertEquals("Buzz", fizzBuzzTranslate.translate(10));
        assertEquals("Buzz", fizzBuzzTranslate.translate(25)); // Chứa số 5
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzzTranslate.translate(15));
        assertEquals("FizzBuzz", fizzBuzzTranslate.translate(30));
    }

    @Test
    public void testNumberToWords() {
        assertEquals("một", fizzBuzzTranslate.translate(1));
        assertEquals("hai", fizzBuzzTranslate.translate(2));
        assertEquals("bốn", fizzBuzzTranslate.translate(4));
        assertEquals("mười", fizzBuzzTranslate.translate(10));
        assertEquals("hai mươi ba", fizzBuzzTranslate.translate(23));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInput() {
        fizzBuzzTranslate.translate(0);
        fizzBuzzTranslate.translate(100);
    }
}