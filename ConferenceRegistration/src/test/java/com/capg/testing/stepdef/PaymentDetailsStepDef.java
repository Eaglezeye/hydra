package com.capg.testing.stepdef;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.capg.testing.pom.PaymentDetails;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentDetailsStepDef {
	private WebDriver driver;

	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\svikas\\Desktop\\chromedriver.exe" );
	}
	
	@Given("^user is on Payment Details page$")
	public void user_is_on_Payment_Details_page() throws Throwable {
		 driver = new ChromeDriver();
		   
		   driver.get("file:///C:/Users/svikas/Desktop/CAPG1218JA1166_Sravan_Moodule4/PaymentDetails.html");
		}


	@When("^user enter load the page$")
	public void user_enter_load_the_page() throws Throwable {
	    
	}

	@Then("^valid page should open$")
	public void valid_page_should_open() throws Throwable {
		String expected="Payment Details";
		String actual=driver.getTitle();
		assertEquals(expected, actual);
		driver.close();
	}

	@When("^user enter invalid name$")
	public void user_enter_invalid_name() throws Throwable {
		  WebElement element = PaymentDetails.submitButton(driver);
			element.click();

}

	@Then("^display 'Please enter the name correctly'$")
	public void display_Please_enter_the_name_correctly() throws Throwable {
		String expectedMessage="Please fill the Card holder name";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enter the invalid Debit Card Number$")
	public void user_enter_the_invalid_Debit_Card_Number() throws Throwable {
		WebElement element = PaymentDetails.name(driver);
		   element.sendKeys("Sravan");
		   element = PaymentDetails.submitButton(driver);
		   element.click();
		   
		}

	@Then("^display 'Please enter the Card Number correctly'$")
	public void display_Please_enter_the_Card_Number_correctly() throws Throwable {
		String expectedMessage="Please fill the Debit card Number";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}


	@When("^user enter invalid expiration month$")
	public void user_enter_invalid_expiration_month() throws Throwable {
		  WebElement element = PaymentDetails.name(driver);
		   element.sendKeys("Sravan");
		   
		   element = PaymentDetails.cardNumber(driver);
		   element.sendKeys("9000911391999");
		   
		   element= PaymentDetails.cvv(driver);
		   element.sendKeys("908");
		   
		   element = PaymentDetails.submitButton(driver);
		   element.click();
	}

	@Then("^display 'Please enter correct month of expiration'$")
	public void display_Please_enter_correct_month_of_expiration() throws Throwable {
		String expectedMessage="Please fill expiration month";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}


	@When("^user enter invalid expiration year$")
	public void user_enter_invalid_expiration_year() throws Throwable {
		 WebElement element = PaymentDetails.name(driver);
		   element.sendKeys("Sravan");
		   
		   element = PaymentDetails.cardNumber(driver);
		   element.sendKeys("9000911391999");
		   element= PaymentDetails.cvv(driver);
		   element.sendKeys("908");
		   
		   element = PaymentDetails.month(driver);
		   element.sendKeys("12");
		   
		   element = PaymentDetails.submitButton(driver);
		   element.click();
	}


	@Then("^display 'Please enter correct year of expiration'$")
	public void display_Please_enter_correct_year_of_expiration() throws Throwable {
		String expectedMessage="Please fill the expiration year";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enter valid  payment details$")
	public void user_enter_valid_payment_details() throws Throwable {
		 WebElement element = PaymentDetails.name(driver);
		   element.sendKeys("Sravan");
		   
		   element = PaymentDetails.cardNumber(driver);
		   element.sendKeys("9000911391999");
		   element= PaymentDetails.cvv(driver);
		   element.sendKeys("908");
		   
		   element = PaymentDetails.month(driver);
		   element.sendKeys("12");
		   
		   element = PaymentDetails.year(driver);
		   element.sendKeys("26");
		   
		   element = PaymentDetails.submitButton(driver);
		   element.click();
	}


	@Then("^display 'Conference Room Booking is done successfully'$")
	public void display_Conference_Room_Booking_is_done_successfully() throws Throwable {
		String expectedMessage="Conference Room Booking successfully done!!!";
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}



}
