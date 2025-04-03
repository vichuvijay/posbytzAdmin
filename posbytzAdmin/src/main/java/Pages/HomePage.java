package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import CommonFunction.CommonClass;

public class HomePage extends CommonClass {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='js_merchant-currency-code-unique']/div/div/a/span")
	WebElement btn_profile;

	@FindBy(xpath = "//a[text()=' Logout']")
	WebElement btn_logout;

	@FindBy(xpath = "//span[@aria-label='Close chat']")
	WebElement btn_closecrisp;

	@FindBy(xpath = "//*[text()='Finish your store setup']")
	WebElement txt_verifyRegister;
	
	@FindBy(xpath = "//a[contains(@href, '/account/locations')]")
	WebElement btn_updateaddress;
	

	public WebElement getBtn_profile() {
		return btn_profile;
	}

	public WebElement getBtn_logout() {
		return btn_logout;
	}

	public WebElement getBtn_closecrisp() {
		return btn_closecrisp;
	}

	public WebElement getTxt_verifyRegister() {
		return txt_verifyRegister;
	}

	public WebElement getBtn_updateaddress() {
		return btn_updateaddress;
	}
}
