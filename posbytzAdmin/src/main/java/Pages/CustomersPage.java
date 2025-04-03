package Pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonFunction.CommonClass;

public class CustomersPage extends CommonClass {
	
	public CustomersPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Customers')]")
	WebElement customer_menu;
	
	@FindBy(xpath="(//*[contains(text(),'Groups')])[1]")
	WebElement customer_group_tab;
	
	@FindBy(xpath="(//button[contains(text(),'Create Group')])[1]")
	WebElement customer_group_create;
	
	@FindBy(xpath="//input[@placeholder='Group Name']")
	WebElement customer_group_name ;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement customer_group_save_button;
	
	@FindBy(xpath="//a[contains(text(),'Save')]")
	WebElement customer_save_button;
	
	@FindBy(xpath="(//*[contains(text(),'Customers')])[2]")
	WebElement customer_tab;
	
	@FindBy(xpath="//a[contains(text(),'Create Customer')]")
	WebElement customer_create ;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement customer_first_name ;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement customer_last_name;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement customer_email ;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement customer_phone_number ;
	
	@FindBy(xpath="(//span[@role='combobox'])[6]")
	WebElement customer_group_dropdown ;
	
	@FindBy(xpath="//ul/li[text()='Vichu Group']")
	WebElement customer_group_dropdown_select ;
	
	@FindBy(xpath="//input[@name='customer_code']")
	WebElement customer_code;
	
	

	@FindBy(xpath="//input[@name='dob']")
	WebElement customer_dob ;
	
	
	@FindBy(xpath="//select[@name='gender']")
	WebElement customer_gender ;
	
	@FindBy(xpath="//input[@name='address[line]']")
	WebElement customer_address_line ;
	
	@FindBy(xpath="//input[@name='address[landmark]']")
	WebElement customer_address_landmark ;
	
	@FindBy(xpath="//input[@name='address[area]']")
	WebElement customer_address_area;
	
	@FindBy(xpath="//span[text()='Select Country']")
	WebElement customer_country_dropdown ;
	
	@FindBy(xpath="//span//ul//li[text()='India']")
	WebElement customer_country_india;
	
	
	@FindBy(xpath="//span[text()='Select State']")
	WebElement customer_state_dropdown ;
	
	@FindBy(xpath="//span//ul//li[text()='Tamil Nadu']")
	WebElement customer_state_tamilnadu;
	
	@FindBy(xpath="//span[text()='Select City']")
	WebElement customer_city_dropdown ;
	
	@FindBy(xpath="//ul//li[text()='Chennai']")
	WebElement customer_city_chennai;
	
	@FindBy(xpath="//input[@name='address[zip]']")
	WebElement customer_zipcode;
	
	@FindBy(xpath="(//select[@class='form-control'])[2]")
	WebElement customer_type;
	
	@FindBy(xpath="//input[@name='address[coordinates][1]']")
	WebElement customer_latitude;
	
	@FindBy(xpath="//input[@name='address[coordinates][0]']")
	WebElement customer_longitude;
	
	@FindBy(xpath="//input[@name='custom_attributes[trn]']")
	WebElement customer_trn_gstin_vat_number;
	
	@FindBy(xpath="//input[@name='custom_attributes[cr]']")
	WebElement customer_cr_number;
	
	@FindBy(xpath="//input[@name='custom_attributes[company_name]']")
	WebElement customer_company_name;
	
	@FindBy(xpath="//input[@name='credit_limit']")
	WebElement customer_credit_limit;
	
	@FindBy(xpath="//input[@name='credit_opening_balance']")
	WebElement customer_opening_balance;
	
