package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.set(2, "ALine");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        String nome = nomes.get(2);

        System.out.println(nome);

        Collections.sort(nomes);

        for (String nomeDoItem : nomes){
            System.out.println(nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println("---> "+iterator.next());
        }



    }
}
