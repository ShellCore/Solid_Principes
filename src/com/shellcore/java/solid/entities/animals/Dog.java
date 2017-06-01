package com.shellcore.java.solid.entities.animals;

/**
 * Created by Cesar. 01/06/2017.
 */
public class Dog extends Animal {

    private String otherRelatedData;
    private int obligatorySuppliesPrice;
    private int optionalSuppliesPrice;


    public Dog(int basePrice, int obligatory, int optional, String otherRelatedData) {
        super("Dog", basePrice, obligatory + optional);
        this.otherRelatedData = otherRelatedData;
        this.obligatorySuppliesPrice = obligatory;
        this.optionalSuppliesPrice = optional;
    }

    @Override
    public String getExtraSupplies() {
        return "\tObligatory: Vaccines, Food 50kg" +
                "\t($" + obligatorySuppliesPrice + ".00)" +
                "\n\t\tOptional: dog collar & harness" +
                "\t($" + optionalSuppliesPrice + ".00)";
    }

    @Override
    public String getBuyOptions() {
        return "Breeds: Golden Retriever, Schnauzer, Huzky\n\t" + otherRelatedData;
    }
}
