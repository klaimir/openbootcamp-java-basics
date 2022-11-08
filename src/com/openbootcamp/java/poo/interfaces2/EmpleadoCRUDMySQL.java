package com.openbootcamp.java.poo.interfaces2;

import com.openbootcamp.java.poo.interfaces1.Empleado;

import java.util.List;

public class EmpleadoCRUDMySQL implements EmpleadoCRUD {


    @Override
    public void save(Empleado empleado) {
        System.out.println("Save EmpleadoCRUDMySQL");
    }

    @Override
    public List<Empleado> findAll() {
        System.out.println("findAll EmpleadoCRUDMySQL");
        return null;
    }

    @Override
    public void delete(Empleado empleado) {
        System.out.println("delete EmpleadoCRUDMySQL");
    }
}
