package org.xyz.auto.fb;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class KeyboardMouse 
{
	WebDriver driver;
	
	@Test(enabled=true)
	public void handleFrames() throws Exception
	{
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe')]")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).getText());

		
		CaptureScreenshot.takingscreenshot(driver,"handleFrames");
		
	}
	
	@Test(enabled=true)
	public void handleAalert() throws Exception
	{
		
		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.takingscreenshot(driver, "handleAalert");
		
	}
	
	@Test(enabled=false)
	public void mouseControl() throws Exception
	{
		
		driver = new ChromeDriver();
		driver.get("https://www.mphasis.com/home.html");

		Actions act = new Actions(driver);
		
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).perform();
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> windid = driver.getWindowHandles();
		
		System.out.println(windid);
		
		Iterator<String> itr = windid.iterator();
		
		String win1 = itr.next();
		String win2 = itr.next();
		
		
		driver.switchTo().window(win2);
		driver.switchTo().window(win1);
		
		///driver.quit();
		
	}
	
	@Test(enabled=false)
	public void keyboardControl() throws Exception
	{
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		//act.sendKeys("user1").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
		
		/*
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("pass1234").perform();
		
		act.sendKeys(Keys.ENTER).perform();
		*/
		
		
	}
		
}
