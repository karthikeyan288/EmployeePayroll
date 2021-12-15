package com.File_IO;

public class EmployeePayroll_Info {
	int id;
	String name;
	double salary; 
	
	public EmployeePayroll_Info(int data, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollData [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
