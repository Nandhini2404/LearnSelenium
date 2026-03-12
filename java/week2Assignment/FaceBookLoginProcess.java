package week2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookLoginProcess {

	public static void main(String[] args) 
	{
           ChromeDriver driver = new ChromeDriver();
		
		
		//Launch the browser
		
		driver.get("https://www.facebook.com/");
		
		// maximize the window
		
		driver.manage().window().maximize();
		
		// using implecit wait method to handle the loading 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// click on create new account
		
		driver.findElement(By.linkText("Create new account")).click();
		
		// enter first name
		 driver.findElement(By.name("firstname")).sendKeys("Nandhini");
		 
		 // enter last name
		 
		 driver.findElement(By.name("lastname")).sendKeys("Prabu");
		 
		 // select the day in dropdown so we need to create a object for select class which is present in java
		 
		 WebElement dayElement =driver.findElement(By.id("day"));
		 Select selectDay = new Select(dayElement);
		 selectDay.selectByVisibleText("15");
		 
		 // select the month in dropdown
		 
		 WebElement monthElement=driver.findElement(By.id("month"));
		 Select selectMonth=new Select(monthElement);
		 selectMonth.selectByVisibleText("Apr");
		 
		 // select the year
		 
		 WebElement yearElement=driver.findElement(By.id("year"));
		 Select selectYear=new Select(yearElement);
		 selectYear.selectByVisibleText("1994");
		 
		 // Select the gender
		 
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
		 
		// enter phone number
		 driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		 
		 // enter the password
		 driver.findElement(By.id("password_step_input")).sendKeys("test");
		 
		 // close the browser
		 
		 driver.quit();
		

	}

}
