package com.shellcore.java.solid.services;

import com.shellcore.java.solid.entities.Worker;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que solo es responsable del cálculo de los salarios
 * Created by Cesar. 01/06/2017.
 */
public final class SalaryCalculator {

    private static HashMap<String, Integer> extraHours = new HashMap<>();

    public SalaryCalculator() {
    }

    public static void initOvertimeHourPayment() {
        extraHours.put("Project developer", 40);
        extraHours.put("Project manager", 25);
    }

    public static HashMap<Integer, Integer> calculateWorkerSalary(HashMap<Integer, Worker> companyWorkers) {
        HashMap<Integer, Integer> companyWorkersSalary = new HashMap<>();

        for (Map.Entry<Integer, Worker> workers :
                companyWorkers.entrySet()) {
            Integer id = workers.getKey();
            Worker worker = workers.getValue();
            int salary = worker.getBaseSalary() +
                    worker.getExtraHoursPerMonth() *
                    extraHours.get(worker.getJobTitle());

            companyWorkersSalary.put(id, salary);
        }

        return companyWorkersSalary;
    }
}
