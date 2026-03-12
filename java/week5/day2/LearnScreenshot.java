package week5.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/.");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// Need to capture snapshot of username
		// Step 1 capture a pic
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		// to access file from File class need to create a object
		File target = new File("./snapshot/userName.png");
		FileUtils.copyFile(source, target);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.close();

	}

}
