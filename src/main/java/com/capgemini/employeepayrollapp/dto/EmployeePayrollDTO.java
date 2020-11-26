package com.capgemini.employeepayrollapp.dto;

public class EmployeePayrollDTO {
	public String name;
	public double salary;

	public EmployeePayrollDTO(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollDTO [name=" + name + ", salary=" + salary + "]";
	}

}
