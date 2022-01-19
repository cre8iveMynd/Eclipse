package com.pdw.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pdw.dao.EmployeeDAO;
import com.pdw.entities.Employee;
@Service("employeeService") // EmployeeSercvice  emplolyeeService= new eMPLOYEEsERVICEiMPL();
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;
	

	public void addEmployee(Employee employee) {
		
		employeeDAO.createEmployee(employee);
	}
	public Employee fetchEmployeeById(int employeeId) {
		return employeeDAO.getEmployeeById(employeeId);
	}
	public void deleteEmployeeById(int employeeId) {
		employeeDAO.deleteEmployeeById(employeeId);
	}
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		employeeDAO.updateEmployeeEmailById(newEmail, employeeId);
	}
	public List<Employee> getAllEmployeesInfo() {
		return employeeDAO.getAllEmployeesDetails();
	}
}
