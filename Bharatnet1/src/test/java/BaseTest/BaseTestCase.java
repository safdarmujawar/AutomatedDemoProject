package BaseTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestCase {
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static Properties cred = new Properties();
	public static WebDriver driver;
	public static FileReader fr;
	public static FileReader fr1;
	public static FileReader fr2;


	@BeforeTest
	public void setup() throws IOException {
		
		if (driver==null) {
			
			FileReader fr =new FileReader("C:\\Users\\admin\\git\\AutomatedDemoProject\\Bharatnet1\\Resources\\Config.Properties");
			prop.load(fr);
			
			FileReader fr1 =new FileReader("C:\\Users\\admin\\git\\AutomatedDemoProject\\Bharatnet1\\Resources\\locators.Properties");
			loc.load(fr1);
			

			FileReader fr2 =new FileReader("C:\\Users\\admin\\git\\AutomatedDemoProject\\Bharatnet1\\Resources\\Credentials.Properties");
			cred.load(fr2);
			
		}
		
		if(prop.getProperty("Browser").equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
		
			// Create a new ChromeDriver instance
			 driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			//driver.manage().window().maximize();
		}
	        

	
	}
	

	@AfterTest
    public void teardown() {
		
		driver.quit();
    	
    }
}
//WebDriverManager.chromedriver().setup();
//
//// Create a new ChromeDriver instance
// driver = new ChromeDriver();
//
//// Use the ChromeDriver to navigate to a web page
//driver.get("http://172.31.37.57:8080/NofnNMS/modules/map/admin.jsp");
//
//driver.manage().window().maximize();
