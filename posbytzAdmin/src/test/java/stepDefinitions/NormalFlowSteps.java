package stepDefinitions;

import java.io.IOException;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import CommonFunction.CommonClass;
import PageFactory.PagesFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NormalFlowSteps extends CommonClass {
	
	public PagesFactory pages = new PagesFactory();
	
	
	@Then("selecting the update address")
	public void selecting_update_address() throws IOException, InterruptedException {

		try {
			waitforclick(pages.getHomepage().getBtn_updateaddress()).click();
			System.out.println(pages.getHomepage().getBtn_updateaddress().toString()
					.split(":")[2].strip().substring(0,pages.getHomepage().getBtn_updateaddress().toString().split(":")[2].strip().length()-1));
			}
			catch(Exception e) {
				
			}
	}
	@Then("selecting the edit location address")
	public void selecting_the_edit_location_address() throws IOException, InterruptedException {
		waitforclick(pages.getAccountsettingspage().getLocations_txt_moreactionLoc()).click();
		pages.getAccountsettingspage().getLocations_txt_editLoc().click();
	}
	@Then("entering the location name")
	public void entering_the_location_name() throws IOException, InterruptedException {
		waitforclick(pages.getAccountsettingspage().getLocations_name()).clear();	
		waitforclick(pages.getAccountsettingspage().getLocations_name()).sendKeys(loadPropertyFile("location"));
	}
	@Then("entering the addressline1")
	public void entering_the_addressline1() throws IOException, InterruptedException {
		waitforclick(pages.getAccountsettingspage().getLocations_txt_addressline1()).sendKeys(loadPropertyFile("addressline1"));	
	}
	@Then("entering the addressline2")
	public void entering_the_addressline2() throws IOException, InterruptedException {
		waitforclick(pages.getAccountsettingspage().getLocations_txt_addressline2()).sendKeys(loadPropertyFile("addressline2"));

	}
	@Then("selecting the country")
	public void selecting_the_country() throws IOException, InterruptedException {
		pages.getAccountsettingspage().selectByText("India", waitforclick(pages.getAccountsettingspage().getLocations_btn_country()));

	}
	@Then("entering the region")
	public void entering_the_region() throws IOException, InterruptedException {
		waitforclick(pages.getAccountsettingspage().getLocations_txt_region()).sendKeys(loadPropertyFile("region"));

	}
	@Then("entering the city")
	public void entering_the_city() throws IOException, InterruptedException {
		waitforclick(pages.getAccountsettingspage().getLocations_txt_city()).sendKeys(loadPropertyFile("city"));

	}
	@Then("entering the postalcode")
	public void entering_the_postalcode() throws IOException, InterruptedException {
		waitforclick(pages.getAccountsettingspage().getLocations_txt_postalcode()).sendKeys(loadPropertyFile("postalcode"));

	}
	@Then("entering the TRN")
	public void entering_the_trn() throws IOException, InterruptedException {
	    waitforclick(pages.getAccountsettingspage().getSecondTRNInputField()).sendKeys(loadPropertyFile("trn"));
	}

	@Then("entering the Company Registration Number")
	public void entering_the_company_registration_number() throws IOException, InterruptedException {
	    waitforclick(pages.getAccountsettingspage().getSecondCompanyRegistrationNumberInputField()).sendKeys(loadPropertyFile("company_registration_number"));
	}

	@Then("entering the FSSAI License Number")
	public void entering_the_fssai_license_number() throws IOException, InterruptedException {
	    waitforclick(pages.getAccountsettingspage().getSecondFSSAILicenseNumberInputField()).sendKeys(loadPropertyFile("fssai_license_number"));
	}

	@Then("entering the Order Sequence No Prefix")
	public void entering_the_order_sequence_no() throws IOException, InterruptedException {
	    waitforclick(pages.getAccountsettingspage().getSecondOrderSequenceNoInputField()).sendKeys(loadPropertyFile("order_sequence_no"));
	}

	@Then("entering the Maximum Delivery Distance")
	public void entering_the_maximum_delivery_distance() throws IOException, InterruptedException {
		waitforclick(pages.getAccountsettingspage().getSecondMaximumDeliveryDistanceInputField()).clear();
		waitforclick(pages.getAccountsettingspage().getSecondMaximumDeliveryDistanceInputField()).sendKeys(loadPropertyFile("maximum_delivery_distance"));
	}

	@Then("entering the Latitude")
	public void entering_the_latitude() throws IOException, InterruptedException {
	    waitforclick(pages.getAccountsettingspage().getSecondLatitudeInputField()).sendKeys(loadPropertyFile("latitude"));
	}

	@Then("entering the Longitude")
	public void entering_the_longitude() throws IOException, InterruptedException {
	    waitforclick(pages.getAccountsettingspage().getSecondLongitudeInputField()).sendKeys(loadPropertyFile("longitude"));
	}

	@Then("checking the Pickup Available checkbox")
	public void checking_the_pickup_available_checkbox() throws IOException, InterruptedException {
	    (pages.getAccountsettingspage().getSecondPickupAvailableCheckbox()).click();
	}
	
	@Then("checking the Delivery Available checkbox")
	public void checking_the_delivery_available_checkbox() throws IOException, InterruptedException {
		(pages.getAccountsettingspage().getSecondDeliveryAvailableCheckbox()).click();
		sleep(1000);
	}
	@Then("saving location details")
	public void ssaving_location_details() throws IOException, InterruptedException {
		waitforclick(pages.getAccountsettingspage().getLocations_btn_save()).click();
		sleep(1000);
//		Assert.assertTrue(waitforinvisible("//div/strong[text()='Success']"));


	}
	
	// Employee Creation
	
	@Then("Clicking the Employee Menu")
	public void clicking_the_employee_menu() throws InterruptedException {
	   waitforclick(pages.getEmployeespage().getEmployee_menu()).click();
	  
		
	}

	@Then("Clicking the Roles tab")
	public void clicking_the_roles_tab() throws InterruptedException {
	    waitforclick(pages.getEmployeespage().getEmployee_roles_tab()).click();
	}

	@Then("Clicking the create role button")
	public void clicking_the_create_role_button() {
	    waitforclick(pages.getEmployeespage().getRoles_create()).click();
	}
	
	

	@Then("Entering the Name of the role")
	public void entering_the_name_of_the_role() throws InterruptedException {
//		waitforclick(pages.getEmployeespage().getRoles_name()).click();
		sleep(500);
		waitforclick(pages.getEmployeespage().getRoles_name()).sendKeys("Manager");

	}

	@Then("Clicking the full access in the role.")
	public void clicking_the_full_access_in_the_role() {
	    scrollToBottom();
	    pages.getEmployeespage().getRoles_full_access_checkbox().click();
	}

	@Then("Clicking the save button in the role.")
	public void clicking_the_save_button_in_the_role() throws InterruptedException {
		//Thread.sleep(3000);
	    waitforclick(pages.getEmployeespage().getRoles_save_button()).click();
	}
	
	@Then("Check the role is Created.")
	public void check_the_role_is_created() throws InterruptedException {
		//Thread.sleep(3000);
		Assert.assertEquals(waitforXpath("(//tbody//tr//td)[1]").getText(),"Manager");
	
	}
	//  pages.getEmployeespage()


	@Then("Clicking the Employee create button")
	public void clicking_the_employee_create_button() throws InterruptedException {
		
		waitforclick(pages.getEmployeespage().getEmployee_tab_name()).click();
		waitforclick(pages.getEmployeespage().getCreate_employee()).click();
	 	}

	@Then("Entering the Employee Name")
	public void entering_the_employee_name() throws InterruptedException {
		
	    waitforclick(pages.getEmployeespage().getEmployee_name()).sendKeys("Vichu");
		
	}

	@Then("Clicking The Employee Type")
	public void clicking_the_employee_type() throws InterruptedException {
		waitforclick(pages.getEmployeespage().getEmployee_select_type_click()).click();
		
	}

	@Then("Selecting the Employee Type")
	public void selecting_the_employee_type() throws InterruptedException {
		waitforclick(pages.getEmployeespage().getEmployee_select_type_search()).click();
	    
	}

	@Then("Set the Employee password")
	public void set_the_employee_password() throws IOException {
	    waitforclick(pages.getEmployeespage().getEmployee_password()).sendKeys(loadPropertyFile("validpassword"));
	}

	@Then("Set the Employee six digit password")
	public void set_the_employee_six_digit_password() {
	    waitforclick(pages.getEmployeespage().getEmployee_six_digit_password()).sendKeys("123456");
	}

	@Then("Set the Employee Four digit password")
	public void set_the_employee_four_digit_password() {
	   waitforclick(pages.getEmployeespage().getEmployee_four_digit_password()).sendKeys("1111");
	}

	@Then("Enter the Employee Email")
	public void enter_the_employee_email() {
		waitforclick(pages.getEmployeespage().getEmployee_email()).sendKeys("vichu"+randomNumber(1000000)+"@bytize.in");
	}

	@Then("Enter the Employee Phone Number")
	public void enter_the_employee_phone_number() throws IOException {
	    waitforclick(pages.getEmployeespage().getEmployee_phone_number()).sendKeys(loadPropertyFile("validmobilenumber"));
	}
	
	@Then("Clicking the Employee Role")
	public void clicking_the_employee_role() throws InterruptedException {
		 waitforclick(pages.getEmployeespage().getEmployee_role_click()).click();
	}
	
	@Then("Select the Employee Role")
	public void select_the_employee_role() throws InterruptedException {
	     waitforclick(pages.getEmployeespage().getEmployee_roles_search_name()).click();
	}

	@Then("Click the Save button in the Employee")
	public void click_the_save_button_in_the_employee() {
	    waitforclick(pages.getEmployeespage().getEmployee_save_button()).click();
	}

	@Then("Check Employee is not created and through subscription validation")
	public void check_employee_is_not_created_and_through_subscription_validation() {
		Assert.assertEquals(waitforXpath(("//h5[text()='Subscription']")).getText(),"Subscription");

	}
	
	@Then("Close the Employee subscription page.")
	public void close_the_employee_subscription_page() throws InterruptedException {
		sleep(3000);
	    waitforclick(pages.getEmployeespage().getEmployee_subscription_close()).click();	
	}
	
	@Then("Close the Employee Create Popup")
	public void close_the_employee_create_popup() {
	    waitforclick(pages.getEmployeespage().getEmployee_close_button()).click();
	}
///////////////////////////////////////////////////////////////////
///customer menu
	
	
	@Then("Clicking the customer menu")
	public void clicking_the_customer_menu() throws InterruptedException {
	 waitforclick(pages.getCustomerspage().getCustomer_menu()).click();   	
	}
	
	
	@Then("Clicking the customer group tab")
	public void clicking_the_customer_group_tab() throws InterruptedException {
	    waitforclick(pages.getCustomerspage().getCustomer_group_tab()).click();
		
		
	}
	@Then("Clicking the create group button")
	public void clicking_the_create_group_button() {
	    waitforclick(pages.getCustomerspage().getCustomer_group_create()).click();
	}
	@Then("Entering the group name")
	public void entering_the_group_name() throws InterruptedException {
	    waitforclick(pages.getCustomerspage().getCustomer_group_name()).sendKeys("Vichu Group");
	}
	
	@Then("Clicking the save button in the customer group")
	public void clicking_the_save_button_in_the_customer_group() throws InterruptedException {
	    waitforclick(pages.getCustomerspage().getCustomer_group_save_button()).click();
	   
	}
	
	@Then("Check the customer group is created")
	public void check_the_customer_group_is_created() {
	Assert.assertEquals(waitforXpath(("(//tbody//tr//td[2])[1]")).getText(),"Vichu Group");
	}
	
	@Then("Clicking the customer tab")
	public void clicking_the_customer_tab() throws InterruptedException {
	   waitforclick(pages.getCustomerspage().getCustomer_tab()).click();
		
	}
	@Then("Clicking the customer create button")
	public void clicking_the_customer_create_button() {
	   waitforclick(pages.getCustomerspage().getCustomer_create()).click();
	}
	@Then("Entering the customer first name")
	public void entering_the_customer_first_name() {
	    waitforclick(pages.getCustomerspage().getCustomer_first_name()).sendKeys("viswanathan");
	}
	@Then("Entering the customer last name")
	public void entering_the_customer_last_name() {
	   waitforclick(pages.getCustomerspage().getCustomer_last_name()).sendKeys("velayutham");
	}
	@Then("Entering the customer email")
	public void entering_the_customer_email() {
		Random randomGen = new Random();
		int nextInt = randomGen.nextInt(10000000);
		waitforclick(pages.getCustomerspage().getCustomer_email()).sendKeys("customer"+nextInt+"@bytize.in");
		
	}
	@Then("Entering the customer phone number")
	public void entering_the_customer_phone_number() throws IOException {
//		Random randomGen = new Random();
//		int nextInt = randomGen.nextInt(100000000);
		pages.getCustomerspage().customerPhoneNumber();
	}		
	@Then("Clicking the customer group")
	public void clicking_the_customer_group() {
		waitforclick(pages.getCustomerspage().getCustomer_group_dropdown()).click();
	}
	
	@Then("Select the customer group")
	public void select_the_customer_group() throws InterruptedException {
	   // pages.getCustomerspage().waitforxpath(By.xpath("//span[text()='Vichu Group']")).click();
	    waitforclick(pages.getCustomerspage().getCustomer_group_dropdown_select()).click();
	}
	@Then("Entering the customer code")
	public void entering_the_customer_code() {
	    waitforclick(pages.getCustomerspage().getCustomer_code()).sendKeys("1");
	}   
	@Then("Entering the customer DOB")
	public void entering_the_customer_dob() {
		waitforclick(pages.getCustomerspage().getCustomer_dob()).sendKeys("06/09/1995");

	}
	 @Then("Click the customer gender")
	 public void click_the_customer_gender() throws InterruptedException {
		 sleep(500);
		 pages.getCustomerspage().selectByText("Male",waitforclick(pages.getCustomerspage().getCustomer_gender()));
	  
	}
	@Then("Entering the customer address line")
	public void entering_the_customer_address_line() {
	    waitforclick(pages.getCustomerspage().getCustomer_address_line()).sendKeys("address line");
	}
	@Then("Entering the customer landmark")
	public void entering_the_customer_landmark() {
	    waitforclick(pages.getCustomerspage().getCustomer_address_landmark()).sendKeys("landmark");
	}
	@Then("Entering the customer area")
	public void entering_the_customer_area() {
	   waitforclick(pages.getCustomerspage().getCustomer_address_area()).sendKeys("area");
	}
	@Then("Selecting the customer country")
	public void selecting_the_customer_country() throws InterruptedException {
	    waitforclick(pages.getCustomerspage().getCustomer_country_dropdown()).click();
	    waitforclick(pages.getCustomerspage().getCustomer_country_india()).click();
	}
	@Then("Selecting the customer state")
	public void selecting_the_customer_state() throws InterruptedException {
	   waitforclick(pages.getCustomerspage().getCustomer_state_dropdown()).click();
	   waitforclick(pages.getCustomerspage().getCustomer_state_tamilnadu()).click();	
	}
	@Then("Selecting the customer city")
	public void selecting_the_customer_city() throws InterruptedException {
		waitforclick(pages.getCustomerspage().getCustomer_city_dropdown()).click();
		waitforclick(pages.getCustomerspage().getCustomer_city_chennai()).click();	
	}
	@Then("Entering the customer zipcode")
	public void entering_the_customer_zipcode() {
	   waitforclick(pages.getCustomerspage().getCustomer_zipcode()).sendKeys("605401");		
	}
	@Then("Selecting the customer address type")
	public void selecting_the_customer_address_type() throws InterruptedException {
		pages.getCustomerspage().selectByText("Home",waitforclick(pages.getCustomerspage().getCustomer_type()));
	}
	@Then("Entering the customer latitude")
	public void entering_the_customer_latitude() {
	    waitforclick(pages.getCustomerspage().getCustomer_latitude()).sendKeys("80.00");
	}
	@Then("Entering the customer longitude")
	public void entering_the_customer_longitude() {
		waitforclick(pages.getCustomerspage().getCustomer_longitude()).sendKeys("90.00");
	}
	@Then("Entering the customer TRN and GSTIN andVAT number")
	public void entering_the_customer_trn_and_gstin_and_vat_number() {
	   waitforclick(pages.getCustomerspage().getCustomer_trn_gstin_vat_number()).sendKeys("12345678");
	}
	@Then("Entering the customer CR number")
	public void entering_the_customer_cr_number() {
	    waitforclick(pages.getCustomerspage().getCustomer_cr_number()).sendKeys("99999");
	}
	@Then("Entering the customer company number")
	public void entering_the_customer_company_number() {
	    waitforclick(pages.getCustomerspage().getCustomer_company_name()).sendKeys("vichu company");
		
	}
	@Then("Entering the customers notes")
	public void entering_the_customers_notes() {
	    waitforclick(pages.getCustomerspage().getCustomer_nots()).sendKeys("customer notes");
		
	}
	@Then("Clicking the customer save button")
	public void clicking_the_customer_save_button() throws InterruptedException {
	    waitforclick(pages.getCustomerspage().getCustomer_save_button()).click();
	    sleep(2000);
	    
	}
	@Then("Check the customer is created")
	public void check_the_customer_is_created() throws InterruptedException {
		sleep(1000);
		Assert.assertEquals(waitforXpath(("(//table//tbody//tr//td)[1]")).getText(),"viswanathan velayutham");
		System.out.println("verified");
	}
	/////////////////////////////////////////////////////////////////
	//Restaurant Management//////////////////////////////////////////
	
	
	@Then("Clicking the restaurant management menu")
	public void clicking_the_restaurant_management_menu() throws InterruptedException {
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_menu()).click();
	}
	@Then("Clicking the create floor button")
	public void clicking_the_create_floor_button() throws InterruptedException {
		waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_create_floor_button()).click();
	}
	@Then("Entering the floor name")
	public void entering_the_floor_name() throws InterruptedException {
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_floor_name()).sendKeys("First Floor");
	}
	@Then("Selecting the floor location name")
	public void selecting_the_floor_location_name() throws InterruptedException {
	    pages.getRestaurantmanagementpage().getRestaurant_management_select_location().click();
	    sleep(2000);
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_location_chennai());
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_location_chennai()).click();
	    
	}
	@Then("Clicking the save button in the floor")
	public void clicking_the_save_button_in_the_floor() {
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_save_button()).click();
		
	}
	@Then("Check the floor is created")
	public void check_the_floor_is_created() {
		Assert.assertEquals(waitforXpath(("//tbody//tr/td[1]")).getText(),"First Floor");
	}
	@Then("Clicking the tables button in the created floor")
	public void clicking_the_tables_button_in_the_created_floor() throws InterruptedException {
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_table_button()).click();
	}
	@Then("Clicking the create table button")
	public void clicking_the_create_table_button() throws InterruptedException {
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_create_table_button()).click();
	}
	@Then("Entering the Table name")
	public void entering_the_table_name() throws InterruptedException {
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_table_name()).sendKeys("Table 1");
	}
	@Then("Entering the Table seating capacity")
	public void entering_the_table_seating_capacity() throws InterruptedException {
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_seating_capacity()).sendKeys("5");

	}
	@Then("Selecting the price category")
	public void selecting_the_price_category() throws InterruptedException {
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_select_price_category()).click();
	    sleep(1000);
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_select_price_category_dine_in());
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_select_price_category_dine_in()).click();
	  
	}
	@Then("Clicking the save button in the table")
	public void clicking_the_save_button_in_the_table() throws InterruptedException {
	   waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_table_save_button()).click();
	}
	@Then("Check the table is created")
	public void check_the_table_is_created() {
		Assert.assertEquals(waitforXpath(("//tbody//tr/td[1]")).getText(),"Table 1");
		
	}
	@Then("Clicking the floor plan button")
	public void clicking_the_floor_plan_button() throws InterruptedException {
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_create_floor_plan_button()).click();
		
	}
	@Then("Clicking the set option in the edit floor plan")
	public void clicking_the_set_option_in_the_edit_floor_plan() throws InterruptedException {
	   waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_set_button()).click();
	}
	@Then("Check the floor layout is created")
	public void check_the_floor_layout_is_created() throws InterruptedException {
		Assert.assertEquals(waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_floor_layout()).getText(),"Table 1"); 
		
	}
	@Then("Close the floor layout")
	public void close_the_floor_layout() throws InterruptedException {
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_floor_plan_close_button()).click();
	}
	/////////////////////////////////////////////////////////////////
	//Edit the table ///////////////////
	@Then("Clicking the edit button in the table")
	public void clicking_the_edit_button_in_the_table() throws InterruptedException {
		sleep(3000);
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_tables_edit_button()).click();
		
		
	}
	@Then("Editing the Table name")
	public void editing_the_table_name() throws InterruptedException {
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_table_name_edit()).clear();
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_table_name_edit()).sendKeys("Table edit");

	}
	@Then("Editing the Table seating capacity")
	public void editing_the_table_seating_capacity() throws InterruptedException {
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_seating_capacity_edit()).clear();
	    waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_seating_capacity_edit()).sendKeys("10");

	}
	@Then("Editing the price category")
	public void editing_the_price_category() throws InterruptedException {
		 waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_select_price_category_dine_in_edit_click()).click();
		 waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_select_price_category_edit_takeaway()).click();
	}
	
	@Then("Clicking the save button in the edit table")
	public void clicking_the_save_button_in_the_edit_table() throws InterruptedException {
		   waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_table_save_button_edit()).click();
		   sleep(2000);
	}	  
	@Then("Check the edit changes in the tables")
	public void check_the_edit_changes_in_the_tables() throws InterruptedException {
		 	waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_tables_edit_button()).click();
		   Assert.assertEquals("Table edit",pages.getRestaurantmanagementpage().getRestaurant_management_table_name_edit().getAttribute("value") );
		   Assert.assertEquals("10",pages.getRestaurantmanagementpage().getRestaurant_management_seating_capacity_edit().getAttribute("value") );
		   Assert.assertTrue(waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_select_price_category_edit_takeaway_check()).getText().contains("Takeaway"));
		   System.out.println("verified");
		   waitforclick(pages.getRestaurantmanagementpage().getRestaurant_management_tables_edit_close_button()).click();
	}


	////////////////////////////////////////////////////////////////
	//loyalty management/////////////////////////
	
	@Then("Clicking the loyalty management menu")
	public void clicking_the_loyalty_management_menu() throws InterruptedException {
		//scrollDownJs(findLocatorByXpath("(//*[@class='nav-link'])[12]"));
	    waitforclick(pages.getLoyaltymanagementpage().getLoyalty_management_menu()).click();
	}
	@Then("Clicking the create loyalty button")
	public void clicking_the_create_loyalty_button() throws InterruptedException {
		
	    waitforclick(pages.getLoyaltymanagementpage().getLoyalty_create_button()).click();
	}
	@Then("Entering the loyalty name")
	public void entering_the_loyalty_name()throws InterruptedException {
	    waitforclick(pages.getLoyaltymanagementpage().getLoyalty_name()).sendKeys("Test Loyalty");
	}
	@Then("Clicking the loyalty location")
	public void clicking_the_loyalty_location() {
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_locations()).click();
		
	}
	@Then("selecting the loyalty location")
	public void selecting_the_loyalty_location() throws InterruptedException {
		//refreshElement((pages.getLoyaltymanagementpage().getLoyalty_location_chennai()));
		
		sleep(1000);
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_location_chennai());
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_location_chennai()).click();
		
	}
	@Then("Entering the loyalty description")
	public void entering_the_loyalty_description()throws InterruptedException {
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_descriptions()).sendKeys("Test Description");
	}
	@Then("Entering the customer signup points")
	public void entering_the_customer_signup_points()throws InterruptedException {
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_signup_points()).sendKeys("100"); 
	}
	
	@Then("Entering the Specify the amount required to earn one loyalty point")
	public void entering_the_specify_the_amount_required_to_earn_one_loyalty_point() throws InterruptedException{
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_amount_spent_earn_points()).sendKeys("10");
	}
	@Then("Entering the Discount Type \\(Applicable on order)")
	public void entering_the_discount_type_applicable_on_order()throws InterruptedException {
		pages.getCustomerspage().selectByText("Fixed",waitforclick(pages.getLoyaltymanagementpage().getLoyalty_discount_type_dropdown()));

	}
	@Then("Entering the Discount Value \\(Applicable on order)")
	public void entering_the_discount_value_applicable_on_order() throws InterruptedException{
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_discount_value()).sendKeys("10");
	}
	
	
	@Then("Entering the Minimum Reward Points Needed \\(For Earning Reward)")
	public void entering_the_minimum_reward_points_needed_for_earning_reward()throws InterruptedException {
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_minimum_reward_need()).sendKeys("150"); 
	}
	@Then("Entering the Discount Amount for each point")
	public void entering_the_discount_amount_for_each_point()throws InterruptedException {
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_discount_each_point()).sendKeys("10");
	}
	@Then("Clicking the save button in the loyalty")
	public void clicking_the_save_button_in_the_loyalty()throws InterruptedException {
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_save_button()).click();
	
	}
	@Then("Check the loyalty is created")
	public void check_the_loyalty_is_created() {
		Assert.assertEquals(waitforXpath(("//tbody//tr/td[1]")).getText(),"Test Loyalty"); 
	}
