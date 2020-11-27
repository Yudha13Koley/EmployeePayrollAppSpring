package com.capgemini.employeepayrollapp.model;

import com.capgemini.employeepayrollapp.dto.EmployeePayrollDTO;

public class EmployeePayrollData {

	private int employeeId;
	private String name;
	private double salary;

	public EmployeePayrollData() {

	}

	public EmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDto) {
		super();
		this.employeeId = employeeId;
		this.name = employeePayrollDto.name;
		this.salary = employeePayrollDto.salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
