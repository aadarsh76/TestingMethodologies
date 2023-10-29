package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="features", glue="Definition")
public class testRunner {
	
}
