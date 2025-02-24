package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
//base class is also called as base test, configuration class by teams.
// we cannot execute this class as it doesn't have @test, it is just a base class for pre and post condition
// base class is used to optimize the test class and we can call these with annotations anytime.
	public WebDriver driver;// making driver as global variable, as it can be assessed by whole class

	@Parameters("Browser")

	@BeforeClass
	public void openBrowser(@Optional("Chrome") String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

		}

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/");
	}

	@BeforeMethod
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
