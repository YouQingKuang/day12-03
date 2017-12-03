package com.exampl.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exampl.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>, JpaSpecificationExecutor<Employee> {
	
//	 //自定义
//	 @Transactional
//	 @Modifying
//	 @Query("update Employee e set e.ename=:ename where e.eid=:eid")
//	 void updateBySname(@Param("ename") String deptname,@Param("eid") Integer deptno);
	
}
