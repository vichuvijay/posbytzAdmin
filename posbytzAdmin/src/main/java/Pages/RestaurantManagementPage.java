package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonFunction.CommonClass;

public class RestaurantManagementPage extends CommonClass {
	
	public RestaurantManagementPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=' Restaurant Management']")
	WebElement restaurant_management_menu; 
	
	@FindBy(xpath="(//button[contains(text(),'Create Floor')])[1]")
	WebElement restaurant_management_create_floor_button; 
	
	@FindBy(xpath="//input[@placeholder='Floor Name']")
	WebElement restaurant_management_floor_name; 

	@FindBy(xpath="//*[contains(text(),'Select Location')]")
	WebElement restaurant_management_select_location; 
	
	@FindBy(xpath="//span//ul//li[@role='option']")
	WebElement restaurant_management_location_chennai; 
	
	@FindBy(xpath="//button[@id='js_floor-btn']")
	WebElement restaurant_management_save_button; 

	@FindBy(xpath="//tbody//tr/td//a[@class='btn btn-outline-info btn-sm']")
	WebElement restaurant_management_table_button; 
	
	@FindBy(xpath="(//button[text()=' Create Table'])[1]")
	WebElement restaurant_management_create_table_button; 
	
	@FindBy(xpath="//input[@placeholder='Table Number']")
	WebElement restaurant_management_table_name;

	@FindBy(xpath="(//input[@placeholder='Table Number'])[2]")
	WebElement restaurant_management_table_name_edit;
	
	@FindBy(xpath="//input[@placeholder='Seating Capacity']")
	WebElement restaurant_management_seating_capacity; 
	
	@FindBy(xpath="(//input[@placeholder='Seating Capacity'])[2]")
	WebElement restaurant_management_seating_capacity_edit; 
	
	@FindBy(xpath="//span[contains(text(),'Select Price Category')]")
	WebElement restaurant_management_select_price_category; 
	
	@FindBy(xpath="//span//ul//li[contains(text(),'Dine-In')]")
	WebElement restaurant_management_select_price_category_dine_in; 
	
	@FindBy(xpath="//span[contains(text(),'Dine-In')]")
	WebElement restaurant_management_select_price_category_dine_in_edit_click;
	
	@FindBy(xpath="//span//ul//li[contains(text(),'Takeaway')]")
	WebElement restaurant_management_select_price_category_edit_takeaway;
	
	@FindBy(xpath="//span[contains(text(),'Takeaway')]")
	WebElement restaurant_management_select_price_category_edit_takeaway_check;
	
	@FindBy(xpath="//button[@id='js_table-btn']")
	WebElement restaurant_management_table_save_button; 
	
	@FindBy(xpath="(//button[@class='btn btn-primary ld-ext-right'])[2]")
	WebElement restaurant_management_table_save_button_edit; 
	
	@FindBy(xpath="//button[contains(text(),'Floor Plan')]")
	WebElement restaurant_management_create_floor_plan_button;
	
	@FindBy(xpath="//span[@class='js_show-floor-element badge badge-success']")
	WebElement restaurant_management_set_button; 
	
	@FindBy(xpath="//span[@class='floor-plan-element-text']")
	WebElement restaurant_management_floor_layout; 
	
	@FindBy(xpath="//i[@class='la la-times']")
	WebElement restaurant_management_floor_plan_close_button;
	
	@FindBy(xpath="//a[@class='js_table btn btn-outline-primary btn-sm']")
	WebElement restaurant_management_tables_edit_button;
	
	@FindBy(xpath="(//button[@class='btn btn-secondary'])[2]")
	WebElement restaurant_management_tables_edit_close_button;
	
	
	
	/*
	 * public WebElement
	 * getRestaurant_management_select_price_category_edit_takeaway_check() { return
	 * restaurant_management_select_price_category_edit_takeaway_check; }
	 * 
	 * public WebElement getRestaurant_management_tables_edit_close_button() {
	 * return restaurant_management_tables_edit_close_button; }
	 * 
	 * public WebElement getRestaurant_management_tables_edit_button() { return
	 * restaurant_management_tables_edit_button; }
	 * 
	 * public WebElement getRestaurant_management_table_name_edit() { return
	 * restaurant_management_table_name_edit; }
	 * 
	 * public WebElement getRestaurant_management_seating_capacity_edit() { return
	 * restaurant_management_seating_capacity_edit; }
	 * 
	 * public WebElement
	 * getRestaurant_management_select_price_category_dine_in_edit_click() { return
	 * restaurant_management_select_price_category_dine_in_edit_click; }
	 * 
	 * public WebElement
	 * getRestaurant_management_select_price_category_edit_takeaway() { return
	 * restaurant_management_select_price_category_edit_takeaway; }
	 * 
	 * public WebElement getRestaurant_management_table_save_button_edit() { return
	 * restaurant_management_table_save_button_edit; }
	 * 
	 * public WebElement getRestaurant_management_create_floor_plan_button() {
	 * return restaurant_management_create_floor_plan_button; }
	 * 
	 * public WebElement getRestaurant_management_menu() { return
	 * restaurant_management_menu; }
	 * 
	 * public WebElement getRestaurant_management_create_button() { return
	 * restaurant_management_create_floor_button; }
	 * 
	 * public WebElement getRestaurant_management_floor_name() { return
	 * restaurant_management_floor_name; }
	 * 
	 * public WebElement getRestaurant_management_select_location() { return
	 * restaurant_management_select_location; }
	 * 
	 * public WebElement getRestaurant_management_location_chennai() { return
	 * restaurant_management_location_chennai; }
	 * 
	 * public WebElement getRestaurant_management_save_button() { return
	 * restaurant_management_save_button; }
	 * 
	 * public WebElement getRestaurant_management_table_button() { return
	 * restaurant_management_table_button; }
	 * 
	 * public WebElement getRestaurant_management_create_table_button() { return
	 * restaurant_management_create_table_button; }
	 * 
	 * public WebElement getRestaurant_management_table_name() { return
	 * restaurant_management_table_name; }
	 * 
	 * public WebElement getRestaurant_management_seating_capacity() { return
	 * restaurant_management_seating_capacity; }
	 * 
	 * public WebElement getRestaurant_management_select_price_category() { return
	 * restaurant_management_select_price_category; }
	 * 
	 * public WebElement getRestaurant_management_select_price_category_dine_in() {
	 * return restaurant_management_select_price_category_dine_in; }
	 * 
	 * public WebElement getRestaurant_management_table_save_button() { return
	 * restaurant_management_table_save_button; }
	 * 
	 * public WebElement getRestaurant_management_set_button() { return
	 * restaurant_management_set_button; }
	 * 
	 * public WebElement getRestaurant_management_floor_layout() { return
	 * restaurant_management_floor_layout; }
	 * 
	 * public WebElement getRestaurant_management_floor_plan_close_button() { return
	 * restaurant_management_floor_plan_close_button; } public WebElement
	 * getRestaurant_management_create_floor_button() { return
	 * restaurant_management_create_floor_button; }
	 */	
	
	// Restaurant Management Menu
	public WebElement getRestaurant_management_menu() {
	    return waitforXpath("//a[text()=' Restaurant Management']");
	}

	// Restaurant Management Create Floor Button
	public WebElement getRestaurant_management_create_floor_button() {
	    return waitforXpath("(//button[contains(text(),'Create Floor')])[1]");
	}

	// Restaurant Management Floor Name
	public WebElement getRestaurant_management_floor_name() {
	    return waitforXpath("//input[@placeholder='Floor Name']");
	}

	// Restaurant Management Select Location
	public WebElement getRestaurant_management_select_location() {
	    return waitforXpath("//*[contains(text(),'Select Location')]");
	}

	// Restaurant Management Location Chennai
	public WebElement getRestaurant_management_location_chennai() {
	    return waitforXpath("//span//ul//li[@role='option']");
	}

	// Restaurant Management Save Button
	public WebElement getRestaurant_management_save_button() {
	    return waitforXpath("//button[@id='js_floor-btn']");
	}

	// Restaurant Management Table Button
	public WebElement getRestaurant_management_table_button() {
	    return waitforXpath("//tbody//tr/td//a[@class='btn btn-outline-info btn-sm']");
	}

	// Restaurant Management Create Table Button
	public WebElement getRestaurant_management_create_table_button() {
	    return waitforXpath("(//button[text()=' Create Table'])[1]");
	}

	// Restaurant Management Table Name
	public WebElement getRestaurant_management_table_name() {
	    return waitforXpath("//input[@placeholder='Table Number']");
	}

	// Restaurant Management Table Name Edit
	public WebElement getRestaurant_management_table_name_edit() {
	    return waitforXpath("(//input[@placeholder='Table Number'])[2]");
	}

	// Restaurant Management Seating Capacity
	public WebElement getRestaurant_management_seating_capacity() {
	    return waitforXpath("//input[@placeholder='Seating Capacity']");
	}

	// Restaurant Management Seating Capacity Edit
	public WebElement getRestaurant_management_seating_capacity_edit() {
	    return waitforXpath("(//input[@placeholder='Seating Capacity'])[2]");
	}

	// Restaurant Management Select Price Category
	public WebElement getRestaurant_management_select_price_category() {
	    return waitforXpath("//span[contains(text(),'Select Price Category')]");
	}

	// Restaurant Management Select Price Category Dine-In
	public WebElement getRestaurant_management_select_price_category_dine_in() {
	    return waitforXpath("//span//ul//li[contains(text(),'Dine-In')]");
	}

	// Restaurant Management Select Price Category Dine-In Edit Click
	public WebElement getRestaurant_management_select_price_category_dine_in_edit_click() {
	    return waitforXpath("//span[contains(text(),'Dine-In')]");
	}

	// Restaurant Management Select Price Category Edit Takeaway
	public WebElement getRestaurant_management_select_price_category_edit_takeaway() {
	    return waitforXpath("//span//ul//li[contains(text(),'Takeaway')]");
	}

	// Restaurant Management Select Price Category Edit Takeaway Check
	public WebElement getRestaurant_management_select_price_category_edit_takeaway_check() {
	    return waitforXpath("//span[contains(text(),'Takeaway')]");
	}

	// Restaurant Management Table Save Button
	public WebElement getRestaurant_management_table_save_button() {
	    return waitforXpath("//button[@id='js_table-btn']");
	}

	// Restaurant Management Table Save Button Edit
	public WebElement getRestaurant_management_table_save_button_edit() {
	    return waitforXpath("(//button[@class='btn btn-primary ld-ext-right'])[2]");
	}

	// Restaurant Management Create Floor Plan Button
	public WebElement getRestaurant_management_create_floor_plan_button() {
	    return waitforXpath("//button[contains(text(),'Floor Plan')]");
	}

	// Restaurant Management Set Button
	public WebElement getRestaurant_management_set_button() {
	    return waitforXpath("//span[@class='js_show-floor-element badge badge-success']");
	}

	// Restaurant Management Floor Layout
	public WebElement getRestaurant_management_floor_layout() {
	    return waitforXpath("//span[@class='floor-plan-element-text']");
	}

	// Restaurant Management Floor Plan Close Button
	public WebElement getRestaurant_management_floor_plan_close_button() {
	    return waitforXpath("//i[@class='la la-times']");
	}

	// Restaurant Management Tables Edit Button
	public WebElement getRestaurant_management_tables_edit_button() {
	    return waitforXpath("//a[@class='js_table btn btn-outline-primary btn-sm']");
	}

	// Restaurant Management Tables Edit Close Button
	public WebElement getRestaurant_management_tables_edit_close_button() {
	    return waitforXpath("(//button[@class='btn btn-secondary'])[2]");
	}
}	

