package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonFunction.CommonClass;

public class InventoryManagementPage extends CommonClass {
	
	public InventoryManagementPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//a[text()=' Inventory Management']")
	WebElement inventory_management_menu; 
	
	@FindBy(xpath="//a[@title='More Actions']")
	WebElement inventory_management_more_action_dot;
	
	@FindBy(xpath="(//*[contains(text(),'Vendors')])[1]")
	WebElement inventory_management_vendors;
	
	@FindBy(xpath="(//a[contains(text(),' Create Vendor')])[1]")
	WebElement inventory_management_create_vendor_button;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement inventory_management_vendor_name;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement inventory_management_vendor_email;
	
	@FindBy(xpath="//input[@placeholder='Phone']")
	WebElement inventory_management_vendor_phone_no;
	
	@FindBy(xpath="//input[@placeholder='Vendor Code']")
	WebElement inventory_management_vendor_code;
	
	@FindBy(xpath="//input[@placeholder='Address Line 1']")
	WebElement inventory_management_vendor_address_line_1;
	
	@FindBy(xpath="//input[@placeholder='Address Line 2']")
	WebElement inventory_management_vendor_address_line_2;
	
	@FindBy(xpath="//input[@placeholder='City']")
	WebElement inventory_management_vendor_city;
	
	@FindBy(xpath="//input[@placeholder='Region']")
	WebElement inventory_management_vendor_region;
	
	@FindBy(xpath="//input[@placeholder='Country']")
	WebElement inventory_management_vendor_country;
	
	@FindBy(xpath="//input[@placeholder='Postal Code']")
	WebElement inventory_management_vendor_postal_code;
	
	
	@FindBy(xpath="//input[@placeholder='Tax Registration Number']")
	WebElement inventory_management_vendor_trn;
	
	@FindBy(xpath="//input[@placeholder='Company Registration Number']")
	WebElement inventory_management_vendor_crn;
	
	@FindBy(xpath="//a[text()='Save']")
	WebElement inventory_management_vendor_save_button;
	
	
	@FindBy(xpath="//*[contains(text(),'Purchase Orders')]")
	WebElement inventory_management_purchase_order_tab;
	
	@FindBy(xpath="(//a[contains(text(),' Create Purchase Order')])[1]")
	WebElement inventory_management_purchase_order_create_button;
	
	@FindBy(xpath="//span[contains(text(),'Select Vendor')]")
	WebElement inventory_management_purchase_order_select_vendor;
	
	@FindBy(xpath="//span//ul//li[contains(text(),'Test Vendor')]")
	WebElement inventory_management_purchase_order_Test_vendor;
	
	@FindBy(xpath="//span[contains(text(),'Select Location')]")
	WebElement inventory_management_purchase_order_select_location;
	
	@FindBy(xpath="//span//ul//li[contains(text(),'Chennai')]")
	WebElement inventory_management_purchase_order_select_location_chennai;
	
	@FindBy(xpath="//input[@class='form-control bg-white js_delivery-date']")
	WebElement inventory_management_purchase_order_expect_delivery;
	
	@FindBy(xpath="(//button[text()='Apply'])[1]")
	WebElement inventory_management_purchase_order_delivery_date_apply_button;
	
	@FindBy(xpath="//input[@name='custom_attributes[invoice_no]']")
	WebElement inventory_management_purchase_order_invoice_number;
	
	@FindBy(xpath="//input[@class='form-control bg-white js_billing-date']")
	WebElement inventory_management_purchase_order_billing_date;
	
	
	@FindBy(xpath="(//button[text()='Apply'])[2]")
	WebElement inventory_management_purchase_order_billing_date_appy_button;
	
	@FindBy(xpath="//textarea[@name='custom_attributes[notes]']")
	WebElement inventory_management_purchase_order_notes;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement inventory_management_purchase_order_add_items;
	
	@FindBy(xpath="//span[contains(text(),'Select Item')]")
	WebElement inventory_management_purchase_order_select_item;
	
	@FindBy(xpath="//span[contains(text(),'Select Item')]//following::input[1]")
	WebElement inventory_management_purchase_order_select_item_input;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement inventory_management_purchase_order_singleItem_save_button;
	
