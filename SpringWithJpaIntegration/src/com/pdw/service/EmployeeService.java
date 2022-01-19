package com.pdw.service;

import java.util.List;

import com.pdw.entities.Employee;

public interface EmployeeService {

	void addEmployee(Employee employee);

	Employee fetchEmployeeById(int employeeId);

	void deleteEmployeeById(int employeeId);

	void updateEmployeeEmailById(String newEmail, int employeeId);

	List<Employee> getAllEmployeesInfo();

}
