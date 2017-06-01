package com.shellcore.java.solid;

import com.shellcore.java.solid.entities.animals.Dog;
import com.shellcore.java.solid.entities.animals.Fish;
import com.shellcore.java.solid.services.PetShopInfoCenter;

/**
 * Sustitución de Liskov
 * Created by Cesar. 01/06/2017.
 */
public class LiskovMain {

    public static void main(String[] args) {

        PetShopInfoCenter.addProduct(
                new Dog(180, 100, 15, "If you adopt, supplies are free")
        );
        PetShopInfoCenter.addProduct(
                new Fish(15, 15)
        );

        System.out.println(PetShopInfoCenter.generateCatalogue());
    }
}
