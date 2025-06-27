package qapages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qabase.TestBase;

public class orderconfrimpage extends TestBase {
	
	
	@FindBy(partialLinkText="Confirmed! Order #")
	WebElement successmessage;
	
	
	

	public orderconfrimpage() {
		PageFactory.initElements(driver, this);
	}
	
	public void confirmation() {
		/*String confirm_message = successmessage.getText();
		System.out.println(confirm_message);
		assertEquals(confirm_message, "Confirmed! Order #");*/
		String successpage = driver.getTitle();
		System.out.println(successpage);
		assertEquals(successpage, "Catering | Wawa");
		
		
	}
	
}
