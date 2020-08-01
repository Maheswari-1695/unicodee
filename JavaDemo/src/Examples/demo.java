package Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mahi\\Desktop\\Driver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.chrome.com");
		driver.manage().window().maximize();
		
	}

}
