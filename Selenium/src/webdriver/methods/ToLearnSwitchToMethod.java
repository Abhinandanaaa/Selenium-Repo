package webdriver.methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(15000);
		driver.findElement(By.id("compare")).click();
		
		
		Set<String> allWindowsIDs=driver.getWindowHandles();// capture windowsIDs
		
		for(String id:allWindowsIDs)
		{
			driver.switchTo().window(id);//switch to any window
			String url=driver.getCurrentUrl();//capture url and compare
			if(url.contains("shoppersstack"))
			{
				driver.close();
			}
		}
		
		
		
		
	}

}
