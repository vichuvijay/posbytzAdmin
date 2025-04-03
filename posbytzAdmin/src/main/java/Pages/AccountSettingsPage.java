package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import CommonFunction.CommonClass;

public class AccountSettingsPage extends CommonClass {
	
	public AccountSettingsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@title='More Actions']")
	WebElement locations_txt_moreactionLoc;
	
	@FindBy(xpath = "//*[text()='Edit']")
	WebElement locations_txt_editLoc;
	
	@FindBy(xpath = "(//input[@placeholder='Name'])[2]")
	WebElement locations_name;
	
	@FindBy(xpath = "(//input[@placeholder='Address Line 1'])[2]")
	WebElement locations_txt_addressline1;
	
	@FindBy(xpath = "(//input[@placeholder='Address Line 2'])[2]")
	WebElement locations_txt_addressline2;
	
	@FindBy(xpath = "//option[text()='Select Country']/following::select[@name='address[country]']")
	WebElement locations_btn_country;
	
	@FindBy(xpath = "(//input[@placeholder='Region'])[2]")
	WebElement locations_txt_region;
	
	@FindBy(xpath = "(//input[@placeholder='City'])[2]")
	WebElement locations_txt_city;
	
	@FindBy(xpath = "(//input[@placeholder='Postal Code'])[2]")
	WebElement locations_txt_postalcode;
	
	@FindBy(xpath = "(//a[text()='Save'])[2]")
	WebElement locations_btn_save;
	
	@FindBy(xpath = "//input[@placeholder='Address Line 1']")
	WebElement business_profile_address_line_1;
	
	@FindBy(xpath = "//input[@placeholder='Address Line 2']")
	WebElement business_profile_address_line_2;
	
	
	@FindBy(xpath = "//input[@placeholder='Postal Code']")
	WebElement business_profile_postal_code;
	
	
	@FindBy(xpath = "//input[@placeholder='Business WhatsApp Number']")
	WebElement business_profile_whatsapp_number;
	
	@FindBy(xpath = "(//input[@class='form-control js_business-hours'])[1]")
	WebElement business_profile_opening_time;
	
	@FindBy(xpath = "(//input[@class='form-control js_business-hours'])[2]")
	WebElement business_profile_closing_time;
	
	@FindBy(xpath = "(//button[text()='Apply'])[1]")
	WebElement business_profile_opening_time_appy_button;
	
	@FindBy(xpath = "(//button[text()='Apply'])[2]")
	WebElement business_profile_closing_time_apply_button;
	
	@FindBy(xpath = "//*[@name='custom_attributes[currency_symbol]']")
	WebElement business_profile_current_code;
	
	@FindBy(xpath = "//input[@placeholder='Bank Name']")
	WebElement business_profile_bank_name;
	
	@FindBy(xpath = "//input[@placeholder='Account Number']")
	WebElement business_profile_account_number;
	
	@FindBy(xpath = "//input[@placeholder='Bank Code Label']")
	WebElement business_profile_bank_code_label;
	
	@FindBy(xpath = "//input[@placeholder='Bank Code']")
	WebElement business_profile_bank_code;
	
	@FindBy(xpath = "//input[@placeholder='Company Registration Number']")
	WebElement business_profile_company_registraion_number;
	
	@FindBy(xpath = "(//a[text()='Save'])[1]")
	WebElement business_profile_save_button;
	
	@FindBy(xpath = "(//*[text()='Settings'])[1]")
	WebElement account_settings_settings_tab;
	
	@FindBy(xpath = "(//a[text()=' Account & Settings'])[2]")
	WebElement account_settings_menu_tab;
	
	@FindBy(xpath = "//input[@placeholder='Account Number']")
	WebElement business_profile_account_number_input;
	
	@FindBy(xpath = "(//*[contains(text(),'Payment Methods')])[1]")
	WebElement settings_payment_methods_tab;
	
	@FindBy(xpath = "(//input[@placeholder='Label'])[1]")
	WebElement settings_payment_methods_label_name;
	
	@FindBy(xpath = "//*[contains(text(),'Select Payment Method')]")
	WebElement settings_payment_method_select_payment_methods_dropdown;
	
	@FindBy(xpath = "//*[contains(text(),'Select Payment Method')]//following::input[1]")
	WebElement settings_payment_methods_select_payment_methods_input;
	
	@FindBy(xpath = "(//input[@name='position'])[1]")
	WebElement settings_payment_methods_position_field;
	
	@FindBy(xpath = "(//*[@placeholder='Select Merchant Platforms'])[1]")
	WebElement settings_payment_methods_select_merchant_platforms_dropdown;
	
	@FindBy(xpath = "(//*[contains(text(),'Default Payment Method')])[2]")
	WebElement settings_payment_methods_check_box;
	
	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	WebElement settings_payment_methods_save_button;
	
	@FindBy(xpath = "//button[contains(text(),' Add Payment Method')]")
	WebElement settings_payment_methods_add_payment_button;
	
	@FindBy(xpath = "//*[contains(text(),'Unit Of Measurements')]")
	WebElement settings_UOM_tab;
	
	@FindBy(xpath = "//input[@name='label']")
	WebElement settings_UOM_name;
	
	@FindBy(xpath = "(//*[contains(text(),' Add UOM')])[1]")
	WebElement settings_UOM_create_UOM_button;
	
	@FindBy(xpath = "//*[contains(text(),'Select Unit Measure Type')]")
	WebElement settings_UOM_select_UOM_type;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement settings_UOM_attribute_checkbox;
	
	@FindBy(xpath = "//input[@placeholder='Integer Unit']")
	WebElement settings_UOM_integer_unit;
	
	@FindBy(xpath = "//input[@placeholder='Decimal Unit']")
	WebElement settings_UOM_decimal_unit;
	
	@FindBy(xpath = "(//*[contains(text(),'Item Tag')])[1]")
	WebElement settings_item_tag_menu;
	
	@FindBy(xpath = "//button[contains(text(),' Create Item Tag')]")
	WebElement settings_item_tag_create_button;
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement settings_item_tag_name;
	
	@FindBy(xpath = "//span[contains(text(),'Select Category')]")
	WebElement settings_item_tag_select_category;
	
	
	

	public WebElement getSettings_item_tag_menu() {
		return settings_item_tag_menu;
	}

	public WebElement getSettings_item_tag_create_button() {
		return settings_item_tag_create_button;
	}

	public WebElement getSettings_item_tag_name() {
		return settings_item_tag_name;
	}

	public WebElement getSettings_item_tag_select_category() {
		return settings_item_tag_select_category;
	}

	public WebElement getSettings_UOM_tab() {
		return settings_UOM_tab;
	}

	public WebElement getSettings_UOM_name() {
		return settings_UOM_name;
	}

	public WebElement getSettings_UOM_create_UOM_button() {
		return settings_UOM_create_UOM_button;
	}

	public WebElement getSettings_UOM_select_UOM_type() {
		return settings_UOM_select_UOM_type;
	}

	public WebElement getSettings_UOM_attribute_checkbox() {
		return settings_UOM_attribute_checkbox;
	}

	public WebElement getSettings_UOM_integer_unit() {
		return settings_UOM_integer_unit;
	}

	public WebElement getSettings_UOM_decimal_unit() {
		return settings_UOM_decimal_unit;
	}

	public WebElement getSettings_payment_methods_add_payment_button() {
		return settings_payment_methods_add_payment_button;
	}

	public WebElement getSettings_payment_methods_tab() {
		return settings_payment_methods_tab;
	}

	public WebElement getSettings_payment_methods_label_name() {
		return settings_payment_methods_label_name;
	}

	public WebElement getSettings_payment_method_select_payment_methods_dropdown() {
		return settings_payment_method_select_payment_methods_dropdown;
	}

	public WebElement getSettings_payment_methods_select_payment_methods_input() {
		return settings_payment_methods_select_payment_methods_input;
	}

	public WebElement getSettings_payment_methods_position_field() {
		return settings_payment_methods_position_field;
	}

	public WebElement getSettings_payment_methods_select_merchant_platforms_dropdown() {
		return settings_payment_methods_select_merchant_platforms_dropdown;
	}

	public WebElement getSettings_payment_methods_check_box() {
		return settings_payment_methods_check_box;
	}

	public WebElement getSettings_payment_methods_save_button() {
		return settings_payment_methods_save_button;
	}

	public WebElement getBusiness_profile_account_number_input() {
		return business_profile_account_number_input;
	}

	public WebElement getAccount_settings_menu_tab() {
		return account_settings_menu_tab;
	}

	public WebElement getLocations_name() {
		return locations_name;
	}

	public WebElement getAccount_settings_settings_tab() {
		return account_settings_settings_tab;
	}

	public WebElement getBusiness_profile_address_line_1() {
		return business_profile_address_line_1;
	}

	public WebElement getBusiness_profile_address_line_2() {
		return business_profile_address_line_2;
	}

	public WebElement getBusiness_profile_postal_code() {
		return business_profile_postal_code;
	}

	public WebElement getBusiness_profile_whatsapp_number() {
		return business_profile_whatsapp_number;
	}

	public WebElement getBusiness_profile_opening_time() {
		return business_profile_opening_time;
	}

	public WebElement getBusiness_profile_closing_time() {
		return business_profile_closing_time;
	}

	public WebElement getBusiness_profile_opening_time_appy_button() {
		return business_profile_opening_time_appy_button;
	}

	public WebElement getBusiness_profile_closing_time_apply_button() {
		return business_profile_closing_time_apply_button;
	}

	public WebElement getBusiness_profile_current_code() {
		return business_profile_current_code;
	}

	public WebElement getBusiness_profile_bank_name() {
		return business_profile_bank_name;
	}

	public WebElement getBusiness_profile_account_number() {
		return business_profile_account_number;
	}

	public WebElement getBusiness_profile_bank_code_label() {
		return business_profile_bank_code_label;
	}

	public WebElement getBusiness_profile_bank_code() {
		return business_profile_bank_code;
	}

	public WebElement getBusiness_profile_company_registraion_number() {
		return business_profile_company_registraion_number;
	}

	public WebElement getBusiness_profile_save_button() {
		return business_profile_save_button;
	}

	public WebElement getLocations_txt_moreactionLoc() {
		return waitforXpath("//*[@title='More Actions']");
	}

	public WebElement getLocations_txt_editLoc() {
		return waitforXpath("//*[text()='Edit']");
	}

	public WebElement getLocations_txt_addressline1() {
		return locations_txt_addressline1;
	}

	public WebElement getLocations_txt_addressline2() {
		return locations_txt_addressline2;
	}

	public WebElement getLocations_btn_country() {
		return waitforXpath("//option[text()='Select Country']/following::select[@name='address[country]']");
	}

	public WebElement getLocations_txt_region() {
		return locations_txt_region;
	}

	public WebElement getLocations_txt_city() {
		return locations_txt_city;
	}

	public WebElement getLocations_txt_postalcode() {
		return waitforXpath("(//input[@placeholder='Postal Code'])[2]");
	}

	public WebElement getSecondTRNInputField() {
	    return waitforXpath("(//input[@placeholder='TRN'])[2]");
	}

	public WebElement getSecondCompanyRegistrationNumberInputField() {
	    return waitforXpath("(//input[@placeholder='Company Registration Number'])[2]");
	}

	public WebElement getSecondFSSAILicenseNumberInputField() {
	    return waitforXpath("(//input[@placeholder='FSSAI License Number'])[2]");
	}

	public WebElement getSecondOrderSequenceNoInputField() {
	    return waitforXpath("(//input[@placeholder='Order Sequence No(Prefix)'])[2]");
	}

	public WebElement getSecondMaximumDeliveryDistanceInputField() {
	    return waitforXpath("(//input[@placeholder='Maximum Delivery Distance(KM)'])[2]");
	}

	public WebElement getSecondLatitudeInputField() {
	    return waitforXpath("(//input[@placeholder='Latitude'])[2]");
	}

	public WebElement getSecondLongitudeInputField() {
	    return waitforXpath("(//input[@placeholder='Longitude'])[2]");
	}

	public WebElement getSecondDeliveryAvailableCheckbox() {
	    return waitforXpath("(//input[@class='form-check-input js_is-delivery-available'])[2]");
	}

	public WebElement getSecondPickupAvailableCheckbox() {
	    return waitforXpath("(//input[@class='form-check-input js_is-pickup-available'])[2]");
	}
	public WebElement getLocations_btn_save() {
		return waitforXpath("(//a[text()='Save'])[2]");
	}
	public void validlocationdetails() throws IOException {
		getLocations_txt_moreactionLoc().click();
		getLocations_txt_editLoc().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='Address Line 1'])[2]")));
		getLocations_txt_addressline1().sendKeys(loadPropertyFile("addressline1"));
		getLocations_txt_addressline2().sendKeys(loadPropertyFile("addressline2"));
		selectByText("India", getLocations_btn_country());
		getLocations_txt_region().sendKeys(loadPropertyFile("region"));
		getLocations_txt_city().sendKeys(loadPropertyFile("city"));
		getLocations_txt_postalcode().sendKeys(loadPropertyFile("postalcode"));
		getLocations_btn_save().click();
	}
	
}