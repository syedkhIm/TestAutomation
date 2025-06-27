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
import qapages.storepage;

public class cartTest extends TestBase{
	
	home hm;
	storepage store;
	menupage menu;
	cartpage cart;
	checkoutpage checkout;
	
	
	
	cartTest () throws IOException {
		
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
		  
	}
	
	
	@Test
	public void checkout() throws InterruptedException, IOException {
		checkout = cart.navigatetocheckout();		 
	}
	
	
	@AfterMethod()
		public void close() {
			//driver.quit();
		
	}
	

}
