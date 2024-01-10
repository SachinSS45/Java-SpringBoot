package com.empapplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empapplication.entities.Employees;
import com.empapplication.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	public List<Employees> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}
	@SuppressWarnings("deprecation")
	@Override
	public Employees getEmpById(int empId) {
		Employees entity1 =  employeeRepo.findByEmpId(empId);
		return entity1;
	}
	@Override
	public Employees addEmployee(Employees employees) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employees);
	}
	@Override
	public void deleteEmpById(int empId) {
		// TODO Auto-generated method stub
		Employees entity = employeeRepo.getOne(empId);
		employeeRepo.delete(entity);
	}
	@Override
	public Employees updateEmployee(Employees employees) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employees);
	}
	

}
