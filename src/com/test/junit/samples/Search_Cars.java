package com.test.junit.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Search_Cars {
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
	void launchBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.expedia.com/");
	}

	@AfterEach
	void closeBrowser() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	void Rental_car() {
		driver.manage().window().maximize();
		driver.findElement(By.id("tab-car-tab-hp")).click();
		driver.findElement(By.id("car-pickup-hp-car")).sendKeys("Atlanta (and vicinity), Georgia");
		driver.findElement(By.id("car-dropoff-hp-car")).sendKeys("Phoenix, AZ (PHX-Sky Harbor Intl.)");
		driver.findElement(By.id("car-pickup-date-hp-car")).sendKeys("02/14/2019");
		driver.findElement(By.id("car-dropoff-date-hp-car")).sendKeys("02/14/2019");
		driver.findElement(By.id("car-pickup-time-hp-car")).sendKeys("12:15 am");
		driver.findElement(By.id("car-dropoff-time-hp-car")).sendKeys("10:15");
		driver.findElement(By.xpath("/html/body/meso-native-marquee/section/div/div/div/section/div/div[2]/div[2]/section[4]/form/div[7]/label/button")).getText();
		Assert.assertTrue("header-logo", true);
	}
	

}
