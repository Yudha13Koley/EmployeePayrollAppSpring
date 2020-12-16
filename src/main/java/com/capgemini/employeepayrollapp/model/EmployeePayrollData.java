package com.capgemini.employeepayrollapp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.capgemini.employeepayrollapp.dto.EmployeePayrollDTO;

@Entity
@Table(name = "EMPLOYEES_TABLE")
public class EmployeePayrollData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String profilePic;
	private String gender;
	@ElementCollection
	@CollectionTable(name = "employee_department_table", joinColumns = @JoinColumn(name = "id"))
	@Column(name = "department")
	private List<String> department;
	private double salary;
	private String note;
	private Date startDate;

	public EmployeePayrollData() {

	}

	public EmployeePayrollData(EmployeePayrollDTO employeePayrollDto) {
		super();
		this.name = employeePayrollDto.name;
		this.salary = employeePayrollDto.salary;
		this.profilePic = employeePayrollDto.profilePic;
		this.gender = employeePayrollDto.gender;
		this.department = employeePayrollDto.department;
		this.note = employeePayrollDto.note;
		this.startDate = employeePayrollDto.startDate;
	}

	public EmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDto) {
		super();
		this.id = employeeId;
		this.name = employeePayrollDto.name;
		this.salary = employeePayrollDto.salary;
		this.profilePic = employeePayrollDto.profilePic;
		this.gender = employeePayrollDto.gender;
		this.department = employeePayrollDto.department;
		this.note = employeePayrollDto.note;
		this.startDate = employeePayrollDto.startDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int employeeId) {
		this.id = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getDepartment() {
		return department;
	}

	public void setDepartment(List<String> department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
}
