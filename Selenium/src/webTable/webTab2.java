package webTable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class webTab2 {
	public static void main(String[] args) {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		  // to launch browser
		    WebDriver driver=new ChromeDriver();
		    driver.get("file:///C:/Users/mahi/Downloads/table.html");
			driver.manage().window().maximize();
			
		
	Map<String,String> m=new LinkedHashMap<String,String>();
	List<Map<String,String>>li=new ArrayList<Map<String,String>>();
	
	
	List<WebElement> headers=driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
	List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
	for(int  i=1;i<rows.size();i++) {
		List<WebElement> datas=rows.get(i).findElements(By.xpath("//table[@name='Booktable']//tr["+(i+1)+"]/td"));
		for(int j=0;j<headers.size();j++) {
			m.put(headers.get(j).getText(), datas.get(j).getText());
		
		}
		li.add(m);
		m=new LinkedHashMap<String,String>();
		
		
	}
	System.out.println(li);
			
	
	
	
	
	}

}
