package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class CyberTruckHomePage {
	
	private WebDriver driver ;
	
	public CyberTruckHomePage() {
		this.driver= Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public boolean isAt() {
		return driver.getTitle().contentEquals("Cybertruck | Tesla");
	}

}
