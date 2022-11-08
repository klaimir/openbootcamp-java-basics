package com.openbootcamp.java.summay;

public class CocheHibrido extends Coche {

    String motorHibrido;

    /**
     * @param color
     * @param fabricante
     * @param peso
     * @param velocidad
     * @param motorHibrido
     */
    public CocheHibrido(String color, String fabricante, Double peso, Integer velocidad, String motorHibrido) {
        super(color, fabricante, peso, velocidad);
        this.motorHibrido = motorHibrido;
    }

    public CocheHibrido() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "com.openbootcamp.java.basics.CocheHibrido [motorHibrido=" + motorHibrido + ", color=" + color + ", fabricante=" + fabricante
                + ", peso=" + peso + ", velocidad=" + velocidad + "]";
    }

    public String getMotorHibrido() {
        return motorHibrido;
    }

    public void setMotorHibrido(String motorHibrido) {
        this.motorHibrido = motorHibrido;
    }
}