	@FindBy(xpath="//textarea[@name='custom_attributes[notes]']")
	WebElement customer_nots;
	
	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	WebElement customer_edit_button ;
	
	
	
	
	/*
	 * public WebElement getCustomer_edit_button() { return customer_edit_button; }
	 * 
	 * public WebElement getCustomer_menu() { return customer_menu; }
	 * 
	 * public WebElement getCustomer_group_tab() { return customer_group_tab; }
	 * 
	 * public WebElement getCustomer_group_create() { return customer_group_create;
	 * }
	 * 
	 * public WebElement getCustomer_group_name() { return customer_group_name; }
	 * 
	 * public WebElement getCustomer_group_save_button() { return
	 * customer_group_save_button; }
	 * 
	 * public WebElement getCustomer_tab() { return customer_tab; }
	 * 
	 * public WebElement getCustomer_create() { return customer_create; }
	 * 
	 * public WebElement getCustomer_first_name() { return customer_first_name; }
	 * 
	 * public WebElement getCustomer_last_name() { return customer_last_name; }
	 * 
	 * public WebElement getCustomer_email() { return customer_email; }
	 * 
	 * public WebElement getCustomer_phone_number() { return customer_phone_number;
	 * }
	 * 
	 * public WebElement getCustomer_group_dropdown() { return
	 * customer_group_dropdown; }
	 * 
	 * public WebElement getCustomer_group_dropdown_select() { return
	 * customer_group_dropdown_select; }
	 * 
	 * public WebElement getCustomer_code() { return customer_code; }
	 * 
	 * public WebElement getCustomer_dob() { return customer_dob; }
	 * 
	 * public WebElement getCustomer_gender() { return customer_gender; }
	 * 
	 * public WebElement getCustomer_address_line() { return customer_address_line;
	 * }
	 * 
	 * public WebElement getCustomer_address_landmark() { return
	 * customer_address_landmark; }
	 * 
	 * public WebElement getCustomer_address_area() { return customer_address_area;
	 * }
	 * 
	 * public WebElement getCustomer_country_dropdown() { return
	 * customer_country_dropdown; }
	 * 
	 * public WebElement getCustomer_country_india() { return
	 * customer_country_india; }
	 * 
	 * public WebElement getCustomer_state_dropdown() { return
	 * customer_state_dropdown; }
	 * 
	 * public WebElement getCustomer_state_tamilnadu() { return
	 * customer_state_tamilnadu; }
	 * 
	 * public WebElement getCustomer_city_dropdown() { return
	 * customer_city_dropdown; }
	 * 
	 * public WebElement getCustomer_city_chennai() { return customer_city_chennai;
	 * }
	 * 
	 * public WebElement getCustomer_zipcode() { return customer_zipcode; }
	 * 
	 * public WebElement getCustomer_type() { return customer_type; }
	 * 
	 * public WebElement getCustomer_latitude() { return customer_latitude; }
	 * 
	 * public WebElement getCustomer_longitude() { return customer_longitude; }
	 * 
	 * 
	 * 
	 * public WebElement getCustomer_save_button() { return customer_save_button; }
	 * 
	 * public WebElement getCustomer_trn_gstin_vat_number() { return
	 * customer_trn_gstin_vat_number; }
	 * 
	 * public WebElement getCustomer_cr_number() { return customer_cr_number; }
	 * 
	 * public WebElement getCustomer_company_name() { return customer_company_name;
	 * }
	 * 
	 * public WebElement getCustomer_credit_limit() { return customer_credit_limit;
	 * }
	 * 
	 * public WebElement getCustomer_opening_balance() { return
	 * customer_opening_balance; }
	 * 
	 * public WebElement getCustomer_nots() { return customer_nots; }
	 */
	// Customer Menu
	public WebElement getCustomer_menu() {
	    return waitforXpath("//a[contains(text(),'Customers')]");
	}

	// Customer Group Tab
	public WebElement getCustomer_group_tab() {
	    return waitforXpath("(//*[contains(text(),'Groups')])[1]");
	}

	// Customer Group Create
	public WebElement getCustomer_group_create() {
	    return waitforXpath("(//button[contains(text(),'Create Group')])[1]");
	}

	// Customer Group Name
	public WebElement getCustomer_group_name() {
	    return waitforXpath("//input[@placeholder='Group Name']");
	}

	// Customer Group Save Button
	public WebElement getCustomer_group_save_button() {
	    return waitforXpath("//button[text()='Save']");
	}

	// Customer Save Button
	public WebElement getCustomer_save_button() {
	    return waitforXpath("//a[contains(text(),'Save')]");
	}

	// Customer Tab
	public WebElement getCustomer_tab() {
	    return waitforXpath("(//*[contains(text(),'Customers')])[2]");
	}

	// Customer Create
	public WebElement getCustomer_create() {
	    return waitforXpath("//a[contains(text(),'Create Customer')]");
	}

	// Customer First Name
	public WebElement getCustomer_first_name() {
	    return waitforXpath("//input[@name='first_name']");
	}

