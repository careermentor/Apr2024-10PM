package org.xyz.auto.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchData 
{
	WebDriver driver;
	
	@Test
	public void fetchdataandcompare() throws Exception
	{	
		driver = new ChromeDriver();
		
		String ExpURL = "https://www.facebook.com";
		driver.get(ExpURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, ExpURL,"this expected and actual did not match");  //hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpURL);
		
		System.out.println("this test case is executed");
		
		String ExpPageTitle = "Facebook – log in or sign up";
		
		String ActPageTitle = driver.getTitle();
		
		System.out.println(ActPageTitle);
		
		sa.assertEquals(ActPageTitle, ExpPageTitle);
		
		String ExpUname = "Email address or phone number";
		
		String ActUname = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActUname);
		
		sa.assertEquals(ActUname, ExpUname);
		
		String ExpLoginbutton = "Log in";
		String ActLoginbutton = driver.findElement(By.name("login")).getText();
		
		System.out.println(ActLoginbutton);
		
		sa.assertEquals(ActLoginbutton, ExpLoginbutton);
		
		
		String ActText = driver.findElement(By.xpath("//*[contains(text(),'Facebook helps you connect')]")).getText();
		
		System.out.println(ActText);
		
		Point loginLoc = driver.findElement(By.name("login")).getLocation();
		
		System.out.println(loginLoc);
		
		System.out.println(driver.getPageSource());
		
		
		sa.assertAll();
		
		
	}
	
	public void tc2()
	{
		
	}
	
			
}