	@FindBy(xpath="//input[@name='quantityRequired']")
	WebElement inventory_management_purchase_order_singleItem_quantity;
	
	@FindBy(xpath="//input[@name='discountAmount']")
	WebElement inventory_management_purchase_order_discount_value;
	
	@FindBy(xpath="//select[@name='discountType']")
	WebElement inventory_management_purchase_order_discount_type;
//	
	@FindBy(xpath="//a[text()='Save ']")
	WebElement inventory_management_purchase_order_save_button;
	
	@FindBy(xpath="//a[contains(text(),'Approve')]")
	WebElement inventory_management_purchase_order_approve_button;
	
	@FindBy(xpath="//*[contains(text(),'Ok')]")
	WebElement inventory_management_purchase_order_Ok_button_approve_popup;
	
	@FindBy(xpath="//a[contains(text(),'Receive Orders')]")
	WebElement inventory_management_purchase_order_receive_order_button;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement inventory_management_purchase_order_check_prefill_receive_quantity;
	
	@FindBy(xpath="(//*[contains(text(),'Save')])[2]")
	WebElement inventory_management_purchase_order_receive_save_button;
	
	@FindBy(xpath="//a[contains(text(),'GRN Details')]")
	WebElement inventory_management_purchase_order_grn_details;
	
	@FindBy(xpath="(//a[@data-toggle='dropdown'])[4]")
	WebElement inventory_management_purchase_order_grn_more_actions;
	
	@FindBy(xpath="//a[contains(text(),'Add Payment')]")
	WebElement inventory_management_purchase_order_add_payment;
	
	@FindBy(xpath="//span[contains(text(),'Select Payment Method')]")
	WebElement inventory_management_purchase_order_select_payment_method;
	
	@FindBy(xpath="//li[contains(text(),'Cash')]")
	WebElement inventory_management_purchase_order_payment_cash;
	
	@FindBy(xpath="//input[@placeholder='Date']")
	WebElement inventory_management_purchase_order_payment_date;
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement inventory_management_purchase_order_payment_date_apply_button;
	
	@FindBy(xpath="(//button[text()='Save'])[2]")
	WebElement inventory_management_purchase_order_payment_details_save_button;
	
	@FindBy(xpath="//*[text()='History']")
	WebElement inventory_management_history;

	@FindBy(xpath="//*[contains(text(),'	GRN')]")
	WebElement inventory_management_purchase_order_grn_tab;

	@FindBy(xpath="//*[contains(text(),'Create GRN Order')]")
	WebElement inventory_management_purchase_order_create_grn_button;

	@FindBy(xpath="//*[contains(text(),'Waste Management')]")
	WebElement inventory_management_waste_management;
	
	@FindBy(xpath="(//*[contains(text(),' Create waste management Order')])[2]")
	WebElement inventory_management_waste_management_create_button;
	
	@FindBy(xpath="(//*[contains(text(),'Select Location')])[1]")
	WebElement inventory_management_waste_management_select_location;
	
	@FindBy(xpath="//span[contains(text(),'Select Approver')]")
	WebElement inventory_management_waste_managemnet_select_approver;
	
	
	@FindBy(xpath="//li[contains(text(),'Auto')]")
	WebElement inventory_management_waste_managemnet_select_approver_select;
	

	@FindBy(xpath="//span[contains(text(),'Select Variation')]")
	WebElement inventory_management_waste_managemnet_select_variation;
	
	
	@FindBy(xpath="(//input[@type='number'])[4]")
	WebElement inventory_management_waste_managemnet_stock_adjustment_quantity;
	
	@FindBy(xpath="//select[@class='form-control js_stock-adjust-reason']")
	WebElement inventory_management_waste_managemnet_stock_adjustment_reason;
	
	@FindBy(xpath="//button[text()='Add']")
	WebElement inventory_management_waste_managemnet_add_button;
	
	@FindBy(xpath="(//a[contains(text(),'Save')])[1]")
	WebElement inventory_management_waste_managemnet_save_button;
	
	@FindBy(xpath="(//a[contains(text(),'Complete')])")
	WebElement inventory_management_waste_managemnet_complete_button;
	
