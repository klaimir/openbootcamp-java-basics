package com.openbootcamp.java.datatypes;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainArrayList {

    public static void main(String[] args) {

        // ArrayList
        // Utiliza un array por debajo
        // Rápida para almacenar datos y buscar

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        lista.remove("ElementoB");

        System.out.println(lista);

        for (String elemento: lista) {
            System.out.println(elemento);
        }

        // Conversión a array
        String array[] = new String[lista.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = lista.get(i);
        }

        System.out.println(array.toString());

        // LinkedList
        // Utiliza una lista doblemente enlazada por debajo
        // Rápida para modificar datos

        LinkedList<String> listaEnlazada = new LinkedList<String>();
    }
}
