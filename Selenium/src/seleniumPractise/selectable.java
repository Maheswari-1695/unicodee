package seleniumPractise;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectable {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();//method chaining

		
		
		
	//	WebElement homepage=driver.findElement(By.className("wp-categories-icon svg-image"));
//		List<WebElement>selectable=driver.findElements(By.xpath(""));
//		 int listSize=selectable.size();
//		 System.out.println(listSize);
//		 
//		 Actions actions=new Actions(driver);
//		 
//		

}
}
