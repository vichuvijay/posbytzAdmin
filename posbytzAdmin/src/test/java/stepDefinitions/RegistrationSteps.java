package stepDefinitions;

import java.io.IOException;
import java.util.Random;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import CommonFunction.CommonClass;
import PageFactory.PagesFactory;
import io.cucumber.java.en.*;

public class RegistrationSteps extends CommonClass {

	public PagesFactory pages = new PagesFactory();

	@Given("^User entered signup page$")
	public void user_entered_signup_page() throws IOException, InterruptedException {

		pages.getRegisterpage().getbtn_registernow().click();

	}

	@Then("selected the Business type")
	public void selected_the_business_type() throws InterruptedException {

		pages.getRegisterpage().getCli_businessType().click();
		pages.getRegisterpage().getSel_businessType().click();

	}

	@Then("Entered valid Emailid")
	public void entered_valid_emailid() throws InterruptedException, IOException {

		Random randomGen = new Random();
		int nextInt = randomGen.nextInt(10000000);
		pages.getRegisterpage().getTxt_email().sendKeys("Auto+" + nextInt + "@bytize.in");

	}
	
	@Then("Entered invalid Emailid")
	public void entered_invalid_emailid_and_mobile_number() throws InterruptedException, IOException {

		pages.getRegisterpage().getTxt_email().sendKeys(loadPropertyFile("invalidemailid"));
		
	}
	
	@Then("Entered valid mobilenumber")
	public void entered_valid_mobilenumber() throws InterruptedException, IOException {

		pages.getRegisterpage().getTxt_mobileNo().sendKeys(loadPropertyFile("validmobilenumber"));

	}

	@Then("Entered invalid mobilenumber")
	public void entered_invalid_mobile_number() throws InterruptedException, IOException {

		pages.getRegisterpage().getTxt_mobileNo().sendKeys(loadPropertyFile("invalidmobilenumber"));

	}
	
	@Then("user clicked register button")
	public void user_clicked_register_button() throws InterruptedException {

		pages.getRegisterpage().getBtn_registerbutton().click();
		thread("start");
	}

	@And("Redirect to home page and check signed in successfully")
	public void Redirect_to_home_page() throws InterruptedException {
	//	sleep(4000);
//		WebElement opencrsip = waitforXpath("//a[@aria-label='Open chat']");
//
//		opencrsip.click();	
		
//		WebElement closecrsip = waitforXpath("//html/body/div[2]/div[2]/div/div/div[1]/div/span[2]/span/span");
//
//		closecrsip.click();
		waitforXpath(("//*[text()='Finish your store setup']"));
		Assert.assertEquals("Finish your store setup", getText(pages.getHomepage().getTxt_verifyRegister()));
	//	waitforXpath(("//span[@class='cc-oktsw cc-5t1tm']"));
		
		
	}
	
	@And("logout")
	public void logout() {
		
		pages.getHomepage().getBtn_profile().click();
		pages.getHomepage().getBtn_logout().click();
	
	}

	@Then("display validation as invalid emailid")
	public void display_validation_as_invalid_emailid() throws InterruptedException {

		waitforvisible(By.xpath("//*[@id='email-error']"));
		Assert.assertEquals("Please enter a valid email address.", getText(pages.getRegisterpage().getTxt_invalidemail()));
	}

	@Then("display validation as invalid mobilenumber")
	public void display_validation_as_invalid_mobilenumber() throws InterruptedException {
		
		pages.getRegisterpage().get_registeraccount().click();
		waitforvisible(By.xpath("//*[@id='business-phone-error']"));
		Assert.assertEquals("mobile validation", getText(pages.getRegisterpage().getTxt_invalidmobilenumber()));
	}
	
	@And("Entered existing emailid")
	public void entered_existing_emailid_and_mobile_number() throws InterruptedException, IOException {

		pages.getRegisterpage().getTxt_email().sendKeys(loadPropertyFile("existemailid"));

	}

	@Then("validation message should appear as already taken")
	public void validation_message_should_appear_as_already_taken() {

		waitforvisible(By.id("email-error"));
		Assert.assertEquals("The email has already been taken.", getText(pages.getRegisterpage().getTxt_existemail()));

	}

	@Then("required field validation should display")
	public void validation_should_display() {

		waitforpresence(By.xpath("(//span[text()='This field is required.'])[1]"));
		Assert.assertEquals("This field is required.", getText(pages.getRegisterpage().getTxt_signuprequiredmsg()));

	}
}