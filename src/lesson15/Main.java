package lesson15;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap <String, Integer> table = new HashMap<>();
        table.put("Динамо", 12);
        table.put("ЦСКА", 20);
        table.put("Спартак", 15);
        table.put("Зенит", 8);

        System.out.println(table);

        // первый проход по Map
        for (String key:table.keySet()){
            System.out.println(key + "-"+ table.get(key));

            // второй проход по коллекции

            for (Map.Entry <String,Integer> kv:table.entrySet()){
                System.out.println(kv.getKey()+ "-" + kv.getValue());
            }
        }
    }
}

