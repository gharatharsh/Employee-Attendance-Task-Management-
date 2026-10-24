package com.eatm.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatm.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	EntityManager entityManager;

	@Autowired
	EntityTransaction entityTransaction;

	// Save Employee
	public void saveEmployee(Employee employee) {

		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}

	// Update Employee
	public void updateEmployee(Employee employee) {

		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();

	}

	// Delete Employee
	public void deleteEmployee(int employeeId) {

		Employee employee = entityManager.find(Employee.class, employeeId);

		if (employee != null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
		}
	}

	// Find Employee by ID
	public Employee findEmployeeById(int employeeId) {
		return entityManager.find(Employee.class, employeeId);
	}

	// Find All Employees
	public List<Employee> findAllEmployee() {
		return entityManager.createQuery("SELECT employee FROM Employee employee ", Employee.class).getResultList();
	}

	// find based on Email and password
	public Employee findByEmailAndPassword(String email, String password) {
		Query query = entityManager.createQuery(
				"SELECT employee FROM Employee employee WHERE employee.email = ?1 AND employee.password = ?2");
		query.setParameter(1, email);
		query.setParameter(2, password);

		List<Employee> list = query.getResultList();
		if (list.size() > 0)
			return list.get(0);
		return null;
	}

	public List<Employee> findAllDevelopr() {
		return entityManager.createQuery("SELECT employee FROM Employee employee WHERE role = 'Developer'")
				.getResultList();
	}

	// find employee based on email
	public Employee findByEmail(String email) {
		if (email == null) {
			return null;
		}

		Query query = entityManager.createQuery("SELECT e FROM Employee e WHERE e.email = :email");

		query.setParameter("email", email);

		return (Employee) query.getSingleResult();
	}

	
	// update developer name
	public Employee updateDeveloperName(int employeeId, String employeeName) {

		Employee employee = entityManager.find(Employee.class, employeeId);

		if (employee == null) {
			return null;
		}
		
		employee.setEmployeeName(employeeName);
		return entityManager.merge(employee);
	}
	

	// update developer email
	public Employee updateDeveloperEmail(int employeeId, String email) {

		Employee employee = entityManager.find(Employee.class, employeeId);

		if (employee == null) {
			return null;
		}
		
		employee.setEmail(email);
		return entityManager.merge(employee);
	}
}
