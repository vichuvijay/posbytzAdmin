package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonFunction.CommonClass;

public class EmployeesPage extends CommonClass {
	
	public EmployeesPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath=("(//*[contains(text(),'Employees')])[1]" ))
	WebElement employee_menu;
	
	@FindBy(xpath="(//*[contains(text(),'Employees')])[2]")
	WebElement employee_tab_name;
	
	@FindBy(xpath=("//a[text()=' Create Employee']"))
	WebElement create_employee;
	
	@FindBy(xpath=("(//input[@placeholder='Name'])[1]"))
	WebElement employee_name;
	
	@FindBy(xpath=("(//span[@role='combobox'])[2]"))
	WebElement employee_select_type_click;
	
	@FindBy(xpath=("//span[contains(text(),'Select Type')]"))
	WebElement employee_select_type;
	
	@FindBy(xpath = "//ul/li[text()='Staff']")
	WebElement employee_select_type_search;
	
	@FindBy(xpath=("//input[@placeholder='Password']"))
	WebElement employee_password;
	
	@FindBy(xpath=("(//input[@placeholder='6 Digit Passcode'])[1]"))
	WebElement employee_six_digit_password;
	
	@FindBy(xpath=("(//input[@placeholder='4 Digit Passcode'])[1]"))
	WebElement employee_four_digit_password;
	
	@FindBy(xpath=("(//input[@placeholder='Email'])[1]"))
	WebElement employee_email;
	
	@FindBy(xpath=("(//input[@placeholder='Phone Number'])[1]"))
	WebElement employee_phone_number;
	
	@FindBy(xpath=("(//span[@role='textbox'])[3]"))
	WebElement employee_role_click;
	
	@FindBy(xpath="//ul/li[text()='Manager']")
	WebElement employee_roles_search_name;
	
	@FindBy(xpath=("(//*[contains(text(),'Locations')]//following::input[@placeholder='All Locations'])[1]"))
	WebElement employee_locations;
	

	@FindBy(xpath=("//ul//li[text()='Staff']"))
	WebElement employee_type_staff;
	
	@FindBy(xpath =( "(//button[text()='Save'])[1]"))
	WebElement employee_save_button;
	
	@FindBy(xpath ="(//div//button[text()='Close'])[1]")
	WebElement employee_close_button;
	
	//Employees Roles Webelement

	

	@FindBy(xpath = ("(//*[contains(text(),'Roles')])[1]"))
	WebElement Employee_roles_tab;
	
	
	@FindBy(xpath =("(//*[contains(text(),'Create Role')])[2]"))
	WebElement roles_create;
	
	@FindBy(xpath = ("(//input[@placeholder='Role Name'])[1]"))
	WebElement roles_name;
	
	@FindBy(xpath =("(//*[contains(text(),'Full Access')])[1]"))
	WebElement roles_full_access_checkbox;
	
	@FindBy(xpath="//*[contains(text(),'item gift card')]//following::*[contains(text(),'Save')]")
	WebElement roles_save_button;

	//Employee subscription
	
	@FindBy(xpath="//h5[text()='Subscription']")
	WebElement employee_subscription;
	
	@FindBy(xpath="//a[@id='js_subscription-close']")
	WebElement employee_subscription_close;
	// Employee Menu
	public WebElement getEmployee_menu() {
	    return waitforXpath("(//*[contains(text(),'Employees')])[1]");
	}

	// Employee Tab Name
	public WebElement getEmployee_tab_name() {
	    return waitforXpath("(//*[contains(text(),'Employees')])[2]");
	}

	// Create Employee
	public WebElement getCreate_employee() {
	    return waitforXpath("//a[text()=' Create Employee']");
	}

	// Employee Name
	public WebElement getEmployee_name() {
	    return waitforXpath("(//input[@placeholder='Name'])[1]");
	}

	// Employee Select Type Click
	public WebElement getEmployee_select_type_click() {
	    return waitforXpath("(//span[@role='combobox'])[2]");
	}

	// Employee Select Type
	public WebElement getEmployee_select_type() {
	    return waitforXpath("//span[contains(text(),'Select Type')]");
	}

	// Employee Select Type Search
	public WebElement getEmployee_select_type_search() {
	    return waitforXpath("//ul/li[text()='Staff']");
	}

	// Employee Password
	public WebElement getEmployee_password() {
	    return waitforXpath("//input[@placeholder='Password']");
	}

	// Employee Six Digit Password
	public WebElement getEmployee_six_digit_password() {
	    return waitforXpath("(//input[@placeholder='6 Digit Passcode'])[1]");
	}

	// Employee Four Digit Password
	public WebElement getEmployee_four_digit_password() {
	    return waitforXpath("(//input[@placeholder='4 Digit Passcode'])[1]");
	}

	// Employee Email
	public WebElement getEmployee_email() {
	    return waitforXpath("(//input[@placeholder='Email'])[1]");
	}

	// Employee Phone Number
	public WebElement getEmployee_phone_number() {
	    return waitforXpath("(//input[@placeholder='Phone Number'])[1]");
	}

	// Employee Role Click
	public WebElement getEmployee_role_click() {
	    return waitforXpath("(//span[@role='textbox'])[3]");
	}

	// Employee Roles Search Name
	public WebElement getEmployee_roles_search_name() {
	    return waitforXpath("//ul/li[text()='Manager']");
	}

	// Employee Locations
	public WebElement getEmployee_locations() {
	    return waitforXpath("(//*[contains(text(),'Locations')]//following::input[@placeholder='All Locations'])[1]");
	}

	// Employee Type Staff
	public WebElement getEmployee_type_staff() {
	    return waitforXpath("//ul//li[text()='Staff']");
	}

	// Employee Save Button
	public WebElement getEmployee_save_button() {
	    return waitforXpath("(//button[text()='Save'])[1]");
	}

	// Employee Close Button
	public WebElement getEmployee_close_button() {
	    return waitforXpath("(//div//button[text()='Close'])[1]");
	}

	// Employee Roles Tab
	public WebElement getEmployee_roles_tab() {
	    return waitforXpath("(//*[contains(text(),'Roles')])[1]");
	}

	// Roles Create
	public WebElement getRoles_create() {
	    return waitforXpath("(//*[contains(text(),'Create Role')])[2]");
	}

	// Roles Name
	public WebElement getRoles_name() {
	    return waitforXpath("(//input[@placeholder='Role Name'])[1]");
	}

	// Roles Full Access Checkbox
	public WebElement getRoles_full_access_checkbox() {
	    return waitforXpath("(//*[contains(text(),'Full Access')])[1]");
	}

	// Roles Save Button
	public WebElement getRoles_save_button() {
	    return waitforXpath("//*[contains(text(),'item gift card')]//following::*[contains(text(),'Save')]");
	}

	// Employee Subscription
	public WebElement getEmployee_subscription() {
	    return waitforXpath("//h5[text()='Subscription']");
	}

	// Employee Subscription Close
	public WebElement getEmployee_subscription_close() {
	    return waitforXpath("//a[@id='js_subscription-close']");
	}
	
	/*
	 * public WebElement getEmployee_subscription_close() { return
	 * employee_subscription_close; }
	 * 
	 * public WebElement getEmployee_subscription() { return employee_subscription;
	 * }
	 * 
	 * public WebElement getEmployee_menu() { return employee_menu; }
	 * 
	 * public WebElement getCreate_employee() { return create_employee; }
	 * 
	 * public WebElement getEmployee_name() { return employee_name; }
	 * 
	 * public WebElement getEmployee_select_type_click() { return
	 * employee_select_type_click; }
	 * 
	 * public WebElement getEmployee_select_type() { return employee_select_type; }
	 * 
	 * public WebElement getEmployee_password() { return employee_password; }
	 * 
	 * public WebElement getEmployee_six_digit_password() { return
	 * employee_six_digit_password; }
	 * 
	 * public WebElement getEmployee_four_digit_password() { return
	 * employee_four_digit_password; }
	 * 
	 * public WebElement getEmployee_email() { return employee_email; }
	 * 
	 * public WebElement getEmployee_phone_number() { return employee_phone_number;
	 * }
	 * 
	 * public WebElement getEmployee_role_click() { return employee_role_click; }
	 * 
	 * public WebElement getEmployee_roles_search_name() { return
	 * employee_roles_search_name; }
	 * 
	 * public WebElement getEmployee_locations() { return employee_locations; }
	 * 
	 * public WebElement getEmployee_type_staff() { return employee_type_staff; }
	 * 
	 * public WebElement getEmployee_save_button() { return employee_save_button; }
	 * 
	 * public WebElement getEmployee_roles_tab() { return Employee_roles_tab; }
	 * 
	 * public WebElement getRoles_create() { return roles_create; }
	 * 
	 * public WebElement getRoles_name() { return
	 * waitforXpath("(//input[@placeholder='Role Name'])[1]"); }
	 * 
	 * public WebElement getRoles_full_access_checkbox() { return
	 * roles_full_access_checkbox; }
	 * 
	 * public WebElement getRoles_save_button() { return roles_save_button; }
	 * 
	 * public WebElement getEmployee_tab_name() { return employee_tab_name; }
	 * 
	 * 
	 * public WebElement getEmployee_select_type_search() { return
	 * employee_select_type_search; }
	 * 
	 * public WebElement getEmployee_close_button() { return employee_close_button;
	 * }
	 */
	
	
}
