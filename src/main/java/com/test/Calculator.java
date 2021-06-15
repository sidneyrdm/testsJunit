package com.test;

public class Calculator {

    public int somar(String expressao){
        int soma = 0;
        for (String valorSoma : expressao.split("\\+"))
            soma += Integer.valueOf(valorSoma);

        System.out.println(soma);
        return soma;
    }

}
