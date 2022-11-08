package com.openbootcamp.java.summay.interfaces;

import com.openbootcamp.java.summay.Coche;
import com.openbootcamp.java.summay.CocheElectrico;

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
