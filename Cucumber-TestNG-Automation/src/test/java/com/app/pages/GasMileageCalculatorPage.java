package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class GasMileageCalculatorPage {

	private WebDriver driver;
	
	public GasMileageCalculatorPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "uscodreading")
	public WebElement currentOdometer;
	
	
	@FindBy(id = "uspodreading")
	public WebElement previousOdometer;
	
	@FindBy(id = "usgasputin")
	public WebElement gasAdded;
	
	@FindBy(id = "usgasprice")
	public WebElement gasPrice;
	
	@FindBy(xpath = "(//input[@alt='Calculate'])[1]")
	public WebElement calculate;
	
	
	
}
