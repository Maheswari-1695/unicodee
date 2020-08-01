package Interview;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class TestNGSample {
	WebDriver driver;
	   
@Test
	public void testcases1() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://tartecosmetics.com/en_IN/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

@Test(priority=2)
	public void selectmakeup() {
		driver.findElement(By.xpath("//li[@class='nav_level1--makeup nav_level1']")).click();
		WebElement prod = driver.findElement((By.xpath("//span[contains(@class,'product-name-desktop')]")));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", prod);	  
	}


@Test(priority=3)
public void addtobag() {	
    try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("document.getElementById('add-to-cart').click();");
}


@Test(priority=4)
public void shapetape() {
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
@Test(priority=5)

public  void busygalbrows() {
	JavascriptExecutor jsn = (JavascriptExecutor)driver;
	jsn.executeScript("scroll(0,2350)");
	List<WebElement>list=driver.findElements(By.xpath("//span[@class='product-name-desktop']"));
	
	for(int i=0;i<list.size();i++) {
		list.get(2).click();
	}	
}

@Test(priority=6)
public void addtocart() {
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("document.getElementById('add-to-cart').click();");
    
}
@Test(priority=7)

public void newitem() {
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("scroll(0,2500)");
}
@Test(priority=8)
public void otheritem() {
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	List<WebElement>list=driver.findElements(By.xpath("//span[@class='product-name-desktop']"));
	
	for(int i=0;i<list.size();i++) {
		list.get(5).click();
	}	

}

@Test(priority=9)
public void addagain() {
	
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("document.getElementById('add-to-cart').click();");
  

}

@Test(priority=10)
public void movetocart() {
WebDriverWait wait=new WebDriverWait(driver, 25);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'minicart-quantity')]"))).click();
}

@Test(priority=13,invocationCount=4)
public void removeall(){
driver.findElement(By.xpath("//button[@class='button-text btn-box']")).click();
}}
