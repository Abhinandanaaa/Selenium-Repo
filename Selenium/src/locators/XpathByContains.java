package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]")).sendKeys("Iphone");
		Thread.sleep(2000);
		
		
		

	}

}
