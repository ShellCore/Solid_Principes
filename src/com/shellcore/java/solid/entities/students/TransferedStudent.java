package com.shellcore.java.solid.entities.students;

import com.shellcore.java.solid.entities.PaperWork;

/**
 * Created by Cesar. 01/06/2017.
 */
public class TransferedStudent implements Inscription {

    private String previousStudies;

    public TransferedStudent(String previousStudies) {
        this.previousStudies = previousStudies;
    }

    @Override
    public PaperWork procedure(int ID) {
        System.out.println("Inscription of transfered student");
        return new PaperWork(ID, false, "InProgress", "Inscription" ,previousStudies);
    }
}
