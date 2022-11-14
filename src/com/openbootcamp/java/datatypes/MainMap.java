package com.openbootcamp.java.datatypes;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("clave1", 10);
        map.put("clave2", 20);
        map.put("clave3", 30);
        map.put("clave3", 40);

        System.out.println(map);

        System.out.println(map.get("clave1"));

        map.replace("clave3", 90);
        // Si no existe la clave ni da fallo ni se crea
        map.replace("clave4", 100);

        System.out.println(map);

        map.remove("clave2");

        // Recorrerlo
        for (Map.Entry elemento: map.entrySet()) {
            System.out.println("Elemento clave: " + elemento.getKey() + " con valor: " + elemento.getValue());
        }

        // Lambda
        map.forEach((k, v) -> System.out.println((k + ":" + v)));
        map.keySet().forEach(k -> System.out.println((k + ":" + map.get(k))));
        map.values().forEach(v -> System.out.println(("value: " + v)));
    }
}
