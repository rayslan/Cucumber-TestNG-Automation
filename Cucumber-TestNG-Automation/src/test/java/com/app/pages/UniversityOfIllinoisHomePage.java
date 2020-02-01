package com.app.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class UniversityOfIllinoisHomePage {
	
	private static WebDriver driver;
	
	public UniversityOfIllinoisHomePage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public boolean isAt() {
		return driver.getTitle().contentEquals("University of Arizona | The University of Arizona, Tucson, Arizona");
	}
	
	public List<WebElement> GetTopMenuOptions (){
		String xpath="(//a[@class='menu__link text-uppercase dropdown-toggle nolink'])[2]/..//li/a";
		return driver.findElements(By.xpath(xpath));
	}
	
	
	public List<WebElement> GetTopMenuOptions2 (){
		String xpath="(//a[@class='menu__link text-uppercase dropdown-toggle nolink'])[5]/..//li/a";
		return driver.findElements(By.xpath(xpath));
	}

	
	@FindBy(xpath = "(//a[@class='menu__link text-uppercase dropdown-toggle nolink'])[2]")
	public WebElement AcademicsLabel;
	
	
	@FindBy(xpath = "(//a[@class='menu__link text-uppercase dropdown-toggle nolink'])[5]")
	public WebElement AboutLabel;
}
