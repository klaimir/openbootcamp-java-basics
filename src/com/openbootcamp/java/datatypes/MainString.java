package com.openbootcamp.java.datatypes;

public class MainString {

    public static void main(String[] args) {
        String cadena = "Mensaje DE texto";

        int cadenaLen = cadena.length();

        System.out.println(cadenaLen);

        String cadenaMayus = cadena.toUpperCase();

        System.out.println(cadenaMayus);

        String cadenaMinus = cadena.toLowerCase();

        System.out.println(cadenaMinus);

        boolean resultado = cadena.startsWith("Menwe");

        if(resultado) {
            System.out.println("Empieza por Menwe");
        } else {
            System.out.println("No empieza por Menwe");
        }

        boolean resultado2 = cadena.endsWith("texto");

        if(resultado2) {
            System.out.println("Termina por texto");
        } else {
            System.out.println("No Termina por texto");
        }

        char letra = cadena.charAt(0);
        System.out.println("Caracter es letra " + letra);

        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i));
        }

        System.out.println(cadenaMinus.concat(cadenaMayus));
    }
}
