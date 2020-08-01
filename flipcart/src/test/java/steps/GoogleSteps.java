package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSteps {


	WebDriver driver;
	
	@Given("user is entering {string}")
	public void user_is_entering_google_co_in(String str){
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	 WebDriverManager.chromedriver().setup();		
	 driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}

@When("user is trying the search term {string}")
public void user_is_trying_the_search_term(String searchTeam) {
	driver.findElement(By.name("q")).sendKeys(searchTeam);
}
   

@And("enters the return key")
public void enters_the_return_key() {
   driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
}

@Then("the user should see the results")
public void the_user_should_see_the_results() {
	boolean status=driver.findElement(By.partialLinkText("mahi")).isDisplayed();
	if(status) {
		System.out.println("results displayed");
	}
	driver.quit();
  
}

}
