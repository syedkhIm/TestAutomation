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

public class checkouTest extends TestBase {
	
	home hm;
	storepage store;
	menupage menu;
	cartpage cart;
	checkoutpage checkout;	
	orderconfrimpage orderconfirm;
	

	checkouTest(){
		
		super();
	}
	
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		intialization();
		 hm = new home();
		 hm.naviagatetostore();
		  store = new storepage();
		  store.storeselection();
		  menu = new menupage();
		  menu.navigatetoPDP();
		  cart = new cartpage();
		  cart.navigatetocheckout();
		  checkout = new checkoutpage();
		  
	}
	
	@Test(priority=1)
	public void contactinfo() throws InterruptedException {
		checkout.contactform("syed", "khan", "syed.khan@wawa.com", "6505555555");
		orderconfirm = checkout.paymentform();
		
		
	}
	
	/*@Test(priority=2)
	public void paymentdetails() throws InterruptedException {
		checkout.paymentform();
	}*/
	
	
	@AfterMethod
	public void close() {
		//driver.close();
	}
	
}
