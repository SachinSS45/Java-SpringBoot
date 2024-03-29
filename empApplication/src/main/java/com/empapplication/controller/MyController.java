package com.empapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empapplication.entities.Employees;
import com.empapplication.services.EmployeeService;
@RestController 
@RequestMapping("/api/employees")
public class MyController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping
	public List<Employees> getAllEmployees(){
		return this.employeeService.getAllEmployees();
	}
	
	@GetMapping("{empId}")
	public Employees getEmpById(@PathVariable String empId) {
		return this.employeeService.getEmpById(Integer.parseInt(empId));
	}
	
	@PostMapping
	public Employees addEmployee(@RequestBody Employees employees) {
		return this.employeeService.addEmployee(employees);
	}
	
	@PutMapping
	public Employees updateEmployee(@RequestBody Employees employees) {
		return this.employeeService.updateEmployee(employees);
	}
	
	@DeleteMapping("{empId}")
	public ResponseEntity<HttpStatus> deleteEmpById(@PathVariable String empId) {
		try {
			this.employeeService.deleteEmpById(Integer.parseInt(empId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
