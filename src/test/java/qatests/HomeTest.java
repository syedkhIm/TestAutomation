package qatests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qabase.TestBase;
import qapages.home;
import qapages.storepage;

public class HomeTest extends TestBase{
	home hm;
	storepage store;
	
	public HomeTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		intialization();
		 hm = new home();
	}
	
	
	@Test
	public void navigate() throws IOException {
		store = hm.naviagatetostore();
		
		
	}
	
	@AfterMethod
	public void close() {
		
		//driver.close();
	}
	
	

}
