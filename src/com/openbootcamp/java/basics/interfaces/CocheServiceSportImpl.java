package com.openbootcamp.java.basics.interfaces;

import com.openbootcamp.java.basics.Coche;
import com.openbootcamp.java.basics.CocheHibrido;

public class CocheServiceSportImpl implements CocheService {
    @Override
    public Coche createCocheDemo() {
        System.out.println("Create coche sport");
        return new CocheHibrido();
    }

    @Override
    public void destroyCoche(Coche coche) {
        System.out.println("Destroy coche sport");
    }
}
