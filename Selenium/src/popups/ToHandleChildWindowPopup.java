package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildWindowPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();
		
		
		Set<String> allWindowIDs = driver.getWindowHandles();//capture all the window ids, but we need to execute one
		for(String id:allWindowIDs) {//iterate for all the window ids
			driver.switchTo().window(id); //switch to any one window, we cant switch to all windows at a time.
			String url = driver.getCurrentUrl();
			if(url.contains("flipkart")) 
			{
			break;
			}		
		}
		
		driver.manage().window().maximize();
		
		
		
		

	}

}
