package seleniumPractise;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dowmloadFile {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/HyperLink.html");	
		WebElement downloadLink=driver.findElement(By.linkText("Download.xls"));
		downloadLink.click();
		
		Thread.sleep(3000);
		
		File fileLocation=new File("");
		File[] totalFiles=fileLocation.listFiles();
		for (File file : totalFiles) {
			file.getName().equals("downLoad.xls");
			{
				System.out.println("file is downloaded");
				break;
				
			}
		}
		

}}
