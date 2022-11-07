package com.openbootcamp.java.basics.interfaces;

import com.openbootcamp.java.basics.Coche;
import com.openbootcamp.java.basics.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService {
    @Override
    public Coche createCocheDemo() {
        System.out.println("Create coche classic");
        return new CocheElectrico();
    }

    @Override
    public void destroyCoche(Coche coche) {
        System.out.println("Destroy coche classic");
    }
}
