package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseTestCase;

public class LoginTestase extends BaseTestCase{
	@Test
	public static void loginTestValidCredientials() throws InterruptedException {
		
		System.out.println("redirected to Login page page");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("locator_userid"))).sendKeys(cred.getProperty("userid"));
		
		driver.findElement(By.xpath(loc.getProperty("locator_password"))).sendKeys(cred.getProperty("password"));
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(loc.getProperty("locator_click"))).click();
		
		System.out.println("user successfully redirected to home page");
		String expectedTitle="Dash Board";
		String webpageTitle=driver.getTitle();
		System.out.println(webpageTitle);
		Thread.sleep(3000);
		
		Assert.assertEquals(expectedTitle,webpageTitle);
		
	}
	@Test
	public static void LoginTestIncorrectCredentials() throws InterruptedException {
		
        driver.findElement(By.xpath(loc.getProperty("locator_userid"))).sendKeys(cred.getProperty("userid"));
		
		driver.findElement(By.xpath(loc.getProperty("locator_password"))).sendKeys(cred.getProperty("password1"));
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(loc.getProperty("locator_click"))).click();
		
		Thread.sleep(3000);
		
		WebElement errormessage=driver.findElement(By.xpath(cred.getProperty("error_msg")));
		String ErrorMessegeText= errormessage.getText();
		System.out.println(ErrorMessegeText);
		
	}
	@Test
	public static void LogoutFunctionality() throws InterruptedException {
		
        driver.findElement(By.xpath(loc.getProperty("locator_userid"))).sendKeys(cred.getProperty("userid"));
		
		driver.findElement(By.xpath(loc.getProperty("locator_password"))).sendKeys(cred.getProperty("password"));
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(loc.getProperty("locator_click"))).click();
		
		driver.findElement(By.xpath(loc.getProperty("locator_Bbmhft_77"))).click();
		driver.findElement(By.xpath(loc.getProperty("locator_logoutLink"))).click();
		
		System.out.println("user successfully redirected to Login page");
		String expectedTitle="Home";
		String LoginwebpageTitle=driver.getTitle();
		System.out.println(LoginwebpageTitle);
		Thread.sleep(3000);
		
		Assert.assertEquals(expectedTitle,LoginwebpageTitle);
		
	}

}
