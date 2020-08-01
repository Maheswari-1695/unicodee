package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDataTable {
	WebDriver driver;
	@Given("First have to open browser names")
	public void first_have_to_open_browser_names() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		 WebDriverManager.chromedriver().setup();		
		 driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
	}


@When("Here We are trying to give credentials")
public void here_We_are_trying_to_give_credentials(DataTable dataTable) {
	List<String> credentials= dataTable.asList(String.class);
	String username=credentials.get(0);
	String password=credentials.get(1);
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	
}
@When("click the login button")
public void click_the_login_button() {
	  driver.findElement(By.id("btnLogin")).click();
}





   

	
}

