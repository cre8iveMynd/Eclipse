package com.pdw.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pdw.entities.Employee;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

	
	@PersistenceContext
	private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	
	public void createEmployee(Employee employee) {
		entityManager.persist(employee);
	}

	public Employee getEmployeeById(int employeeId) {
		return entityManager.find(Employee.class, employeeId);
	}


	public void deleteEmployeeById(int employeeId) {
		Employee employee = entityManager.find(Employee.class, employeeId);
		if (employee != null) {
			entityManager.remove(employee);
		}
	}


	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		Employee employee = entityManager.find(Employee.class, employeeId);
		if (employee != null) {
			employee.setEmail(newEmail);
			entityManager.merge(employee);
		}
	}

	public List<Employee> getAllEmployeesDetails() {
		Query query = entityManager.createQuery("FROM Employee");
		List<Employee> empList = query.getResultList();
		return empList;
	}
}