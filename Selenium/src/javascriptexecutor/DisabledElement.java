package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();                                    
		driver.manage().window().maximize();                                    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));      
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		driver.findElement(By.linkText("jdk-17.0.14_linux-aarch64_bin.tar.gz")).click();//click on the download link
		
		WebElement disableEle = driver.findElement(By.linkText("Download jdk-17.0.14_linux-aarch64_bin.tar.gz")); //this is popup
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].click()", disableEle);//pop link// if click method of selenium is not working, we use java script click function
		
	
		
	}

}