	@FindBy(xpath="//span[contains(text(),'Select Variation')]//following::input[8]")
	WebElement inventory_management_waste_management_select_variation_input;
	
	@FindBy(xpath="(//*[contains(text(),'Preparation Order')])")
	WebElement inventory_management_preparation_order;
	
	@FindBy(xpath="//input[@spellcheck='false']")
	WebElement inventory_management_preparation_order_select_variation_input;
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement inventory_management_preparation_order_quantity_input;
	
	@FindBy(xpath="//*[contains(text(),' Create preparation Order')]")
	WebElement inventory_management_preparation_create_preparation_order;
	
	@FindBy(xpath="(//*[contains(text(),'Inventory Audit')])[1]")
	WebElement inventory_management_inventory_audit;
	
	@FindBy(xpath="(//a[contains(text(),'Create Inventory Audit')])")
	WebElement inventory_management_Audit_create_inventory_audit_button;
	
	@FindBy(xpath="(//span[contains(text(),'Select Auditor')])[2]")
	WebElement inventory_management_Audit_select_auditor;
	
	@FindBy(xpath="(//span[contains(text(),'Select Approver')])[2]")
	WebElement inventory_management_Audit_select_approver;
	
	@FindBy(xpath="(//button[contains(text(),' Add Item')])")
	WebElement inventory_management_Audit_add_item_button;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement inventory_management_Audit_variation_search_input;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement inventory_management_Audit_variation_checkbox_select;
	
	@FindBy(xpath="//button[contains(text(),'Add Selected Items')]")
	WebElement inventory_management_Audit_add_select_items;
	
	@FindBy(xpath="//a[contains(text(),'Count Stock')]")
	WebElement inventory_management_Audit_count_stock_button;
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement inventory_management_Audit_total_phyical_stock_input;
	
	@FindBy(xpath="(//input[@type='number'])[2]")
	WebElement inventory_management_Audit_stock_expired;
	
	@FindBy(xpath="(//input[@type='number'])[3]")
	WebElement inventory_management_Audit_stock_damaged;
	
	@FindBy(xpath="(//a[contains(text(),'Save')])[2]")
	WebElement inventory_management_Audit_count_stock_save_button;
	
	@FindBy(xpath="(//a[contains(text(),'Send to Approve Count')])")
	WebElement inventory_management_Audit_send_to_approve_count_button;
	
	@FindBy(xpath="(//a[contains(text(),'Approve Count Stock')])")
	WebElement inventory_management_Audit_approve_count_stock_button;
	
	@FindBy(xpath="(//input[@class='form-control form-control-sm js_qty-difference'])[2]")
	WebElement inventory_management_count_stock_difference_quantity;
	
	@FindBy(xpath="(//input[@type='number'])[6]")
	WebElement inventory_management_Audit_loss_quantity_input;
	
	@FindBy(xpath="(//input[@type='number'])[7]")
	WebElement inventory_management_Audit_recount_quantity_input;
	
