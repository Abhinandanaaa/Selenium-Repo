package pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pom {

		public static void main(String[] args) {
			
			//less preferred locator as it is dynamic in nature it keeps changing
			
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.className("search-box-text")).sendKeys("Books");// cannot add full name value as it contains space and it will not work, only words seperated with - works
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.className("search-box-text")).sendKeys("Books");// cannot add full name value as it contains space and it will not work, only words seperated with - works
		
			
			
		}

	}


