package com.app.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {
	
	
	
	public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
		
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
		return wait.until(ExpectedConditions.visibilityOf(element)); 
	}
	
	public static WebElement waitForVisibility(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOut);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static void waitForPageToLoad(long timeOutInSeconds) {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		
		try {
			System.out.println("waiting for page to load");
			WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOutInSeconds);
			wait.until(expectation);
		}
		catch (Throwable error) {
			System.out.println("Timeout for page load request to complete after" + timeOutInSeconds);
		}
	}
	
	public static void waitFor( int sec) {
		try {
			Thread.sleep(sec * 1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void switchToWindow(String targetTitle) {
		String origin = Driver.getDriver().getWindowHandle();
		
		for(String handle : Driver.getDriver().getWindowHandles()) {
			Driver.getDriver().switchTo().window(handle);
			if(Driver.getDriver().getTitle().equals(targetTitle)){
				return ;
			}
			
		}
		Driver.getDriver().switchTo().window(origin);
	}
	
	
	public static List<String> getNameOfElementsAsString(List<WebElement> listOfWebElements){
		List<String> nameOfWebElementsAsString = new ArrayList<>();
		for( WebElement nameOfWebElementAsString: listOfWebElements) {
			if(!nameOfWebElementAsString.getText().isEmpty()) {
				nameOfWebElementsAsString.add(nameOfWebElementAsString.getText());
			}
		}
		return nameOfWebElementsAsString;
		
	}
	
	
	
	
	

}
