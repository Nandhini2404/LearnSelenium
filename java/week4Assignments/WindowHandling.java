package week4Assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

    public static void main(String[] args) {
// to handle chrome password breach alert shuld use chromeoption
    	ChromeOptions opt=new ChromeOptions();
    	opt.addArguments("guest");
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver(opt);

        // Load the URL
        driver.get("http://leaftaps.com/opentaps/control/login");

        // Maximize the browser window
        driver.manage().window().maximize();

        //  Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Enter username and password
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        // Click Login
        driver.findElement(By.className("decorativeSubmit")).click();

        //  Click CRM/SFA
        driver.findElement(By.linkText("CRM/SFA")).click();

        //  Click Contacts
        driver.findElement(By.linkText("Contacts")).click();

        // Click Merge Contacts
        driver.findElement(By.linkText("Merge Contacts")).click();

        String parentWindow = driver.getWindowHandle();

       // Click widget for "From Contact"
        driver.findElement(By.xpath("//img[@alt='Lookup']")).click();

        // Switch to new window
        Set<String> windows = driver.getWindowHandles();
        for (String win : windows) {
            if (!win.equals(parentWindow)) {
                driver.switchTo().window(win);
            }
        }

        // Click first resulting contact
        driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();

        // Switch back to parent window
        driver.switchTo().window(parentWindow);

        // Click widget for "To Contact"
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

        // Switch to second window
        windows = driver.getWindowHandles();
        for (String win : windows) {
            if (!win.equals(parentWindow)) {
                driver.switchTo().window(win);
            }
        }

        // Click second resulting contact
        driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[2]")).click();

        // Switch back to parent window
        driver.switchTo().window(parentWindow);

        // Click Merge button
        driver.findElement(By.linkText("Merge")).click();

        // Accept the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //  Verify page title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        if (title.contains("View Contact")) {
            System.out.println("Merge Contacts successful");
        } else {
            System.out.println("Merge Contacts failed");
        }

        // driver.quit(); // Uncomment if you want to close the browser
    }
}