	@FindBy(xpath="(//a[contains(text(),'Complete Count Stock')])")
	WebElement inventory_management_Audit_complete_count_stock_button;
	
	
	
	
	/*
	 * public WebElement getInventory_management_inventory_audit() { return
	 * inventory_management_inventory_audit; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_Audit_create_inventory_audit_button() { return
	 * inventory_management_Audit_create_inventory_audit_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_Audit_select_auditor() { return
	 * inventory_management_Audit_select_auditor; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_Audit_select_approver() { return
	 * inventory_management_Audit_select_approver; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_Audit_add_item_button() { return
	 * inventory_management_Audit_add_item_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_Audit_variation_search_input() {
	 * return inventory_management_Audit_variation_search_input; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_Audit_variation_checkbox_select() {
	 * return inventory_management_Audit_variation_checkbox_select; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_Audit_add_select_items() { return
	 * inventory_management_Audit_add_select_items; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_Audit_count_stock_button() { return
	 * inventory_management_Audit_count_stock_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_Audit_total_phyical_stock_input() {
	 * return inventory_management_Audit_total_phyical_stock_input; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_Audit_stock_expired() { return
	 * inventory_management_Audit_stock_expired; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_Audit_stock_damaged() { return
	 * inventory_management_Audit_stock_damaged; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_Audit_count_stock_save_button() {
	 * return inventory_management_Audit_count_stock_save_button; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_Audit_send_to_approve_count_button() { return
	 * inventory_management_Audit_send_to_approve_count_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_Audit_approve_count_stock_button()
	 * { return inventory_management_Audit_approve_count_stock_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_count_stock_difference_quantity() {
	 * return inventory_management_count_stock_difference_quantity; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_Audit_loss_quantity_input() {
	 * return inventory_management_Audit_loss_quantity_input; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_Audit_recount_quantity_input() {
	 * return inventory_management_Audit_recount_quantity_input; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_Audit_complete_count_stock_button()
	 * { return inventory_management_Audit_complete_count_stock_button; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_preparation_create_preparation_order() { return
	 * inventory_management_preparation_create_preparation_order; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_preparation_order_select_variation_input() { return
	 * inventory_management_preparation_order_select_variation_input; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_preparation_order_quantity_input()
	 * { return inventory_management_preparation_order_quantity_input; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_waste_management_select_variation_input() { return
	 * inventory_management_waste_management_select_variation_input; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_preparation_order() { return
	 * inventory_management_preparation_order; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_waste_management() { return
	 * inventory_management_waste_management; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_waste_management_select_varitaion_input() { return
	 * inventory_management_waste_management_select_variation_input; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_waste_management_create_button() {
	 * return inventory_management_waste_management_create_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_waste_management_select_location()
	 * { return inventory_management_waste_management_select_location; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_waste_managemnet_select_approver()
	 * { return inventory_management_waste_managemnet_select_approver; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_waste_managemnet_select_approver_select() { return
	 * inventory_management_waste_managemnet_select_approver_select; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_waste_managemnet_select_variation()
	 * { return inventory_management_waste_managemnet_select_variation; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_waste_managemnet_stock_adjustment_quantity() { return
	 * inventory_management_waste_managemnet_stock_adjustment_quantity; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_waste_managemnet_stock_adjustment_reason() { return
	 * inventory_management_waste_managemnet_stock_adjustment_reason; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_waste_managemnet_add_button() {
	 * return inventory_management_waste_managemnet_add_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_waste_managemnet_save_button() {
	 * return inventory_management_waste_managemnet_save_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_waste_managemnet_complete_button()
	 * { return inventory_management_waste_managemnet_complete_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_menu() { return
	 * inventory_management_menu; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_grn_tab() { return
	 * inventory_management_purchase_order_grn_tab; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_create_grn_button()
	 * { return inventory_management_purchase_order_create_grn_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_history() { return
	 * inventory_management_history; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_save_button() {
	 * return inventory_management_purchase_order_save_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_approve_button() {
	 * return inventory_management_purchase_order_approve_button; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_purchase_order_Ok_button_approve_popup() { return
	 * inventory_management_purchase_order_Ok_button_approve_popup; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_purchase_order_receive_order_button() { return
	 * inventory_management_purchase_order_receive_order_button; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_purchase_order_check_prefill_receive_quantity() {
	 * return inventory_management_purchase_order_check_prefill_receive_quantity; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_purchase_order_receive_save_button() { return
	 * inventory_management_purchase_order_receive_save_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_grn_details() {
	 * return inventory_management_purchase_order_grn_details; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_grn_more_actions() {
	 * return inventory_management_purchase_order_grn_more_actions; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_add_payment() {
	 * return inventory_management_purchase_order_add_payment; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_purchase_order_select_payment_method() { return
	 * inventory_management_purchase_order_select_payment_method; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_payment_cash() {
	 * return inventory_management_purchase_order_payment_cash; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_payment_date() {
	 * return inventory_management_purchase_order_payment_date; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_purchase_order_payment_date_apply_button() { return
	 * inventory_management_purchase_order_payment_date_apply_button; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_purchase_order_payment_details_save_button() { return
	 * inventory_management_purchase_order_payment_details_save_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_discount_type() {
	 * return inventory_management_purchase_order_discount_type; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_discount_value() {
	 * return inventory_management_purchase_order_discount_value; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_purchase_order_singleItem_quantity() { return
	 * inventory_management_purchase_order_singleItem_quantity; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_tab() { return
	 * inventory_management_purchase_order_tab; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_create_button() {
	 * return inventory_management_purchase_order_create_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_select_vendor() {
	 * return inventory_management_purchase_order_select_vendor; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_Test_vendor() {
	 * return inventory_management_purchase_order_Test_vendor; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_select_location() {
	 * return inventory_management_purchase_order_select_location; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_purchase_order_select_location_chennai() { return
	 * inventory_management_purchase_order_select_location_chennai; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_expect_delivery() {
	 * return inventory_management_purchase_order_expect_delivery; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_purchase_order_delivery_date_apply_button() { return
	 * inventory_management_purchase_order_delivery_date_apply_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_invoice_number() {
	 * return inventory_management_purchase_order_invoice_number; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_billing_date() {
	 * return inventory_management_purchase_order_billing_date; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_purchase_order_billing_date_appy_button() { return
	 * inventory_management_purchase_order_billing_date_appy_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_notes() { return
	 * inventory_management_purchase_order_notes; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_add_items() { return
	 * inventory_management_purchase_order_add_items; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_select_item() {
	 * return inventory_management_purchase_order_select_item; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_purchase_order_select_item_input()
	 * { return inventory_management_purchase_order_select_item_input; }
	 * 
	 * 
	 * 
	 * public WebElement
	 * getInventory_management_purchase_order_singleItem_save_button() { return
	 * inventory_management_purchase_order_singleItem_save_button; }
	 * 
	 * 
	 * 
	 * public WebElement getInventory_management_more_action_dot() { return
	 * inventory_management_more_action_dot; }
	 * 
	 * public WebElement getInventory_management_vendors() { return
	 * inventory_management_vendors; }
	 * 
	 * public WebElement getInventory_management_create_vendor_button() { return
	 * inventory_management_create_vendor_button; }
	 * 
	 * public WebElement getInventory_management_vendor_name() { return
	 * inventory_management_vendor_name; }
	 * 
	 * public WebElement getInventory_management_vendor_email() { return
	 * inventory_management_vendor_email; }
	 * 
	 * public WebElement getInventory_management_vendor_phone_no() { return
	 * inventory_management_vendor_phone_no; }
	 * 
	 * public WebElement getInventory_management_vendor_code() { return
	 * inventory_management_vendor_code; }
	 * 
	 * public WebElement getInventory_management_vendor_address_line_1() { return
	 * inventory_management_vendor_address_line_1; }
	 * 
	 * public WebElement getInventory_management_vendor_address_line_2() { return
	 * inventory_management_vendor_address_line_2; }
	 * 
	 * public WebElement getInventory_management_vendor_city() { return
	 * inventory_management_vendor_city; }
	 * 
	 * public WebElement getInventory_management_vendor_region() { return
	 * inventory_management_vendor_region; }
	 * 
	 * public WebElement getInventory_management_vendor_country() { return
	 * inventory_management_vendor_country; }
	 * 
	 * public WebElement getInventory_management_vendor_postal_code() { return
	 * inventory_management_vendor_postal_code; }
	 * 
	 * public WebElement getInventory_management_vendor_trn() { return
	 * inventory_management_vendor_trn; }
	 * 
	 * public WebElement getInventory_management_vendor_crn() { return
	 * inventory_management_vendor_crn; }
	 * 
	 * public WebElement getInventory_management_vendor_save_button() { return
	 * inventory_management_vendor_save_button; }
	 */
	
