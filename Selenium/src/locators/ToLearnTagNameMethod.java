package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagNameMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		//driver.findElements(By.tagName("a"));//error, so we need to store it by creating a variable list
		//System.out.println(a); 
		
		List<WebElement> allLinks=driver.findElements(By.tagName("img"));
		Thread.sleep(2000);
		System.out.println(allLinks.size());

	} 

}
