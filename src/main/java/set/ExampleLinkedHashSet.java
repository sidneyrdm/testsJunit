package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleLinkedHashSet {

    public static void main(String[] args) {

        //Mantém a ordem se inserção dos elementos - performance intermediária
        Set<Integer> numeros = new LinkedHashSet<>();

        numeros.add(5);
        numeros.add(9);
        numeros.add(6);
        numeros.add(10);
        numeros.add(4);
        numeros.add(7);
        numeros.add(3);
        numeros.add(2);

        System.out.println(numeros);




    }
}
