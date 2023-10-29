package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "feature",
		glue = { "myStepDefinition"}
		
		)


public class MyRunner extends AbstractTestNGCucumberTests{

}
