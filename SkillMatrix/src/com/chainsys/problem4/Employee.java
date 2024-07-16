package com.chainsys.problem4;

public class Employee extends Member{
	String specialization;
	@Override
	public String toString() {
		return "Employee [specialization=" + specialization + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getPhoneNumber()=" + getPhoneNumber() + ", getAddress()=" + getAddress() + ", getSalary()="
				+ getSalary() + "]";
	}
	public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
	}



}
