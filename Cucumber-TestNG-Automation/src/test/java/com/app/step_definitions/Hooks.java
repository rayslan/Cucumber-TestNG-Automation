package com.app.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.app.utilities.Driver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before
	public void setUp() {
		WebDriver driver = Driver.getDriver();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}


	@SuppressWarnings("deprecation")
	@After
	public void tearDown(Scenario scenario) {
		
		if(scenario.isFailed()) {
			
		
		
		final byte[] screenshot= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
		scenario.embed( screenshot, "image/png");
		}
		
		Driver.closeDriver();
	}
}
