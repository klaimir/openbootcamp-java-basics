package com.openbootcamp.java.errors;

import java.util.Scanner;

public class MainErrors {

    // Al poner el suppress se puede configurar el ámbito
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos números: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        int resultado = 0;
        int resultado2; // Esta variable provoca warning pero está suprimido

        try {
            resultado = numeroA / numeroB;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            // No está bien visto que se use finally...
            // A veces se utiliza para resetear variables o cerrar Streams
            System.out.println("Finally...");
        }

        System.out.println("Resultado es: " + resultado);
    }
}
