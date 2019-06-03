package com.capg.testing.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentDetails {
	
	WebElement element;
	
	
	public static WebElement name(WebDriver driver) {
		return driver.findElement(By.name("txtFN"));
		
	}
	public static WebElement cardNumber(WebDriver driver) {
		return driver.findElement(By.name("debit"));
		
		
	}
	
	public static WebElement cvv(WebDriver driver) {
		return driver.findElement(By.name("cvv"));
		
		
	}
	
	public static WebElement month(WebDriver driver) {
		return driver.findElement(By.name("month"));
		
		
	}
	
	public static WebElement year(WebDriver driver) {
		return driver.findElement(By.name("year"));
		
		
	}
	
	public static WebElement submitButton(WebDriver driver) {
		return driver.findElement(By.name("submit"));
		
		
	}
}
