package map;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {
    public static void main(String[] args) {

        //Map não extende collections

        Map<String, Integer> campeosMundialFifa = new HashMap<>();

        campeosMundialFifa.put("Brasil", 5);
        campeosMundialFifa.put("Alemanha", 4);
        campeosMundialFifa.put("Itália", 4);
        campeosMundialFifa.put("Uruguai", 2);
        campeosMundialFifa.put("Argentina", 2);
        campeosMundialFifa.put("França", 2);
        campeosMundialFifa.put("Inglaterra", 2);
        campeosMundialFifa.put("Espanha", 1);

        System.out.println("HashMap original.: "+campeosMundialFifa);

        campeosMundialFifa.put("Brasil", 6);
        System.out.println("valor da chave BRASIL atualizado de 5 para 6");

        System.out.println("Método Get para Argentina.: "+campeosMundialFifa.get("Argentina"));
        System.out.println("Método containsKey para França.: "+campeosMundialFifa.containsKey("França"));

        campeosMundialFifa.remove("França");
        System.out.println("HashMap depois de ter removido a chave França.: "+campeosMundialFifa);

        System.out.println("Método containsValue para 6.: "+campeosMundialFifa.containsValue(6));

        System.out.println("Método size.: "+campeosMundialFifa.size());

        //navegação nos registros do Map
        for (Map.Entry<String, Integer > entry : campeosMundialFifa.entrySet()){
            System.out.println(entry.getKey() + "-- "+ entry.getValue());
        }





    }
}
