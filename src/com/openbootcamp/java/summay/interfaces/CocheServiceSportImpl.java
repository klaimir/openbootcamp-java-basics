package com.openbootcamp.java.summay.interfaces;

import com.openbootcamp.java.summay.Coche;
import com.openbootcamp.java.summay.CocheHibrido;

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
