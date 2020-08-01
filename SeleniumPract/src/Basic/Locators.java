package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Locators
{
	public static void main(String[] args) 
	{
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe ");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com");
		
	   driver.manage().window().maximize();//method chaining
		WebElement userName=driver.findElement(By.id("email"));
		userName.sendKeys("mahisweety918@gmail.com");
		WebElement passWord=driver.findElement(By.name("pass"));
	    passWord.sendKeys("45664");
		WebElement logIn=driver.findElement(By.className("uiButton"));
		logIn.click();
		String title =driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}

}
