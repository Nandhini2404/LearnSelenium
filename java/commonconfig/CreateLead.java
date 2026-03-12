package commonconfig;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week6.day1.ReadExcelData;

public class CreateLead extends BaseClass {
@BeforeTest	
public void setValues() 
{
	filename="CreateLead";
}

@Test(dataProvider="fetchData")
	public void createLead(String companyName, String firstName, String lastName,String phonenum) {
		
		
		// Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter the Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		// Enter the First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		// Enter the Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(phonenum);
		// Enter the Title
		String expectedTitle = "Testing";
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(expectedTitle);
		
		// adding the wait method
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.name("submitButton")));
		button.click();
		
		// Click on Create Lead
		//driver.findElement(By.name("submitButton")).click();
		// Verify the title is displayed correctly
		//WebElement titleElement = driver.findElement(By.xpath("(//span[text()='Title']//following::span)[1]"));
		//String actualTitle = titleElement.getText();
		//if (actualTitle.equals(expectedTitle))
		//{
			//System.out.println("Title is displayed correctly");

		//} else
		//{
			//System.out.println("Tile is not correctly displayed");
		//}
		
		// Close the Browser
		//driver.quit();

	}

}