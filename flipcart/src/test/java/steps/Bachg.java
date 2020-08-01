package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bachg {
	  @Given("Need to be execute")
	  public void need_to_be_execute() {
	   ;System.out.println("Need to be execute");
	  }

	  @Given("Top of the list")
	  public void top_of_the_list() {
		  System.out.println("Top of the list");
	    
	  }

@Given("first step")
public void first_step() {
  System.out.println( "first step");
}

@When("It is second step")
public void it_is_second_step() {
	System.out.println("second step");
}

@Then("it comes under Third step")
public void it_comes_under_Third_step() {
  System.out.println("third step");
 
  



}



}
