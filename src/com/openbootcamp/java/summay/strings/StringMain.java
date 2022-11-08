package com.openbootcamp.java.summay.strings;

public class StringMain {

    /**
     * Java application entry point
     * @param args - arguments for application
     */
    public static void main(String[] args) {

        // La clase String

        /*
            length
            startsWith
            endsWith
            indexOf
            subString
            trim
            equals
            compareTo
         */

        String nombre = "  Hola mundo  ";
        System.out.println(nombre.length());

        String mensajeMAY = nombre.toUpperCase();
        System.out.println(mensajeMAY);
        System.out.println(mensajeMAY.trim());
        mensajeMAY = mensajeMAY.trim();

        String otro = "hola mundo";
        if(mensajeMAY.equalsIgnoreCase(otro)) {
            System.out.println("VERDADERO");
        }
    }
}
