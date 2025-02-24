package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		
		
		Alert popups = driver.switchTo().alert();
		String getmessage = popups.getText();//to get message written in the popup by using gettext method and storing it in a variable
		System.out.println(getmessage);// executing that variable
		Thread.sleep(2000);//to check whats the popup is
		popups.accept();// we can use dismiss() also here
				
	}

}
