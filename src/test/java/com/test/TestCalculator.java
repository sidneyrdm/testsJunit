package com.test;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void testSomar(){

        Calculator calc = new Calculator();

        int soma = calc.somar("1+1+3"); //5
        Assert.assertEquals(5, soma);
    }
}
