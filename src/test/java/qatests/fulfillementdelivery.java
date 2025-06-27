package qatests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

import qabase.TestBase;
import qapages.cartpage;
import qapages.checkoutpage;
import qapages.home;
import qapages.menupage;
import qapages.orderconfrimpage;
import qapages.storepage;

public class fulfillementdelivery extends TestBase{
	
	home hm;
	storepage store;
	menupage menu;
	cartpage cart;
	checkoutpage checkout;	
	orderconfrimpage orderconfirm;
	fulfillementdelivery fd;
	
	
	
	fulfillementdelivery(){
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		intialization();
		 hm = new home();
	}
	
	
	
	@Test
	public void Selectdeliveryfulfillment() throws IOException, InterruptedException {
		hm.naviagatetostore();
		store = new storepage();
		store.selectdelivery();
		 menu = new menupage();
		menu.navigatetoPDP();
		cart = new cartpage();
		cart.navigatetocheckout();
		checkout = new checkoutpage();
		checkout.contactform("syed", "khan", "syed.khan@wawa.com", "6505555555"); // data need to read from excel file
		checkout.paymentform();
		orderconfirm = new orderconfrimpage();
		orderconfirm.confirmation();
		
	}
	
	
	@AfterMethod
	public void close() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();
		
	}
	
}
