package com.shellcore.java.solid;

import com.shellcore.java.solid.entities.PaperWork;
import com.shellcore.java.solid.entities.students.FirstYearStudent;
import com.shellcore.java.solid.entities.students.Inscription;
import com.shellcore.java.solid.entities.students.ReEntryStudent;
import com.shellcore.java.solid.entities.students.TransferedStudent;


import java.util.ArrayList;

/**
 * Abierto en extensión, cerrado en modificación
 * Created by Cesar. 01/06/2017.
 */
public class OpenCloseMain {

    private static ArrayList<PaperWork> universityProcedures = new ArrayList<>();
    private static int idCounter = 17000;

    public static void main(String[] args) {
        // Inscripciones
        newInscription(new FirstYearStudent("Personal Identity Document Data"));
        newInscription(new ReEntryStudent("14101010"));
        newInscription(new TransferedStudent("Previous study on X University"));

        System.out.println("\nProcedures:");

        for (PaperWork procedure :
                universityProcedures) {
            System.out.println(procedure);
        }
    }

    // Interface instance
    public static void newInscription(Inscription inscription) {
        universityProcedures.add(inscription.procedure(idCounter));
        idCounter++;
    }
}
