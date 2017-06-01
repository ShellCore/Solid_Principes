package com.shellcore.java.solid.entities.students;

import com.shellcore.java.solid.entities.PaperWork;

/**
 * Created by Cesar. 01/06/2017.
 */
public class FirstYearStudent implements Inscription {

    private String personalIdentityDocument;

    public FirstYearStudent(String personalIdentityDocument) {
        this.personalIdentityDocument = personalIdentityDocument;
    }

    @Override
    public PaperWork procedure(int ID) {
        System.out.println("Inscription of new student");
        return new PaperWork(ID, false, "InProgress", "Inscription", personalIdentityDocument);
    }
}
