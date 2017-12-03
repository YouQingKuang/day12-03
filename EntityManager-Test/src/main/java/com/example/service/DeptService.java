package com.example.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Dept;

@Service
public class DeptService {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void saveDept(Dept dept) {
		System.out.println(dept);
		entityManager.persist(dept);
	}
	
	@Transactional
	public void deleteDept(int deptno) {
		Dept dept = entityManager.find(Dept.class, deptno);
		entityManager.remove(dept);
	}
	
	@Transactional
	public void updateDept(Dept dept) {
		entityManager.persist(dept);
	}
	
	@Transactional
	public Dept findDept(int deptno) {
		Dept dept = entityManager.find(Dept.class, deptno);
		return dept;
	}
	
	@Transactional
	public List<Dept> findAllDept() {
		List<Dept> list = new ArrayList<>();
		list = entityManager.createQuery(("select e from Dept e"), Dept.class).getResultList();
		return list;
	}

}
