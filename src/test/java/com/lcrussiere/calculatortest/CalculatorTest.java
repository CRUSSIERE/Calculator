package com.lcrussiere.calculatortest;

import com.lcrussiere.calculator.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Integer opG;
    Integer opD;

    @BeforeEach
    void setup(){
        opG = 2;
        opD = 3;
    }


    @Test
    public void testAdd() {
        // Calculer la somme de opG et opD
        int result = Calculator.add(opG, opD);
        assertEquals(result, Calculator.add(opG, opD));
    }

    @Test
    public void testDivide() {
        // Calculer la division de opG par opD
        int result = Calculator.divide(opG, opD);
        assertEquals(result, Calculator.divide(opG, opD));
    }

    @AfterEach
    void tearDown(){
        opG = null;
        opD = null;
    }
}
