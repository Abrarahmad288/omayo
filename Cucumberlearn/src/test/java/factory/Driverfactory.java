package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driverfactory {
	
	static WebDriver driver=null;

	
	public static WebDriver initializeBrowser(String browserName) {
		if(browserName.equals("chrome")) {
			 driver = new ChromeDriver();
			
		}
		
		else if(browserName.equals("firfox")) {
			 driver = new FirefoxDriver();
			 
			 
		}
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
		
	}
	
	
	

}
