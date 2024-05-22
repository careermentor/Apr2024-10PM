package org.xyz.auto.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DifferentControl 
{
	WebDriver driver;
	
	@Test(enabled=false)
	public void yatrawebsite() throws Exception
	{
		
		driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//a[@title='Non Stop Flights']")).click();
		
	}
	
	
	@Test(enabled=true)
	public void launchbrowser() throws Exception
	{
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(5000);
		
		
		System.out.println(10);
		
		int a =10;
		System.out.println(a);
		
		WebElement abc = driver.findElement(By.name("firstname"));
		abc.sendKeys("Selenium");
		
		driver.findElement(By.name("firstname")).clear();
		
		abc.sendKeys("Java");
		
		driver.findElement(By.xpath("//*[text()='Male']")).click();
		
		Select dob_day = new Select(driver.findElement(By.name("birthday_day")));
		dob_day.selectByIndex(9);
		
		Select dob_month = new Select(driver.findElement(By.name("birthday_month")));
		dob_month.selectByValue("7");
		
		Select dob_year = new Select(driver.findElement(By.name("birthday_year")));
		dob_year.selectByVisibleText("2025");
		dob_year.selectByVisibleText("2020");
		
		
		
		
		
		
		//driver.findElement(By.xpath("//a[text()='Already have an account?']")).click();
		
		
	}
		
}
