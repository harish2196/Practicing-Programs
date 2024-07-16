package com.chainsys.problem1;

public class Employee {
	
  

	private int id;
    private String name;
    private String designation;
    private double salary;

  

	public int getId() {
		return id;
	}

	public Employee(int id, String name, String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	public Employee() {
		super();
	}

	public double getSalary() {
		return salary;
		
	}
	
	public String getDesignation() {
		return designation;
		
	}
}
