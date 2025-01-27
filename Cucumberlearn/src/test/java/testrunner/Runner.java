package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/source/feature",
		
		glue = {"stepdefenition"},
		tags="@Login",
		
				plugin = {"pretty","html:target//cucumber-report//cucumber-reports.html"}
		
		)
public class Runner {
	
	

}
