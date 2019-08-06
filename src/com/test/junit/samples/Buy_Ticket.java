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

class Buy_Ticket {
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
	public void loginApplication() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ara\\Desktop\\java jar files\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.expedia.com/");
	}

	@AfterEach
	public void closeAppication() throws Exception {
		driver.close();
		driver.quit();
		
		
	}

	@Test
	public void test() {
		driver.manage().window().maximize();
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("Miami, FL (MIA-All Airports)");
		driver.findElement(By.id("flight-destination-hp-flight")).sendKeys("New York, NY (JFK-John F. Kennedy Intl.)");
		driver.findElement(By.id("flight-departing-hp-flight")).sendKeys("02/14/2019");	
		driver.findElement(By.id("flight-returning-hp-flight")).sendKeys("02/14/2019");
		driver.findElement(By.xpath("/html/body/meso-native-marquee/section/div/div/div/section/div/div[2]/div[2]/section[1]/form/div[7]/label/button")).getText();
		Assert.assertTrue("amenities-legend", true);
	}
}
