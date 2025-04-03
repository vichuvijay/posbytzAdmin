package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import CommonFunction.CommonClass;

public class SalesPage extends CommonClass {
	
	public SalesPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()=' Sales']")
	WebElement sales_menu ;
	
	@FindBy(xpath="//*[text()='Quotation']")
	WebElement sales_quotation_tab;
	
	@FindBy(xpath="//a[text()='New Quotation']")
	WebElement sales_quotation_new_quotation_button;
	
	@FindBy(xpath="(//input[@placeholder='Select Date'])[2]")
	WebElement sales_quotation_due_date;
	
	@FindBy(xpath="(//button[contains(text(),'Apply')])[3]")
	WebElement sales_quotation_due_date_apply_button;
	
	@FindBy(xpath="//textarea[@placeholder='Enter description']")
	WebElement sales_quotation_description;
	
	@FindBy(xpath="(//i[@class='las la-pen'])[1]")
	WebElement sales_quotation_billing_address_click;
	
	@FindBy(xpath="(//i[@class='las la-pen'])[2]")
	WebElement sales_quotation_shipping_address_click;
	
	@FindBy(xpath="//input[@placeholder='Select Delivery Date']")
	WebElement sales_quotation_select_delivery_date;
	
	@FindBy(xpath="(//button[contains(text(),'Apply')])[4]")
	WebElement sales_quotation_select_delivery_date_apply_button;
	
	@FindBy(xpath="(//input[@placeholder='Reference Number'])[2]")
	WebElement sales_quotation_reference_number_input;
	
	@FindBy(xpath="//a[contains(text(),'Convert to Invoice')]")
	WebElement sales_quotation_convert_to_invoice_button;
	
	@FindBy(xpath="//button[contains(text(),'Create Invoice')]")
	WebElement sales_quotation_create_invoice_button;
	
	@FindBy(xpath="(//table//tbody//tr[1]//td[2]//a[1])[1]")
	WebElement sales_quotation_check_order_number_check;
	
	@FindBy(xpath="//*[@class='breadcrumb-item active']")
	WebElement sales_quotation_get_order_number_tranaction;
	
	
	@FindBy(xpath="(//*[contains(text(),'Transactions')])[1]")
	WebElement sales_tranaction_tab;


	public WebElement getSales_menu() {
		return sales_menu;
	}


	public WebElement getSales_quotation_tab() {
		return sales_quotation_tab;
	}


	public WebElement getSales_quotation_new_quotation_button() {
		return sales_quotation_new_quotation_button;
	}


	public WebElement getSales_quotation_due_date() {
		return sales_quotation_due_date;
	}


	public WebElement getSales_quotation_due_date_apply_button() {
		return sales_quotation_due_date_apply_button;
	}


	public WebElement getSales_quotation_description() {
		return sales_quotation_description;
	}


	public WebElement getSales_quotation_billing_address_click() {
		return sales_quotation_billing_address_click;
	}


	public WebElement getSales_quotation_shipping_address_click() {
		return sales_quotation_shipping_address_click;
	}


	public WebElement getSales_quotation_select_delivery_date() {
		return sales_quotation_select_delivery_date;
	}


	public WebElement getSales_quotation_select_delivery_date_apply_button() {
		return sales_quotation_select_delivery_date_apply_button;
	}


	public WebElement getSales_quotation_reference_number_input() {
		return sales_quotation_reference_number_input;
	}


	public WebElement getSales_quotation_convert_to_invoice_button() {
		return sales_quotation_convert_to_invoice_button;
	}


	public WebElement getSales_quotation_create_invoice_button() {
		return sales_quotation_create_invoice_button;
	}


	public WebElement getSales_quotation_check_order_number_check() {
		return sales_quotation_check_order_number_check;
	}


	public WebElement getSales_quotation_get_order_number_tranaction() {
		return sales_quotation_get_order_number_tranaction;
	}


	public WebElement getSales_tranaction_tab() {
		return sales_tranaction_tab;
	}
	
	public void getOrderNumberQuotation() {
		String  quotationOrderNumber = getSales_quotation_get_order_number_tranaction().getText();	
		String replaceAll = quotationOrderNumber.replaceAll("/ ", "");
		System.out.println(replaceAll);
		
	}
	
	public void transactionOrderNumber() {
		String transationOrderNumber = sales_quotation_check_order_number_check.getText();
		
	}
	
}
