package com.test;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestCalculatorMock {

    @Test
    public void testSomarComMock(){
        Calculator calculator = mock(Calculator.class);

        when(calculator.somar("1+2")).thenReturn(10);
        
        int resultado = calculator.somar("1+2");

        assertEquals(10, resultado);
    }

}
