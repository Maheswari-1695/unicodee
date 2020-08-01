package SeleniumDemo;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

               public class seleniumLocator
               {
            	   public static void main(String[] args) 
			   {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				//to launch the browser
			    WebDriver driver=new ChromeDriver();
				//to launch url
				driver.get("https://www.facebook.com");
				/*to get the title
				*String title=driver.getTitle();
				System.out.println(title);*/
				driver.manage().window().maximize();//method chaining
				WebElement userName=driver.findElement(By.id("email"));
				userName.sendKeys("mahisweety918@gmail.com");
				WebElement passWord=driver.findElement(By.name("pass"));
			    passWord.sendKeys("45664");
				WebElement logIn=driver.findElement(By.className("uiButton"));
				logIn.click();

		}

}
