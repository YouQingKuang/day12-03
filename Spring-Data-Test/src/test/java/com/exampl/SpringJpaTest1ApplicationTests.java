package com.exampl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.exampl.entity.Dept;
import com.exampl.entity.Employee;
import com.exampl.repository.DeptRepository;
import com.exampl.repository.EmployeeRepository;
import com.exampl.service.DeptRepositoryService;
import com.exampl.service.EmployeeRepositoryService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJpaTest1ApplicationTests {
	@Autowired
	private EmployeeRepository empRepository;
	@Autowired
	private DeptRepository deptRepository;
	@Autowired
	private EmployeeRepositoryService employeeService;
	@Autowired
	private DeptRepositoryService deptService;
	
	@Test
	public void contextLoads() {
		
		//增加部门
//		Dept dept = new Dept();
//		dept.setDeptno(30);
//		dept.setDeptname("部门3");
//		deptService.saveDept(deptRepository, dept);
		
		//增加员工
//		Employee emp = new Employee();
//		emp.setEname("lala");
//		emp.setSalary(500);
//		Dept findDeptById = deptService.findDeptById(deptRepository, 30);//获取部门的实体
//		emp.setDept(findDeptById);
//		employeeService.saveEmployee(empRepository, emp);
		
		//删除部门（获取部门，判断员工是否为空）
//		Dept delDept = deptService.findDeptById(deptRepository, 30);
//		if(delDept.getEmployees()==null) {
//			deptService.deleteDept(deptRepository, delDept);
//		}else {
//			//1.删除所有员工
//			//2.或者修改该部员工的deptno，再删除该部门
//		}
		
		//查询所有部门
		List<Dept> findDeptAll = deptService.findDeptAll(deptRepository);
		System.out.println(findDeptAll);
		//查询所有员工
		List<Employee> findEmployeeAll = employeeService.findEmployeeAll(empRepository);
		System.out.println(findEmployeeAll);
	}

}
