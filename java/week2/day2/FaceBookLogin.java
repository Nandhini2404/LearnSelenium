package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		
		//Launch the browser
		
		driver.get("https://www.facebook.com/");
		
		// maximize the window
		
		driver.manage().window().maximize();
		
		// enter username
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		// Enter the password
		
		driver.findElement(By.id("pass")).sendKeys("Tuna@321 ");
		
		// click the sign in button
		
		driver.findElement(By.name("login")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}

}
