package com.chainsys.skillmatrix;

import java.util.Scanner;

public class EmployeeService {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Age: ");
		int age=scanner.nextInt();
		while(age<0) {
			System.out.println("Negative Number...");
			System.out.println("Enter Age: ");
			age=scanner.nextInt();
		}

		System.out.println("Enter Gender M or F: ");
		char gender=scanner.next().charAt(0);

		if(gender=='F' || gender=='M') {

			if(gender=='F') 
			{
				System.out.println("she will work only in urban areas.");
			}
			else if(gender=='M' && (age>=20 && age<=40)) 
			{
				System.out.println(" he may work in anywhere");
			}
			else if(gender=='M' && (age>=40 && age<=60)) 
			{
				System.out.println("he will work in urban areas only");
			}
			else 
			{
				System.out.println("Error");
			}

		}else{
			System.out.println("Invalid Data");
		}

		scanner.close();

	}

}
