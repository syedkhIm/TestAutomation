package qapages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qabase.TestBase;

public class checkoutpage extends TestBase {
	basePage bp = new basePage();
	
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement fisrtname;
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastname;
	@FindBy(xpath = "//input[@id='emailAddress']")
	WebElement emailid;
	@FindBy(xpath = "//input[@id='phoneNumber']")
	WebElement phonenumber;
	@FindBy(xpath = "//button[@name='Continue to Payment']")
	WebElement continuebutton;	
	@FindBy(xpath = "//strong[contains(text(),'Pay with a credit card')]")
	WebElement commercehub;
	@FindBy(xpath = "//input[@id='cardNumber']")
	WebElement cardnumber;
	@FindBy(xpath = "//input[@id='expiration']")
	WebElement expiryfield;
	@FindBy(xpath = "//input[@id='securityCode']")
	WebElement cvv;
	@FindBy(xpath = "//input[@id='nameOnCard']")
	WebElement cardname;
	@FindBy(xpath = "//input[@placeholder='Address']")
	WebElement address;
	@FindBy(xpath = "//input[@placeholder='City']")
	WebElement city;
	@FindBy(xpath = "//input[@placeholder='State']")
	WebElement state;
	@FindBy(xpath = "//input[@placeholder='ZIP Code']")
	WebElement zipcode;
	@FindBy(xpath = "//button[@id='submit']")
	WebElement submit;
	
	
	
	public checkoutpage(){
		PageFactory.initElements(driver, this);
	}
	
	public void contactform(String fn, String ln, String email, String ph) throws InterruptedException {
		fisrtname.sendKeys(fn);
		lastname.sendKeys(ln);
		emailid.sendKeys(email);
		phonenumber.sendKeys(ph);
		//continuebutton.click();
		bp.clickElement(continuebutton);
		
		}
	
	public orderconfrimpage paymentform() throws InterruptedException {
		
		Thread.sleep(2000);
		String paymentname =commercehub.getText();
		
		System.out.println(paymentname);
		assertEquals(paymentname, "Pay with a credit card");
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		cardnumber.sendKeys("4111 1111 1111 1111");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);			
		expiryfield.sendKeys("12/25");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);	
		cvv.sendKeys("123");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(4);
		cardname.sendKeys("tester");
		driver.switchTo().parentFrame();
		address.sendKeys("19th street");
		city.sendKeys("test");
		state.sendKeys("tx");
		zipcode.sendKeys("89105");
		submit.click();
		return new orderconfrimpage();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
