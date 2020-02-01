package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class TeslaHomePage {
	
	private WebDriver driver;
	
	public TeslaHomePage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText = "CYBERTRUCK")
	public WebElement CyberTruckLink;
	
	
	
	
	public boolean isAt() {
		return driver.getTitle().contentEquals("Electric Cars, Solar Panels & Clean Energy Storage | Tesla");
	}

}
