package com.openbootcamp.java.errors;

import java.io.IOException;

public class MainThrows {

    public static void main(String[] args) {

        // Se puede poner como una captura genera o bien el tipo de excepción deseado
        try {
            divide(4,0);
        } catch (Exception e) {
            System.out.println("Excepción: " + e);
        }

    }

    public static double divide(int A, int B) throws ArithmeticException, IOException {
        try {
            return A / B;
        } catch (ArithmeticException e) {
            throw new IOException();
        }
    }
}
