package com.capgemini.employeepayrollapp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.employeepayrollapp.dto.EmployeePayrollDTO;
import com.capgemini.employeepayrollapp.model.EmployeePayrollData;
import com.capgemini.employeepayrollapp.repository.EmployeePayrollRepository;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

	@Autowired
	private EmployeePayrollRepository empRepo;

	@Override
	public List<EmployeePayrollData> getEmployeeData() {
		return empRepo.findAll();
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		return empRepo.findById(empId).get();
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empDto) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(empDto);
		empRepo.save(empData);
		return empData;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(int id, EmployeePayrollDTO empDto) {
		EmployeePayrollData empData = null;
		empData = this.getEmployeePayrollDataById(id);
		empData.setName(empDto.name);
		empData.setGender(empDto.gender);
		empData.setDepartment(empDto.department);
		empData.setProfilePic(empDto.profilePic);
		empData.setNote(empDto.note);
		empData.setSalary(empDto.salary);
		empData.setStartDate(empDto.startDate);
		empRepo.save(empData);
		return empData;
	}

	@Override
	public void deleteEmployeePayrollDataById(int empId) {
		empRepo.deleteById(empId);
	}

}
