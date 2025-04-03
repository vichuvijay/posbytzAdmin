package stepDefinitions;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import CommonFunction.CommonClass;
import PageFactory.PagesFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginSteps extends CommonClass {
	
	public PagesFactory pages = new PagesFactory();
	public Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@Given("User Entering valid username and valid password")
	public void User_Entering_valid_username_and_valid_password() throws InterruptedException, IOException {
		
		pages.getLoginpage().getTxt_username().sendKeys(loadPropertyFile("validemailid"));
		pages.getLoginpage().getTxt_password().sendKeys(loadPropertyFile("validpassword"));

	}

	@Then("Click Login button")
	public void click_login_button() throws InterruptedException {
	   
		pages.getLoginpage().getBtn_login().click();
		
	}
	@Then("Close crisp")
	public void close_crisp() {
		waitforpresence(pages.getHomepage().getBtn_closecrisp()).click();

	}
	
	@Then("Verify loggedin succesfully")
	public void Verify_loggedin_succesfully() throws InterruptedException, IOException {
		waitforXpath("//span[@class='cc-ci26 cc-4yys']");
		waitforclick(pages.getHomepage().getBtn_closecrisp()).click();
		Assert.assertEquals("https://epos.smartbytz.com/account/home", pages.getHomepage().getCurrentUrl());
	}
	
	@And("Now logout")
	public void now_logout() throws InterruptedException {
	    
		waitforvisible(By.xpath("//span[text()='Arun+tabiboba']"));
		pages.getHomepage().getBtn_profile().click();
		pages.getHomepage().getBtn_logout().click();
	}
	
	@Given("user enter invalid username and valid password")
	public void user_enter_invalid_username_and_password() throws InterruptedException, IOException {
		
		pages.getLoginpage().getTxt_username().sendKeys(loadPropertyFile("invalidemailid"));
		pages.getLoginpage().getTxt_password().sendKeys(loadPropertyFile("validpassword"));
		
	}
	
	@Given("user enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() throws IOException {
		
		pages.getLoginpage().getTxt_username().sendKeys(loadPropertyFile("validemailid"));
		pages.getLoginpage().getTxt_password().sendKeys(loadPropertyFile("invalidpassword"));
		
	}
	
    @Given ("user enter valid username and empty password")
    public void user_enter_valid_username_and_empty_password() throws IOException {
		
		pages.getLoginpage().getTxt_username().sendKeys(loadPropertyFile("validemailid"));
		
	}
    
    @Given ("user enter empty username and valid password")
    public void user_enter_empty_username_and_valid_password() throws IOException {
		
		pages.getLoginpage().getTxt_password().sendKeys(loadPropertyFile("validpassword"));
		
	}
    
	@And("Credential mismatch error should be thrown")
	public void Credential_mismatch_error_should_be_thrown(){
		
		waitforvisible(By.id("username-error"));
		Assert.assertEquals("These credentials do not match our records.", getText(pages.getLoginpage().getTxt_loginError()));
		
	}
		
	@And("password required message should be shown")
	public void password_required_message_should_be_shown() {
		
		waitforvisible(By.id("password-error"));
		Assert.assertEquals("This field is required.", getText(pages.getLoginpage().getTxt_passwordError()));
		
	}
	
	@And("username required message should be shown")
	public void username_required_message_should_be_shown() {
		
		waitforvisible(By.id("username-error"));
		Assert.assertEquals("This field is required.", getText(pages.getLoginpage().getTxt_usernameError()));
		
	}
}
