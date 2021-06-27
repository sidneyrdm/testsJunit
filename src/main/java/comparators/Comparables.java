package comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparables<E> {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Sidney", 31));
        estudantes.add(new Estudante("Eduardo", 25));
        estudantes.add(new Estudante("Suzana", 22));
        estudantes.add(new Estudante("Edna", 50));
        estudantes.add(new Estudante("Iraildo", 58));
        estudantes.add(new Estudante("Jonatas", 7));

        System.out.println("Ordem de inserção.: "+estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("Ordem de Crescente.: "+estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("Ordem de Decrescente.: "+estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("Ordem natural dos números - idade -- method reference.: "+estudantes);
        for(Estudante estudante: estudantes){
            System.out.println(estudante);
        }

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("Ordem natural dos números - idade -- method reverse.: "+estudantes);
        for(Estudante estudante: estudantes){
            System.out.println(estudante);
        }

    }
}
