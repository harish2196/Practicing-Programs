package com.chainsys.problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		ArrayList<Employee> companyList = new ArrayList<Employee>();
		System.out.print("Enter company name: ");
		String  companyName = scanner.nextLine();	

		System.out.println("Enter the number of employees:");
		int numberOfEmployees = scanner.nextInt();
		ArrayList<Employee> employees = new ArrayList<>();
		for (int i = 0; i < numberOfEmployees; i++) {
			System.out.print("Enter employee ID: ");
			int empId = scanner.nextInt();
			scanner.nextLine(); 	            
			System.out.print("Enter employee name: ");
			String empName = scanner.nextLine();	            
			System.out.print("Enter employee designation: ");
			String empDesignation = scanner.nextLine();	            
			System.out.print("Enter employee salary: ");
			double empSalary = scanner.nextDouble();
			Employee employee = new Employee(empId, empName, empDesignation, empSalary);
			employees.add(employee);

		}
		companyList.addAll(employees);		
		Company company = new Company(companyName, employees);
		System.out.println("Average Salary: "+ company.getAverageSalary());
		System.out.println("Max Salary: "+ company.getMaxSalary());
		System.out.print("Enter employee designation: ");
		String empDesignation = scanner.next();	 
		System.out.println("Designation"+ company.getEmployeesByDesignation(empDesignation));
	

	}

}
