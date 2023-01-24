package com.StepDefinition;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.cucumber.java.en.*;

public class SearchFlight {
	
	WebDriver driver = new ChromeDriver();
	Boolean valid_data_entered = false , invalid_date_enter_exception = false;
	@Given("User can access Flight Page")
	public void user_can_access_flight_page() {
		
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]")).click();
		
		//Assert.assertEquals(driver.getTitle(),"Flight Booking, Flight Tickets Booking at Lowest Airfare | MakeMyTrip");
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	    
		//filling the form
		//from City
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys(string);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p[contains(text(),\"Mumbai, India\")]")).click();
		
		//To city
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/label")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(@placeholder,'To')]")).sendKeys(string2);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]")).click();
		
		
		
	}
	
	@When("Selects valid {string} , {string}	, '{int}'")
	public void selects_valid_sun_jan(String string, String string2, Integer int3) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//dateDept
		driver.findElement(By.xpath("//div[contains(@aria-label,'"+string+"')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//dateReturn
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]/div[2]/label")).click();
		driver.findElement(By.xpath("//div[contains(@aria-label,'"+string2+"')]")).click();
		
		//travellers
		driver.findElement(By.xpath("//div[contains(@data-cy,'flightTraveller')]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[contains(@data-cy,'adults-"+int3+"')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[2]/button")).click();
	
		
		//filling form end
		
	}
	
	@When("User clicks on Search")
	public void user_clicks_on_search() {
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
	}
	
	@Then("User can view Valid Search Result")
	public void user_can_view_valid_search_result() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement wb = driver.findElement(By.xpath("//p[contains(text(),'Flights from')]"));
		System.out.println(wb.isDisplayed());
		if (wb.isDisplayed()==true) {
			valid_data_entered = true;
		}
	}
	
	
	@Given("User entered valid data")
	public void user_entered_valid_data() {
	    Assert.assertTrue(valid_data_entered);
	}
	
	
	
	@Then("User can view List of Flights")
	public void user_can_view_list_of_flights() {
		Assert.assertTrue(driver.findElement(By.className("listingCardWrap")).isDisplayed());
	}
	
	@Given("User has access to Search Result List")
	public void user_has_access_to_search_result_list() {
		Assert.assertTrue(driver.findElement(By.className("listingCardWrap")).isDisplayed());
	}
	@Given("User is directed to Flight List page")
	public void user_is_directed_to_flight_list_page() {
		  Assert.assertTrue(valid_data_entered);
	}
	
	@Given("user can view Cheapest option")
	public void user_can_view_cheapest_option() {
		Assert.assertTrue(driver.findElement(By.className("splitviewStickyOuter")).isDisplayed(),"Error in Cheapest option viewing");
		
	}
	@Given("user can click on continue button")
	public void user_can_click_on_continue_button() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
	}
	
	@Then("user is redirected to booking page")
	public void user_is_redirected_to_booking_page() throws InterruptedException {
		//Changing the tab 
		System.out.println(driver.getTitle());
		
		
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	    //switch to new tab
		Thread.sleep(3000);

	    driver.switchTo().window(newTb.get(1));
	    System.out.println("Page title of new tab: " + driver.getTitle());
		
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Fare Summary')]")).isDisplayed(),"Error is on Fare Summary display");
		
	}
	
	
	
	
	@When("Selects invalid {string} , {string}, {string}")
	public void selects_invalid(String string, String string2, String string3) {
		try {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//dateDept
		driver.findElement(By.xpath("//div[contains(@aria-label,'"+string+"')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//dateReturn
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]/div[2]/label")).click();
		driver.findElement(By.xpath("//div[contains(@aria-label,'"+string2+"')]")).click();
	}
		catch(Exception e) {
			invalid_date_enter_exception = true;
			}
		}

	@Then("User can view InValid Search Message")
	public void user_can_view_in_valid_search_message() {
	    Assert.assertTrue(invalid_date_enter_exception,"InValid Search time Exception Error");
	}
	
	
}