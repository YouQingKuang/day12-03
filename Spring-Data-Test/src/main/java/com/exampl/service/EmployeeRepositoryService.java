package com.exampl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exampl.entity.Employee;
import com.exampl.repository.EmployeeRepository;

@Service
public class EmployeeRepositoryService {
	
	//save
	public void saveEmployee(EmployeeRepository empRepository,Employee emp) {
		empRepository.save(emp);
	}
	//delete
	public void deleteEmployee(EmployeeRepository empRepository,Employee emp) {
		empRepository.delete(emp);
	}
	//update
	public void updateEmployee(EmployeeRepository empRepository,Employee emp) {
		empRepository.save(emp);
	}
	//findOne
	public Employee findEmployeeById(EmployeeRepository empRepository,int eid) {
		Employee findOne = empRepository.findOne(eid);
		return findOne;
	}
	//findAll
	public List<Employee> findEmployeeAll(EmployeeRepository empRepository) {
		List<Employee> findAll = new ArrayList<>();
		findAll = empRepository.findAll();
		System.out.println(findAll+"000000");
		return findAll;
	}
	
	
	
}
