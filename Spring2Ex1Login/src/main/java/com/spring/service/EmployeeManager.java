package com.spring.service;

import java.util.*;

import com.spring.model.Employee;

public class EmployeeManager 
{
private static List<Employee>employeeList;
public EmployeeManager()
{
	employeeList=new ArrayList<Employee>();
	employeeList.add(new Employee("1","mike","smith"));
	employeeList.add(new Employee("2","john","Faylon"));
	employeeList.add(new Employee("3","Dave","wilson"));
}
public List<Employee>getEmployeeList()
{
	return employeeList;
}
}
