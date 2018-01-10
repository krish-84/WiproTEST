package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (dryRun = false, features = "C:/Users/abc/workspace/Halifax/src/test/java/FeatureFiles",  format = {"pretty", "html:Target/cucumber-pretty"}, monochrome = true, glue = "StepDefs", tags = {"@yes", "~@no"})


public class testRunner {

}
