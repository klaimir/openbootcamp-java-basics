package com.openbootcamp.java.io;

import java.io.*;

public class MainInputStream {

    public static void main(String[] args) {

        // Lectura completa del fichero con byte
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\0015523\\Downloads\\texto.txt");

            byte datos [] = fichero.readAllBytes();

            for (byte dato: datos) {
                System.out.print((char) dato);
            }

        } catch (FileNotFoundException e) {
            // throw new RuntimeException(e);
            System.out.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Lectura carácter a carácter
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\0015523\\Downloads\\texto.txt");

            int dato = fichero.read();
            while(dato != -1) {
                System.out.print((char) dato);
                dato = fichero.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Lectura con BufferedInputStream
        // El buffer se encarga de leer poco a poco, tal cual va necesitando, el fichero
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\0015523\\Downloads\\texto.txt");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            int dato = ficheroBuffer.read();
            while(dato != -1) {
                System.out.print((char) dato);
                dato = ficheroBuffer.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
