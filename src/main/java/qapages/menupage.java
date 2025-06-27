package qapages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qabase.TestBase;

public class menupage extends TestBase {
	basePage bp = new basePage();
	
	@FindBy(xpath="(//img[@alt='Caesar Salad Tray'])")
	WebElement selectitem;
	
	@FindBy(xpath=("//button[contains(text(),'Add to Cart')]"))
	WebElement addtocart;
	
	@FindBy(xpath="//button[@name='goToCart']")
	WebElement gotocart;
	
	
	
	
	
	
	public menupage() throws IOException{
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	
	
	public cartpage navigatetoPDP() throws InterruptedException, IOException {
		
		Thread.sleep(3000);
		//selectitem.click();
		bp.clickElement(selectitem);
		Thread.sleep(3000);
		//addtocart.click();
		bp.clickElement(addtocart);
		Thread.sleep(5000);
		//gotocart.click();
		bp.clickElement(gotocart);
		return new cartpage();
		
		
	}
	

	
	
}
