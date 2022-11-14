package com.openbootcamp.java.datatypes;

public class MainArrays {

    public static void main(String[] args) {

        // Array fijo de 5 enteros
        int arrayUno[] = new int[5];

        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i] = i;
        }

        for (int i : arrayUno) {
            System.out.println(i);
        }

        // Declaración e inicialización
        int arrayDos[] = {1, 2, 3, 4, 5};

        String arrayString[] = {
                "Manolo",
                "Pepe",
                "Juan"
        };

        // Foreach
        for (String nombre: arrayString) {
            System.out.println(nombre);
        }

        // Array bidimensional
        int arrayBidi[][]= new int[2][4];

        for (int i = 0; i < arrayBidi.length; i++) {
            for (int j = 0; j < arrayBidi[i].length; j++) {
                arrayBidi[i][j] = i + j;
            }
        }

        for (int i = 0; i < arrayBidi.length; i++) {
            System.out.println("Fila " + i);
            for (int j = 0; j < arrayBidi[i].length; j++) {
                arrayBidi[i][j] = i + j;
                System.out.println("Valor " + j + " es " + arrayBidi[i][j]);
            }
        }
    }
}
