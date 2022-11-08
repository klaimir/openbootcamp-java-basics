package com.openbootcamp.java.poo.interfaces1;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDV2 {

    // Conexión a base de datos
    List<Empleado> empleados = new ArrayList<>();

    /**
     * Create
     * @param empleado
     */
    void saveCRUD2(Empleado empleado) {
        empleados.add(empleado);
    }

    List<Empleado> findAllCRUD2() {
        return empleados;
    }
}
