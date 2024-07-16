package com.chainsys.problem4;

public class DataMember {

	public static void main(String[] args) {
		Employee emp = new Employee("Harish", 22, "1234567890", "123 Main St, Svks", 50000, "Software Engineer");
		Manager mgr = new Manager("Akash", 25, "9876543210", "456 Park Ave, Mdu", 80000, "Engineering");
		System.out.println(emp.toString());
		System.out.println(mgr.toString());

	}

}
