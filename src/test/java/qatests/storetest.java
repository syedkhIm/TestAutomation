package qatests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qabase.TestBase;
import qapages.home;
import qapages.menupage;
import qapages.storepage;

public class storetest extends TestBase{
	home hm;
	storepage store;
	menupage menu;
	
	

	public storetest() throws IOException {
		
		super();		
		
	}
	

	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		intialization();
		 hm = new home();
		 hm.naviagatetostore();
		  store = new storepage();
	}
	
	@Test(priority=1)
	public void enterstorename() throws InterruptedException, IOException {
		//store.storeselection(prop.getProperty("store_name").toString(),prop.getProperty("city").toString(),prop.getProperty("state").toString());
		//menu = store.storeselection("media", "Media", "PA, USA");
		menu = store.storeselection();
		
	}
	
	/*@Test
	public void choosedeliveryfulfillment() throws InterruptedException {
		store.selectdelivery();
	}*/
	
	
	
	
	
	
	@AfterMethod
	public void close() {
		
		//driver.close();
	}

}
