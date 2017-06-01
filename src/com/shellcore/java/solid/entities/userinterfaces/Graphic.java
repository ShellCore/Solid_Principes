package com.shellcore.java.solid.entities.userinterfaces;

/**
 * Created by Cesar. 01/06/2017.
 */
public class Graphic implements Input, Output {

    public Graphic() {
    }

    @Override
    public void getInput() {
        System.out.println("Get mouse clicks and movements");
    }

    @Override
    public void getOutput() {
        System.out.println("Show data graphically");
    }
}
