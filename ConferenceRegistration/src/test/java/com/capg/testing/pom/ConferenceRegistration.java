package com.capg.testing.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConferenceRegistration {
	
	WebElement element;
	
	public static WebElement firstname(WebDriver driver) {
		
		return driver.findElement(By.name("txtFN"));
	}
	

	public static WebElement lastname(WebDriver driver) {
		
		return driver.findElement(By.name("txtLN"));
	}
	

	public static WebElement email(WebDriver driver) {
		
		return driver.findElement(By.name("Email"));
	}


	public static WebElement contactnumber(WebDriver driver) {
		
		return driver.findElement(By.name("Phone"));
	}
	
	

	public static WebElement people(WebDriver driver) {
		
		return driver.findElement(By.name("size"));
	}
	

	public static WebElement address1(WebDriver driver) {
		
		return driver.findElement(By.name("Address"));
	}
	

	public static WebElement address2(WebDriver driver) {
		
		return driver.findElement(By.name("Address2"));
	}
	
	

	public static WebElement city(WebDriver driver) {
		
		return driver.findElement(By.name("city"));
	}
	

	public static WebElement State(WebDriver driver) {
		
		return driver.findElement(By.name("state"));
	}

	public static WebElement fullaccess(WebDriver driver) {
		
		return driver.findElement(By.xpath("//input[@value='member']"));
	}
	
	public static WebElement nextButton(WebDriver driver) {
		
		return driver.findElement(By.name("submit"));
	}
	
	
}
