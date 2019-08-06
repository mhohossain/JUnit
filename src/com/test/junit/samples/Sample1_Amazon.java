package com.test.junit.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Sample1_Amazon {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Inside Before Class");
	}

	@AfterAll
	 static void tearDownAfterClass() throws Exception {
		System.out.println("Inside After Class");
	}

	@BeforeEach
	void Login() throws Exception {
		System.out.println("Inside Login");
	}

	@AfterEach
	void Logout() throws Exception {
		System.out.println("Inside Logout");
	}
	
	@Test
	void composeEmail() {
		System.out.println("Inside Compose Email");
	}

	@Test
	 void checkEmail() {
		System.out.println("Inside Check Email");
	}
		
	@Test
	 void calender() {
		System.out.println("Inside Calender");
		
	}
		}
		
	


