package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// load the URL
		driver.get("https://www.leafground.com/window.xhtml");
		// maximize the window
		driver.manage().window().maximize();
		// Add the implecit wait method to handle the load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// find the element in the parent window or click the open window
		 driver.findElement(By.xpath("//span[text()='Open']")).click();
		 
		 // find the parent address using getHandle method
		 String parentAddress = driver.getWindowHandle();
		 System.out.println("parent address :"+parentAddress);
		 
		 // find the child address using getHandles method
		 Set<String> childAddress = driver.getWindowHandles();
		 System.out.println("child address :"+childAddress);
		 
		 // to transfer the focus from parent to child window
		 // to convert set to list
		 List<String> focusMovedToChild = new ArrayList<String>(childAddress);
		 String childFocus = focusMovedToChild.get(1);
		 
		 // used get title method to ensure currently the focus is where it is
		 String parentTitle = driver.getTitle();
		 System.out.println("Parent focus :"+parentTitle);
		 
		
		// switch the driver focus to child window
		 driver.switchTo().window(childFocus); // directly we cant paste the address because it is dynamically changing on every refresh.
		
		 // here also we are using get title method to ensure the driver focus is in child window
		 String childTitle = driver.getTitle();
		 System.out.println("Child title is :" +childTitle);
		 
		 driver.close();
		 
		 // again we need to change the focus to parent
		 
		 driver.switchTo().window(focusMovedToChild.get(0)); // here 0 indecates that parent window
		 
		 String parent = driver.getTitle();
		 System.out.println(parent); // here we get NoSuchWindowException because after that close target window is closed but focus still remain in the same child window itself
		 
		

	}

}
