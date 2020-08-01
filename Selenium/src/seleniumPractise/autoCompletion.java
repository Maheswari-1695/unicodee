package seleniumPractise;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoCompletion {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/HyperLink.html");	
		WebElement input=driver.findElement(By.id(" "));
		input.sendKeys("s");
		List<WebElement>optionList=driver.findElements(By.xpath(""));
		for (WebElement webElement : optionList) {
			
			if (webElement.getText().equals("webservices")) {
				webElement.click();
				break;
				
			}
		}
}}
