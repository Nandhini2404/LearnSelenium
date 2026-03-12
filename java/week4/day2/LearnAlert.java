package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) 
	{
		// launch the browser
				ChromeDriver driver = new ChromeDriver();
				// load the URL
				driver.get("https://www.leafground.com/alert.xhtml");
				// maximize the window
				driver.manage().window().maximize();
				// Add the implecit wait method to handle the load
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				// click on the show button 
				driver.findElement(By.xpath("//span[text()='Show']")).click();
				// chnage the focus of driver to alert box
				
				Alert simpleAlert = driver.switchTo().alert();
				simpleAlert.accept();
				
				// prompt alert
				driver.findElement(By.xpath("//button[@name='j_idt88:j_idt104']/span[text()='Show']")).click();
				
				Alert promptAlert = driver.switchTo().alert();
				String text = promptAlert.getText();
				System.out.println("Text is in alert box :" +text);
				promptAlert.sendKeys("Nandhini");
				
				promptAlert.accept();
				

	}

}