	public WebElement getInventory_management_menu() {
	    return waitforXpath("//a[text()=' Inventory Management']");
	}

	public WebElement getInventory_management_more_action_dot() {
	    return waitforXpath("//a[@title='More Actions']");
	}

	public WebElement getInventory_management_vendors() {
	    return waitforXpath("(//*[contains(text(),'Vendors')])[1]");
	}

	public WebElement getInventory_management_create_vendor_button() {
	    return waitforXpath("(//a[contains(text(),' Create Vendor')])[1]");
	}

	public WebElement getInventory_management_vendor_name() {
	    return waitforXpath("//input[@placeholder='Name']");
	}

	public WebElement getInventory_management_vendor_email() {
	    return waitforXpath("//input[@placeholder='Email']");
	}

	public WebElement getInventory_management_vendor_phone_no() {
	    return waitforXpath("//input[@placeholder='Phone']");
	}

	public WebElement getInventory_management_vendor_code() {
	    return waitforXpath("//input[@placeholder='Vendor Code']");
	}

	public WebElement getInventory_management_vendor_address_line_1() {
	    return waitforXpath("//input[@placeholder='Address Line 1']");
	}

	public WebElement getInventory_management_vendor_address_line_2() {
	    return waitforXpath("//input[@placeholder='Address Line 2']");
	}

