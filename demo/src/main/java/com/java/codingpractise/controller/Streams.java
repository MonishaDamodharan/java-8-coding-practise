package com.java.codingpractise.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.codingpractise.dto.Employee;

@RestController
public class Streams {
	
	@GetMapping
	public void groupBy() {
		try {
			 List<Employee> empList = Arrays.asList(
					    new Employee("Monisha",23),
	                    new Employee("Charles", 24),
	                    new Employee("Bala", 24),
	                    new Employee("Akila", 24)
	            );
			System.out.println("Employee List : "+empList.toString());
			Map<Integer, List<Employee>> employeeMap = empList.stream().collect(Collectors.groupingBy(emp->emp.age()));
			System.out.println("employeeMap : "+employeeMap);
		} catch (Exception e) {
			System.out.println("Exception : "+ e);
		}
		
	}

}
