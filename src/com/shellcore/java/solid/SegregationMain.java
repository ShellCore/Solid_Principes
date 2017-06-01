package com.shellcore.java.solid;

import com.shellcore.java.solid.entities.factory.CarFactory;
import com.shellcore.java.solid.entities.factory.MaquilaFactory;
import com.shellcore.java.solid.entities.factory.SodaFactory;

/**
 * Segregación de intefaces
 * Created by Cesar. 01/06/2017.
 */
public class SegregationMain {

    public static void main(String[] args) {
        MaquilaFactory maquilaFactory = new MaquilaFactory();
        SodaFactory sodaFactory = new SodaFactory();
        CarFactory carFactory = new CarFactory();
    }
}