/////////////////////////////////////////////////////////////
	//edit the loyalty
	
	@Then("Clicking the edit button")
	public void clicking_the_edit_button() throws InterruptedException{
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_edit_button()).click();
		
	}
	@Then("Editing the loyalty name")
	public void editing_the_loyalty_name() throws InterruptedException {
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_name_edit()).clear();
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_name_edit()).sendKeys("Test Loyalty New"); 
	}
	@Then("Editing the customer signup points")
	public void editing_the_customer_signup_points() throws InterruptedException{
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_signup_point_edit()).clear();
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_signup_point_edit()).sendKeys("150");
	}
	@Then("Editing the Specify the amount required to earn one loyalty point")
	public void editing_the_specify_the_amount_required_to_earn_one_loyalty_point()throws InterruptedException {
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_amount_spent_earn_points_edit()).clear();
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_amount_spent_earn_points_edit()).sendKeys("20");
	}
	@Then("Editing the discount Type")
	public void editing_the_discount_type()throws InterruptedException {
		pages.getCustomerspage().selectByText("Percentage",waitforclick(pages.getLoyaltymanagementpage().getLoyalty_discount_type_dropdown_edit()));

	}
	@Then("Editing the discount value")
	public void editing_the_discount_value()throws InterruptedException {
		sleep(500);
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_discount_value_edit()).clear();
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_discount_value_edit()).sendKeys("20");
	}
	@Then("Editing the Minimum Reward Points Needed")
	public void editing_the_minimum_reward_points_needed()throws InterruptedException {
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_minimum_reward_need_edit()).clear();
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_minimum_reward_need_edit()).sendKeys("150");
		
	}
	@Then("Editing the Discount Amount for each point")
	public void editing_the_discount_amount_for_each_point()throws InterruptedException {
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_discount_each_point_edit()).clear();
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_discount_each_point_edit()).sendKeys("20");
	}
	
	@Then("Clicking the save button in the loyalty edit")
	public void clicking_the_save_button_in_the_loyalty_edit()throws InterruptedException {
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_save_button_edit()).click();
		
	}
	@Then("Check the edit changes in the loyalty")
	public void check_the_edit_changes_in_the_loyalty() throws InterruptedException{
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_edit_button());
		sleep(2000);
		waitforclick(pages.getLoyaltymanagementpage().getLoyalty_edit_button()).click();
		Assert.assertEquals("Test Loyalty New",pages.getLoyaltymanagementpage().getLoyalty_name_edit().getAttribute("value") );
		sleep(3000);
		Assert.assertEquals("150",pages.getLoyaltymanagementpage().getLoyalty_signup_point_edit().getAttribute("value") );
		Assert.assertEquals("20",pages.getLoyaltymanagementpage().getLoyalty_amount_spent_earn_points_edit().getAttribute("value") );
		Assert.assertEquals("Percentage",getFirstOption(pages.getLoyaltymanagementpage().getLoyalty_discount_type_dropdown_edit()));
		Assert.assertEquals("20",pages.getLoyaltymanagementpage().getLoyalty_discount_value_edit().getAttribute("value") );
		Assert.assertEquals("150",pages.getLoyaltymanagementpage().getLoyalty_minimum_reward_need_edit().getAttribute("value") );
		Assert.assertEquals("20",pages.getLoyaltymanagementpage().getLoyalty_discount_each_point_edit().getAttribute("value") );
	}
	
	@Then("Close the loyalty")
	public void close_the_loyalty() throws InterruptedException {
	    waitforclick(pages.getLoyaltymanagementpage().getLoyalty_close_button()).click();
	}

	
	
	////////////////////////////////////////////////////////////

	@Then("Click the edit button in the customer")
	public void click_the_edit_button_in_the_customer() throws InterruptedException {
		sleep(1000);
	    waitforclick(pages.getCustomerspage().getCustomer_edit_button()).click();
		
	}
	@Then("Editing the customer first name")
	public void editing_the_customer_first_name() throws InterruptedException{
		waitforclick(pages.getCustomerspage().getCustomer_first_name()).clear();
		waitforclick(pages.getCustomerspage().getCustomer_first_name()).sendKeys("editFirstName");
	}
	@Then("Editing the customer second name")
	public void editing_the_customer_second_name()throws InterruptedException {
		waitforclick(pages.getCustomerspage().getCustomer_last_name()).clear();
		waitforclick(pages.getCustomerspage().getCustomer_last_name()).sendKeys("editLasttName");
		
		
	}
	@Then("Editing the customer email")
	public void editing_the_customer_email() throws InterruptedException{
		waitforclick(pages.getCustomerspage().getCustomer_email()).clear();
		Random randomGen = new Random();
		int nextInt = randomGen.nextInt(10000000);
		pages.getCustomerspage().getCustomer_email().sendKeys("");
		waitforclick(pages.getCustomerspage().getCustomer_email()).sendKeys("customer"+nextInt+"@bytize.in");
	}
	
	@Then("Editing the customer phone number")
	public void editing_the_customer_phone_number()throws InterruptedException, IOException {
		waitforclick(pages.getCustomerspage().getCustomer_phone_number()).clear();
//		Random randomGen = new Random();
//		int nextInt = randomGen.nextInt(100000000);
		pages.getCustomerspage().getCustomer_phone_number().sendKeys(loadPropertyFile("customerNumber"));  
		
	}
	@Then("Click the edit customer save button")
	public void click_the_edit_customer_save_button() {
	    
		
	}
	@Then("Check the edit customer is created")
	public void check_the_edit_customer_is_created() {
		Assert.assertEquals(waitforXpath(("(//table//tbody//tr//td)[1]")).getText(),"editFirstName editLasttName");
		
	}

	
	////////////////////////////////////////////////////////////////////////
	////Inventory management////////
	
	@Then("Clicking the inventory management menu")
	public void clicking_the_inventory_management_menu() throws InterruptedException {
		sleep(800);
	    waitforclick(pages.getInventorymanagementpage().getInventory_management_menu()).click();
   
	}
	@Then("Clicking the inventory management more actions button")
	public void clicking_the_inventory_management_more_actions_button() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_more_action_dot()).click();
		waitforXpath("//div[@class='dropdown-menu dropdown-menu-right show']");

	}
	@Then("Clicking the vendor in more actions")
	public void clicking_the_vendor_in_more_actions() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_vendors()).click();
	}
	
	
	@Then("Clicking the vendor create button")
	public void clicking_the_vendor_create_button() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_create_vendor_button()).click();

	}
	@Then("Entering the vendor name")
	public void entering_the_vendor_name() throws InterruptedException, IOException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_vendor_name()).sendKeys(loadPropertyFile("vendorName"));

	}
	@Then("Entering the vendor email")
	public void entering_the_vendor_email() throws InterruptedException, IOException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_vendor_email()).sendKeys(loadPropertyFile("validemailid"));

	}
	@Then("Entering the vendor phone number")
	public void entering_the_vendor_phone_number() throws InterruptedException, IOException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_vendor_phone_no()).sendKeys(loadPropertyFile("validmobilenumber"));

	}
	@Then("Entering the vendor code")
	public void entering_the_vendor_code() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_vendor_code()).sendKeys("55");

	}
	@Then("Entering the vendor address line one")
	public void entering_the_vendor_address_line_one() throws InterruptedException, IOException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_vendor_address_line_1()).sendKeys(loadPropertyFile("addressline1"));

	}
	@Then("Entering the vendor address line two")
	public void entering_the_vendor_address_line_two() throws InterruptedException, IOException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_vendor_address_line_2()).sendKeys(loadPropertyFile("addressline2"));

	}
	@Then("Entering the vendor city")
	public void entering_the_vendor_city() throws InterruptedException, IOException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_vendor_city()).sendKeys(loadPropertyFile("city"));

	}
	@Then("Entering the vendor region")
	public void entering_the_vendor_region() throws InterruptedException, IOException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_vendor_region()).sendKeys(loadPropertyFile("vendorRegion"));

	}
	@Then("Entering the vendor country")
	public void entering_the_vendor_country() throws InterruptedException, IOException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_vendor_country()).sendKeys(loadPropertyFile("vendorCountry"));
		
	}
	@Then("Entering the vendor postal code")
	public void entering_the_vendor_postal_code() throws InterruptedException, IOException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_vendor_postal_code()).sendKeys("567545");

		
	}
	@Then("Entering the vendor TRN")
	public void entering_the_vendor_trn() throws InterruptedException, IOException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_vendor_trn()).sendKeys(loadPropertyFile("vendorTRN"));

		
	}
	@Then("Entering the vendor CRN")
	public void entering_the_vendor_crn() throws InterruptedException, IOException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_vendor_crn()).sendKeys(loadPropertyFile("vendorCRN"));

	}
	@Then("Clicking the vendor save button")
	public void clicking_the_vendor_save_button() throws InterruptedException, IOException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_vendor_save_button()).click();
		sleep(2000);
	}

	@Then("Check the vendor is created")
	public void check_the_vendor_is_created() throws InterruptedException {
		Assert.assertEquals(waitforXpath(("(//tr/td//div[1])[1]")).getText(),"Test Vendor"); 
		System.out.println("verified");
	}
	/////////////////////////////////////////////////////////////////
	////purchase order/////////////////////
	
	@Then("Clicking the purchase order tab")
	public void clicking_the_purchase_order_tab() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_tab()).click();

	}
	@Then("Clicking the purchase order create button")
	public void clicking_the_purchase_order_create_button() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_create_button()).click();

	}
	@Then("Selecting the vendor in the purchase order")
	public void selecting_the_vendor_in_the_purchase_order() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_select_vendor()).click();
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_Test_vendor()).click();

	}
	@Then("Selecting the ship to location in purchase order")
	public void selecting_the_ship_to_location_in_purchase_order() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_select_location()).click();
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_select_location_chennai()).click();

	}
	@Then("Selecting the expected delivery date in purchase order")
	public void selecting_the_expected_delivery_date_in_purchase_order() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_expect_delivery()).click();
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_delivery_date_apply_button()).click();

	}
	@Then("Entering the PO invoice number")
	public void entering_the_po_invoice_number() throws InterruptedException {
		Random randomGen = new Random();
		int nextInt = randomGen.nextInt(10000);
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_invoice_number()).sendKeys("INV"+nextInt);

	}
	@Then("Selecting the billing date in purchase order")
	public void selecting_the_billing_date_in_purchase_order() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_billing_date()).click();
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_billing_date_appy_button()).click();


	}
	@Then("Entering the purchase order notes")
	public void entering_the_purchase_order_notes() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_notes()).sendKeys("PO Notes");

	}
	@Then("Clicking the add items in the purchase order")
	public void clicking_the_add_items_in_the_purchase_order() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_add_items()).click();

	}
	@Then("Clicking the select item")
	public void clicking_the_select_item() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_select_item()).click();

	}
	@Then("Entering the variation in purchase order")
	public void entering_the_variation_in_purchase_order() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_select_item_input()).sendKeys("chicken biriyani full");
		waitforclick(findLocatorByXpath("//*[contains(text(),'chicken biriyani full')]")).click();
	}
	
	@Then("Entering the Quantity in purchase order")
	public void entering_the_quantity_in_purchase_order() throws InterruptedException, IOException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_singleItem_quantity()).sendKeys(loadPropertyFile("purchaseItemStock"));

	}
	@Then("Selecting the discount Type in purchase order")
	public void selecting_the_discount_type_in_purchase_order() throws InterruptedException {
		 pages.getInventorymanagementpage().selectByText("Fixed",waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_discount_type()));
		 sleep(1000);
	}
	
	@Then("Entering the discount value in the purchase order")
	public void entering_the_discount_value_in_the_purchase_order() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_discount_value()).sendKeys("10");

	}
	
	
	@Then("Clicking the save button in add single item in purchase")
	public void clicking_the_save_button_in_add_single_item_in_purchase() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_singleItem_save_button()).click();

	}

	@Then("Clicking the save button in purchase order")
	public void clicking_the_save_button_in_purchase_order() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_save_button()).click();
		sleep(3000);
	}
	@Then("Clicking the Approve button in purchase order")
	public void clicking_the_approve_button_in_purchase_order() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_approve_button()).click();

	}
	@Then("Clicking the OK button in approve popup in purchase order")
	public void clicking_the_ok_button_in_approve_popup_in_purchase_order() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_Ok_button_approve_popup()).click();
		sleep(500);
	}
	@Then("Clicking the Recieve order in the purchase order")
	public void clicking_the_recieve_order_in_the_purchase_order() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_receive_order_button()).click();

	}
	@Then("Clicking the check button in receive prefill quantity in the purchase order")
	public void clicking_the_check_button_in_receive_prefill_quantity_in_the_purchase_order() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_check_prefill_receive_quantity()).click();

	}
	@Then("Clicking the save button in the receive purchase order")
	public void clicking_the_save_button_in_the_receive_purchase_order() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_receive_save_button()).click();
		sleep(1000);
	}
	@Then("Clicking the GRN details in the purchase order")
	public void clicking_the_grn_details_in_the_purchase_order() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_grn_details()).click();
	

	}
	@Then("Clicking the more options in the Grn details in purchase order")
	public void clicking_the_more_options_in_the_grn_details_in_purchase_order() throws InterruptedException {
		sleep(1000);
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_grn_more_actions()).click();
		waitforXpath("//div[@class='dropdown-menu dropdown-menu-right show']");
		
	}
	@Then("Clicking the add payment in the Grn details in purchase order")
	public void clicking_the_add_payment_in_the_grn_details_in_purchase_order() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_add_payment()).click();

	}
	@Then("Clicking the Cash payment in the puchase order")
	public void clicking_the_cash_payment_in_the_puchase_order() throws InterruptedException {
		//waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_select_payment_method()).click();
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_select_payment_method()).click();
	    sleep(1000);
	    waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_payment_cash());
	    waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_payment_cash()).click();
	  
	}
	@Then("Entering the payment date in the puchase order")
	public void entering_the_payment_date_in_the_puchase_order() throws InterruptedException {
	    waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_payment_date()).click();
	    waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_payment_date_apply_button()).click();

		
	}
	@Then("Clicking the save button in payment details of the puchase order")
	public void clicking_the_save_button_in_payment_details_of_the_puchase_order() throws InterruptedException {
	    waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_payment_details_save_button()).click();
	    sleep(2000);

	}
	@Then("Clicking the history in the inventory management")
	public void clicking_the_history_in_the_inventory_management() throws InterruptedException {
		scrollToTop();
	    waitforclick(pages.getInventorymanagementpage().getInventory_management_history()).click();

	}
	@Then("Check the stock received in the purchase order")
	public void check_the_stock_received_in_the_purchase_order() throws IOException {
		
		Assert.assertEquals(waitforXpath("(//table//tbody//tr//td)[5]").getText(),"1");
		Assert.assertEquals(waitforXpath("(//table//tbody//tr//td)[7]").getText()," 1.0000 Received");
		Assert.assertEquals(waitforXpath("(//table//tbody//tr[1]//td[8])").getText(),loadPropertyFile("iteminitialstock"+"purchaseItemStock"));
		
	}
	//////////////////////////////////////////////////
	/////GRN///////////////////////////
	@Then("Clicking the Grn tab")
	public void clicking_the_grn_tab() throws InterruptedException {
	    waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_grn_tab()).click();

	}
	@Then("Clicking the create GRN button")
	public void clicking_the_create_grn_button() throws InterruptedException {
	    waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_create_grn_button()).click();

	}
