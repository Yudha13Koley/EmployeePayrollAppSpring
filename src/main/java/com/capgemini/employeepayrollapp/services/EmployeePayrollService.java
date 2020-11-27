package com.capgemini.employeepayrollapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.employeepayrollapp.dto.EmployeePayrollDTO;
import com.capgemini.employeepayrollapp.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {
	private List<EmployeePayrollData> empList = new ArrayList<>();

	@Override
	public List<EmployeePayrollData> getEmployeeData() {
		return empList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		return empList.get(empId - 1);
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empDto) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(empList.size() + 1, empDto);
		empList.add(empData);
		return empData;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(int id, EmployeePayrollDTO empDto) {
		EmployeePayrollData empData = null;
		empData = this.getEmployeePayrollDataById(id);
		empData.setName(empDto.name);
		empData.setSalary(empDto.salary);
		empList.set(id - 1, empData);
		return empData;
	}

	@Override
	public void deleteEmployeePayrollDataById(int empId) {
		empList.remove(empId - 1);
	}

}
