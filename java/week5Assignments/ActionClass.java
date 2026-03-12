package week5Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws IOException 
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		// Launch the browser
				ChromeDriver driver = new ChromeDriver(opt);
				// Load the URL
				driver.get("https://www.amazon.in/");
				
				// Maximize the window
				driver.manage().window().maximize();
				
				// Add implecit wait to handle the timeout
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				// Action class to interact the web element with complex gestures
				// step 1 create the object
				
				Actions act = new Actions(driver);
				
				// Locate the element
				
				WebElement scrollElement = driver.findElement(By.linkText("Conditions of Use & Sale"));
				
				// use the method which is present in action class -> scrollToelemnt
				
				act.scrollToElement(scrollElement).perform();
				
				// get the text of element
				String text = scrollElement.getText();
				System.out.println(text);
				
				// use screenshot method to capture the pic
				File source = driver.getScreenshotAs(OutputType.FILE);
				// to access file from File class need to create a object
				File target = new File("./snapshot/sample.png");
				FileUtils.copyFile(source, target);
	}

}