/////////////////////waste management///////////////////
	
	@Then("Clicking the Waste Management tab")
	public void clicking_the_waste_management_tab() throws InterruptedException {
	    waitforclick(pages.getInventorymanagementpage().getInventory_management_waste_management()).click();

	}
	@Then("Clicking the create waste management button")
	public void clicking_the_create_waste_management_button() throws InterruptedException {
	    waitforclick(pages.getInventorymanagementpage().getInventory_management_waste_management_create_button()).click();

	}
	@Then("Clicking the Wastage location")
	public void clicking_the_wastage_location() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_select_location()).click();
		waitforclick(pages.getInventorymanagementpage().getInventory_management_purchase_order_select_location_chennai()).click();

	}
	@Then("Selecting the approver in waste management")
	public void selecting_the_approver_in_waste_management() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_waste_managemnet_select_approver()).click();
		waitforclick(pages.getInventorymanagementpage().getInventory_management_waste_managemnet_select_approver_select()).click();

	}
	@Then("Clicking the select variation in the waste management")
	public void clicking_the_select_variation_in_the_waste_management() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_waste_managemnet_select_variation()).click();

		
	}
	@Then("Selecting the variation in the waste management")
	public void selecting_the_variation_in_the_waste_management() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_waste_management_select_variation_input()).sendKeys("chicken biriyani full");
		waitforclick(findLocatorByXpath("//li[contains(text(),'chicken biriyani full')]")).click();
	}
	@Then("Entering the stock adjustment in the waste management")
	public void entering_the_stock_adjustment_in_the_waste_management() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_waste_managemnet_stock_adjustment_quantity()).sendKeys("1");

	}
	@Then("Selecting the stock adjustment reason in the waste management")
	public void selecting_the_stock_adjustment_reason_in_the_waste_management() throws InterruptedException {
		 pages.getInventorymanagementpage().selectByText("Loss",waitforclick(pages.getInventorymanagementpage().getInventory_management_waste_managemnet_stock_adjustment_reason()));
		 sleep(700);
	}
	@Then("Clicking the add button in the waste management")
	public void clicking_the_add_button_in_the_waste_management() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_waste_managemnet_add_button()).click();
		 sleep(700);
	}
	@Then("Clicking the save button in the waste management")
	public void clicking_the_save_button_in_the_waste_management() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_waste_managemnet_save_button()).click();
		sleep(1000);
		
	}
	@Then("Clicking the Complete button in the waste Management")
	public void clicking_the_complete_button_in_the_waste_management() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_waste_managemnet_complete_button()).click();

	}