	public WebElement getInventory_management_vendor_city() {
	    return waitforXpath("//input[@placeholder='City']");
	}

	public WebElement getInventory_management_vendor_region() {
	    return waitforXpath("//input[@placeholder='Region']");
	}

	public WebElement getInventory_management_vendor_country() {
	    return waitforXpath("//input[@placeholder='Country']");
	}

	public WebElement getInventory_management_vendor_postal_code() {
	    return waitforXpath("//input[@placeholder='Postal Code']");
	}

	public WebElement getInventory_management_vendor_trn() {
	    return waitforXpath("//input[@placeholder='Tax Registration Number']");
	}

	public WebElement getInventory_management_vendor_crn() {
	    return waitforXpath("//input[@placeholder='Company Registration Number']");
	}

	public WebElement getInventory_management_vendor_save_button() {
	    return waitforXpath("//a[text()='Save']");
	}

	public WebElement getInventory_management_purchase_order_tab() {
	    return waitforXpath("//*[contains(text(),'Purchase Orders')]");
	}

	public WebElement getInventory_management_purchase_order_create_button() {
	    return waitforXpath("(//a[contains(text(),' Create Purchase Order')])[1]");
	}

	public WebElement getInventory_management_purchase_order_select_vendor() {
	    return waitforXpath("//span[contains(text(),'Select Vendor')]");
	}

	public WebElement getInventory_management_purchase_order_Test_vendor() {
	    return waitforXpath("//span//ul//li[contains(text(),'Test Vendor')]");
	}

	public WebElement getInventory_management_purchase_order_select_location() {
	    return waitforXpath("//span[contains(text(),'Select Location')]");
	}

	public WebElement getInventory_management_purchase_order_select_location_chennai() {
	    return waitforXpath("//span//ul//li[contains(text(),'Chennai')]");
	}

	public WebElement getInventory_management_purchase_order_expect_delivery() {
	    return waitforXpath("//input[@class='form-control bg-white js_delivery-date']");
	}

	public WebElement getInventory_management_purchase_order_delivery_date_apply_button() {
	    return waitforXpath("(//button[text()='Apply'])[1]");
	}

	public WebElement getInventory_management_purchase_order_invoice_number() {
	    return waitforXpath("//input[@name='custom_attributes[invoice_no]']");
	}

	public WebElement getInventory_management_purchase_order_billing_date() {
	    return waitforXpath("//input[@class='form-control bg-white js_billing-date']");
	}

	public WebElement getInventory_management_purchase_order_billing_date_appy_button() {
	    return waitforXpath("(//button[text()='Apply'])[2]");
	}

	public WebElement getInventory_management_purchase_order_notes() {
	    return waitforXpath("//textarea[@name='custom_attributes[notes]']");
	}

	public WebElement getInventory_management_purchase_order_add_items() {
	    return waitforXpath("(//button[@type='button'])[3]");
	}

	public WebElement getInventory_management_purchase_order_select_item() {
	    return waitforXpath("//span[contains(text(),'Select Item')]");
	}

	public WebElement getInventory_management_purchase_order_select_item_input() {
	    return waitforXpath("//span[contains(text(),'Select Item')]//following::input[1]");
	}

	public WebElement getInventory_management_purchase_order_singleItem_save_button() {
	    return waitforXpath("//button[text()='Save']");
	}

	public WebElement getInventory_management_purchase_order_singleItem_quantity() {
	    return waitforXpath("//input[@name='quantityRequired']");
	}

