package seleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class interactWithIamages {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/HyperLink.html");	
		WebElement first=driver.findElement(By.xpath(""));
		WebElement brokenImage=driver.findElement(By.xpath(""));
		brokenImage.click();
		
		if(brokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("image is broken");
		}
		else {
			System.out.println("not a broken image");
		}
		
	}
}