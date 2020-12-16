package com.capgemini.employeepayrollapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.employeepayrollapp.model.EmployeePayrollData;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {

	@Query(value = "select*from EMPLOYEES_TABLE a,employee_department_table b where a.id=b.id and department=:department ", nativeQuery = true)
	List<EmployeePayrollData> findEmployeesByDepartment(String department);
}
