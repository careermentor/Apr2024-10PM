package org.wipro.automation.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.fb.basepkg.InitiateBrowser;
import org.wipro.automation.fb.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void tc0020_validatesignup() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccountbttn();
		sign.enter_firstname("Selenium");
		sign.dropdown_day("22");
		sign.click_gender();
		sign.click_signupbttn();
		
	}
	

	
	
	
}
