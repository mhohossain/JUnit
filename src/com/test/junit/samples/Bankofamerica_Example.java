package com.test.junit.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

class Bankofamerica_Example {
	WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Execution is Started");
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Execution is Ended");
	}

	@BeforeEach
	void launchAppliation() throws Exception {
		System.out.println("Launched Application");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.bankofamerica.com/");
		 Thread.sleep(3000);
	}

	@AfterEach
	void closeApplication() throws Exception {
		System.out.println("Clossing Application");
		driver.close();
		driver.quit();
	}

	@Test
	void loginApplication() throws Exception {
		driver.findElement(By.id("signIn")).click();
		driver.findElement(By.id("onlineId1")).sendKeys("tester123@gmail.com");
		driver.findElement(By.id("passcode1")).sendKeys("tester123");
		driver.findElement(By.id("signIn")).isDisplayed();
		Thread.sleep(3000);
		
	}

}
