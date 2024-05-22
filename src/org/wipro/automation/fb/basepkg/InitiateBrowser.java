package org.wipro.automation.fb.basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.fb.utilities.ReadPropClass;

public class InitiateBrowser 
{
	public WebDriver driver;

	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(ReadPropClass.readconfg("Browsername").equalsIgnoreCase("CHROME"))
		{
			driver = new ChromeDriver();
		}
		
		else if(ReadPropClass.readconfg("Browsername").equalsIgnoreCase("EDGE"))
		{
			driver = new EdgeDriver();
		}
		
		
		
		driver.get(ReadPropClass.readconfg("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
}
