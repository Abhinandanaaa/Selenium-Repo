package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		
		
		Alert popup = driver.switchTo().alert();//switch, why we need to create variable-to get the value of alert
	//	popup.getText();//get message, if we give only this line, it will get text but wont print it, hence we need to store it in variable to print it
		String message = popup.getText();//get message
	System.out.println(message);
		
		
		Thread.sleep(2000);
		popup.accept();// we get unhandelledalertexception only if we try clicking on webelements when there is a popup that needs to be handelled.
		String message2 = popup.getText();
		Thread.sleep(2000);
		System.out.println(message2);
		
		
		
		
		

	}

}
