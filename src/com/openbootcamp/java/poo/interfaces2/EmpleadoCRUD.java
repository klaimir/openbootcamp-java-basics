package com.openbootcamp.java.poo.interfaces2;

import com.openbootcamp.java.poo.interfaces1.Empleado;

import java.util.List;

/**
 *  Se declaran los métodos, no se implementan
 *
 *  Actúa como un contrato, dice lo que hay que hacer pero no cómo
 */
public interface EmpleadoCRUD {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);
}
