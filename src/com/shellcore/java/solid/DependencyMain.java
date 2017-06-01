package com.shellcore.java.solid;

import com.shellcore.java.solid.entities.userinterfaces.CommandLine;
import com.shellcore.java.solid.entities.userinterfaces.Graphic;
import com.shellcore.java.solid.entities.userinterfaces.UserInterface;

/**
 * Inversión de dependencia
 * Created by Cesar. 01/06/2017.
 */
public class DependencyMain {

    public static void main(String[] args) {
        // Interfáz de usuario gráfica
        UserInterface.getUserInput(new Graphic());
        UserInterface.sendToUserOutput(new Graphic());

        System.out.println();

        // Interfáz de línea de comandos o terminal de usuario
        UserInterface.getUserInput(new CommandLine());
        UserInterface.sendToUserOutput(new CommandLine());
    }
}
