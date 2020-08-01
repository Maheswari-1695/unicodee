package webTable;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class webTab3 {
public static void main(String[] args) {
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	  // to launch browser
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/mahi/Downloads/table.html");
		driver.manage().window().maximize();
		
		
		WebElement table=driver.findElement(By.xpath("//table[@name='BookTable']"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		List<String>li=new ArrayList<String>();
				List<List<String>>l=new ArrayList<List<String>>();
		for(int  i=1;i<rows.size();i++) {
			List<WebElement> datas=rows.get(i).findElements(By.xpath("//table[@name='Booktable']//tr["+(i+1)+"]/td"));
			for(int j=0;j<datas.size();j++) {
				li.add(datas.get(j).getText());
			
			}
			l.add(li);
		li=new ArrayList<String>();
			
}
		System.out.println(l);
}}
