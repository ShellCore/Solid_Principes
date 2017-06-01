package com.shellcore.java.solid.entities.students;

import com.shellcore.java.solid.entities.PaperWork;

/**
 * Created by Cesar. 01/06/2017.
 */
public class ReEntryStudent implements Inscription {

    private String studentId;

    public ReEntryStudent(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public PaperWork procedure(int ID) {
        System.out.println("Inscription of re-entry student");
        return new PaperWork(ID, true, "InProgress", "Inscription", studentId);
    }
}
