package com.capgemini.employeepayrollapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.employeepayrollapp.model.EmployeePayrollData;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {

}
