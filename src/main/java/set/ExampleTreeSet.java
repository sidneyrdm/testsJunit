package set;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {

    public static void main(String[] args) {

        //Mantém a ordem se inserção dos elementos - performance não tão boa / só tem boa performance em leitura
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(5);
        numeros.add(9);
        numeros.add(6);
        numeros.add(10);
        numeros.add(4);
        numeros.add(7);
        numeros.add(3);
        numeros.add(2);

        System.out.println("números na ordem de inserção.: "+numeros);
        numeros.stream().sorted();

        System.out.println("números ordenados.: "+numeros);

        System.out.println("Primeiro elemento do Set.: "+numeros.first());
        System.out.println("Ultimo elemento do Set.: "+numeros.last());

        System.out.println("mostra e remove o Primeiro elemento do Set.: "+numeros.pollFirst());
        System.out.println("mostra e remove o Ultimo elemento do Set.: "+numeros.pollLast());
        System.out.println("Lista após remoções.: "+numeros);
        System.out.println("Uso do Método Lower - retorna o elemento abaixo do elemento 4.: "+numeros.lower(4));
        System.out.println("Uso do Método Lower - retorna o elemento acima do elemento 4.: "+numeros.higher(4));




    }
}
