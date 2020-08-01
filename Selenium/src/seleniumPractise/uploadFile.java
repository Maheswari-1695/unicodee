package seleniumPractise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile {
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/upload.html");
		WebElement uploadButton=driver.findElement(By.name("filename"));
		uploadButton.click();
		
		//windows control begins here
		
		String file=" ";
		
		//changing string to plain text
		
		StringSelection Selection=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection,null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

}}
