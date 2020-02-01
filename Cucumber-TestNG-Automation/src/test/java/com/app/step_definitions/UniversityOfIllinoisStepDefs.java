package com.app.step_definitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.app.pages.UniversityOfIllinoisHomePage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UniversityOfIllinoisStepDefs {
	
private  WebDriver driver = Driver.getDriver();
	
UniversityOfIllinoisHomePage uniHomePage = new UniversityOfIllinoisHomePage();



@Given("I am on the UIC main homepage")
public void i_am_on_the_UIC_main_homepage() {
	driver.get(ConfigurationReader.configFile.getProperty("url"));
	Assert.assertTrue(uniHomePage.isAt());
   
}

@When("^I hover over the (ACADEMICS|RESEARCH|ACADEMICS|STUDENT LIFE|ABOUT) menu$")
public void i_hover_over_the_ACADEMICS_menu(String menu) {
	Actions mouse = new Actions(driver);
	
	switch(menu) {
	
	case("ACADEMICS"):
		mouse.moveToElement(uniHomePage.AcademicsLabel).perform(); BrowserUtils.waitFor(5);
	break;
	
	case("ABOUT"):
		mouse.moveToElement(uniHomePage.AboutLabel).perform(); BrowserUtils.waitFor(5);
	break;
	
	}
	

	
	
}

@Then("following menu options should be visible")
public void following_menu_options_should_be_visible(List<String> menuOptions) {
	List<WebElement> TopMenuOptions =  uniHomePage.GetTopMenuOptions();
	List<String> TopMenuOptionsAsString =  BrowserUtils.getNameOfElementsAsString(TopMenuOptions);
	Assert.assertEquals(TopMenuOptionsAsString.size(), menuOptions.size());
	
	for(int i=0; i<menuOptions.size(); i++) {
		assertEquals(TopMenuOptionsAsString.get(i), menuOptions.get(i));
	}
   
}

@Then("following menu options should be visible.")
public void following_meenu_options_should_be_visible(List<String> menuOptions) {
	List<WebElement> TopMenuOptions =  uniHomePage.GetTopMenuOptions2();
	List<String> TopMenuOptionsAsString =  BrowserUtils.getNameOfElementsAsString(TopMenuOptions);
	Assert.assertEquals(TopMenuOptionsAsString.size(), menuOptions.size());
	
	for(int i=0; i<menuOptions.size(); i++) {
		assertEquals(TopMenuOptionsAsString.get(i), menuOptions.get(i));
	}
   
}


 

}
