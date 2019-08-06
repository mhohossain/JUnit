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

public class EabyCreateAccount {
	WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Execution Started");
	}

	@Before
	public void launchBrowser() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	
	
	}
	
	@Test
	public void RegisterAccount() {
		driver.findElement(By.xpath("/html/body/header/div[1]/ul[1]/li[1]/span/span/a")).click();
		driver.findElement(By.id("firstname")).sendKeys("mho");
		driver.findElement(By.id("lastname")).sendKeys("hossain");
		driver.findElement(By.id("email")).sendKeys("mhohossain123@gamil.com");
		driver.findElement(By.id("PASSWORD")).sendKeys("hossain123");
		driver.findElement(By.id("ppaFormSbtBtn")).click();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Execution is Ended");
	}
	
	@After
	public void closeApplication() throws Exception {
		driver.close();
		driver.quit();
	}
}
