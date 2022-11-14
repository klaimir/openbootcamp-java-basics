package com.openbootcamp.java.io;

import java.io.*;

public class MainPrintStream {

    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\0015523\\Downloads\\texto.txt");
            byte datos [] = fichero.readAllBytes();
            fichero.close();

            PrintStream output = new PrintStream("C:\\Users\\0015523\\Downloads\\destino.txt");
            output.write(datos);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
