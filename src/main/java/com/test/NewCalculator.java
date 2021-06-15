package com.test;

public class NewCalculator {

    public int somar(int ...valores) {
        int soma = 0;

        for (int valor : valores) {
            soma += valor;
        }
        return soma;
    }
}
