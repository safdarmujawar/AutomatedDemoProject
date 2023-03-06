package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import BaseTest.BaseTestCase;

public class ReadUtilituFiles{

	public static void main(String[] args) throws IOException {
		
		FileReader fr= new FileReader("C:\\Users\\admin\\eclipse-workspace\\Bharatnet1\\Resources\\Config.Properties");
		Properties p = new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("url"));
		

	}

}
