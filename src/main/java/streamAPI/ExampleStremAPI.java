package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStremAPI {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");


        //Retorna a contagem dos elementos da STREAM
        System.out.println("Contagem.: "+estudantes.stream().count());

        //Retorna o elemento com maior numero de letras
        System.out.println("Palavra com maior número de letras.: "
                +estudantes.stream().max(Comparator.comparingInt(String::length)));

        //Retorna o elemento com menor numero de letras
        System.out.println("Palavra com menor número de letras.: "
                +estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Retorna os elementos que Tem a letra R na palavra
        System.out.println("Elementos que contém a letra R.: "
        +estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Retorna uma nova coleção com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Retorna uma nova coleção com a quantidade de letras.: "+
                estudantes.stream().map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elementos.: "+
                estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no consol e depois retorna a mesma coleção
        System.out.println("Retorna os elementos.: "+
                estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elemento no console, sem retornar uma nova coleção
        System.out.println("Retorna os elementos novamente.: ");
                estudantes.stream().forEach(System.out::println);

        //Retorna true se todos os elementos possuem a letra W na palavra
        System.out.println("Todos os elementos tem a letra W ?"+
                estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        //Retorna true se algum elemento possuir a letra 'a' minúscula na palavra
        System.out.println("Algum elemento tem a letra a ?"+
                estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));


        //Retorna true se nenhum elemento possuir a letra 'a' minúscula na palavra
        System.out.println("nenhum elemento tem a letra a ?"+
                estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        //Retorna o primeiro elemento da coleção, se existir, exibe no console
        System.out.println("Primeiro elemento da coleção.: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Exemplo de operação Encadeada
        System.out.println("Operação encadeada.: ");
        System.out.println(estudantes.stream()
        .peek(System.out::println)
        .map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length())))
        .peek(System.out::println)
        //.filter((estudante) -> estudante.toLowerCase().contains("r"))
        //.collect(Collectors.toList()));
         //.collect(Collectors.joining(", ")));
                //.collect(Collectors.toSet()));
                .collect(Collectors.groupingBy(estudante
                        -> estudante.substring(estudante.indexOf("-") + 1))));

    }




}

