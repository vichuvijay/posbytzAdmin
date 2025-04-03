package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonFunction.CommonClass;

public class LoyaltyManagementPage extends CommonClass {
	
	public LoyaltyManagementPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=' Loyalty Management']")
	WebElement loyalty_management_menu;
	
	@FindBy(xpath = "(//button[text()=' Create Loyalty'])[1]")
	WebElement loyalty_create_button;
	
	@FindBy(xpath = "//input[@name='name']")
	WebElement loyalty_name;
	
	@FindBy(xpath = "(//input[@name='name'])[2]")
	WebElement loyalty_name_edit;
	
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement loyalty_locations;
	
	@FindBy(xpath = "//textarea[@name='description']")
	WebElement loyalty_descriptions;
	
	@FindBy(xpath = "//input[@placeholder='Signup Points']")
	WebElement loyalty_signup_points;
	
	@FindBy(xpath = "(//input[@placeholder='Signup Points'])[2]")
	WebElement loyalty_signup_point_edit;
	
	@FindBy(xpath = "//input[@placeholder='Amount Spent to earn 1 point']")
	WebElement loyalty_amount_spent_earn_points;
	
	@FindBy(xpath = "(//input[@placeholder='Amount Spent to earn 1 point'])[2]")
	WebElement loyalty_amount_spent_earn_points_edit;
	
	@FindBy(xpath = "//select[@class='form-control js_redeem-amount-type']")
	WebElement loyalty_discount_type_dropdown;
	
	@FindBy(xpath = "(//select[@class='form-control js_redeem-amount-type'])[2]")
	WebElement loyalty_discount_type_dropdown_edit;
	
	@FindBy(xpath = "//input[@placeholder='Redeem Amount Value']")
	WebElement loyalty_discount_value;
	
	@FindBy(xpath = "(//input[@placeholder='Redeem Amount Value'])[2]")
	WebElement loyalty_discount_value_edit;
	
	@FindBy(xpath = "//input[@placeholder='Maximum Redeemable Amount']")
	WebElement loyalty_Maxium_redeemable_amount;
	
	@FindBy(xpath = "(//input[@placeholder='Maximum Redeemable Amount'])[2]")
	WebElement loyalty_Maxium_redeemable_amount_edit;
	
	@FindBy(xpath = "//input[@placeholder='Minimum Points to earn reward']")
	WebElement loyalty_minimum_reward_need;
	
	@FindBy(xpath = "(//input[@placeholder='Minimum Points to earn reward'])[2]")
	WebElement loyalty_minimum_reward_need_edit;
	
	@FindBy(xpath = "//input[@placeholder='Amount Per Point']")
	WebElement loyalty_discount_each_point;
	
	@FindBy(xpath = "(//input[@placeholder='Amount Per Point'])[2]")
	WebElement loyalty_discount_each_point_edit;

	@FindBy(xpath = "(//span//ul//li[@role='option'])[1]")
	WebElement loyalty_location_chennai;
	
	@FindBy(xpath = "(//a[contains(text(),'Save')])[1]")
	WebElement loyalty_save_button;
	
	@FindBy(xpath = "(//a[contains(text(),'Save')])[2]")
	WebElement loyalty_save_button_edit;
	
	@FindBy(xpath = "(//*[contains(text(),'Edit')])[1]")
	WebElement loyalty_edit_button;
	
	@FindBy(xpath = "(//i[@class='la la-times'])[2]")
	WebElement loyalty_close_button;
	
	
	
	/*
	 * public WebElement getLoyalty_name_edit() { return loyalty_name_edit; }
	 * 
	 * public WebElement getLoyalty_close_button() { return loyalty_close_button; }
	 * 
	 * public WebElement getLoyalty_signup_point_edit() { return
	 * loyalty_signup_point_edit; }
	 * 
	 * public WebElement getLoyalty_amount_spent_earn_points_edit() { return
	 * loyalty_amount_spent_earn_points_edit; }
	 * 
	 * public WebElement getLoyalty_discount_type_dropdown_edit() { return
	 * loyalty_discount_type_dropdown_edit; }
	 * 
	 * public WebElement getLoyalty_discount_value_edit() { return
	 * loyalty_discount_value_edit; }
	 * 
	 * public WebElement getLoyalty_Maxium_redeemable_amount_edit() { return
	 * loyalty_Maxium_redeemable_amount_edit; }
	 * 
	 * public WebElement getLoyalty_minimum_reward_need_edit() { return
	 * loyalty_minimum_reward_need_edit; }
	 * 
	 * public WebElement getLoyalty_discount_each_point_edit() { return
	 * loyalty_discount_each_point_edit; }
	 * 
	 * public WebElement getLoyalty_save_button_edit() { return
	 * loyalty_save_button_edit; }
	 * 
	 * public WebElement getLoyalty_edit_button() { return loyalty_edit_button; }
	 * 
	 * public WebElement getLoyalty_amount_spent_earn_points() { return
	 * loyalty_amount_spent_earn_points; }
	 * 
	 * public WebElement getLoyalty_save_button() { return loyalty_save_button; }
	 * 
	 * public WebElement getLoyalty_discount_type_dropdown() { return
	 * loyalty_discount_type_dropdown; }
	 * 
	 * public WebElement getLoyalty_location_chennai() { return
	 * loyalty_location_chennai; }
	 * 
	 * public WebElement getLoyalty_management_menu() { return
	 * loyalty_management_menu; }
	 * 
	 * public WebElement getLoyalty_create_button() { return loyalty_create_button;
	 * }
	 * 
	 * public WebElement getLoyalty_name() { return loyalty_name; }
	 * 
	 * public WebElement getLoyalty_locations() { return loyalty_locations; }
	 * 
	 * public WebElement getLoyalty_descriptions() { return loyalty_descriptions; }
	 * 
	 * public WebElement getLoyalty_signup_points() { return loyalty_signup_points;
	 * }
	 * 
	 * public WebElement getLoyalty_ammount_spent_earn_points() { return
	 * loyalty_amount_spent_earn_points; }
	 * 
	 * public WebElement getLoyalty_discount_type() { return
	 * loyalty_discount_type_dropdown; }
	 * 
	 * public WebElement getLoyalty_discount_value() { return
	 * loyalty_discount_value; }
	 * 
	 * public WebElement getLoyalty_Maxium_redeemable_amount() { return
	 * loyalty_Maxium_redeemable_amount; }
	 * 
	 * public WebElement getLoyalty_minimum_reward_need() { return
	 * loyalty_minimum_reward_need; }
	 * 
	 * public WebElement getLoyalty_discount_each_point() { return
	 * loyalty_discount_each_point; }
	 */
	
	public WebElement getLoyalty_management_menu() {
	    return waitforXpath("//a[text()=' Loyalty Management']");
	}

	public WebElement getLoyalty_create_button() {
	    return waitforXpath("(//button[text()=' Create Loyalty'])[1]");
	}

	public WebElement getLoyalty_name() {
	    return waitforXpath("//input[@name='name']");
	}

	public WebElement getLoyalty_name_edit() {
	    return waitforXpath("(//input[@name='name'])[2]");
	}

	public WebElement getLoyalty_locations() {
	    return waitforXpath("//input[@type='search']");
	}

	public WebElement getLoyalty_descriptions() {
	    return waitforXpath("//textarea[@name='description']");
	}

	public WebElement getLoyalty_signup_points() {
	    return waitforXpath("//input[@placeholder='Signup Points']");
	}

	public WebElement getLoyalty_signup_point_edit() {
	    return waitforXpath("(//input[@placeholder='Signup Points'])[2]");
	}

	public WebElement getLoyalty_amount_spent_earn_points() {
	    return waitforXpath("//input[@placeholder='Amount Spent to earn 1 point']");
	}

	public WebElement getLoyalty_amount_spent_earn_points_edit() {
	    return waitforXpath("(//input[@placeholder='Amount Spent to earn 1 point'])[2]");
	}

	public WebElement getLoyalty_discount_type_dropdown() {
	    return waitforXpath("//select[@class='form-control js_redeem-amount-type']");
	}

	public WebElement getLoyalty_discount_type_dropdown_edit() {
	    return waitforXpath("(//select[@class='form-control js_redeem-amount-type'])[2]");
	}

	public WebElement getLoyalty_discount_value() {
	    return waitforXpath("//input[@placeholder='Redeem Amount Value']");
	}

	public WebElement getLoyalty_discount_value_edit() {
	    return waitforXpath("(//input[@placeholder='Redeem Amount Value'])[2]");
	}

	public WebElement getLoyalty_Maxium_redeemable_amount() {
	    return waitforXpath("//input[@placeholder='Maximum Redeemable Amount']");
	}

	public WebElement getLoyalty_Maxium_redeemable_amount_edit() {
	    return waitforXpath("(//input[@placeholder='Maximum Redeemable Amount'])[2]");
	}

	public WebElement getLoyalty_minimum_reward_need() {
	    return waitforXpath("//input[@placeholder='Minimum Points to earn reward']");
	}

	public WebElement getLoyalty_minimum_reward_need_edit() {
	    return waitforXpath("(//input[@placeholder='Minimum Points to earn reward'])[2]");
	}

	public WebElement getLoyalty_discount_each_point() {
	    return waitforXpath("//input[@placeholder='Amount Per Point']");
	}

	public WebElement getLoyalty_discount_each_point_edit() {
	    return waitforXpath("(//input[@placeholder='Amount Per Point'])[2]");
	}

	public WebElement getLoyalty_location_chennai() {
	    return waitforXpath("(//span//ul//li[@role='option'])[1]");
	}

	public WebElement getLoyalty_save_button() {
	    return waitforXpath("(//a[contains(text(),'Save')])[1]");
	}

	public WebElement getLoyalty_save_button_edit() {
	    return waitforXpath("(//a[contains(text(),'Save')])[2]");
	}

	public WebElement getLoyalty_edit_button() {
	    return waitforXpath("(//*[contains(text(),'Edit')])[1]");
	}

	public WebElement getLoyalty_close_button() {
	    return waitforXpath("(//i[@class='la la-times'])[2]");
	}

}
