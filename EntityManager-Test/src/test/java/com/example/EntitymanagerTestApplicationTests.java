package com.example;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.Dept;
import com.example.model.Employee;
import com.example.service.DeptService;
import com.example.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntitymanagerTestApplicationTests {
	
	@Autowired
	private DeptService deptService;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Test
	public void contextLoads() {
		//增加部门
//		Dept dept = new Dept();
//		dept.setDeptno(20);
//		dept.setDeptname("部门2");
//		deptService.saveDept(dept);
		
		//增加用户
//		Employee emp = new Employee();
//		emp.setEname("张三");
//		emp.setSalary(500);
//		Dept findDept = deptService.findDept(10);//找到对应部门的实体
//		emp.setDept(findDept);
//		employeeService.saveEmployee(emp);
		
		//删除用户
//		employeeService.deleteEmployee(1);
		
		//删除部门（判断部门下的员工，有员工不能删，没有员工可以删）
//	    Dept delDept = deptService.findDept(10);
//		if(delDept.getEmployees()!=null) {
//			System.out.println("部门有员工，不能删除");
//		}else{
//			deptService.deleteDept(delDept.getDeptno());
//		}
		
		//查找所有部门
		List<Dept> findAllDept = deptService.findAllDept();
		System.out.println(findAllDept);
		//查找所有员工
		List<Employee> findAllEmployee = employeeService.findAllEmployee();
		System.out.println(findAllEmployee);
	}

}
