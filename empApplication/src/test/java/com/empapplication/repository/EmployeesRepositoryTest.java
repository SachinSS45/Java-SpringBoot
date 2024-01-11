package com.empapplication.repository;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.empapplication.entities.Employees;

@DataJpaTest
public class EmployeesRepositoryTest {
	//given-when-then
	
	@Autowired
	private EmployeeRepo employeeRepo;
	Employees employees;//we are dealing with entity
	
	@BeforeEach
	void setUp() {
		employees = new Employees(1,"Subramanyam Jadhav","subramnyam.jadhav@example.com","B",2024,"Trainee");
		employeeRepo.save(employees);
	}
	
	@AfterEach
	void tearDown() {
		employees = null;
		employeeRepo.deleteAll();
	}
	
	//Test Case SUCESS
	@Test
	void testFindByEmpId_Found() {
		
		Employees foundEmployee = employeeRepo.findByEmpId(1);
		
		assertNotNull(foundEmployee);
		assertEquals(1, foundEmployee.getEmpId());
		assertEquals("Subramanyam Jadhav", foundEmployee.getEmpName());
	}
	
	//Test Case Failure
	@Test
	void testFindByEmpId_NotFound() {
		
		Employees foundEmployee = employeeRepo.findByEmpId(2);
		
		assertNull(foundEmployee);//we are is empty or not i.e null
	}
}
