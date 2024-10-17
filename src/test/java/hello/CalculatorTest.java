package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void test1() {
        Calculator calculator = new Calculator();
        double value = calculator.calculate(  "sqrt(pi)");
        assertEquals(1.7724538509055159D, value);
    }

    @Test
    public void test2() {
        Calculator calculator = new Calculator();
        double value = calculator.calculate( "sum(n, 1, 100, 1/n^2)");
        assertEquals(1.634983900184893D, value);
    }

//    @Test
//    public void test3() {
//        Calculator calculator = new Calculator();
//        double value = calculator.calculate( "(2+2)*2");
//        assertEquals(9D, value);
//    }
}
