package commonconfig;




import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week6.day1.ReadExcelData;

public class EditLead extends BaseClass{
	
	@BeforeTest	
	public void setValues() 
	{
		filename="EditLead";
	}
	
@Test(dataProvider="fetchData")
	public void editLead(String phoneNum, String companyName) throws InterruptedException{
		
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNum);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
	driver.findElement(By.name("submitButton")).click();
	
		
	}

}