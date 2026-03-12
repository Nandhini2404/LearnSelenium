package marathons;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PvrCinemas 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// 1. launch the browser
				ChromeDriver driver = new ChromeDriver();
		 //2.  load the URL
				driver.get("https://www.pvrcinemas.com/");
				// maximize the window
				driver.manage().window().maximize();
				// Add the implecit wait method to handle the load
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				// web driver wait explicit 
				WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(60));
				
				wait.until(ExpectedConditions.elementToBeClickable(By.className("p-dropdown-trigger")));
				driver.findElement(By.className("p-dropdown-trigger")).click();
		//3.  select the location
				driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
				
				Thread.sleep(3000);
		//4.  click the cinima button under quick book
				driver.findElement(By.xpath("//span[text()='Cinema']")).click();
				
		// 5. click the cinima dropdown
				
				driver.findElement(By.id("cinema")).click();
				
				driver.findElement(By.xpath("//span[text()='INOX Chennai Citi Centre,Dr. R. K. Salai Chennai']")).click();
				
				
		//6.  select the date as tomorrow so first need to locate the element
				
				Thread.sleep(3000);
			
			
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Tomorrow')]"))).click();
				
				
				
				// 7. select a movie from the list
				driver.findElement(By.xpath("(//span[text()='MY LORD'])[2]")).click();
			
				
				Thread.sleep(3000);
				
				//8. select a time slot
				driver.findElement(By.xpath("//span[text()='12:30 PM']")).click();
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				driver.findElement(By.xpath("//button[text()='Accept']")).click();
				
				// 9. select the seat
				driver.findElement(By.id("CL.Club|F:23")).click();

				
				// 10. click on proceed button
				driver.findElement(By.xpath("//button[text()='Proceed']")).click();
				
				// 11 get text of seat number
				
				WebElement seatNumber = driver.findElement(By.className("seat-number"));
				String text = seatNumber.getText();
				System.out.println("Text of seat number :" +text);
				
				// 12 get the grand total
				WebElement grandPrice = driver.findElement(By.xpath("//div[@class='grand-prices']"));
				String price = grandPrice.getText();
				System.out.println("Total price is :" +price);
				
				// 13, click on continue button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']")));
				
				driver.findElement(By.xpath("//button[text()='Continue']")).click();
				
				// 14, click close button to the alert box
				
				driver.findElement(By.xpath("(//i[contains(@class,'pi-times')])[2]")).click();
				String title = driver.getTitle();
				System.out.println("Title of the page : "+title);
				
				driver.close();
				
				
	}

}
