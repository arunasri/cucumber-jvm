package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/Aruna/Documents/workspace/cucumber-jvm/src/test/java/Features/fatfreecrm.feature",
				glue={"stepDefinitions"},
				format = {"pretty", "html:/Users/Aruna/Documents/workspace/cucumber-jvm/target/cucumber-reports/cucumber-pretty"})

public class FatfreecrmTestRunner {

}
