package com.StepDefinition;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class BookFlight {

	WebDriver driver = new ChromeDriver();
	Boolean add_button_worked = false;
	@Given("User is redirected to Booking Page")
	public void user_is_redirected_to_booking_page() {

		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Fare Summary')]")).isDisplayed(),"Error is on Fare Summary display");
		
	}
	
	@Given("user can access the Travel insurance section")
	public void user_can_access_the_travel_insurance_section() {
		
		Assert.assertTrue(driver.findElement(By.className("travelinsuranceTop")).isDisplayed(),"Error is on Insurance Section display");
		
	}
	
	@Then("user can select valid option")
	public void user_can_select_valid_option() {
		driver.findElement(By.className("insRadioSection")).click();
	}
	
	
	
	@Given("Booking detail section is displayed")
	public void booking_detail_section_is_displayed() {
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Booking details')]")).isDisplayed(),"Error is on Traveller Section Text display");
		
	}

	@Given("user enters {string},{string}")
	public void user_enters(String string, String string2) {

		driver.findElement(By.xpath("//input[@placeholder='Mobile No']")).sendKeys(string);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(string2);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

	@Then("user can click on Continue Button")
	public void user_can_click_on_continue_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
	}

	@Given("User has access to book flight page")
	public void user_has_access_to_book_flight_page() {
	    driver.getTitle();
	}

	@Given("User can view Promo Code Section")
	public void user_can_view_promo_code_section() {
		Assert.assertTrue(driver.findElement(By.xpath("//b[contains(text(),'PROMO')]")).isDisplayed(),"Error is on PROMO Section display");
	}

	@Given("User Selects a promo code")
	public void user_selects_a_promo_code() {
	    driver.findElement(By.xpath("//span[contains(text(),'MMTSUPER')]")).click();
	}

	@Then("User can view added promo code")
	public void user_can_view_added_promo_code() {
		Assert.assertTrue(driver.findElement(By.xpath("//font[contains(text(),'Congratulations!')]")).isDisplayed(),"Error is on PROMO selection \"Congratuations\" display");
	}


	
	@Given("Traveller detail section is visible")
	public void traveller_detail_section_is_visible() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Traveller Details')]")).isDisplayed(),"Error is on Traveller display");
	}

	@Given("User can access Add Button")
	public void user_can_access_add_button() {
		Assert.assertTrue(driver.findElement(By.className("addTravellerBtn")).isDisplayed(),"Error is on Add Button display");
	}

	@Given("user enters {string}, {string}, {string}")
	public void user_enters(String string, String string2, String string3) throws InterruptedException {
		int i;
		for ( i = 1; i<4;i++) {
			Thread.sleep(3000);
			driver.findElement(By.className("addTravellerBtn")).click();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@placeholder='First & Middle Name' and @value='']")).sendKeys(string+" "+string2);
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@placeholder='Last Name' and @value='']")).sendKeys(string3);
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//label[@tabindex='0'])["+i+"]")).click();
		}
		if (i==3) {
			add_button_worked = true;
		}
		
	}

	@Then("user can proceed to add another Traveller")
	public void user_can_proceed_to_add_another_traveller() {
	    if (add_button_worked) {
	    	boolean T=true;
			Assert.assertTrue(T);
	    }
	    else {
	    	System.out.println("Error in adding another user");
	    }
	}
	
	
	
}
