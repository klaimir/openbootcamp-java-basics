package com.openbootcamp.java.poo.interfaces1;

import java.util.ArrayList;
import java.util.List;

/**
 * Create
 * Retrive/Read
 * Update
 * Delete
 */
public class EmpleadoCRUDV1 {

    List<Empleado> empleados = new ArrayList<>();

    /**
     * Create
     * @param empleado
     */
    void save(Empleado empleado) {
        empleados.add(empleado);
    }

    List<Empleado> findAll() {
        return empleados;
    }
}
