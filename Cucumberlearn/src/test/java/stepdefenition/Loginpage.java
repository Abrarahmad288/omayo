package stepdefenition;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.Driverfactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.pages.LoginPage;

public class Loginpage {
    
    WebDriver driver;
    LoginPage loginPage;
    
    @Given("enter the url click on my account button and select login")
    public void enter_the_url_click_on_my_account_button_and_select_login() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver=Driverfactory.getDriver();
        loginPage=new LoginPage(driver);
       
        loginPage.clickMyAccount();
        loginPage.clickLoginLink();
    }

    @When("enter the valid email id {string}")
    public void enter_the_valid_email_id(String validemail) {
        loginPage.enterEmail(validemail);
    }

    @Then("enter the valid passward {string}")
    public void enter_the_valid_passward(String validpassward) {
        loginPage.enterPassword(validpassward);
    }

    @And("click on login button")
    public void click_on_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("the user will successfully login")
    public void the_user_will_successfully_login() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Edit your account information']")).isDisplayed());
    }

    @When("enter the invalid email id {string}")
    public void enter_the_invalid_email_id(String invalidemail) {
        driver.findElement(By.id("input-email")).sendKeys(invalidemail);
    }

    @Then("enter the invalid passward {string}")
    public void enter_the_invalid_passward(String invalidpassward) {
        driver.findElement(By.id("input-password")).sendKeys(invalidpassward);
    }

    @Then("it notifies Warning")
    public void it_notifies_warning() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed());
    }

    @When("without email id")
    public void without_email_id() {
        driver.findElement(By.id("input-email")).sendKeys("");
    }

    @Then("without passward")
    public void without_passward() {
        driver.findElement(By.id("input-password")).sendKeys("");
    }
}