	// Customer Last Name
	public WebElement getCustomer_last_name() {
	    return waitforXpath("//input[@name='last_name']");
	}

	// Customer Email
	public WebElement getCustomer_email() {
	    return waitforXpath("//input[@name='email']");
	}

	// Customer Phone Number
	public WebElement getCustomer_phone_number() {
	    return waitforXpath("//input[@name='phone']");
	}

	// Customer Group Dropdown
	public WebElement getCustomer_group_dropdown() {
	    return waitforXpath("(//span[@role='combobox'])[6]");
	}

	// Customer Group Dropdown Select
	public WebElement getCustomer_group_dropdown_select() {
	    return waitforXpath("//ul/li[text()='Vichu Group']");
	}

	// Customer Code
	public WebElement getCustomer_code() {
	    return waitforXpath("//input[@name='customer_code']");
	}

	// Customer Date of Birth
	public WebElement getCustomer_dob() {
	    return waitforXpath("//input[@name='dob']");
	}

	// Customer Gender
	public WebElement getCustomer_gender() {
	    return waitforXpath("//select[@name='gender']");
	}

	// Customer Address Line
	public WebElement getCustomer_address_line() {
	    return waitforXpath("//input[@name='address[line]']");
	}

	// Customer Address Landmark
	public WebElement getCustomer_address_landmark() {
	    return waitforXpath("//input[@name='address[landmark]']");
	}

	// Customer Address Area
	public WebElement getCustomer_address_area() {
	    return waitforXpath("//input[@name='address[area]']");
	}

	// Customer Country Dropdown
	public WebElement getCustomer_country_dropdown() {
	    return waitforXpath("//span[text()='Select Country']");
	}

	// Customer Country India
	public WebElement getCustomer_country_india() {
	    return waitforXpath("//span//ul//li[text()='India']");
	}

	// Customer State Dropdown
	public WebElement getCustomer_state_dropdown() {
	    return waitforXpath("//span[text()='Select State']");
	}

	// Customer State Tamil Nadu
	public WebElement getCustomer_state_tamilnadu() {
	    return waitforXpath("//span//ul//li[text()='Tamil Nadu']");
	}

	// Customer City Dropdown
	public WebElement getCustomer_city_dropdown() {
	    return waitforXpath("//span[text()='Select City']");
	}

	// Customer City Chennai
	public WebElement getCustomer_city_chennai() {
	    return waitforXpath("//ul//li[text()='Chennai']");
	}

	// Customer Zipcode
	public WebElement getCustomer_zipcode() {
	    return waitforXpath("//input[@name='address[zip]']");
	}

	// Customer Type
	public WebElement getCustomer_type() {
	    return waitforXpath("(//select[@class='form-control'])[2]");
	}

	// Customer Latitude
	public WebElement getCustomer_latitude() {
	    return waitforXpath("//input[@name='address[coordinates][1]']");
	}

	// Customer Longitude
	public WebElement getCustomer_longitude() {
	    return waitforXpath("//input[@name='address[coordinates][0]']");
	}

	// Customer TRN/GSTIN/VAT Number
	public WebElement getCustomer_trn_gstin_vat_number() {
	    return waitforXpath("//input[@name='custom_attributes[trn]']");
	}

	// Customer CR Number
	public WebElement getCustomer_cr_number() {
	    return waitforXpath("//input[@name='custom_attributes[cr]']");
	}

	// Customer Company Name
	public WebElement getCustomer_company_name() {
	    return waitforXpath("//input[@name='custom_attributes[company_name]']");
	}

	// Customer Credit Limit
	public WebElement getCustomer_credit_limit() {
	    return waitforXpath("//input[@name='credit_limit']");
	}

	// Customer Opening Balance
	public WebElement getCustomer_opening_balance() {
	    return waitforXpath("//input[@name='credit_opening_balance']");
	}

	// Customer Notes
	public WebElement getCustomer_nots() {
	    return waitforXpath("//textarea[@name='custom_attributes[notes]']");
	}

	// Customer Edit Button
	public WebElement getCustomer_edit_button() {
	    return waitforXpath("//a[contains(text(),'Edit')]");
	}
	
	public void customerPhoneNumber() {
		Random randomGen = new Random();
		int nextInt = randomGen.nextInt(10);
		getCustomer_phone_number().sendKeys("936331088"+nextInt);
		
	}
			
	
	
	
	
}
