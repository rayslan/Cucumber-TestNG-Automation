package com.app.tests;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.app.pages.GasMileageCalculatorPage;
import com.app.utilities.Driver;

public class DataDrivenTest {
	
	WebDriver driver;
	Workbook workbook;
	Sheet worksheet;
	
	GasMileageCalculatorPage gasMileageCalculatorPage = new  GasMileageCalculatorPage();
	
	@BeforeClass
	public void setUp() {
		driver= Driver.getDriver();
		driver.get("https://www.calculator.net/gas-mileage-calculator.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void calculatotTest() {
		gasMileageCalculatorPage.currentOdometer.sendKeys("3456");
		gasMileageCalculatorPage.previousOdometer.sendKeys("2345");
		gasMileageCalculatorPage.gasAdded.sendKeys("30");
		gasMileageCalculatorPage.gasPrice.sendKeys("3");
		gasMileageCalculatorPage.calculate.click();
		
	}

}
