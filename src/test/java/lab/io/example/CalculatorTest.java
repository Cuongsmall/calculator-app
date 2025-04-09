package lab.io.example;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(calc.add(2, 3), 5);
        Assert.assertEquals(calc.add(-2, -3),5);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calc.subtract(5, 2), 3);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(calc.multiply(2, 3), 6);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(calc.divide(6, 2), 3);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        calc.divide(5, 0);
    }
}