	public WebElement getInventory_management_purchase_order_discount_value() {
	    return waitforXpath("//input[@name='discountAmount']");
	}

	public WebElement getInventory_management_purchase_order_discount_type() {
	    return waitforXpath("//select[@name='discountType']");
	}

	public WebElement getInventory_management_purchase_order_save_button() {
	    return waitforXpath("//a[text()='Save ']");
	}

	public WebElement getInventory_management_purchase_order_approve_button() {
	    return waitforXpath("//a[contains(text(),'Approve')]");
	}

	public WebElement getInventory_management_purchase_order_Ok_button_approve_popup() {
	    return waitforXpath("//*[contains(text(),'Ok')]");
	}

	public WebElement getInventory_management_purchase_order_receive_order_button() {
	    return waitforXpath("//a[contains(text(),'Receive Orders')]");
	}

	public WebElement getInventory_management_purchase_order_check_prefill_receive_quantity() {
	    return waitforXpath("(//input[@type='checkbox'])[1]");
	}

	public WebElement getInventory_management_purchase_order_receive_save_button() {
	    return waitforXpath("(//*[contains(text(),'Save')])[2]");
	}

	public WebElement getInventory_management_purchase_order_grn_details() {
	    return waitforXpath("//a[contains(text(),'GRN Details')]");
	}

	public WebElement getInventory_management_purchase_order_grn_more_actions() {
	    return waitforXpath("(//a[@data-toggle='dropdown'])[4]");
	}

	public WebElement getInventory_management_purchase_order_add_payment() {
	    return waitforXpath("//a[contains(text(),'Add Payment')]");
	}

	public WebElement getInventory_management_purchase_order_select_payment_method() {
	    return waitforXpath("//span[contains(text(),'Select Payment Method')]");
	}

	public WebElement getInventory_management_purchase_order_payment_cash() {
	    return waitforXpath("//li[contains(text(),'Cash')]");
	}

	public WebElement getInventory_management_purchase_order_payment_date() {
	    return waitforXpath("//input[@placeholder='Date']");
	}

	public WebElement getInventory_management_purchase_order_payment_date_apply_button() {
	    return waitforXpath("//button[text()='Apply']");
	}

	public WebElement getInventory_management_purchase_order_payment_details_save_button() {
	    return waitforXpath("(//button[text()='Save'])[2]");
	}

	public WebElement getInventory_management_history() {
	    return waitforXpath("//*[text()='History']");
	}

	public WebElement getInventory_management_purchase_order_grn_tab() {
	    return waitforXpath("//*[contains(text(),'	GRN')]");
	}

	public WebElement getInventory_management_purchase_order_create_grn_button() {
	    return waitforXpath("//*[contains(text(),'Create GRN Order')]");
	}

	public WebElement getInventory_management_waste_management() {
	    return waitforXpath("//*[contains(text(),'Waste Management')]");
	}

	public WebElement getInventory_management_waste_management_create_button() {
	    return waitforXpath("(//*[contains(text(),' Create waste management Order')])[2]");
	}

	public WebElement getInventory_management_waste_management_select_location() {
	    return waitforXpath("(//*[contains(text(),'Select Location')])[1]");
	}

	public WebElement getInventory_management_waste_managemnet_select_approver() {
	    return waitforXpath("//span[contains(text(),'Select Approver')]");
	}

	public WebElement getInventory_management_waste_managemnet_select_approver_select() {
	    return waitforXpath("//li[contains(text(),'Auto')]");
	}

	public WebElement getInventory_management_waste_managemnet_select_variation() {
	    return waitforXpath("//span[contains(text(),'Select Variation')]");
	}

	public WebElement getInventory_management_waste_managemnet_stock_adjustment_quantity() {
	    return waitforXpath("(//input[@type='number'])[4]");
	}

	public WebElement getInventory_management_waste_managemnet_stock_adjustment_reason() {
	    return waitforXpath("//select[@class='form-control js_stock-adjust-reason']");
	}

	public WebElement getInventory_management_waste_managemnet_add_button() {
	    return waitforXpath("//button[text()='Add']");
	}

