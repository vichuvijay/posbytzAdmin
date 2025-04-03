package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import CommonFunction.CommonClass;

public class LoginPage extends CommonClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@placeholder='Your username']")
	WebElement txt_username;

	@FindBy(xpath = "//*[@placeholder='Your password']")
	WebElement txt_password;

	@FindBy(id = "js_login")
	WebElement btn_login;

	@FindBy(id = "username-error")
	WebElement txt_usernmae_Error;
	
	@FindBy(id = "password-error")
	WebElement txt_password_Error;
	
	public WebElement getTxt_username() {
		return txt_username;
	}

	public WebElement getTxt_password() {
		return txt_password;
	}

	public WebElement getBtn_login() {
		return btn_login;
	}

	public WebElement getTxt_loginError() {
		return txt_usernmae_Error;
	}
	
	public WebElement getTxt_usernameError() {
		return txt_usernmae_Error;
	}

	public WebElement getTxt_passwordError() {
		return txt_password_Error;
	}
}
