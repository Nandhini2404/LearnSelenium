package week5Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;

public class ProjectSpecificMethod 
{
	public ChromeDriver driver; // global variable
	
	@BeforeMethod
	
	public void preCondition() 
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		driver = new ChromeDriver(opt);
	//driver.manage().window().maximize();
	driver.manage().window().maximize();
	// launch the browser
	driver.get("http://leaftaps.com/opentaps/.");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	// Enter the Username
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	// Enter the Password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	// Click on Submit
	driver.findElement(By.className("decorativeSubmit")).click();
	// close the page
	
}
	@AfterMethod
	
	public void postCondition() 
	{
		driver.close();
	}
}
