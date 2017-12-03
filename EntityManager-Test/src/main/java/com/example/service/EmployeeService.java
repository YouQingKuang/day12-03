package com.example.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Dept;
import com.example.model.Employee;

@Service
public class EmployeeService {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void saveEmployee(Employee employee) {
		entityManager.persist(employee);
	}
	
	@Transactional
	public void deleteEmployee(int eid) {
		Employee employee = entityManager.find(Employee.class, eid);
		entityManager.remove(employee);
	}
	
	@Transactional
	public void updateEmployee(Employee employee) {
		entityManager.persist(employee);
	}
	
	@Transactional
	public Employee findEmployee(int eid) {
		Employee employee = entityManager.find(Employee.class, eid);
		return employee;
	}
	
	@Transactional
	public List<Employee> findAllEmployee() {
		List<Employee> list = new ArrayList<>();
		list = entityManager.createQuery(("select e from Employee e"), Employee.class).getResultList();
		return list;
	}
	
}
