package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.instagram.com/?hl=en");
		driver.findElement(By.xpath("//span[text()='Meta']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Blog']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
