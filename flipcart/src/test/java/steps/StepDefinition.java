package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	
	@Given("First we have to open browser names {string}")
	public void first_we_have_to_open_browser_names(String string) {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		 WebDriverManager.chromedriver().setup();		
		 driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	}
	@When("We are trying to give username {string}")
	public void we_are_trying_to_give_username(String uname) {
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
	  
	}

	@And("we have to give password {string}")
	public void we_have_to_give_password(String pswd) {
		driver.findElement(By.id("txtPassword")).sendKeys(pswd);
	}

	@Then("Click on the login button")
	public void click_on_the_login_button() {
	   driver.findElement(By.id("btnLogin")).click();
	}




}
