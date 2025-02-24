package takescreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com");
		//Where this line will be stored?--->driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getScreenshotAs(OutputType.FILE);
		//hence we need to create a variable
		File temp=driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/element.png");
	    FileHandler.copy(temp, dest);
	    driver.close();

	}

}
