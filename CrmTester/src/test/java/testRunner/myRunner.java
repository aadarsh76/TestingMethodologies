package testRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = { "com.StepDefine" },
		dryRun = true
		)
public class myRunner {

}
