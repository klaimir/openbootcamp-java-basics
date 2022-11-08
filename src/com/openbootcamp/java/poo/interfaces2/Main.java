package com.openbootcamp.java.poo.interfaces2;

import com.openbootcamp.java.poo.interfaces1.Empleado;

public class Main {

    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDMySQL();

    public static void main(String[] args) {

        Empleado juanito = new Empleado("Juanito", 30, 40000, true);
        empleadoCRUD.findAll();
        empleadoCRUD.save(juanito);
    }
}
