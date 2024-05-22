package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.fb.utilities.ReadPropClass;

public class SignupPage 
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver) 
	{
	
		this.driver=driver;
	}
	
	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropClass.readelement("FB_Signup_Createnewaccount_xpath"))).click();
	}
	

	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropClass.readelement("FB_Signup_Firstname_name"))).sendKeys(fname);
	}
	
	public void dropdown_day(String day) throws Exception
	{
		Select dob_day = new Select(driver.findElement(By.name(ReadPropClass.readelement("FB_Signup_DOB_Day_name"))));
		dob_day.selectByVisibleText(day);
	}
	
	public void click_gender() throws Exception
	{
		driver.findElement(By.xpath(ReadPropClass.readelement("FB_Signup_Gender_Male_xpath"))).click();
	}
	
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropClass.readelement("FB_Sugnup_Signupbttn_name"))).click();
	}
	
	
	
}
