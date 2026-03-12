package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args)
	{
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://www.pvrcinemas.com/");
		
		// Maximize the window
		driver.manage().window().maximize();
		
		// Add implecit wait to handle the timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Action class to interact the web element with complex gestures
		// step 1 create the object
		Actions act = new Actions(driver);

		// Step 2 Locate the element (or find element)
		WebElement mouseOverElement =  driver.findElement(By.xpath("//span[text()='More']"));
		
		// Step 3 use the method for mouse over -> moveToElement at last .perform()
		
		act.moveToElement(mouseOverElement).perform();
		
		//driver.quit();
		
		
		
	}

}
