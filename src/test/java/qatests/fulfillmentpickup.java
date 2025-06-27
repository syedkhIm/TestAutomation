package qatests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qabase.TestBase;
import qapages.cartpage;
import qapages.checkoutpage;
import qapages.home;
import qapages.menupage;
import qapages.orderconfrimpage;
import qapages.storepage;

public class fulfillmentpickup extends TestBase{
	
	home hm;
	storepage store;
	menupage menu;
	cartpage cart;
	checkoutpage checkout;	
	orderconfrimpage orderconfirm;
	fulfillmentpickup fp;
	
	fulfillmentpickup(){
		super();
	}

	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		intialization();
		 hm = new home();
	}
	
	
	
	@Test(groups= {"Regression", "tc002"})
	public void Selectpickupfulfillment() throws IOException, InterruptedException {
		hm.naviagatetostore();
		store = new storepage();
		store.storeselection();
		 menu = new menupage();
		menu.navigatetoPDP();
		cart = new cartpage();
		cart.navigatetocheckout();
		checkout = new checkoutpage();
		checkout.contactform("syed", "khan", "syed.khan@wawa.com", "6505555555");
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
