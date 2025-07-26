package com.java.codingpractise.dto;

public class Employee {
    private String name;
    private int age;
    
    public Employee(String name, Integer age) {
    	this.name=name;
    	this.age=age;
    }
    
    public Integer age() {
    	return age;
    }
    
    public String name() {
    	return name;
	}
    
    public String toString() {
    	return name + "(" + age + ")";
		
	}
}
