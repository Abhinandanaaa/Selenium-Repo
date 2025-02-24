package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutorScrollView {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement latestCourse = driver.findElement(By.xpath("//h3[text()='Latest Courses']"));
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", latestCourse);
//		If i give true, it will take to the top of the web page so that all the below element can be seen
//		If i give flase, it will take to the bottom of the web element
//		arguments[0] is a java script pre-defined variable and it is used to give input
	}

}
