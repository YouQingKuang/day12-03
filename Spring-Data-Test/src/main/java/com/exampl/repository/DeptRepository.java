package com.exampl.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exampl.entity.Dept;


public interface DeptRepository extends JpaRepository<Dept, Integer>,JpaSpecificationExecutor<Dept> {
	
//	//自定义
//	@Transactional
//	@Modifying
//	@Query("update Dept d set d.deptname=:deptname where d.deptno=:deptno")
//	void updateBySname(@Param("deptname") String deptname,@Param("deptno") Integer deptno);

}
