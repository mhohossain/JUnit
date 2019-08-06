package com.test.junit.samples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class FaceBookLogin {
	WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Execution is Started");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Execution is Ended");
	}
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");		
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("Clossing the Application");
		driver.close();
		driver.quit();
	}

	@Test
	public void LoginApplication() {
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.id("email")).sendKeys("Araf123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("araf123");
		driver.findElement(By.id("loginbutton")).click();
		Assert.assertTrue(true);
		
	}

}