	public WebElement getInventory_management_waste_managemnet_save_button() {
	    return waitforXpath("(//a[contains(text(),'Save')])[1]");
	}

	public WebElement getInventory_management_waste_managemnet_complete_button() {
	    return waitforXpath("(//a[contains(text(),'Complete')])");
	}

	public WebElement getInventory_management_waste_management_select_variation_input() {
	    return waitforXpath("//span[contains(text(),'Select Variation')]//following::input[8]");
	}

	public WebElement getInventory_management_preparation_order() {
	    return waitforXpath("(//*[contains(text(),'Preparation Order')])");
	}

	public WebElement getInventory_management_preparation_order_select_variation_input() {
	    return waitforXpath("//input[@spellcheck='false']");
	}

	public WebElement getInventory_management_preparation_order_quantity_input() {
	    return waitforXpath("(//input[@type='number'])[1]");
	}

	public WebElement getInventory_management_preparation_create_preparation_order() {
	    return waitforXpath("//*[contains(text(),' Create preparation Order')]");
	}

	public WebElement getInventory_management_inventory_audit() {
	    return waitforXpath("(//*[contains(text(),'Inventory Audit')])[1]");
	}

	public WebElement getInventory_management_Audit_create_inventory_audit_button() {
	    return waitforXpath("(//a[contains(text(),'Create Inventory Audit')])");
	}

	public WebElement getInventory_management_Audit_select_auditor() {
	    return waitforXpath("(//span[contains(text(),'Select Auditor')])[2]");
	}

	public WebElement getInventory_management_Audit_select_approver() {
	    return waitforXpath("(//span[contains(text(),'Select Approver')])[2]");
	}

	public WebElement getInventory_management_Audit_add_item_button() {
	    return waitforXpath("(//button[contains(text(),' Add Item')])");
	}

	public WebElement getInventory_management_Audit_variation_search_input() {
	    return waitforXpath("//input[@placeholder='Search']");
	}

	public WebElement getInventory_management_Audit_variation_checkbox_select() {
	    return waitforXpath("(//input[@type='checkbox'])[2]");
	}

	public WebElement getInventory_management_Audit_add_select_items() {
	    return waitforXpath("//button[contains(text(),'Add Selected Items')]");
	}

	public WebElement getInventory_management_Audit_count_stock_button() {
	    return waitforXpath("//a[contains(text(),'Count Stock')]");
	}

	public WebElement getInventory_management_Audit_total_phyical_stock_input() {
	    return waitforXpath("(//input[@type='number'])[1]");
	}

	public WebElement getInventory_management_Audit_stock_expired() {
	    return waitforXpath("(//input[@type='number'])[2]");
	}

	public WebElement getInventory_management_Audit_stock_damaged() {
	    return waitforXpath("(//input[@type='number'])[3]");
	}

	public WebElement getInventory_management_Audit_count_stock_save_button() {
	    return waitforXpath("(//a[contains(text(),'Save')])[2]");
	}

	public WebElement getInventory_management_Audit_send_to_approve_count_button() {
	    return waitforXpath("(//a[contains(text(),'Send to Approve Count')])");
	}

	public WebElement getInventory_management_Audit_approve_count_stock_button() {
	    return waitforXpath("(//a[contains(text(),'Approve Count Stock')])");
	}

	public WebElement getInventory_management_count_stock_difference_quantity() {
	    return waitforXpath("(//input[@class='form-control form-control-sm js_qty-difference'])[2]");
	}

	public WebElement getInventory_management_Audit_loss_quantity_input() {
	    return waitforXpath("(//input[@type='number'])[6]");
	}

	public WebElement getInventory_management_Audit_recount_quantity_input() {
	    return waitforXpath("(//input[@type='number'])[7]");
	}

	public WebElement getInventory_management_Audit_complete_count_stock_button() {
	    return waitforXpath("(//a[contains(text(),'Complete Count Stock')])");
	}

	
	
	public void Entering_the_recount_the_stock_quantity() throws InterruptedException {
		String differenceQuantity = inventory_management_count_stock_difference_quantity.getAttribute("value");
		inventory_management_Audit_recount_quantity_input.sendKeys(differenceQuantity);
		
	}
	
	
	
}
