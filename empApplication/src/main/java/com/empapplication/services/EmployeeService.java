package com.empapplication.services;

import java.util.List;

import com.empapplication.entities.Employees;

public interface EmployeeService {
	public List<Employees> getAllEmployees();

	public Employees getEmpById(int empId);

	public Employees addEmployee(Employees employees);
	
	public void deleteEmpById(int empId);

	public Employees updateEmployee(Employees employees);
	
}
