package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args)
	{
		// Steps to launch the facebook 
		ChromeDriver driver=new ChromeDriver();
		
		//step 1 launch the browser
		
		driver.get("https://www.google.com");
		
		//steps 2 load URL
		
		driver.get("https://www.facebook.com/");
		
		//steps 3 maximize the window
		
		driver.manage().window().maximize();
		
		// steps 4 close the window
		
		driver.close();

	}

}