//////////////////////////////////////////////////////
	////////preparation order/////////////////////
	
	@Then("Clicking the preparation order in the more actions")
	public void clicking_the_preparation_order_in_the_more_actions() throws InterruptedException {
		//waitforclick(pages.getInventorymanagementpage().getInventory_management_preparation_order()).click();
		waitforclick(pages.getInventorymanagementpage().getInventory_management_preparation_order()).click();
		switchToWindow(2);
		sleep(1000);
		
	}	


	@Then("Clicking the create preparation order button")
	public void clicking_the_create_preparation_order_button() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_preparation_create_preparation_order()).click();

	}
	@Then("Selecting the variation in the preparation order")
	public void selecting_the_variation_in_the_preparation_order() throws InterruptedException {
		
		waitforclick(pages.getInventorymanagementpage().getInventory_management_preparation_order_select_variation_input()).sendKeys("chicken biriyani full");
		waitforclick(findLocatorByXpath("//li[contains(text(),'chicken biriyani full')]")).click();
	}
	@Then("Entering the quantity in the preparation order")
	public void entering_the_quantity_in_the_preparation_order() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_preparation_order_quantity_input()).sendKeys("1");

	}
//////////////////inventory Audit//////////////////////
	@Then("Clicking the Inventory Audit in the inventory management")
	public void clicking_the_inventory_audit_in_the_inventory_management() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_inventory_audit()).click();

	}
	@Then("Clicking the create inventory audit button")
	public void clicking_the_create_inventory_audit_button() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_Audit_create_inventory_audit_button()).click();

	}
	@Then("Selecting the Auditor in inventory audit")
	public void selecting_the_auditor_in_inventory_audit() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_Audit_select_auditor()).click();
		waitforclick(pages.getInventorymanagementpage().getInventory_management_waste_managemnet_select_approver_select()).click();

		
	}
	@Then("Selecting the approver in the inventory audit")
	public void selecting_the_approver_in_the_inventory_audit() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_Audit_select_approver()).click();
		waitforclick(pages.getInventorymanagementpage().getInventory_management_waste_managemnet_select_approver_select()).click();

		
	}
	@Then("Clicking the add item in the inventory audit")
	public void clicking_the_add_item_in_the_inventory_audit() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_Audit_add_item_button()).click();

	}
	@Then("Entering the variation in the search field in the inventory audit")
	public void entering_the_variation_in_the_search_field_in_the_inventory_audit() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_Audit_variation_search_input()).sendKeys("chicken biriyani full");

		
	}
	@Then("Clicking the variation checkbox in the inventory audit")
	public void clicking_the_variation_checkbox_in_the_inventory_audit() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_Audit_variation_checkbox_select()).click();

		
	}
	@Then("Clicking the selected add item button in inventory audit")
	public void clicking_the_selected_add_item_button_in_inventory_audit() throws InterruptedException {
		sleep(800);
		waitforclick(pages.getInventorymanagementpage().getInventory_management_Audit_add_select_items()).click();

		
	}
	@Then("Clicking the count stock button in inventory audit")
	public void clicking_the_count_stock_button_in_inventory_audit() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_Audit_count_stock_button()).click();

		
	}
	@Then("Entering the Total physical stock in inventory audit")
	public void entering_the_total_physical_stock_in_inventory_audit() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_Audit_total_phyical_stock_input()).sendKeys("110");

	}
	@Then("Entering the expired stock in inventory audit")
	public void entering_the_expired_stock_in_inventory_audit() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_Audit_stock_expired()).sendKeys("1");

		
	}
	@Then("Entering the damage stock in inventory audit")
	public void entering_the_damage_stock_in_inventory_audit() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_Audit_stock_damaged()).sendKeys("1");

	}
	@Then("Clicking the save button in count stock inventory audit")
	public void clicking_the_save_button_in_count_stock_inventory_audit() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_Audit_count_stock_save_button()).click();

		
	}
	@Then("Clicking the send to approve count button in inventory audit")
	public void clicking_the_send_to_approve_count_button_in_inventory_audit() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_Audit_send_to_approve_count_button()).click();
		sleep(500);

		
	}
	@Then("Clicking the approve count stock in inventory")
	public void clicking_the_approve_count_stock_in_inventory() throws InterruptedException {
		Assert.assertTrue(waitforinvisible(By.xpath("//div/strong[text()='Success']")));
		sleep(1000);
		waitforclick(pages.getInventorymanagementpage().getInventory_management_Audit_approve_count_stock_button()).click();
		sleep(1000);
		
	}
	@Then("Tally the count stock in the inventory audit")
	public void tally_the_count_stock_in_the_inventory_audit() throws InterruptedException {
		 pages.getInventorymanagementpage().Entering_the_recount_the_stock_quantity();
		
	}
	@Then("Clicking the complete count stock button in inventory")
	public void clicking_the_complete_count_stock_button_in_inventory() throws InterruptedException {
		waitforclick(pages.getInventorymanagementpage().getInventory_management_Audit_complete_count_stock_button()).click();

	}


	//////////////////////////////////////////////////////

	@Then("clicking the item menu")
	public void clicking_the_item_menu() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getItemMenu()).click();
	}
	@Then("clicking the categories")
	public void clicking_the_categories() throws IOException, InterruptedException {
		scrollToTop();
		waitforclick(pages.getItemspage().getCategoriesBtn()).click();
	}
	@Then("clicking the create category")
	public void clicking_the_create_category() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getCreateCategoryBtn()).click();
		Thread.sleep(1000);
	}
	@Then("entering the category name")
	public void entering_the_category_name() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getCategoryName()).sendKeys(loadPropertyFile("categoryname"));
	}
	@Then("clicking the save button")
	public void clicking_the_save_button() throws IOException, InterruptedException {
		scrollDownJs(pages.getItemspage().getSaveBtn());
		waitforclick(pages.getItemspage().getSaveBtn()).click();
		//Assert.assertTrue(waitforinvisible(By.xpath("//div/strong[text()='Success']")));	
	}
	@Then("clicks the item save button")
	public void clicking_item_save_button() throws IOException, InterruptedException {
		scrollDownJs(pages.getItemspage().getSaveBtn());
		waitforclick(pages.getItemspage().getSaveBtn()).click();
		Assert.assertTrue(waitforinvisible(By.xpath("//div/p[text()='Item created successfully']")));	
	}
	@Then("check category is created")
	public void check_category_is_created() throws IOException {
		waitforXpath("//small[contains(text(),'Showing')]");
		Assert.assertEquals(waitforXpath("(//tbody//tr//td)[2]").getText(),(loadPropertyFile("categoryname")));	
	}
	@Then("clicking the brands")
	public void clicking_the_brands() throws IOException, InterruptedException {
		waitforpresence(pages.getItemspage().getBrandsBtn()).click();
	}
	@Then("clicking the create brand")
	public void clicking_the_create_brand() throws IOException, InterruptedException {
		pages.getItemspage().getCreateBrandBtn().click();
	}
	@Then("entering the brand name")
	public void entering_the_brand_name() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getBrandName()).sendKeys(loadPropertyFile("brandname"));
	}
	@Then("check brand is created")
	public void check_brand_is_created() throws IOException {
		waitforXpath("//small[contains(text(),'Showing')]");
		Assert.assertEquals(waitforXpath("(//tbody//tr//td)[2]").getText(),(loadPropertyFile("brandname")));	
	}
	@Then("clicking the discounts")
	public void clicking_the_discounts() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getDiscounts()).click();
	}
	@Then("clicking the create discount")
	public void clicking_the_create_discount() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getCreateDiscount()).click();
	}
	@Then("entering the discount name")
	public void entering_the_discount_name() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getDiscountName()).sendKeys("order level");
	}
	@Then("clicking the discount location")
	public void clicking_the_discount_location() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getDiscountLocation()).click();;
	}
	@Then("choosing the discount location")
	public void chossing_the_discount_location() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getDiscountLocationChoose()).click();;
	}
	@Then("choosing buy criteria as order")
	public void chossing_buy_criteria() throws IOException, InterruptedException {
		pages.getItemspage().selectByText("Order", waitforclick(pages.getItemspage().getBuyCriteria()));
		driver.findElement(By.xpath("(//div[text()='Buy Criteria'])[1]")).click();
	}
	@Then("choosing type as subtotal")
	public void chossing_type_as_subtotal() throws IOException, InterruptedException {
		pages.getItemspage().selectByText("Subtotal", waitforclick(pages.getItemspage().getBuySubtotal()));
	}
	@Then("entering the prerequisite value")
	public void entering_the_prerequisite_value() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getPrereqValue()).sendKeys("100");
	}
	@Then("choosing get criteria as subtotal")
	public void chossing_gets_criteria() throws IOException, InterruptedException {
		pages.getItemspage().selectByText("Subtotal", waitforclick(pages.getItemspage().getGetCriteria()));
		waitforXpath("(//div[text()='Get Criteria'])[1]").click();
	}
	@Then("choosing type as fixed")
	public void chossing_type_as_fixed() throws IOException, InterruptedException {
		pages.getItemspage().selectByText("Fixed", waitforclick(pages.getItemspage().getGetDiscountType()));
	}
	@Then("entering the discount value")
	public void entering_the_discount_value() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getDiscountValue()).sendKeys("10");
	}
	@Then("clicking the discount save button")
	public void clicking_the_discount_save_button() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getDiscountSaveBtn()).click();
		Assert.assertTrue(waitforinvisible(By.xpath("//div/strong[text()='Success']")));	
	}
	@Then("clicking the taxes")
	public void clicking_the_taxes() throws IOException, InterruptedException {
		waitforpresence(pages.getItemspage().getTaxesBtn()).click();
	}
	@Then("clicking the create taxes")
	public void clicking_the_create_taxes() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getCreateTaxBtn()).click();
	}
	@Then("entering the tax name")
	public void entering_the_tax_name() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getTaxName()).sendKeys(loadPropertyFile("exctaxname"));
	}
	@Then("entering the tax percentage")
	public void entering_the_tax_percentage() throws IOException, InterruptedException {
		pages.getItemspage().getTaxRate().sendKeys(loadPropertyFile("exctaxrate"));
	}
	@Then("selecting the tax_type")
	public void selecting_the_tax_type() throws IOException, InterruptedException {
		pages.getItemspage().getTaxType().click();
		pages.getItemspage().selectByText("Add Tax to Item Price", pages.getItemspage().getTaxType());
	}
	@Then("selecting the save2 button")
	public void selecting_the_save2_button() throws IOException, InterruptedException {
		pages.getItemspage().getTaxSaveBtn().click();

	}
	@Then("check tax is created")
	public void check_exclusive_tax_is_created() throws IOException {
		waitforXpath("//small[contains(text(),'Showing')]");
		Assert.assertEquals(waitforXpath("(//tbody//tr//td)[1]").getText(),(loadPropertyFile("exctaxname")));
		Assert.assertEquals(waitforXpath("(//tbody//tr//td)[3]").getText(),(loadPropertyFile("exctaxrate")));	
	}
	@Then("clicking the charges")
	public void clicking_the_charges() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getChargesBtn()).click();
	}
	@Then("clicking the create charges")
	public void clicking_the_create_charges() throws IOException, InterruptedException {
		pages.getItemspage().getCreateChargeBtn().click();
		Thread.sleep(1000);
	}
	@Then("entering the charge name")
	public void entering_the_charge_name() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getChargeName()).sendKeys("delivery charge");
	}
	@Then("selecting the charge category")
	public void selecting_the_charge_category() throws IOException, InterruptedException {
		pages.getItemspage().getChargeCategory().click();
		waitforclick(pages.getItemspage().getDeliveryCharge()).click();
		pages.getItemspage().selectByText("Fixed", pages.getItemspage().getChargeType());
	}
	@Then("entering the charge value")
	public void entering_the_charge_value() throws IOException, InterruptedException {
		pages.getItemspage().getChargeValue().sendKeys("10");
	}
	@Then("clicking the is online")
	public void clicking_the_is_online() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getIsOnline()).click();
	}
	@Then("clicking the is apply automatically")
	public void clicking_the_is_apply_automatically() throws IOException, InterruptedException {
		pages.getItemspage().getApplyAutomatically().click();
	}
	@Then("entering the base distance")
	public void entering_the_base_distance() throws IOException, InterruptedException {
		pages.getItemspage().getBaseDistance().sendKeys("5");
	}
	@Then("entering the additional cost")
	public void entering_the_additional_cost() throws IOException, InterruptedException {
		pages.getItemspage().getAdditionalCostPerKm().sendKeys("2");
	}
	@Then("clicking the add button")
	public void clicking_the_add_button() throws IOException, InterruptedException {
		pages.getItemspage().getAddBtn().click();
		waitforXpath("//label[text()=' Additional Conditions ']").click();
		waitforXpath("//div[contains(text(), 'The cost per')]");
		scrollToBottom();
	}
	@Then("check deliverycharge created")
	public void check_deliverycharge_created() throws IOException {
		waitforXpath("//small[contains(text(),'Showing')]");
		Assert.assertEquals(waitforXpath("(//tbody//tr//td)[1]").getText(),"delivery charge");	
		Assert.assertEquals(waitforXpath("(//tbody//tr//td)[2]").getText(),"10");	
		Assert.assertEquals(waitforXpath("(//tbody//tr//td)[3]").getText(),"FIXED");	
	}
	@Then("clicking the pcategories")
	public void clicking_the_pcategories() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getPCategoriesBtn()).click();
	}
	@Then("clicking the create pcategory")
	public void clicking_the_create_pcategory() throws IOException, InterruptedException {
		pages.getItemspage().getCreatePCategoryBtn().click();
	}
	@Then("selecting the pcategorytype")
	public void selecting_the_pcategorytype() throws IOException, InterruptedException {
		pages.getItemspage().selectByText("Base Price",pages.getItemspage().getCreatePCategoryTypeBtn());
	}
	@Then("entering the pCategory name")
	public void entering_the_pCategory_name() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getPCategoryName()).sendKeys("regression price category");
		driver.findElement(By.xpath("(//div/label[text()='Price Category Apply ON'])[1]")).click();
		
	}
	@Then("selecting the pCategory value type")
	public void selecting_the_pCategory_value_type() throws IOException, InterruptedException {
		pages.getItemspage().selectByText("Fixed",pages.getItemspage().getPCategoryValueType());	
	}
	@Then("entering the pCategory value")
	public void entering_the_pCategory_value() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getPCategoryValue()).sendKeys("12");	
	}
	@Then("check price category is created")
	public void check_pCategory_is_created() throws IOException {
		waitforXpath("//small[contains(text(),'Showing')]");
		Assert.assertEquals(waitforXpath("(//tbody//tr[5]//td)[1]").getText(),"regression price category");
		Assert.assertEquals(waitforXpath("(//tbody//tr[5]//td)[2]").getText(),"fixed");	
		Assert.assertEquals(waitforXpath("(//tbody//tr[5]//td)[3]").getText(),"12");		
	}
	@Then("clicking the Attributes btn")
	public void clicking_the_Attributes_btn() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getAttributesBtn()).click();
	}
	@Then("clicking the Create attribute btn")
	public void clicking_the_Create_attribute_btn() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getCreateAttributeBtn()).click();
	}
	@Then("clicking the Select attribute btn")
	public void clicking_the_Select_attribute_btn() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getSelectAttributeBtn()).click();
	}
	@Then("entering the attribute name")
	public void enstering_the_attribute_name() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getSearchAttribute()).click();
		waitforclick(pages.getItemspage().getWeightAttribute()).click();
	}
	@Then("entering the attribute value")
	public void enstering_the_attribute_value() throws IOException, InterruptedException {
		pages.getItemspage().getAttributeValue().sendKeys("1");
	}
	@Then("check attribute is created")
	public void check_attribute_is_created() throws IOException {
		waitforXpath("//small[contains(text(),'Showing')]");
		Assert.assertEquals(waitforXpath("(//tbody//tr//td)[1]").getText().trim(),"Weight");
		Assert.assertEquals(waitforXpath("(//tbody//tr//td)[2]").getText(),"1");	
	}
	@Then("clicking the item library")
	public void clicking_item_library() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getItemLibrary()).click();
	}
	@Then("clicking the Create item")
	public void clicking_the_Create_item() throws IOException, InterruptedException {
		pages.getItemspage().getCreateItem().click();
	}
	@Then("entering the Item_name")
	public void enstering_the_Item_name() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getItemName()).sendKeys("chicken biriyani");
	}
	@Then("selecting the category")
	public void selecting_the_category() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getSelectCategoryBtn()).click();
		waitforclick(waitforXpath("//ul//li[text()='"+loadPropertyFile("categoryname")+"']")).click();		
	}
	@Then("selecting the brand")
	public void selecting_the_brand() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getSelectBrandBtn()).click();
		waitforclick(waitforXpath("//li[text()='"+loadPropertyFile("brandname")+"']")).click();		
	}
	@Then("check item is created")
	public void check_item_is_created() {
		waitforXpath("//b[@class='text-capitalize']");
		Assert.assertEquals(waitforXpath("//b[@class='text-capitalize']").getText().trim().toLowerCase(), "chicken biriyani");
	}
	@Then("clicking On Add Variation")
	public void clicking_On_Add_Variation() {
		scrollToTop();
		waitforclick(pages.getItemspage().getAddVariation()).click();	
	}
	@Then("entering Variation Name")
	public void entering_Variation_Name() throws InterruptedException {
		waitforclick(pages.getItemspage().getVariationName()).sendKeys("chicken biriyani full");	
	}
	@Then("selecting VariationType")
	public void selecting_VariationType() {
		pages.getItemspage().selectByText("Sale",pages.getItemspage().getVariationType());
	}
	@Then("selecting UomType")
	public void selecting_UomType() throws IOException, InterruptedException {
		pages.getItemspage().getUomType().click();
		try{
			waitforclick(pages.getItemspage().getWeightUom()).click();
		}catch (Exception e) {
			pages.getItemspage().getUomType().click();
			waitforclick(pages.getItemspage().getWeightUom()).click();
			}		
	}
	
	@Then("selecting recipe UomType")
	public void selecting_recipe_UomType() throws IOException, InterruptedException {
		pages.getItemspage().getUomType().click();
		try{
			waitforclick(pages.getItemspage().getWeightUom()).click();
		}catch (Exception e) {
			pages.getItemspage().getUomType().click();
			waitforclick(pages.getItemspage().getWeightUom()).click();
			}		
	}
	@Then("entering sale Sku")
	public void entering_Sku() {
		pages.getItemspage().getSku().clear();
		pages.getItemspage().getSku().sendKeys("1");;
	}
	@Then("selecting FoodType")
	public void selecting_FoodType() {
		pages.getItemspage().selectByText("Veg",pages.getItemspage().getFoodType());
	}
	@Then("clicking On Submit")
	public void clicking_On_Submit() {
		pages.getItemspage().getSubmit().click();
	}
	@Then("clicking On AddInventory")
	public void clicking_On_AddInventory() throws InterruptedException {
		sleep(1000);
		scrollDownJs(pages.getItemspage().getAddInventory());
		waitforclick(pages.getItemspage().getAddInventory()).click();
	}
	@Then("selecting pricingtype")
	public void selecting_pricingtype() {
		pages.getItemspage().selectByText("Multi",waitforclick(pages.getItemspage().getPricingType()));
	}
	@Then("entering BuyingPrice")
	public void entering_BuyingPrice() {
		pages.getItemspage().getBuyingPrice().sendKeys("100");;
	}
	@Then("entering Mrp")
	public void entering_Mrp() {
		pages.getItemspage().getMrp().sendKeys("300");;
	}
	@Then("entering SellingPrice")
	public void entering_SellingPrice() {
		pages.getItemspage().getSellingPrice().sendKeys("200");
	}
	@Then("selecting SellingTax")
	public void selecting_SellingTax() throws InterruptedException, IOException {
		pages.getItemspage().getSellingTax().click();
		pages.getItemspage().waitforXpath("//ul[@aria-multiselectable='true']//li[text()='"+ loadPropertyFile("exctaxname") + "']").click();
	}
	@Then("selecting BuyingTax")
	public void selecting_BuyingTax() throws IOException, InterruptedException {
		pages.getItemspage().getBuyingTax().click();
		pages.getItemspage().waitforXpath("//ul[@aria-multiselectable='true']//li[text()='"+ loadPropertyFile("exctaxname") + "']").click();
	}
	@Then("selecting price category")
	public void selecting_price_category() {
		scrollDownJs(pages.getItemspage().getStock());	
		pages.getItemspage().getPCategoryChoose().click();
		waitforXpath("//ul/li[text()='regression price category']").click();
	}
	@Then("adding the price category")
	public void adding_the_price_category() throws InterruptedException {
		waitforclick(pages.getItemspage().getPCategoryAdd()).click();	
	}
	@Then("entering StockValue")
	public void entering_StockValue() {
		pages.getItemspage().getStock().sendKeys("100");
	}
	@Then("entering LowStockValue")
	public void entering_LowStockValue() {
		pages.getItemspage().getLowStock().sendKeys("0");
	}
	@Then("clicking OnlineInventory")
	public void clicking_OnlineInventory() {
		pages.getItemspage().getTrackOnline().click();
	}
	@Then("clicking the variation save button")
	public void clicking_the_variation_save_button() throws InterruptedException {
		scrollDownJs(pages.getItemspage().getSaveBtn());
		waitforclick(pages.getItemspage().getSaveBtn()).click();
		Thread.sleep(1000);
	}
	@Then("clicking yes")
	public void clicking_yes() throws InterruptedException {
		waitforclick(pages.getItemspage().getYesButton()).click();
	}
	@Then("clicking Ok")
	public void clicking_Ok() throws InterruptedException  {
		waitforclick(pages.getItemspage().getOkButton()).click();
	}
	@Then("check variation is created")
	public void check_variation_is_created() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals(waitforXpath("//div/h4/b[@id='variation_detail']").getText().toLowerCase().trim(),"chicken biriyani full");
	}
	@Then("check inventory is created")
	public void check_inventory_is_created() throws InterruptedException {
		Thread.sleep(2000);
		scrollDownJs(pages.getItemspage().getAddVariation());//tr/th[text()='Unit Selling Price']
		wait.until(ExpectedConditions.textToBePresentInElement(waitforXpath("//tr/th[text()='Unit Selling Price']"),"Unit Selling Price"));
	}
	@Then("click on attribute")
	public void click_on_attribute() {
		pages.getItemspage().getMapAttributeBtn().click();
	}
	@Then("click on create attribute")
	public void click_on_create_attribute() throws InterruptedException  {
		waitforclick(pages.getItemspage().getAddAttributeBtn()).click();
	}
	@Then("click on select attribute")
	public void click_on_select_attribute() throws InterruptedException  {
		waitforclick(pages.getItemspage().getSelectAttributeBtn()).click();
	}
	@Then("choose attribute")
	public void choose_attribute() throws InterruptedException  {
		waitforclick(pages.getItemspage().getWeightAttribute()).click();		
	}
	@Then("choose attribute value")
	public void choose_attribute_value() throws InterruptedException  {
		waitforclick(pages.getItemspage().getSelectAttributeValue()).click();
		waitforclick(pages.getItemspage().getChooseAttributeValue()).click();		
	}
	@Then("save attribute value")
	public void save_attribute_value() throws InterruptedException  {
		waitforclick(pages.getItemspage().getSaveAttributeValue()).click();		
	}
	@Given ("clicking item edit")
	public void clicking_item_edit() throws InterruptedException  {
		scrollToTop();
		waitforclick(pages.getItemspage().getItemEditBtn()).click();		
	}
	@Given ("changing item name")
	public void changing_item_name() throws InterruptedException {
		waitforclick(pages.getItemspage().getItemName()).clear();
		waitforclick(pages.getItemspage().getItemName()).sendKeys("chicken biriyani new");
		waitforXpath("//h5[text()='Edit Item']").click();
		scrollToBottom();
	}
	@Then("clicking the item save button")
	public void clicking_the_item_save_button() throws IOException, InterruptedException {
		try{waitforclick(pages.getItemspage().getSaveAttributeValue()).click();}catch (Exception e) {}
	}
	@Then("refreshing the page")
	public void refreshing_the_page() throws IOException, InterruptedException {
		Thread.sleep(1000);
		refresh();
	}
	@Then("clicking the category edit button")
	public void clicking_the_category_edit_button() throws IOException {
		pages.getItemspage().getCategoryEdit().click();		
	}
	@Then("changing the category name")
	public void changing_the_category_name() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getCategoryName()).clear();
		pages.getItemspage().getCategoryName().sendKeys(loadPropertyFile("categoryname")+" new");			
	}
	@Then("clicking the brand edit button")
	public void clicking_the_brand_edit_button() throws IOException {
		pages.getItemspage().getBrandEdit().click();		
	}
	@Then("changing the brand name")
	public void changing_the_brand_name() throws IOException, InterruptedException {
		waitforclick(pages.getItemspage().getBrandName()).clear();
		pages.getItemspage().getBrandName().sendKeys(loadPropertyFile("brandname")+" new");		
	}
	@Then("clicking the taxes edit button")
	public void clicking_the_taxes_edit_button() {
		pages.getItemspage().getTaxEdit().click();
	}
	@Then("changing the tax detail")
	public void changing_the_taxes_detail() throws IOException, InterruptedException {	
		pages.getItemspage().changing_the_taxes_detail();
	}
	@Then("clicking the pcategory edit button")
	public void clicking_the_pcategory_edit_button() {
	    pages.getItemspage().getPCategoryEdit().click();
	}
	@Then("changing the pcategory detail")
	public void changing_the_pcategory_detail() throws IOException, InterruptedException {
		
		pages.getItemspage().changing_the_pcategory_detail();
	}
	@Then("clicking the pcategory save button")
	public void clicking_the_pcategory_save_button() throws InterruptedException {
	    pages.getItemspage().getPCategorySaveBtn().click();
		Assert.assertTrue(waitforinvisible(By.xpath("//div/strong[text()='Success']")));	
	}
	@Then("clicking the Attributes edit button")
	public void clicking_the_Attributes_edit_button() {
		waitforclick(pages.getItemspage().getAttributeEdit()).click();
	}
	@Then ("changing the Attributes detail")
	public void changing_the_Attributes_detail() throws InterruptedException  {
		waitforclick(pages.getItemspage().getAttributeEditValue()).clear();
	    pages.getItemspage().getAttributeEditValue().sendKeys("1.25");
	}
	@Then("clicking the item view")
	public void clicking_the_item_view() throws InterruptedException {
		String parentid=parentwindowid();
		waitforclick(pages.getItemspage().getItemView()).click();
		movetonewtab(parentid);
	}
	@Then("check item name changed")
	public void check_item_name_changed() {
		Assert.assertEquals(waitforXpath("//b[@class='text-capitalize']").getText().toLowerCase().trim(),"chicken biriyani new");
	}
	@Then("check category name changed")
	public void check_category_name_changed() throws IOException {
		Assert.assertEquals(waitforXpath("//div[@class='card-body']//div[1]//div[1]//div[1]//div[2]/p").getText().trim(),loadPropertyFile("categoryname")+" new");
	}
	@Then("check brand name changed")
	public void check_brand_name_changed() throws IOException {
		Assert.assertEquals(waitforXpath("//body//div[@class='container-fluid h-100']//div[@class='col']//div[@class='col']//div[2]//div[1]//div[1]//div[2]/p").getText().trim(),loadPropertyFile("brandname")+" new");
	}
	@Then("check tax details are changed")
	public void check_tax_details_are_changed() throws IOException, InterruptedException {
		try{waitforclick( pages.getItemspage().getInventoryEdit()).click();}catch(Exception e) {}
		Thread.sleep(1000);
		waitforpresence("//div//h5[text()='Edit Inventory']");
		Assert.assertTrue(waitforXpath("//label[text()='Selling Taxes']/following-sibling::div//li[text()='cgst inclusive 10%']").getText().trim().contains(loadPropertyFile("inctaxname")));
		Assert.assertTrue(waitforXpath("//label[text()='Buying Taxes']/following-sibling::div//li[text()='cgst inclusive 10%']").getText().trim().contains(loadPropertyFile("inctaxname")));
	}
	@Then("check pricecategory details are changed")
	public void check_pricecategory_details_are_changed() throws IOException, InterruptedException {
	   scrollDownJs(waitforXpath("//div/p[text()='Item Pricing']"));
	   Assert.assertEquals(waitforXpath("//tr[@class='js_item-price-category-row']//td/div/h6").getText().trim(),"regression price category new");
	   Assert.assertEquals(waitforXpath("//input[@name='price_value']").getAttribute("value").trim(), "225");
	   scrollDownJs(waitforXpath("//div//button[text()='Close']")).click();
	}
	@Then("check attribute details are changed")
	public void check_attribute_details_are_changed() throws InterruptedException {
		waitforclick( pages.getItemspage().getMapAttributeBtn()).click();
		Assert.assertEquals(waitforXpath("//td[text()='Weight']/following::td[1]").getText().trim(), "1.25");
	}
	@Then("entering modifier Variation Name")
	public void entering_modifier_variation_name() throws InterruptedException {
		waitforclick(pages.getItemspage().getVariationName()).sendKeys("modifier raitha");
	}
	@Then("selecting modifier VariationType")
	public void selecting_modifier_variation_type() {
		pages.getItemspage().selectByText("Modifier",pages.getItemspage().getVariationType());
	}
	@Then("entering modifier Sku")
	public void entering_modifier_sku() {
		pages.getItemspage().getSku().clear();
		pages.getItemspage().getSku().sendKeys("2");;
	}
	@Then("selecting modifier FoodType")
	public void selecting_modifier_food_type() {
		pages.getItemspage().selectByText("Veg",pages.getItemspage().getFoodType());
	}
	@Then("clicking On modifier Submit")
	public void clicking_on_modifier_submit() throws InterruptedException {
		waitforclick(pages.getItemspage().getSubmit()).click();
	}
	@Then("click on modifier link")
	public void click_on_modifier_link() throws InterruptedException {
		scrollDownJs(waitforXpath("//tr/th[text()='Unit Selling Price']"));
		try{waitforclick(pages.getItemspage().getModifierLink()).click();}catch ( Exception e) {}
	}
	@Then("entering ingredient Variation Name")
	public void entering_ingredient_variation_name() {
		waitforclick(pages.getItemspage().getVariationName()).sendKeys("oil ingredient");
	}
	@Then("selecting ingredient VariationType")
	public void selecting_ingredient_variation_type() {
		pages.getItemspage().selectByText("Ingredient",pages.getItemspage().getVariationType());

	}
	@Then("entering ingredient Sku")
	public void entering_ingredient_sku() {
		pages.getItemspage().getSku().clear();
		pages.getItemspage().getSku().sendKeys("3");;
	}
	@Then("selecting ingredient FoodType")
	public void selecting_ingredient_food_type() {
		pages.getItemspage().selectByText("Veg",pages.getItemspage().getFoodType());

	}
	@Then("clicking On ingredient Submit")
	public void clicking_on_ingredient_submit() {
		waitforclick(pages.getItemspage().getSubmit()).click();

	}
	@Then("click on ingredient link")
	public void click_on_ingredient_link() {
		scrollDownJs(waitforXpath("//tr/th[text()='Unit Selling Price']"));
		try{waitforclick(pages.getItemspage().getIngredientLink()).click();}catch ( Exception e) {}
	}
	@Then("entering recipe Variation Name")
	public void entering_recipe_variation_name() {
		waitforclick(pages.getItemspage().getVariationName()).sendKeys("ginger garlic paste");

	}
	@Then("selecting recipe VariationType")
	public void selecting_recipe_variation_type() {
		pages.getItemspage().selectByText("Recipe",pages.getItemspage().getVariationType());

	}
	@Then("entering recipe Sku")
	public void entering_recipe_sku() {
		pages.getItemspage().getSku().clear();
		pages.getItemspage().getSku().sendKeys("4");;
	}
	@Then("selecting recipe FoodType")
	public void selecting_recipe_food_type() {
		pages.getItemspage().selectByText("Veg",pages.getItemspage().getFoodType());

	}
	@Then("clicking On recipe Submit")
	public void clicking_on_recipe_submit() {
		waitforclick(pages.getItemspage().getSubmit()).click();

	}
	@Then("click on recipe link")
	public void click_on_recipe_link() {
		scrollDownJs(waitforXpath("//tr/th[text()='Unit Selling Price']"));
		try{waitforclick(pages.getItemspage().getRecipeLink()).click();}catch ( Exception e) {}
	}
	@Then("selecting ingredient mapping type")
	public void selecting_ingredient_mapping_type() {
		pages.getItemspage().selectByText("Ingredient",pages.getItemspage().getIgredientRecipeType());

	}
	@Then("selecting recipe mapping type")
	public void selecting_recipe_mapping_type() {
		pages.getItemspage().selectByText("Recipe",pages.getItemspage().getIgredientRecipeType());

	}
	@Then("click on main item")
	public void click_on_main_item() {
		waitforclick(pages.getItemspage().getMainItemLink()).click();
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	}
	@Then("click on add ingredientrecipe link")
	public void click_on_add_ingredientrecipe_link() {
		waitforclick(pages.getItemspage().getIngredientRecipeLink()).click();

	}
	@Then("click on add ingredient recipe button")
	public void click_on_add_ingredient_recipe_button() {
		waitforclick(pages.getItemspage().getAddIngredientRecipeLink()).click();

	}
	@Then("click on add ingredient recipe button2")
	public void click_on_add_ingredient_recipe_button2() {
		waitforclick(pages.getItemspage().getAddIngredientRecipeLink2()).click();

	}
	@Then("selecting ingredient type")
	public void selecting_ingredient_type() {
		pages.getItemspage().selectByText("Ingredient",pages.getItemspage().getIgredientRecipeType());

	}
	@Then("selecting ingredient")
	public void selecting_ingredient() {
		waitforclick(pages.getItemspage().getSelectIgredient()).click();
		waitforclick(pages.getItemspage().getChooseIgredient()).click();

	}
	@Then("entering value")
	public void entering_value() {
		waitforclick(pages.getItemspage().getIgredientValue()).sendKeys("100");

	}
	@Then("choosing uom of ingredient")
	public void choosing_uom_of_ingredient() {
		pages.getItemspage().selectByText("Milliliter (ml)",pages.getItemspage().getIngredienRecipetUomType());

	}
	
	@Then("selecting recipe type")
	public void selecting_recipe_type() {
		pages.getItemspage().selectByText("Recipe",pages.getItemspage().getIgredientRecipeType());

	}
	@Then("selecting recipe")
	public void selecting_recipe() {
		waitforclick(pages.getItemspage().getSelectIgredient()).click();
		waitforclick(pages.getItemspage().getChooseRecipe()).click();
	}
	@Then("choosing uom of recipe")
	public void choosing_uom_of_recipe() {
		pages.getItemspage().selectByText("Gram (g)",pages.getItemspage().getIngredienRecipetUomType());

	}
	
	@Then("click on add modifier link")
	public void click_on_add_modifier_link() {
		waitforclick(pages.getItemspage().getModifierMapLink()).click();
	}
	@Then("click on add modifier button")
	public void click_on_add_modifier_button() {
		waitforclick(pages.getItemspage().getAddModifier()).click();
	}
	@Then("entering modifier set name")
	public void entering_modifier_set_name() {
		waitforclick(pages.getItemspage().getModifierSetName()).sendKeys("Test");
	}
	@Then("click on modifier options")
	public void click_on_modifier_options() {
		waitforclick(pages.getItemspage().getModifierOptions()).click();
	}
	@Then("choose modifier options")
	public void choose_modifier_options() {
		waitforclick(pages.getItemspage().getChooseModifierOptions()).click();
	}
	@Then("entering the position")
	public void entering_the_position() {
		waitforclick(pages.getItemspage().getModifierPosition()).sendKeys("1");
	}
	@Then("click on is multi choice")
	public void click_on_is_multi_choice() {
		waitforclick(pages.getItemspage().getIsMultiChoice()).click();
	}
	@Then("click on default select first option")
	public void click_on_default_select_first_option() {
		waitforclick(pages.getItemspage().getDefaultSelectFirstOption()).click();
	}
	@Then("entering minimum options")
	public void entering_minimum_options() {
		waitforclick(pages.getItemspage().getMinimumOptions()).sendKeys("1");
	}
	@Then("entering maximum options")
	public void entering_maximum_options() {
		waitforclick(pages.getItemspage().getMaximumOptions()).sendKeys("1");
	}
	
	
	//account and settings
	@Then("Clicking the account and settings menu")
	public void clicking_the_account_and_settings_menu() {
	    waitforclick(pages.getAccountsettingspage().getAccount_settings_menu_tab()).click();
		
	}
	@Then("Clicking the business profile tab")
	public void clicking_the_business_profile_tab() {
	    waitforclick(pages.getAccountsettingspage().getAccount_settings_settings_tab()).click();

		
	}
	@Then("Entering the business location address one")
	public void entering_the_business_location_address_one() throws IOException {
	    waitforclick(pages.getAccountsettingspage().getBusiness_profile_address_line_1()).sendKeys(loadPropertyFile("addressline1"));

		
	}
	@Then("Entering the business location address two")
	public void entering_the_business_location_address_two() throws IOException {
	    waitforclick(pages.getAccountsettingspage().getBusiness_profile_address_line_2()).sendKeys(loadPropertyFile("addressline2"));

		
	}
	
	
	@Then("entering the business location postal code")
	public void entering_the_business_location_postal_code() throws IOException {
	    waitforclick(pages.getAccountsettingspage().getBusiness_profile_postal_code()).sendKeys(loadPropertyFile("postalcode"));

	}
	@Then("entering the business location whatsapp number")
	public void entering_the_business_location_whatsapp_number() throws IOException {
	    waitforclick(pages.getAccountsettingspage().getBusiness_profile_whatsapp_number()).sendKeys(loadPropertyFile("validmobilenumber"));

	}
	@Then("entering the opening time in business profile")
	public void entering_the_opening_time_in_business_profile() {
	    waitforclick(pages.getAccountsettingspage().getBusiness_profile_opening_time()).click();
	    waitforclick(pages.getAccountsettingspage().getBusiness_profile_opening_time_appy_button()).click();

	}
	@Then("entering the closing time in business profile")
	public void entering_the_closing_time_in_business_profile() {
		waitforclick(pages.getAccountsettingspage().getBusiness_profile_closing_time()).click();
	    waitforclick(pages.getAccountsettingspage().getBusiness_profile_closing_time_apply_button()).click();
	}
	@Then("Entering the currency symbol in the business profile")
	public void entering_the_currency_symbol_in_the_business_profile() {
		 pages.getAccountsettingspage().selectByText("INR",waitforclick(pages.getAccountsettingspage().getBusiness_profile_current_code()));

	}
	@Then("Entering the bank name in business profile")
	public void entering_the_bank_name_in_business_profile() {
	    waitforclick(pages.getAccountsettingspage().getBusiness_profile_bank_name()).sendKeys("Canara Bank");

	}
	@Then("Entering the account number in business profile")
	public void entering_the_account_number_in_business_profile() {
	    waitforclick(pages.getAccountsettingspage().getBusiness_profile_account_number()).sendKeys("12345678");

	}
	@Then("Entering the bank code label in the business profile")
	public void entering_the_bank_code_label_in_the_business_profile() {
	    waitforclick(pages.getAccountsettingspage().getBusiness_profile_bank_code_label()).sendKeys("bank label");

	}
	@Then("Entering the bank code in the business profile")
	public void entering_the_bank_code_in_the_business_profile() {
	    waitforclick(pages.getAccountsettingspage().getBusiness_profile_bank_code()).sendKeys("bank code");

	}
	@Then("Entering the company registration number in the business profile")
	public void entering_the_company_registration_number_in_the_business_profile() {
	    waitforclick(pages.getAccountsettingspage().getBusiness_profile_company_registraion_number()).sendKeys("98989898989");

	}
	@Then("clicking the save button in the business profile")
	public void clicking_the_save_button_in_the_business_profile() throws InterruptedException {
	    waitforclick(pages.getAccountsettingspage().getBusiness_profile_save_button()).click();
	    sleep(800);
	}
	@Then("Check the business profile is Saved")
	public void check_the_business_profile_is_saved() {
	    Assert.assertTrue(waitforinvisible("//div/strong[text()='Success']"));
	   // scrollToTop();
	    
	}

	/////payment methods ///////////
	@Then("Clicking the payments methods Tab")
	public void clicking_the_payments_methods_tab() {
		//waitforXpath("(//*[contains(text(),'Payment Methods')])[1]");
	    waitforclick(pages.getAccountsettingspage().getSettings_payment_methods_tab()).click();

	    }
	@Then("Click the Add payment method button in payment methods")
	public void click_the_add_payment_method_button_in_payment_methods() {
	    waitforclick(pages.getAccountsettingspage().getSettings_payment_methods_add_payment_button()).click();

	}
	@Then("Entering the payment label Name")
	public void entering_the_payment_label_name() {
	    waitforclick(pages.getAccountsettingspage().getSettings_payment_methods_label_name()).sendKeys("Test payment");

	}
	@Then("Clicking the payment methods")
	public void clicking_the_payment_methods() {
	    waitforclick(pages.getAccountsettingspage().getSettings_payment_method_select_payment_methods_dropdown()).click();

	}
	@Then("Selecting the payment methods")
	public void selecting_the_payment_methods() {
		waitforclick(pages.getAccountsettingspage().getSettings_payment_methods_select_payment_methods_input()).sendKeys("UPI");
		waitforclick(findLocatorByXpath("//li[contains(text(),'UPI')]")).click();
	}
	@Then("Entering the positon of payment methods")
	public void entering_the_positon_of_payment_methods() {
		waitforclick(pages.getAccountsettingspage().getSettings_payment_methods_position_field()).sendKeys("0");

	}
	@Then("Selcting the Pos platforms in payment methods")
	public void selcting_the_pos_platforms_in_payment_methods() {
		waitforclick(pages.getAccountsettingspage().getSettings_payment_methods_select_merchant_platforms_dropdown()).click();
		waitforclick(findLocatorByXpath("//li[contains(text(),'Billing')]")).click();
	}
	@Then("enable the checkbox in the default payment methods reports")
	public void enable_the_checkbox_in_the_default_payment_methods_reports() {
		waitforclick(pages.getAccountsettingspage().getSettings_payment_methods_check_box()).click();

	}
	@Then("Clicking the save button in the payment methods")
	public void clicking_the_save_button_in_the_payment_methods() throws InterruptedException {
		waitforclick(pages.getAccountsettingspage().getSettings_payment_methods_save_button()).click();
		sleep(800);
		scrollToTop();
		
	}
	@Then("Check the success message is created.")
	public void check_the_success_message_is_created() {
	    Assert.assertTrue(waitforinvisible("//div/strong[text()='Success']"));

	}

	//unit of measurements (UOM)
	@Then("Clicking the UOM tab")
	public void clicking_the_uom_tab() {
	    waitforclick(pages.getAccountsettingspage().getSettings_UOM_tab()).click();

	}
	@Then("Clicking the create UOM button")
	public void clicking_the_create_uom_button() {
	    waitforclick(pages.getAccountsettingspage().getSettings_UOM_create_UOM_button()).click();

	}
	@Then("Entering the UOM name")
	public void entering_the_uom_name() {
	    waitforclick(pages.getAccountsettingspage().getSettings_UOM_name()).sendKeys("Pieces");

	}
	@Then("selecting the UOM type")
	public void selecting_the_uom_type() {
		waitforclick(pages.getAccountsettingspage().getSettings_UOM_select_UOM_type()).click();
		waitforclick(findLocatorByXpath("//li[contains(text(),'count')]")).click();
	}
	@Then("clicking the checkbox in the Is UOM attribute")
	public void clicking_the_checkbox_in_the_is_uom_attribute() {
		waitforclick(pages.getAccountsettingspage().getSettings_UOM_attribute_checkbox()).click();

	}
	@Then("Entering the integer place unit")
	public void entering_the_integer_place_unit() {
		waitforclick(pages.getAccountsettingspage().getSettings_UOM_integer_unit()).sendKeys("Pieces");

	}
	@Then("Entering the decimal place unit")
	public void entering_the_decimal_place_unit() {
		waitforclick(pages.getAccountsettingspage().getSettings_UOM_decimal_unit()).sendKeys("gram");

	}

	//item tag///////
	@Then("Clicking the item tag menu")
	public void clicking_the_item_tag_menu() {
	    waitforclick(pages.getAccountsettingspage().getSettings_item_tag_menu()).click();
	}
	@Then("Clicking the item tag create button")
	public void clicking_the_item_tag_create_button() {
	    waitforclick(pages.getAccountsettingspage().getSettings_item_tag_create_button()).click();

	}
	@Then("Entering the name for item tag")
	public void entering_the_name_for_item_tag() {
	    waitforclick(pages.getAccountsettingspage().getSettings_item_tag_name()).sendKeys("Test item tag");

	}
	@Then("Selecting the category for item tag")
	public void selecting_the_category_for_item_tag() {
	    waitforclick(pages.getAccountsettingspage().getSettings_item_tag_select_category()).click();
		waitforclick(findLocatorByXpath("//li[contains(text(),'Custom')]")).click();
	}
	
	//quotation//
	@Then("Clicking the Sales menu")
	public void clicking_the_sales_menu() {
	    waitforclick(pages.getSalespage().getSales_menu()).click();
	}
	@Then("Clicking the Quotation tab")
	public void clicking_the_quotation_tab() {
	    waitforclick(pages.getSalespage().getSales_quotation_tab()).click();

	}
	@Then("clicking the new quotation button")
	public void clicking_the_new_quotation_button() {
	    waitforclick(pages.getSalespage().getSales_quotation_new_quotation_button()).click();
   
	}
	@Then("Clicking the due date in quotation")
	public void clicking_the_due_date_in_quotation() {
	    waitforclick(pages.getSalespage().getSales_quotation_due_date()).click();
	    waitforclick(pages.getSalespage().getSales_quotation_due_date_apply_button()).click();

	}
	@Then("Entering the description in quotation")
	public void entering_the_description_in_quotation() {
	    waitforclick(pages.getSalespage().getSales_quotation_description()).sendKeys("test quatation");

	}
	@Then("Entering the billing address in quotation")
	public void entering_the_billing_address_in_quotation() {
	    waitforclick(pages.getSalespage().getSales_quotation_billing_address_click()).click();

	}
	@Then("Entering the Shipping address in quotation")
	public void entering_the_shipping_address_in_quotation() {
	    waitforclick(pages.getSalespage().getSales_quotation_shipping_address_click()).click();
	}
	@Then("Entering the delivery date in quotation")
	public void entering_the_delivery_date_in_quotation() {
	    waitforclick(pages.getSalespage().getSales_quotation_select_delivery_date()).click();
	    waitforclick(pages.getSalespage().getSales_quotation_select_delivery_date_apply_button()).click();

	}
	@Then("Entering the reference numbe in the quotation")
	public void entering_the_reference_numbe_in_the_quotation() {
	    waitforclick(pages.getSalespage().getSales_quotation_reference_number_input()).sendKeys("678678678");
  
	}
	@Then("Clicking the convert to invoice button")
	public void clicking_the_convert_to_invoice_button() {
	    waitforclick(pages.getSalespage().getSales_quotation_convert_to_invoice_button()).click();

	}
	@Then("Clicking the create invoice button")
	public void clicking_the_create_invoice_button() {
	    waitforclick(pages.getSalespage().getSales_quotation_create_invoice_button()).click();

	}
//	@Then("Get the order number of quotation created")
//	public void get_the_order_number_of_quotation_created() {
//	    pages.getSalespage().getOrderNumberQuotation();
//		
//	}
//	@Then("Clicking the transaction Tab")
//	public void clicking_the_transaction_tab() {
//	    waitforclick(pages.getSalespage().getSales_tranaction_tab()).click();
//
//		
//	}
//	@Then("Check the order number through quotation in the transaction")
//	public void check_the_order_number_through_quotation_in_the_transaction() {
//	   pages.getSalespage().transactionOrderNumber();
	   
	   
	   
	   
	}



