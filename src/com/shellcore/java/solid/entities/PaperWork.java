package com.shellcore.java.solid.entities;

/**
 * Created by Cesar. 01/06/2017.
 */
public class PaperWork {

    private int ID;
    private boolean automated;
    private String state;
    private String typeOfProcedure;
    private String information;

    public PaperWork(int ID, boolean automated, String state, String typeOfProcedure, String information) {
        this.ID = ID;
        this.automated = automated;
        this.state = state;
        this.typeOfProcedure = typeOfProcedure;
        this.information = information;
    }

    @Override
    public String toString() {
        return this.ID
                + " "
                + this.state
                + " "
                + this.typeOfProcedure
                + " "
                + (automated ? "Automated" : "Manual")
                + "\n\t"
                + this.information;
    }
}
