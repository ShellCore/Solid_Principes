package com.shellcore.java.solid;

import com.shellcore.java.solid.entities.Worker;
import com.shellcore.java.solid.services.SalaryCalculator;

import java.util.HashMap;

/**
 * Responsabilidad Simple
 * Created by Cesar. 01/06/2017.
 */
public class SimpleResponsabilityMain {

    public static void main(String[] args) {
        HashMap<Integer, Worker> companyWorkers = new HashMap<>();

        // Agregando 2 trabajadores
        companyWorkers.put(170015,
                new Worker(170015, 5000, 20, "John Smith", "Project developer"));
        companyWorkers.put(170016,
                new Worker(170016, 5100, 20, "Sam Stevenson", "Project manager"));

        // Inicialización de la paga de horas extra para los 2 tipos de título de empleo
        SalaryCalculator.initOvertimeHourPayment();

        // Cálculo del salario sin horas extra
        HashMap<Integer, Integer> companyWorkersSalaries = SalaryCalculator.calculateWorkerSalary(companyWorkers);

        // Impresión en la consola
        System.out.println("Salaries without extra hours:");
        System.out.println( companyWorkers.get(170015) + ",\n\tSalary: " + companyWorkersSalaries.get(170015) + " money unit");
        System.out.println( companyWorkers.get(170016) + ",\n\tSalary: " + companyWorkersSalaries.get(170016) + " money unit");

        // Agregando horas extra
        companyWorkers.replace(170015, companyWorkers.get(170015).addExtraHour(10));
        companyWorkers.replace(170016, companyWorkers.get(170016).addExtraHour(5));

        // Cálculo del salario con horas extra
        companyWorkersSalaries = SalaryCalculator.calculateWorkerSalary(companyWorkers);

        // Impresión en la consola
        System.out.println("Salaries without extra hours:");
        System.out.println( companyWorkers.get(170015) + ",\n\tSalary: " + companyWorkersSalaries.get(170015) + " money unit");
        System.out.println( companyWorkers.get(170016) + ",\n\tSalary: " + companyWorkersSalaries.get(170016) + " money unit");
    }
}
