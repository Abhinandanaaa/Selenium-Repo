package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildWindowPopup2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		//with method calling, if we need to handle two windows or more, we cant keep writing the same code again and again
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();
		
		
		
		switchToWindow(driver, "flipkart");
		driver.manage().window().maximize();
		
		switchToWindow(driver, "amazon");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

	public static void switchToWindow(WebDriver driver, String expectedUrl) // here we are creating a method with formal arguments and calling it above twice
	{
		
		Set<String> allWindowIDs = driver.getWindowHandles();
		for(String id:allWindowIDs) //iterate for all the window ids
		{
			driver.switchTo().window(id); //switch to any one window, we cant switch to all windows at a time.
			String url = driver.getCurrentUrl();
			if(url.contains(expectedUrl)) 
			{
			break;
			}		
		}
		
		
	}
	
	
}
