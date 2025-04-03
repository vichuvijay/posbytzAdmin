package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Features", 

					 tags = "@happyflow",
					   glue= {"stepDefinitions", "HooksClass"},
					   monochrome=true,
					   plugin = { "pretty", "html:target/cucumber-reports/reports.html", },
					   dryRun = false)
						
	public class RunnerClass {
	
	}
