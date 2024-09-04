package myhooks;

import java.time.Duration;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.Driverfactory;
import io.cucumber.java.Scenario;
import utils.configreader;

public class Hooks {

	
WebDriver driver;

	
	@Before
	public void setup() {

		Properties prop = configreader.initializeproperties();
		driver= Driverfactory.initializeBrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		
	}
	
	@After
	public void teardown(Scenario scenario) {
		String Scenarioname = scenario.getName().replaceAll("", " ");
		if(scenario.isFailed()) {
			byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenshot, "image/png", Scenarioname);
			
		}
		
		
		
		driver.quit();
	}
	
	
}
 