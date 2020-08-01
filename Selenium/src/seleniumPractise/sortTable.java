package seleniumPractise;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sortTable {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");
		
		driver.manage().window().maximize();//method chaining
		List<WebElement> element=driver.findElements(By.xpath(""));
		WebElement fromelement=element.get(6);
		WebElement toElement=element.get(10);
		Actions actions=new Actions(driver);
		actions.clickAndHold(fromelement);
		actions.moveToElement(toElement);
		actions.release(toElement);
		actions.build().perform();
		}
}
