package com.capgemini.employeepayrollapp.services;

import java.util.List;

import com.capgemini.employeepayrollapp.dto.EmployeePayrollDTO;
import com.capgemini.employeepayrollapp.model.EmployeePayrollData;

public interface IEmployeePayrollService {

	List<EmployeePayrollData> getEmployeeData();

	EmployeePayrollData getEmployeePayrollDataById(int empId);

	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empDto);

	EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empDto);

	void deleteEmployeePayrollDataById(int empId);
}
