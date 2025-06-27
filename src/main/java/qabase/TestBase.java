package qabase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qautils.Testutil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase() {
		
		prop = new Properties();
		 
		try {
			FileInputStream	ip = new FileInputStream("C:\\Users\\BL775GK\\eclipse-workspace\\com.wawaPOM\\src\\main\\java\\qaconfig\\config.properties");
			prop.load(ip);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public static void intialization () throws InterruptedException
	{
		
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			 
			driver = new ChromeDriver(); 
		}
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().pageLoadTimeout(Testutil.page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.implicitly_Wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
