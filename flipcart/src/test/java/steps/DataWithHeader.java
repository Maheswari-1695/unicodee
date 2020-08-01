package steps;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataWithHeader {
	WebDriver driver;
	@Given("Go to login page")
	public void go_to_login_page() {
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		 WebDriverManager.chromedriver().setup();		
		 driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	}

	@When("Enter the below credentials")
	public void enter_the_below_credentials(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> keyValuePair=dataTable.asMaps(String.class,String.class);
		String user_name = keyValuePair.get(1).get("UserName");
		String pass = keyValuePair.get(1).get("Password");
		driver.findElement(By.id("txtUsername")).sendKeys(user_name);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
	}

	@When("click login button")
	public void click_login_button() {
		   driver.findElement(By.id("btnLogin")).click();
	}




}
