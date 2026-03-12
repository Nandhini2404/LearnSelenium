package week3Assignments;

import week3.day2.TestData;

public class LoginTestData extends TestData
{
	public void enterUsername() 
	{
		System.out.println("enterUsername");
	}
	
	public void enterPassword() 
	{
		System.out.println("enterPassword");
	}

	public static void main(String[] args)
	{
		LoginTestData ld=new LoginTestData();
		ld.enterCredentials();
		ld.enterPassword();
		ld.enterUsername();
		ld.navigateToHomePage();

	}

}
