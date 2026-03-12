package commonconfig;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import commonconfig.ReadExcelData;

import org.openqa.selenium.WebDriver;

public class BaseClass 
{
	//public WebDriver driver;
	public ChromeDriver driver; // global variable
	public String filename;
	@Parameters({"url","username","password"})
	@BeforeMethod
	
	public void preCondition(String URL, String user, String pass) 
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		driver = new ChromeDriver(opt);
	//driver.manage().window().maximize();
	driver.manage().window().maximize();
	// launch the browser
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	// Enter the Username
	driver.findElement(By.id("username")).sendKeys(user);
	// Enter the Password
	driver.findElement(By.id("password")).sendKeys(pass);
	// Click on Submit
	driver.findElement(By.className("decorativeSubmit")).click();
	// close the page
	// Click on CRM/SFA
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			// Click on Leads Tab
			driver.findElement(By.linkText("Leads")).click();
	
}
	@AfterMethod
	
	public void postCondition() 
	{
		driver.close();
	}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException{
		String[][] readData = ReadExcelData.readData(filename);
		return readData;
	}
}
