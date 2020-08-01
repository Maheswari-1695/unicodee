package seleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperLink {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/HyperLink.html");	
		WebElement homePageLink=driver.findElement(By.linkText("Go to the Home Page"));
		homePageLink.click();
		
		driver.navigate().back();
		
		WebElement WhrToGo=driver.findElement(By.partialLinkText("find where"));
		String where=WhrToGo.getAttribute("href");
		System.out.println("this link is going to"+where );
		
		//broken link
		
		WebElement brokenLink=driver.findElement(By.linkText("Verify i am broken?"));
		
		brokenLink.click();
		
		WebElement homePageLink1=driver.findElement(By.linkText("Go to the Home Page"));
		String title=driver.getTitle();
		
		if (title.contains("404")) {
			System.out.println("link is broken");
			}
			else{
				System.out.println("not broken");
			}
		driver.navigate().back();
		homePageLink.click();
		
		driver.navigate().back();
		List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
		int linkCount=totalLinks.size();
		System.out.println("total links"+linkCount);
			
		}
		
		

		
	}


