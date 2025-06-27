package qapages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qabase.TestBase;

public class cartpage extends TestBase {
	basePage bp = new basePage();
	
	@FindBy(xpath="(//strong[contains(text(),'Checkout')])")
	WebElement checkoutbutton;
	
	
	
	
	
	
	public cartpage() throws IOException{
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	
	
	public checkoutpage navigatetocheckout() throws InterruptedException, IOException {
		
		Thread.sleep(4000);
		//checkoutbutton.click();
		bp.clickElement(checkoutbutton);
		return new checkoutpage();
		
		
		
	}
	

	
	
}
