package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowScrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;//type casted
		js.executeScript("window.scrollBy(0,500)");//vertically //scrolling continue if we give one more scrollBy method
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,600)");//always scroll from the beginning although we give one more scrollTo
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//Moves to end of the page, instead of hardcoding it is an script that can be reused.
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");// - helps you go back to the top
		Thread.sleep(2000);
		js.executeScript("history.go()");//method to refresh the screen without using refresh method
	
	
	}
	

}
