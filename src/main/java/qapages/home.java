package qapages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qabase.TestBase;

public class home extends TestBase{
	basePage bp = new basePage(); 
	
	 @FindBy(xpath="//button[@class='sc-aXZVg sc-dcJsrY Link__StyledLink-v7zbn-0 ckgvKE jhlWzs Header_no-edit-btn__v8sSq']")
	 WebElement startorder;

	 //intialization
	public home() throws IOException {
		//super();
		PageFactory.initElements(driver, this);
	}
	
	//Actions
public storepage naviagatetostore() throws IOException {
	//startorder.click();
	bp.clickElement(startorder);
	
	
	System.out.println("navigated to store selector page");
	return new storepage();
	
}

	

}
