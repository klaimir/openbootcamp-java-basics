package com.openbootcamp.java.poo.interfaces1;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmpleadoCRUDV1 empleadoCRUDV1 = new EmpleadoCRUDV1();

        Empleado juanito = new Empleado("Juanito", 30, 40000, true);
        Empleado patricia = new Empleado("Patricia", 30, 40000, true);
        Empleado roberto = new Empleado("Roberto", 30, 40000, true);

        // Save empleados
        empleadoCRUDV1.save(juanito);
        empleadoCRUDV1.save(patricia);
        empleadoCRUDV1.save(roberto);

        // Find empleados
        List<Empleado> empleados = empleadoCRUDV1.findAll();
        System.out.println(empleados);
    }
}
