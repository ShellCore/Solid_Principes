package com.shellcore.java.solid.services;

import com.shellcore.java.solid.entities.animals.Animal;

import java.util.ArrayList;

/**
 * Created by Cesar. 01/06/2017.
 */
public class PetShopInfoCenter {

    private static ArrayList<Animal> productCatalogue = new ArrayList<>();

    public PetShopInfoCenter() {
    }

    public static void addProduct(Animal pet) {
        productCatalogue.add(pet);
    }

    public static String generateCatalogue() {
        String catalogue = "";

        for (Animal pet:
             productCatalogue) {
            catalogue += pet.getName()
                    + ":\n\t"
                    + pet.getCompletePrice()
                    + "\n\t"
                    + pet.getExtraSupplies()
                    + "\n\t"
                    + pet.getBuyOptions()
                    + "\n\n";
        }

        return catalogue;
    }
}
