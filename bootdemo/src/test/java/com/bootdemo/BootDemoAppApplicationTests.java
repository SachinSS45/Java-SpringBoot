package com.bootdemo;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.intThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootDemoAppApplicationTests {
	
	private Calculator c = new Calculator();
	@Test
	void contextLoads() {
	}
	
	@Test
	void testSum() {
		
		//expected
		int expectedResult = 27;
		//actual
		int actualResult = c.doSum(12, 3, 2);
		
		assertThat(actualResult).isEqualTo(expectedResult);			
	}
	
	void testProduct() {
		//expected
		
	}
}
