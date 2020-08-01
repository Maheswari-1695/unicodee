package webTable;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class webTab1 {
	public static void main(String[] args) {
		
		  
		    WebDriver driver=new ChromeDriver();
		 //to launch url    
		    driver.get("file:///C:/Users/mahi/Downloads/table.html");
			driver.manage().window().maximize();
			WebElement table=driver.findElement(By.xpath("//table[@name='BookTable']"));
			List<WebElement> headers=table.findElements(By.tagName("tr"));
	for(WebElement w:headers)
	{
		System.out.println(w.getText());
	}
	}
}
