package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/Aruna/Documents/workspace/cucumber-jvm/src/test/java/Features/fatfreecrm.feature",
				glue={"stepDefinitions"},
				format = {"pretty", "html:/Users/Aruna/Documents/workspace/cucumber-jvm/target/test-output",
							"json:/Users/Aruna/Documents/workspace/cucumber-jvm/json-output/cucumber.json"},
				monochrome = true, 
				strict = true,
				dryRun = false
				)
public class FatfreecrmTestRunner {

}
