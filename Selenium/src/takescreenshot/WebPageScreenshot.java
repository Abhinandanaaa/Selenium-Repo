package takescreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com/");
		 
		TakesScreenshot ts=(TakesScreenshot) driver;
		// Typecasting 	driver element to screenshot element as there is no direct link between two
		//typecasting here is converting webdriver element to takescreenshot element
		File temp = ts.getScreenshotAs(OutputType.FILE);//output types-file*,base64,bytes
		//File dest=new File("file path");
		System.out.println(temp);// original file path temp, which can vanish if we we switch off system too hence we need to store it in a destination file
		File dest=new File("./screenshots/webpage.png");// png,jpeg,img formats
		FileHandler.copy(temp, dest);
		driver.close();
	
	}

}
