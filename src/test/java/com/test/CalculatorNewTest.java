package com.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorNewTest {

    @Test
    public void SomaDoisValores(){
        int valorA = 1;
        int valorB = 2;

        NewCalculator newCalc = new NewCalculator();
        int soma = newCalc.somar(valorA, valorB);

        assertEquals(3, soma);
    }

    @Test
    public void SomarTresValores(){
        int valorA = 1;
        int valorB = 2;
        int valorC = 3;

        NewCalculator newCalc = new NewCalculator();
        int soma = newCalc.somar(valorA, valorB, valorC);

        assertEquals(6, soma);
    }
}

