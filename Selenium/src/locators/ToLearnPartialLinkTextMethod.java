package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnPartialLinkTextMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
	    driver.findElement(By.partialLinkText("Recently")).click(); // partial text check
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click(); //ignoring space in the inspect code
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("BOOKS")).click();//its not case sensitive
		driver.close();
		
		
		
	}

}
