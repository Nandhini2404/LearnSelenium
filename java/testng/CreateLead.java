package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
@Test
	public void createLead() {
		
		// Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click on Leads Tab
		driver.findElement(By.linkText("Leads")).click();
		// Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter the Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Bot Test");
		// Enter the First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lead01");
		// Enter the Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test");
		// Enter the Title
		String expectedTitle = "Testing";
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(expectedTitle);
		// Click on Create Lead
		driver.findElement(By.name("submitButton")).click();
		// Verify the title is displayed correctly
		WebElement titleElement = driver.findElement(By.xpath("(//span[text()='Title']//following::span)[1]"));
		String actualTitle = titleElement.getText();
		if (actualTitle.equals(expectedTitle))
		{
			System.out.println("Title is displayed correctly");

		} else
		{
			System.out.println("Tile is not correctly displayed");
		}
		// Close the Browser
		driver.quit();

	}

}