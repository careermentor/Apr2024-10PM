package org.wipro.automation.fb.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.fb.basepkg.InitiateBrowser;
import org.wipro.automation.fb.datagenerator.TestDataGenerator;
import org.wipro.automation.fb.pages.LoginPage;

public class LoginScenario extends InitiateBrowser
{

	@Test(dataProvider="ddf",dataProviderClass=TestDataGenerator.class)
	public void tc001_validateloginfunc(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
		
	}
	

	
	
	
}
