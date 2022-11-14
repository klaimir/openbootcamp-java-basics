package com.openbootcamp.java.datatypes;

import java.util.Vector;

public class MainVectores {

    public static void main(String[] args) {

        // El vector es un array por debajo
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        System.out.println(vector);

        vector.remove(1);
        System.out.println(vector);

        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());

        // Si rellenamos el vector por encima de su capacidad se redimensiona a más capacidad
        // Pero esta operación es muy costosa
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }

        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());

        // Tb podemos crear vectores con capacidad e incrementos por desbordamientos definidos por nosotros
        Vector<Integer> vector1 = new Vector(50, 15);

        for (int i = 0; i < 55; i++) {
            vector1.add(i);
        }

        System.out.println("Vector tamaño: " + vector1.size() + " y capacidad: " + vector1.capacity());

        // Comparaciones

        Vector<Integer> vector2 = new Vector();
        vector2.add(1);
        vector2.add(2);

        Vector<Integer> vector3 = new Vector();
        vector3.add(1);
        vector3.add(2);

        if(vector2.equals(vector3)) {
            System.out.println("Los vectores son iguales");
        }

        for (int element: vector3) {
            System.out.println("Elemento " + element);
        }

        for (int i = 0; i < vector2.size(); i++) {
            System.out.println("Elemento es :" + vector2.get(i) + " en la posición " + i);
        }

        // Reducir capacidad

        Vector<Integer> vector4 = new Vector(16);
        vector4.add(1);
        vector4.add(2);
        vector4.add(3);
        vector4.add(4);

        System.out.println("Vector tamaño: " + vector4.size() + " y capacidad: " + vector4.capacity());
        // Tb es una operación costosa
        vector4.trimToSize();
        System.out.println("Vector tamaño: " + vector4.size() + " y capacidad: " + vector4.capacity());
    }
}
