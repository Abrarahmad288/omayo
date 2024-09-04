package stepdefenition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPage {
	
	
	WebDriver driver;
	
	@Given("user should navigate to the register page")
	public void user_should_navigate_to_the_register_page() {
		driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}
	@When("user should provide the details")
	public void user_should_provide_the_details(DataTable dataTable1) {
		
		Map<String,String> dataTable = dataTable1.asMap(String.class,String.class);
		System.out.println("pass");
		   driver.findElement(By.id("input-firstname")).sendKeys(dataTable.get("First Name"));
		   driver.findElement(By.id("input-lastname")).sendKeys(dataTable.get("Last Name"));
		   driver.findElement(By.id("input-email")).sendKeys(dataTable.get("E-mail"));
		   driver.findElement(By.id("input-telephone")).sendKeys(dataTable.get("Telephone"));
		   driver.findElement(By.id("input-password")).sendKeys(dataTable.get("Password"));
		   driver.findElement(By.id("input-confirm")).sendKeys(dataTable.get("Password Confirm"));
		   
	}
	@Then("user should select the subscribe yes check button")
	public void user_should_select_the_subscribe_yes_check_button() {
		driver.findElement(By.xpath("(//div//input[@name='newsletter'])[1]")).click();
	}
	@Then("check the privacy policy")
	public void check_the_privacy_policy() {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
	@Then("click on continue button")
	public void click_on_continue_button() {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("user should select the subscribe No check button")
	public void user_should_select_the_subscribe_no_check_button() {
		
		driver.findElement(By.xpath("(//div//input[@name='newsletter'])[2]")).click();   
	
	}

	
	
	
	
	
	
	
	

}
