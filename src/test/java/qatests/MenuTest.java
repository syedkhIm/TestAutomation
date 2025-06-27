package qatests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qabase.TestBase;
import qapages.cartpage;
import qapages.home;
import qapages.menupage;
import qapages.storepage;

public class MenuTest extends TestBase{
	
	home hm;
	storepage store;
	menupage menu;
	cartpage cart;
	
	
	
	MenuTest () throws IOException {
		
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
		  
	}
	
	
	@Test
	public void selectitem() throws InterruptedException, IOException {
		cart = menu.navigatetoPDP();		 
	}
	
	
	@AfterMethod()
		public void close() {
			//driver.quit();
		
	}
	

}
