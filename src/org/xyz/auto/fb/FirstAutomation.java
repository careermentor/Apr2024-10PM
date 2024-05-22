package org.xyz.auto.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Durations;

public class FirstAutomation 
{
	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser()
	{
		
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

	@Test(enabled=false)
	public void login()
	{
		driver.findElement(By.name("email")).sendKeys("santosh");
		
		driver.findElement(By.name("pass")).sendKeys("Pavan");
		
		driver.findElement(By.name("login")).click();
		
		
	}
	
	@Test
	public void signup() throws Exception
	{
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		
		
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		System.out.println(driver.findElement(By.xpath("//label[text()='Male']")).isSelected());  //false
		
		
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.xpath("//label[text()='Male']")).isEnabled());  //true
		
		boolean actselect = driver.findElement(By.xpath("//label[text()='Male']")).isEnabled();
		Assert.assertEquals(actselect, true);
				
		driver.findElement(By.name("websubmit")).click();
		
		
		
	}
	
}
