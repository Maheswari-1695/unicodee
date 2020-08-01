package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumLocator {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();//method chaining

		
		WebElement UserName=driver.findElement(By.id("email"));
		
		UserName.sendKeys("mahi");
	
		
		WebElement passWord=driver.findElement(By.id("pass"));
		
		passWord.sendKeys("15274");
		
		WebElement logIn=driver.findElement(By.id("loginbutton"));
		
		logIn.click(); 
		driver.quit();
		
		}

}
