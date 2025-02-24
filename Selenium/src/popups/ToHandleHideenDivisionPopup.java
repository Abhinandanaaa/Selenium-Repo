package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHideenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		
		//driver.findElement(By.xpath("//div[text()='February 2025']/../..//p[text()='26']")).click(); //dependent, independent element
		//if the element is not visible or system is of small resolution we get an exception "ElementClickInterceptedException" use scrolling method here
		//Thread.sleep(2000);
		//driver.close();
		
		
		//div[text()='June 2025'/../..//p[text()='5'] // nosuchelementexception
		while(true) {
		try {
			driver.findElement(By.xpath("//div[text()='June 2025']/../..//p[text()='6']")).click();
			break;// if we didnt give break it goes to next loop and give nosuchelementexception.
		    } catch (Exception e) {
		    	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			
		}
		
		
		}
	}
	
	

}
