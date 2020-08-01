package com.practi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class pp {
	
	WebDriver driver;

	@Test(priority=1)
	public void testcases1() {
		System.setProperty("webdriver.chrome.driver","./src/lib/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://tartecosmetics.com/en_IN/home");

}
@Test(priority=2)
public void selectmakeup() throws InterruptedException {
	Thread.sleep(2000);
	/*
	 * wait=new WebDriverWait(driver,10);
	 * wait.until(ExpectedConditions.elementToBeClickable(By.
	 * xpath("//li[@class='nav_level1--makeup nav_level1']"))).click();
	 */
	driver.findElement(By.xpath("//li[@class='nav_level1--makeup nav_level1']")).click();
}
@Test(priority=3)
public void selectmakeup1() throws InterruptedException {
	//Thread.sleep(3000);	
	WebElement prod = driver.findElement((By.xpath("//span[contains(@class,'product-name-desktop')]")));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", prod);	  
}//js-menu-nav--link has-sub-menu


@Test(priority=4)
public void addtobag() throws InterruptedException {	
	Thread.sleep(2000);
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("document.getElementById('add-to-cart').click();");
}

  @Test(priority=5) 
  public void shapetape() throws InterruptedException 
  {
  Thread.sleep(2000);
  } 
  
  @Test(priority=6)
  
  public void busygalbrows() { JavascriptExecutor jsn =
  (JavascriptExecutor)driver; jsn.executeScript("scroll(0,2350)");
  List<WebElement>list=driver.findElements(By.xpath(
  "//span[@class='product-name-desktop']"));
  
  for(int i=0;i<list.size();i++) { list.get(2).click(); } }
  
  @Test(priority=7) public void addtocart() { 
	  try { Thread.sleep(3000); }
	  catch (InterruptedException e) { 
  e.printStackTrace(); } 
  JavascriptExecutor jse = (JavascriptExecutor)driver;
  jse.executeScript("document.getElementById('add-to-cart').click();");
  
  }
  
  @Test(priority=8)
  
  public void newitem() { try { Thread.sleep(3000); } catch
  (InterruptedException e) { // TODO Auto-generated catch block
  e.printStackTrace(); }
  
  JavascriptExecutor jse = (JavascriptExecutor)driver;
  jse.executeScript("scroll(0,2500)"); }
  
  @Test(priority=9) public void otheritem() {
  List<WebElement>list=driver.findElements(By.xpath("//span[@class='product-name-desktop']"));
  for(int i=0;i<list.size();i++) { 
	  list.get(5).click(); }
  }
  
  @Test(priority=10) public void addagain() throws InterruptedException {
   Thread.sleep(3000);
   JavascriptExecutor jse =(JavascriptExecutor)driver;
  jse.executeScript("document.getElementById('add-to-cart').click();");
  }
  
  @Test(priority=11) public void movetocart()
  { 
  WebDriverWait wait=new WebDriverWait(driver, 25);
  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'minicart-quantity')]"))).click(); }
  
  @Test(priority=12,invocationCount=4)
  public void removeall(){
  driver.findElement(By.xpath("//button[@class='button-text btn-box']")). click(); }
 

  @Test(priority=13)
  public void delete()
 {
	driver.quit();
}}
