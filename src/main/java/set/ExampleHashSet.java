package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {

    public static void main(String[] args) {

        //Não Mantém a ordem se inserção dos elementos - melhor performance
        Set<Double> notaAlunos = new HashSet<>();

        notaAlunos.add(5.8);
        notaAlunos.add(9.3);
        notaAlunos.add(6.5);
        notaAlunos.add(10.0);
        notaAlunos.add(5.4);
        notaAlunos.add(7.3);
        notaAlunos.add(3.8);
        notaAlunos.add(4.0);

        System.out.println(notaAlunos);
        System.out.println("Número de elementos.: "+notaAlunos.size());

        notaAlunos.remove(3.8);
        System.out.println(notaAlunos);
        System.out.println("Número de elementos.: "+notaAlunos.size());

        Iterator<Double> iterator = notaAlunos.iterator();
        while (iterator.hasNext()){
            System.out.println("usando Iterator ---> "+iterator.next());
        }

        for(Double notas : notaAlunos){
            System.out.println("Usando For --->"+notas);
        }






    }

}
