package com.app.step_definitions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import com.app.pages.CyberTruckHomePage;
import com.app.pages.TeslaHomePage;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UIStepsDefs {
	
	private WebDriver driver = Driver.getDriver();
	TeslaHomePage teslaHomePage = new TeslaHomePage();
	CyberTruckHomePage cyberTruckHomePage = new CyberTruckHomePage();
	
	@Given("I am on the main home page")
	public void i_am_on_the_main_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.get(ConfigurationReader.configFile.getProperty("url"));
	   Actions mouse = new Actions(driver);
	   mouse.moveToElement(teslaHomePage.CyberTruckLink).perform();
	 
	  
	}

	@Then("The title of the website should be displayed properly")
	public void the_title_of_the_website_should_be_displayed_properly() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(teslaHomePage.isAt());
	}

	@Then("I click to CyberTruck link")
	public void i_click_to_CyberTruck_link() {
	    // Write code here that turns the phrase above into concrete actions
	   teslaHomePage.CyberTruckLink.click();
	}

	@Then("I am on CyberTruck home page")
	public void i_am_on_CyberTruck_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(cyberTruckHomePage.isAt());
	}

	
}
	
	


