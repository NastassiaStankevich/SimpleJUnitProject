package by.itstep.stank.javalessons.lesson20.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum(){

        // Arrange
        int a = 11;
        int b = 3;
        int expected = 14;

        // Action

        int actual = Calculator.sum(a,b);

        // Assert
        assertEquals(expected,actual);

    }
    @Test
    public void testSub(){

        int a = 10;
        int b = 2;
        int expected = 8;

        int actual = Calculator.sub(a,b);

        assertEquals(expected,actual);
    }
    @Test
    public void testMul(){

        int a = 3;
        int b = 3;
        int expected = 9;

        int actual = Calculator.mul(a,b);

        assertEquals(expected,actual);
    }

    @Test
    public void testDiv(){

        int a = 12;
        int b = 3;
        int expected = 4;

        int actual = Calculator.div(a,b);

       assertEquals(expected,actual);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero(){

        int a = 12;
        int b = 0;
        Calculator.div(a,b);
    }
}
