package com.shellcore.java.solid.entities.animals;

/**
 * Created by Cesar. 01/06/2017.
 */
public class Fish extends Animal {

    public Fish(int basePrice, int suppliesPrice) {
        super("Fish", basePrice, suppliesPrice);
    }

    @Override
    public String getExtraSupplies() {
        return "\tFishbowl, Food, Fungicide Drops";
    }

    @Override
    public String getBuyOptions() {
        return "Breeds: Beta, Koi, Angel";
    }
}
