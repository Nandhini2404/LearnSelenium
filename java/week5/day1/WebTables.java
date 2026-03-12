package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		
		//Launch the browser
		
		driver.get("https://www.leafground.com/table.xhtml");
		
		// maximize the window
		
		driver.manage().window().maximize();
		
		// using implecit wait method to handle the loading 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// to find the no of columns
		List<WebElement> colum = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr/td[1]"));
		//int text = colum.size();
		//System.out.println(text);
		
		for(int i=0;i<colum.size();i++) 
		{
			String text = colum.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
