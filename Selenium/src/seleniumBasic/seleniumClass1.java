package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
        public class seleniumClass1 
        {
        public static void main(String[] args) 
         {	
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
		  // to launch browser
		    WebDriver driver=new InternetExplorerDriver();
		 //to launch url    
		    driver.get("https://www.facebook.com/");
		 //to get title
		    String title=driver.getTitle();
	        System.out.println(title);
	     //to get url
	        String url=driver.getCurrentUrl();
	        System.out.println(url);	       
	     //to get findElement and get text in mail
	        WebElement UserName=driver.findElement(By.id("email"));
	        UserName.sendKeys("mahisweety918@gmail.com");	        
	     // to get password text
	        WebElement PassWord=driver.findElement(By.id("pass"));
	        PassWord.sendKeys("64646");	        
	     //to click the login button 
	        WebElement LogIn=driver.findElement(By.id("loginbutton"));
	        LogIn.click();
	     //to quit
	        driver.quit();
         }
         }
