import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {
	public static void main(String[] args) throws InterruptedException {
		
	
	//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://www.leafground.com/pages/Window.html");
	
	WebElement firstButton=driver.findElement(By.id("home"));
	
	firstButton.click();
	

	driver.switchTo().window("handle");	
	System.out.println(driver.getCurrentUrl());
	
	driver.close();
	
	//driver.quit();
	


}}
