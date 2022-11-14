package com.openbootcamp.java.io;

import java.util.Scanner;

public class MainScanner {

    public static void main(String[] args) {

        boolean ok = false;
        int a = 0;
        int b = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce dos números:");
            try {
                a = scanner.nextInt();
                b = scanner.nextInt();
                ok = true;
            } catch (Exception e) {
                System.out.println("Excepción: " + e);
            }
        } while (!ok);

        System.out.println("Enteros son: " + a + " y " + b);
    }
}
