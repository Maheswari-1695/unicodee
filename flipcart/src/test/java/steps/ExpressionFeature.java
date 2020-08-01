package steps;

import io.cucumber.java.en.Given;

public class ExpressionFeature {
	//\d+ integer
	@Given("^I have (\\d+) laptop$")
	public void I_have_1_laptop(int count) {
		System.out.println("Laptop count " + count);
	 
	}

@Given("^I have a (\\d+\\.\\d+) CGPA$")
public void i_have_a_CGPA(float num ) {
	System.out.println("CGPA is"+ num);
  
}
// (\"(.*?)\")  string
@Given("^\"(.*?)\" is elder to \"(.*?)\" and \"(.*?)\"$")
public void is_elder_to_and(String n, String n1, String n2) {
   System.out.println(n +" is elder to "+ n1 +" and "+ n2);
}



	
}
