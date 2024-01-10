package com.demo.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;//artifact is changed notice in junit 5 for test


public class CalculatorServiceTestJUnit5 {
	//this will not support timeout
	@Test
	public void addTwoNumbersTest() {
		
		int actualResult = CalculatorService.addTwoNumbers(12, 12);
		int expectedResult = 24;
		
		Assertions.assertEquals(actualResult, expectedResult,"Test Failure");//3rd parameter - F Message
		
		
	}
	
	public void addAnyNumbersTest() {
		
	}
}