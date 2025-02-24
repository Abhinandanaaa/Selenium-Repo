package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.flipkart.com/");
		WebElement elec = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(elec).perform();
		
		WebElement cameras = driver.findElement(By.linkText("Cameras & Accessories"));
		act.moveToElement(cameras).perform();
		
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sports & action")).click();
	
		
		
		

	}

}
