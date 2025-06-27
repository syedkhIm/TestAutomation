package qapages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qabase.TestBase;

public class storepage extends TestBase{
	basePage bp = new basePage();
	
	@FindBy(xpath="//input[@id='autosuggest-input']")
	WebElement search;
	
	
	@FindBy(xpath="//li[@id='selectableOption-0']")
	WebElement selectdropdown;
	
	@FindBy(xpath="(//button[@name='Select Store'])[1]")
	WebElement selectstore; 
	@FindBy(xpath = "//input[@id='pickupDate']")
	WebElement calender;
	@FindBy(xpath = "//button[@type='button'][23]")
	WebElement selectdate;
	@FindBy(xpath = "//select[@id='pickupTime']")
	WebElement timeslot;
	@FindBy(xpath = "//select[@id='pickupTime']/option[50]")
	WebElement choosetime;
	
	//delivery fulfillment
	@FindBy(xpath = "//strong[contains(text(),'Delivery')]")
	WebElement deliverytype;
	
	@FindBy(xpath = "//input[@id='autosuggest-input']")
	WebElement addressfield;
	
	@FindBy(xpath = "//small[contains(text(),'Media, PA, USA')]")
	WebElement selectdeliveryaddress;
	
	@FindBy(xpath = "//button[contains(text(),'Check Availability')]")
	WebElement checkavailbutton;
	
	@FindBy(xpath = "//input[@id='deliveryDate']")
	WebElement deliverycalender;
	
	@FindBy(xpath = "//button[@type='button'][20]")
	WebElement deliverydate;
	
	@FindBy(xpath = "//select[@id='deliveryTime']")
	WebElement deliverytimeslots;
	
	@FindBy(xpath = "//select[@id='deliveryTime']/option[55]")
	WebElement deliverytime;
	
	
	//confirm&view button
	@FindBy(xpath = "//button[@type='submit']")
	WebElement confirm;
	
	
	

	public storepage() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Actions

	public menupage storeselection() throws InterruptedException, IOException {
		//search.sendKeys(md);
		bp.selectStoreInDropDown(search);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//ul[@id='autosuggest']//following::p[text()='"+city+"']//following::small[text()='"+state+"']")).click();
		selectdropdown.click();
		Thread.sleep(3000);
		//selectstore.click();
		bp.clickElement(selectstore);
		Thread.sleep(3000);
		//calender.click();
		bp.clickElement(calender);
		//selectdate.click();
		bp.clickElement(selectdate);
		//timeslot.click();
		bp.clickElement(timeslot);
		//choosetime.click();
		bp.clickElement(choosetime);
		//confirm.click();
		bp.clickElement(confirm);
		return new menupage();	
		
		
		
	}
	 
	public void selectdelivery() throws InterruptedException {
		deliverytype.click();
		Thread.sleep(3000);
		addressfield.sendKeys("1242 W. Baltimore Pike");
		Thread.sleep(2000);
		selectdeliveryaddress.click();
		Thread.sleep(2000);
		checkavailbutton.click();
		deliverycalender.click();
		deliverydate.click();
		deliverytimeslots.click();
		deliverytime.click();
		confirm.click();
		
		
		
		
		
		
		
		
	}

}
