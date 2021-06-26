package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleQeueLinkedList {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Patrícia");
        fila.add("Roberto");
        fila.add("Flávio");
        fila.add("Pamela");
        fila.add("Anderson");

        System.out.println(fila);
        //método PEEK() mostra quem é o próximo elemento a sair da fila, porém não remove\
        String sairDaFila = fila.peek();

        System.out.println(sairDaFila);

        System.out.println(fila);

        //método PEEK() mostra quem é o próximo elemento a sair da fila, porém remove o elemento
        String removerDaFila = fila.poll();

        System.out.println(removerDaFila);

        System.out.println(fila);

        //método PEEK() mostra quem é o próximo elemento a sair da fila,
        // porém não remove Mas lança uma exceção caso a fila esteja vazia
        System.out.println(fila.element());



    }

}
