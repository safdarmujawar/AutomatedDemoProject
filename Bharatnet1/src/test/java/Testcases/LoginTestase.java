package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseTestCase;

public class LoginTestase extends BaseTestCase{
	@Test
	public static void loginTest() throws InterruptedException {
		
		System.out.println("redirected to Login page page");
		Thread.sleep(3000);
		driver.findElement(By.id("j_username")).sendKeys("bbmhft_77");
		
		driver.findElement(By.id("j_password")).sendKeys("bbnl4629");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div[1]/form/fieldset/div[3]/button")).click();
		
		System.out.println("user successfully redirected to home page");
		String expectedTitle="Dash Board";
		String webpageTitle=driver.getTitle();
		System.out.println(webpageTitle);
		Thread.sleep(3000);
		
		Assert.assertEquals(expectedTitle,webpageTitle);
		
	}
	@Test
	public static void LoginTestIncorrectPassword() throws InterruptedException {
		
       driver.findElement(By.id("j_username")).sendKeys("bbmhft_77");
		
		driver.findElement(By.id("j_password")).sendKeys("bbnl4623");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div[1]/form/fieldset/div[3]/button")).click();
		
		WebElement errormessage=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/center/h4/font"));
		String ErrorMessegeText= errormessage.getText();
		System.out.println(ErrorMessegeText);
		
	}

}
