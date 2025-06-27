package qapages;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class basePage {
	WebDriver driver;
	
	public void clickElement(WebElement element) {
	
		System.out.println("conform button to be clicked " + element);
		
		element.click();		
		
		
	}
	
	public void waitForElementPresent(WebElement element) {
		
		
	}
	public void enterTextintoTextField(WebElement element, String value) {
		element.sendKeys(value);
		
				
	}
	
	
	public void selectStoreInDropDown(WebElement element) {
		
		enterTextintoTextField(element,"media");
		
		
	}
	 
	

	

	
	
	
}
