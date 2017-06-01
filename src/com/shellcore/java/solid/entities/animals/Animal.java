package com.shellcore.java.solid.entities.animals;

/**
 * Clase padre
 * Created by Cesar. 01/06/2017.
 */
public abstract class Animal {

    private String name;
    private int basePrice;
    private int suppliesPrice;

    public Animal(String name, int basePrice, int suppliesPrice) {
        this.name = name;
        this.basePrice = basePrice;
        this.suppliesPrice = suppliesPrice;
    }

    public String getName() {
        return name;
    }

    public String getCompletePrice() {
        return "Animal price: $"
                + basePrice
                + ".00 + Supplies price: $"
                + suppliesPrice
                + ".00"
                + "\n\tTotal price: $"
                + (basePrice + suppliesPrice)
                + ".00";
    }

    public abstract String getExtraSupplies();
    public abstract String getBuyOptions();
}
