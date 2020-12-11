package com.capgemini.employeepayrollapp.dto;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.capgemini.employeepayrollapp.exceptions.ValidationException;

public class EmployeePayrollDTO {
	public String name;
	public String profilePic;
	public String gender;
	public String[] department;
	public double salary;
	public String note;
	public Date startDate;

	public EmployeePayrollDTO(String name, String profilePic, String gender, String[] department, double salary,
			String note, Date startDate) throws ValidationException {
		super();
		this.setName(name);
		this.profilePic = profilePic;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.note = note;
		this.setStartDate(startDate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws ValidationException {
		String namePattern = "^[A-Z]{1}[a-zA-Z\\s]{2,}$";
		Pattern p1 = Pattern.compile(namePattern);
		Matcher matcher = p1.matcher(name);
		boolean b = matcher.matches();
		if (!b)
			throw new ValidationException("Name is Incorrect !");
		else
			this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) throws ValidationException {
		if (startDate.after(new Date())) {
			throw new ValidationException("Date is A Future Date !");
		}
		long diff = Math.abs(new Date().getTime() - startDate.getTime());
		if (diff / (1000 * 60 * 60 * 24) > 30) {
			throw new ValidationException("Date is Not Within 30 Days !");
		}
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "";
	}

}
