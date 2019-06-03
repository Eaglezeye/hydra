package com.capg.testing.stepdef;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.capg.testing.pom.ConferenceRegistration;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConferenceStepDefinition {
	
	private WebDriver driver;

	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\svikas\\\\Desktop\\chromedriver.exe" );
	}
	

		@Given("^User is on 'ConferenceRegistration' Page$")
		public void user_is_on_ConferenceRegistration_Page() throws Throwable {
			driver = new ChromeDriver();
			 
			 driver.get("file:///C:/Users/svikas/Desktop/ConferenceRegistration/ConferenceRegistartion.html");
			}

			@When("^user enters url$")
			public void user_enters_url() throws Throwable {
			   
			}
			@Then("^page should be loaded$")
			public void page_should_be_loaded() throws Throwable {
			String actual = driver.getTitle();
			
			String expected = "Conference Registartion";
			
			assertEquals(expected, actual);
			
			}

		@When("^user enter valid details$")
		public void user_enter_valid_details() throws Throwable {
			WebElement element = ConferenceRegistration.firstname(driver);
			element.sendKeys("Sravan");
			element = ConferenceRegistration.lastname(driver);
			element.sendKeys("Varma");
			element = ConferenceRegistration.email(driver);
			element.sendKeys("sravanvarma164@gmail.com");
			element= ConferenceRegistration.contactnumber(driver);
			element.sendKeys("9000911391");
			element= ConferenceRegistration.people(driver);
			Select peopleIndex = new Select(element);
			peopleIndex.selectByIndex(1);
			
			element = ConferenceRegistration.address1(driver);
			element.sendKeys("Hno 216");
			
			element = ConferenceRegistration.address2(driver);
			element.sendKeys("Kphb");
			
			element = ConferenceRegistration.city(driver);
			Select dropDown = new Select(element);
			
			dropDown.selectByIndex(1);
			
			element = ConferenceRegistration.State(driver);
			Select dropDown1 = new Select(element);
			
			dropDown1.selectByIndex(1);
			
			
			element = ConferenceRegistration.fullaccess(driver);
			element.click();
			
			element = ConferenceRegistration.nextButton(driver);
			
			element.click();
			
			
		  
		}

		@Then("^display 'Personal details are been validated'$")
		public void display_Personal_details_are_been_validated() throws Throwable {
			String expectedMessage="Personal details are validated.";
			String actualMessage=driver.switchTo().alert().getText();
			
			assertEquals(expectedMessage, actualMessage);
			driver.switchTo().alert().accept();
			driver.close();
		}


		@When("^user enter invalid firstName$")
		public void user_enter_invalid_firstName() throws Throwable {
			WebElement element = ConferenceRegistration.nextButton(driver);
			
			 element.click();	
			}


		@Then("^display 'Please fill First Name'$")
		public void display_Please_fill_First_Name() throws Throwable {
			String expectedMessage="Please fill the First Name";
			String actualMessage=driver.switchTo().alert().getText();
			
			assertEquals(expectedMessage, actualMessage);
			driver.switchTo().alert().accept();
			driver.close();
		}

		@When("^user enter invalid lastName$")
		public void user_enter_invalid_lastName() throws Throwable {
			WebElement element = ConferenceRegistration.firstname(driver);
			element.sendKeys("Sravan");
			
			element = ConferenceRegistration.nextButton(driver);
			element.click();
			
		}

		@Then("^display 'Please fill Last Name'$")
		public void display_Please_fill_Last_Name() throws Throwable {
			String expectedMessage="Please fill the Last Name";
			String actualMessage=driver.switchTo().alert().getText();
			
			assertEquals(expectedMessage, actualMessage);
			driver.switchTo().alert().accept();
			driver.close();
		}

		@When("^user enter invalid email$")
		public void user_enter_invalid_email() throws Throwable {
			WebElement element = ConferenceRegistration.firstname(driver);
			element.sendKeys("Sravan");
			
			element = ConferenceRegistration.lastname(driver);
			element.sendKeys("Varma");
			

			
			element = ConferenceRegistration.nextButton(driver);
			element.click();
		}

		@Then("^display 'Please fill Email'$")
		public void display_Please_fill_Email() throws Throwable {
			String expectedMessage="Please fill the Email";
			String actualMessage=driver.switchTo().alert().getText();
			
			assertEquals(expectedMessage, actualMessage);
			driver.switchTo().alert().accept();
			driver.close();
		}

		@When("^user enter invalid contact number$")
		public void user_enter_invalid_contact_number() throws Throwable {
			WebElement element = ConferenceRegistration.firstname(driver);
			element.sendKeys("Sravan");
			
			element = ConferenceRegistration.lastname(driver);
			element.sendKeys("Varma");
			element = ConferenceRegistration.email(driver);
			element.sendKeys("sravanvarma164@gmail.com");
			
			element = ConferenceRegistration.nextButton(driver);
			element.click();
		}

		@Then("^display 'Please fill valid Contact no\\.'$")
		public void display_Please_fill_valid_Contact_no() throws Throwable {
			String expectedMessage="Please fill the Contact No.";
			String actualMessage=driver.switchTo().alert().getText();
			
			assertEquals(expectedMessage, actualMessage);
			driver.switchTo().alert().accept();
			driver.close();
		}

		@When("^user enter invalid Number of People attending$")
		public void user_enter_invalid_Number_of_People_attending() throws Throwable {
			WebElement element = ConferenceRegistration.firstname(driver);
			element.sendKeys("Sravan");
			
			element = ConferenceRegistration.lastname(driver);
			element.sendKeys("Varma");
			element = ConferenceRegistration.email(driver);
			element.sendKeys("sravanvarma164@gmail.com");
			element= ConferenceRegistration.contactnumber(driver);
			element.sendKeys("9000911391");
			
			element = ConferenceRegistration.nextButton(driver);
			
			element.click();
		}

		@Then("^display 'Number of people attending'$")
		public void display_Number_of_people_attending() throws Throwable {
			String expectedMessage="Please fill the Number of people attending";
			String actualMessage=driver.switchTo().alert().getText();
			
			assertEquals(expectedMessage, actualMessage);
			driver.switchTo().alert().accept();
			driver.close();
		}

		@When("^user enter invalid Building name and room no$")
		public void user_enter_invalid_Building_name_and_room_no() throws Throwable {
			WebElement element = ConferenceRegistration.firstname(driver);
			element.sendKeys("Sravan");
			
			element = ConferenceRegistration.lastname(driver);
			element.sendKeys("Varma");
			element = ConferenceRegistration.email(driver);
			element.sendKeys("sravanvarma164@gmail.com");
			element= ConferenceRegistration.contactnumber(driver);
			element.sendKeys("9000911391");
			
			element= ConferenceRegistration.people(driver);
			Select peopleIndex = new Select(element);
			peopleIndex.selectByIndex(1);
			
			
			element = ConferenceRegistration.nextButton(driver);
			
			element.click();
		}

		@Then("^display 'Please fill the Building name and room no'$")
		public void display_Please_fill_the_Building_name_and_room_no() throws Throwable {
			String expectedMessage="Please fill the Building & Room No";
			String actualMessage=driver.switchTo().alert().getText();
			
			assertEquals(expectedMessage, actualMessage);
			driver.switchTo().alert().accept();
			driver.close();
			
		}

		@When("^user enter invalid Area name$")
		public void user_enter_invalid_Area_name() throws Throwable {
			WebElement element = ConferenceRegistration.firstname(driver);
			element.sendKeys("Sravan");
			
			element = ConferenceRegistration.lastname(driver);
			element.sendKeys("Varma");
			element = ConferenceRegistration.email(driver);
			element.sendKeys("sravanvarma164@gmail.com");
			element= ConferenceRegistration.contactnumber(driver);
			element.sendKeys("9000911391");
			
			element= ConferenceRegistration.people(driver);
			Select peopleIndex = new Select(element);
			peopleIndex.selectByIndex(1);
			
			element = ConferenceRegistration.address1(driver);
			element.sendKeys("Hno 216");
			
			element = ConferenceRegistration.nextButton(driver);
			element.click();	

		}


		@Then("^display 'Please fill Area name'$")
		public void display_Please_fill_Area_name() throws Throwable {
			String expectedMessage="Please fill the Area name";
			String actualMessage=driver.switchTo().alert().getText();
			
			assertEquals(expectedMessage, actualMessage);
			driver.switchTo().alert().accept();
			driver.close();
		}

		@When("^user enter invalid City$")
		public void user_enter_invalid_City() throws Throwable {
			WebElement element = ConferenceRegistration.firstname(driver);
			element.sendKeys("Sravan");
			element = ConferenceRegistration.lastname(driver);
			element.sendKeys("Varma");
			element = ConferenceRegistration.email(driver);
			element.sendKeys("sravanvarma164@gmail.com");
			element= ConferenceRegistration.contactnumber(driver);
			element.sendKeys("9000911391");
			element= ConferenceRegistration.people(driver);
			Select peopleIndex = new Select(element);
			peopleIndex.selectByIndex(1);
			
			element = ConferenceRegistration.address1(driver);
			element.sendKeys("Hno 216");
			
			element = ConferenceRegistration.address2(driver);
			element.sendKeys("Kphb");

			element = ConferenceRegistration.nextButton(driver);
			element.click();
		}

		@Then("^display 'Please fill City'$")
		public void display_Please_fill_City() throws Throwable {
			String expectedMessage="Please select city";
			String actualMessage=driver.switchTo().alert().getText();
			
			assertEquals(expectedMessage, actualMessage);
			driver.switchTo().alert().accept();
			driver.close();
		}


		@When("^user enter invalid State$")
		public void user_enter_invalid_State() throws Throwable {
			WebElement element = ConferenceRegistration.firstname(driver);
			element.sendKeys("Sravan");
			element = ConferenceRegistration.lastname(driver);
			element.sendKeys("Varma");
			element = ConferenceRegistration.email(driver);
			element.sendKeys("sravanvarma164@gmail.com");
			element= ConferenceRegistration.contactnumber(driver);
			element.sendKeys("9000911391");
			element= ConferenceRegistration.people(driver);
			Select peopleIndex = new Select(element);
			peopleIndex.selectByIndex(1);
			
			element = ConferenceRegistration.address1(driver);
			element.sendKeys("Hno 216");
			
			element = ConferenceRegistration.address2(driver);
			element.sendKeys("Kphb");
			
			element = ConferenceRegistration.city(driver);
			Select dropDown = new Select(element);
			
			dropDown.selectByIndex(1);
			
			
			
			element = ConferenceRegistration.nextButton(driver);
			element.click();

		}


		@Then("^display 'Please fill the State'$")
		public void display_Please_fill_the_State() throws Throwable {
			String expectedMessage="Please select state";
			String actualMessage=driver.switchTo().alert().getText();
			
			assertEquals(expectedMessage, actualMessage);
			driver.switchTo().alert().accept();
			driver.close();
		}

		@When("^user enter invalid Member Status$")
		public void user_enter_invalid_Member_Status() throws Throwable {
			WebElement element = ConferenceRegistration.firstname(driver);
			element.sendKeys("Sravan");
			element = ConferenceRegistration.lastname(driver);
			element.sendKeys("Varma");
			element = ConferenceRegistration.email(driver);
			element.sendKeys("sravanvarma164@gmail.com");
			element= ConferenceRegistration.contactnumber(driver);
			element.sendKeys("9000911391");
			element= ConferenceRegistration.people(driver);
			Select peopleIndex = new Select(element);
			peopleIndex.selectByIndex(1);
			
			element = ConferenceRegistration.address1(driver);
			element.sendKeys("Hno 216");
			
			element = ConferenceRegistration.address2(driver);
			element.sendKeys("Kphb");
			
			element = ConferenceRegistration.city(driver);
			Select dropDown = new Select(element);
			
			dropDown.selectByIndex(1);
			
			element = ConferenceRegistration.State(driver);
			Select dropDown1 = new Select(element);
			
			dropDown1.selectByIndex(1);
			
			
			
			
			element = ConferenceRegistration.nextButton(driver);
			
			element.click();
			

		}


		@Then("^display 'Please fill the Member Status'$")
		public void display_Please_fill_the_Member_Status() throws Throwable {
			String expectedMessage="Please Select MemeberShip status";
			String actualMessage=driver.switchTo().alert().getText();
			
			assertEquals(expectedMessage, actualMessage);
			driver.switchTo().alert().accept();
			driver.close();
		}


	

}
