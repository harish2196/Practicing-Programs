package com.chainsys.problem1;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String companyName;
    private ArrayList<Employee> employees;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public int getNoOfEmployees() {
        if (employees != null) {
            return employees.size();
        } else {
            return 0;
        }
    }

    public Company(String companyName, ArrayList<Employee> employees) {
        this.companyName = companyName;
        this.employees = employees;
    }

    public double getAverageSalary() {
       
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }

        return totalSalary / employees.size();
    }

    public double getMaxSalary() {
      
        double maxSalary = 0;
        for (int i = 1; i < employees.size(); i++) {
            if (employees.get(i).getSalary() > maxSalary) {
                maxSalary = employees.get(i).getSalary();
            }
        }
        return maxSalary;
    }

    public List<Employee> getEmployeesByDesignation(String designation) {
        List<Employee> employeesWithDesignation = new ArrayList<>();
        if (employees != null) {
            for (Employee employee : employees) {
                if (employee.getDesignation().equalsIgnoreCase(designation)) {
                    employeesWithDesignation.add(employee);
                }
            }
        }
        return employeesWithDesignation;
    }

    @Override
    public String toString() {
        return "Company [companyName=" + companyName + ", employees=" + employees + ", noOfEmployees=" + getNoOfEmployees() + "]";
    }
}
