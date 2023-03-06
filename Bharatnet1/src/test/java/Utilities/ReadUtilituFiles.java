package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import BaseTest.BaseTestCase;

public class ReadUtilituFiles{

	public static void main(String[] args) throws IOException {
		
		FileReader fr= new FileReader("C:\\Users\\admin\\git\\AutomatedDemoProject\\Bharatnet1\\Resources\\Config.Properties");
		Properties p = new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("url"));
		
	
		FileReader fr1= new FileReader("C:\\Users\\admin\\git\\AutomatedDemoProject\\Bharatnet1\\Resources\\locators.Properties");
		Properties p1 = new Properties();
		p1.load(fr1);
		
		System.out.println(p1.getProperty("locator_click"));
		
		FileReader fr2= new FileReader("C:\\Users\\admin\\git\\AutomatedDemoProject\\Bharatnet1\\Resources\\Credentials.Properties");
		Properties p2= new Properties();
		p2.load(fr2);
		
		System.out.println(p2.getProperty("password"));
		

	}

}
