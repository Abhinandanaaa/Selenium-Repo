package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScrolling {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement myAcc = driver.findElement(By.linkText("My account"));
		
		Actions act=new Actions(driver);
		act.scrollToElement(myAcc).perform(); //scroll to element type
		//act.scrollByAmount(0, 500).perform();// scroll by amount type
		//act.scrollByAmount(0, -500).perform();
	

	}

}
