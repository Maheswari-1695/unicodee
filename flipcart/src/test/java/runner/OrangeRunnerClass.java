package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"./src/test/resources/feature/orange.feature"},glue= {"steps"},
                dryRun=false,
               monochrome=true,
               strict=true,
               plugin= {"pretty","html:HTML_output","junit:XML_output/index.xml","json:JSON_output/index.json"}
                
		
		
		
		
		)
public class OrangeRunnerClass {

}
