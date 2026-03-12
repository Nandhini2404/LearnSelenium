package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotation {
@BeforeSuite
	public  void beforeSuit() 
	{
		System.out.println("Before suit");
	}

@BeforeTest
public  void beforeTest() 
{
	System.out.println("Before Test");
}

@BeforeClass
public  void beforeClass() 
{
	System.out.println("Before class");
}

@BeforeMethod
public  void beforeMethod() 
{
	System.out.println("Before method");
}

@Test
public  void testCase1() 
{
	System.out.println("test case for @Test");
}

@AfterMethod
public  void afterMethod() 
{
	System.out.println("after method");
}

@AfterClass
public  void afterClass() 
{
	System.out.println("after class");
}

@AfterTest
public  void afterTest() 
{
	System.out.println("after Test");
}

@AfterSuite
public  void afterSuit() 
{
	System.out.println("after suit");
}
}
