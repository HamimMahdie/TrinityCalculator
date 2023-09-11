package edu.trinity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sumIsEven() {
        Calculator calc = new Calculator();
        calc.sumIsEven(5,2);
        calc.productIsEven(5,2);
    }
}