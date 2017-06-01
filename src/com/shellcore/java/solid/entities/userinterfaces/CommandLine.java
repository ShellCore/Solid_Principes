package com.shellcore.java.solid.entities.userinterfaces;

/**
 * Created by Cesar. 01/06/2017.
 */
public class CommandLine implements Input, Output {

    public CommandLine() {
    }

    @Override
    public void getInput() {
        System.out.println("Get commands");
    }

    @Override
    public void getOutput() {
        System.out.println("Print data to terminal");
    }
}
