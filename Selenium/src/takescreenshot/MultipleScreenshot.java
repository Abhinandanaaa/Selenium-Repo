package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MultipleScreenshot {

	public static void main(String[] args) throws IOException {
		
		String timestamp=LocalDateTime.now().toString().replace(":", "-");//capturing system date and time and storing it in timestamp varialble wthat have the datatype as string
		// we need to replace : to - cos it will throw error CHECK ONCE!!
		System.out.println(timestamp);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com");
		
		
		//import org.openqa.selenium.TakesScreenshot;
		//TakesScreenshot	ts = (TakesScreenshot) driver; Typecasting is not necessary if we find elements firectly
		//File temp = ts.getScreenshotAs(OutputType.FILE);
		File temp=driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+timestamp+".png");
		
		FileHandler.copy(temp, dest);
		driver.close();//post execution we need to REFRESH the project!!!
		
		
	}

}
