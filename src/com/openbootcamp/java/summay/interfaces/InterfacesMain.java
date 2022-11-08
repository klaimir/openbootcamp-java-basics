package com.openbootcamp.java.summay.interfaces;

import com.openbootcamp.java.summay.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

        CocheService cocheService1 = new CocheServiceClassicImpl();
        CocheService cocheService2 = new CocheServiceSportImpl();

        Coche coche1 = cocheService1.createCocheDemo();
        Coche coche2 = cocheService2.createCocheDemo();

        System.out.println(coche1);
        System.out.println(coche2);

        cocheService1.destroyCoche(coche1);
        cocheService2.destroyCoche(coche2);

    }
}
