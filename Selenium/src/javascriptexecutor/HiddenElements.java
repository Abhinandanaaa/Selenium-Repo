package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();                                    
		driver.manage().window().maximize();                                    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));      
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement disableEle = driver.findElement(By.id("custom_gender"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].value='abcd'", disableEle);
		//How you wll send data without using sendkeys method-using arguments[0].value='abcd'

	}

}
