package com.chainsys.problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		System.out.println("Enter number of employees:");
		int numEmployees = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < numEmployees; i++) {
			System.out.print("Employee ID: ");
			int employeeId = scanner.nextInt();
			scanner.nextLine(); 
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Branch: ");
			String branch = scanner.nextLine();
			System.out.print("Rating: ");
			double rating = scanner.nextDouble();
			scanner.nextLine(); 
			System.out.print("Uses company transport (true/false): ");
			boolean companyTransport = scanner.nextBoolean();
			scanner.nextLine(); 

			Employee employee = new Employee(employeeId, name, branch, rating, companyTransport);
			employees.add(employee);

		}
		int count=findCountOfEmployeesUsingCompTransport(employees);
		Employee emp = findEmployeeWithSecondHighestRating(employees);
	    
	    System.out.println("Count of employees using company transport: " + count);

	    if (emp != null) {
	        System.out.println("Employee with the second highest rating:");
	        System.out.println("Employee ID: " + emp.getEmployeeId());
	        System.out.println("Name: " + emp.getName());
	        System.out.println("Branch: " + emp.getBranch());
	        System.out.println("Rating: " + emp.getRating());
	        System.out.println("Uses company transport: " + emp.isCompanyTransport());
	    } else {
	        System.out.println("There is no employee with the second highest rating.");
	    }
		
		
	}

	public static int findCountOfEmployeesUsingCompTransport(List<Employee> employees) {
		int count = 0;
		for (Employee employee : employees) {
			if (employee.isCompanyTransport()) { 
				count++;
			}
		}
		return count;
	}
	 public static Employee findEmployeeWithSecondHighestRating(List<Employee> employees) {
	        double highestRating = 0;
	        double secondHighestRating = 0;
	        Employee highestEmployee = null;
	        Employee secondHighestEmployee = null;
    
	        for (Employee emp : employees) {
	            if (!emp.isCompanyTransport()) {
	                if (emp.getRating() > highestRating) {
	                	secondHighestRating = highestRating;
	                    secondHighestEmployee = highestEmployee;
	                    highestRating =  emp.getRating();
	                    highestEmployee = emp;
	                } else if (emp.getRating() > secondHighestRating) {
	                	secondHighestRating = emp.getRating();
	                    secondHighestEmployee = emp;
	                }
	            }
	        }
			return secondHighestEmployee;


	 }
}
