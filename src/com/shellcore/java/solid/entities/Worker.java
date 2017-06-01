package com.shellcore.java.solid.entities;

/**
 * Clase que solo se hace cargo de administrar la información de un trabajador
 * Created by Cesar. 01/06/2017.
 */
public class Worker {
    private int ID;
    private int baseSalary;
    private int workHours;
    private int extraHoursPerMonth;
    private String fullName;
    private String jobTitle;

    public Worker(int ID, int baseSalary, int workHours, String fullName, String jobTitle) {
        this.ID = ID;
        this.baseSalary = baseSalary;
        this.workHours = workHours;
        this.fullName = fullName;
        this.jobTitle = jobTitle;
    }

    public Worker addExtraHour(int hoursPerDay) {
        this.extraHoursPerMonth += hoursPerDay;
        return this;
    }

    public void resetExtraHour() {
        this.extraHoursPerMonth = 0;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getExtraHoursPerMonth() {
        return extraHoursPerMonth;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String toString() {
        return fullName + " " + jobTitle;
    }
}
