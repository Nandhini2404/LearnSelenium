package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
			
			
			//Launch the browser
			
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
			
			// maximize the window
			
			driver.manage().window().maximize();
			
			// using implecit wait method to handle the loading 
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			// Switch to frame
			driver.switchTo().frame("iframeResult");
			
			// Click on try it
			
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			
			// Switch to alert
			 Alert alert = driver.switchTo().alert();
			 
			 // accept or dismiss the alert
			 
			 alert.accept();
			 
			 // close the page
			 
			// driver.quit();
			

	}

}
