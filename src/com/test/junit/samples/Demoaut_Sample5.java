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

class Demoaut_Sample5 {
	
	WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Demo Aut Execution Started");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Demo Aut Execution Ended");
	}

	@BeforeEach
	void launchApplication () throws Exception {
		System.out.println("Launch Browser Started");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoaut.com/");
		
	}

	@AfterEach
	void closeApplication () throws Exception {
		System.out.println("Clossing Browser");
		driver.close();
		driver.quit();
	}

	@Test
	void registerUser () throws Exception {
		System.out.println("Register User Started");
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("Jhon");
		driver.findElement(By.name("lastName")).sendKeys("Haque");
		driver.findElement(By.name("phone")).sendKeys("2679913047");
		driver.findElement(By.name("userName")).sendKeys("Jhaque");
		driver.findElement(By.name("address1")).sendKeys("160 bls");
		driver.findElement(By.name("city")).sendKeys("KK");
		driver.findElement(By.name("state")).sendKeys("NY");
		driver.findElement(By.name("postalCode")).sendKeys("09198");
		driver.findElement(By.name("country")).sendKeys("TURKEY");
		driver.findElement(By.name("register")).click();
		Thread.sleep(3000);
		
		String exp_SuccessMeseage = "Thank you for registering. You may now sign-in using the user name and password you've just entered.";
		String app_successmeseage = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/"
				+ "tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
		
	    if (exp_SuccessMeseage.equals(app_successmeseage)) {
	    	System.out.println("PASS - Home Meseage is displayed");
			
		}else {
			System.out.println("FAIL - Home Meseage is could not displayed");
		}
			
		}
	@Test
	void loginApplication() throws Exception {
		driver.findElement(By.linkText("SIGN-ON")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		if (driver.findElement(By.name("findFlights")).isDisplayed()) {
			System.out.println("PASS - User logged in");
			
		}else {
			System.out.println("FAIL - User could not logged in");
		}
			
		}
	}
	

