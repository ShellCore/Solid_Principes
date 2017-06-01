package com.shellcore.java.solid.entities.userinterfaces;

/**
 * Created by Cesar. 01/06/2017.
 */
public final class UserInterface {

    public UserInterface() {
    }

    public static void getUserInput(Input input) {
        input.getInput();
    }

    public static void sendToUserOutput(Output output) {
        output.getOutput();
    }
}
