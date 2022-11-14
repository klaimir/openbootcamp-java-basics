package com.openbootcamp.java.datatypes;

import java.math.BigDecimal;

public class MainBigDecimal {

    public static void main(String[] args) {
        System.out.println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f);

        // Si queremos más precisión usamos BigDecimal
        // Usado principalmente en el ámbito financiero
        // Más precisión que float o double
        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(4);

        valorA.multiply(valorB);
        valorA.add(valorB);

        System.out.println(valorA.toString());

        BigDecimal valorC = new BigDecimal(3.14);
        BigDecimal valorD = new BigDecimal(3.15);

        BigDecimal resultado = valorC.add(valorD);

        System.out.println(resultado.toString());
    }
}
