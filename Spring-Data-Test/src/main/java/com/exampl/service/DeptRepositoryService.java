package com.exampl.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.exampl.entity.Dept;
import com.exampl.repository.DeptRepository;

@Service
public class DeptRepositoryService {
		//save
		public void saveDept(DeptRepository deptRepository,Dept dept) {
			deptRepository.save(dept);
		}
		//delete
		public void deleteDept(DeptRepository deptRepository,Dept dept) {
			deptRepository.delete(dept);
		}
		//update
		public void updateDept(DeptRepository deptRepository,Dept dept) {
			deptRepository.save(dept);
		}
		//findOne
		public Dept findDeptById(DeptRepository deptRepository,int deptno) {
			Dept findOne = deptRepository.findOne(deptno);
			return findOne;
		}
		//findAll
		public List<Dept> findDeptAll(DeptRepository deptRepository) {
			List<Dept> findAll = new ArrayList<>();
			findAll = deptRepository.findAll();
			return findAll;
		}
			
}
