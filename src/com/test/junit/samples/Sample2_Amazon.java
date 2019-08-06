package com.test.junit.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Sample2_Amazon {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Inside Before class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Inside After class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Inside Before Method");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Inside After Method");
	}

	@Test
	void test() {
		System.out.println("Inside test");
		
	}
	
   @Test
   void composeEmail() {
	 System.out.println("Inside composeEmail");
	 
   }
   @Test
   void checkEmail() {
	  System.out.println("Inside checkEmail");
	  
   }
   @Test
   void checkCalender() {
	   System.out.println("Inside checkCalender");
   }
}
