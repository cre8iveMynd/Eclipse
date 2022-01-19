package com.pdw.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pdw.entities.Employee;
import com.pdw.service.EmployeeService;
import com.pdw.service.EmployeeServiceImpl;



public class Test {
		public static void main(String[] args) {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
			EmployeeService employeeService = ctx.getBean("employeeService", EmployeeServiceImpl.class);

			createEmployee(employeeService);
			//getEmployeeById(employeeService);
			//fetchAllEmployeesInfo(employeeService);
			//employeeService.updateEmployeeEmailById("akash1@gmail.com", 1);
			//employeeService.deleteEmployeeById(1);
			}
		private static void fetchAllEmployeesInfo(EmployeeService employeeService) {
			List<Employee> empList = employeeService.getAllEmployeesInfo();
			for (Employee employee : empList) {
				System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmail()+"\t"+employee.getGender()+"\t"+employee.getSalary());
			}}
		private static void getEmployeeById(EmployeeService employeeService) {
			Employee employee = employeeService.fetchEmployeeById(2);
			System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmail()+"\t"+employee.getGender()+"\t"+employee.getSalary());
		}
		private static void createEmployee(EmployeeService employeeService) {
			Employee employee = new Employee();
			employee.setEmail("akash@gmail.com");
			employee.setEmployeeName("akash");
			employee.setGender("Male");
			employee.setSalary(10000.00);
			
			employeeService.addEmployee(employee);
		}

	}


