package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleNotificationPopup {

	public static void main(String[] args) {
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");// disableing chrome option popup ,all the commands are written by peter beverloo
		opt.addArguments("--incognito");//opens in incognito
		opt.addArguments("--start-maximized");
		opt.addArguments("--start-fullscreen");
		
		
		
		WebDriver driver=new ChromeDriver(opt);//need to give arguments here
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		driver.findElement(By.id("browNotButton")).click();
		driver.close();

	}

}
