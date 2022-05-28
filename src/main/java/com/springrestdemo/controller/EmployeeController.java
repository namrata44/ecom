package com.springrestdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrestdemo.model.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping(value="/emp")
	public Employee searchEmployee() {
		Employee emp=new Employee();
		emp.setEmpId(111);
		emp.setName("Dummy");
		emp.setSalary(50000);
		
		return emp;
		
	}
	
	@GetMapping(value="/emp/all")
	public List<Employee> allEmployee() {
		Employee emp=new Employee();
		emp.setEmpId(111);
		emp.setName("Dummy-1");
		emp.setSalary(50000);
		
		Employee emp2=new Employee();
		emp.setEmpId(222);
		emp.setName("Dummy-2");
		emp.setSalary(40000);
		
		Employee emp3=new Employee();
		emp.setEmpId(333);
		emp.setName("Dummy-3");
		emp.setSalary(60000);
		
		List<Employee> empList=new ArrayList<>();
		empList.add(emp3);
		empList.add(emp2);
		empList.add(emp);
		
		return empList;
		
	}
	
	

}
