package org.xyz.auto.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsWebDriver 
{
	WebDriver driver;
	
	@Test
	public void fetchdataandcompare() throws Exception
	{	
		driver = new ChromeDriver();
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		
		//WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		//waits.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Alaska"));
		
		st.selectByVisibleText("Florida");
		
		
	}	
	
	
}
