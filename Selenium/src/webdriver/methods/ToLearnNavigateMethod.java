package webdriver.methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigateMethod {

	@SuppressWarnings("deprecation")// URL line 20           v                                                                                                                                             vtg
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	
	driver.get("https://www.instagram.com/?hl=en");
	driver.navigate().to("https://www.instagram.com/?hl=en");
	driver.navigate().to(new URL("https://www.instagram.com/?hl=en"));  //DEPRECATED-as no one use this class much might be removed in next version, hence is it cotted.
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.close();
	

	}

}
