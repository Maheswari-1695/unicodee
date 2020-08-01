package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "./src/test/resources/feature/dataWithHeader.feature" }, glue = {
		"steps" })
public class DataTableWithHeader {

}