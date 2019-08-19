package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double resultAdd = calculator.add(4,2);
        double resultSub = calculator.sub(4,2);
        double resultMul = calculator.mul(4,2);
        double resultDiv = calculator.div(4,2);

        //Then
        Assert.assertEquals(resultAdd,6,0.01);
        Assert.assertEquals(resultSub,2,0.01);
        Assert.assertEquals(resultMul,8,0.01);
        Assert.assertEquals(resultDiv,2,0.01);
    }
}
