package org.wipro.automation.fb.datagenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{

	@DataProvider(name="ddf")
	public Object[][] testdata()
	{
		//Object[] username = {"user1","pass1"};    //1-d array
		Object[][] ddfdata = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};    //2-d array
		return ddfdata;
		
	}
	
	@DataProvider(name="ddf1")
	public Object[][] testdata1()
	{
		//Object[] username = {"user1","pass1"};    //1-d array
		Object[][] ddfdata1= {{"xyz","abc"},{"xyz1","abc1"},{"xyz2","abc2"}};    //2-d array
		return ddfdata1;
		
	}
}
