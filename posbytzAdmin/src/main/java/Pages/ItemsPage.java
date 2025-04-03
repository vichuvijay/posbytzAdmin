package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import CommonFunction.CommonClass;

public class ItemsPage extends CommonClass {
	
	public ItemsPage() {
		PageFactory.initElements(driver, this);
	}
	/*@FindBy(xpath = "//a[text()=' Items']")
	WebElement item_menu;
	@FindBy(xpath = "//small[text()='Categories']")	
	WebElement categories_btn;
	@FindBy(xpath = "//a[text()=' Create Category']")
	WebElement create_Category_btn;
	@FindBy(xpath = "//input[@placeholder='Category Name']")
	WebElement category_name;
	@FindBy(xpath = "//a//small[text()='Brands']")
	WebElement brands_btn;
	@FindBy(xpath = "(//a[text()='Create Brand'])[1]")
	WebElement create_Brand_btn;
	@FindBy(xpath = "//input[@placeholder='Brand Name']")
	WebElement brand_name;
	@FindBy(xpath = "//small[text()='Taxes']")
	WebElement taxes_btn;
	@FindBy(xpath = "(//button[text()=' Create Tax'])[1]")
	WebElement create_Tax_btn;
	@FindBy(xpath = "// input[@placeholder='Tax Name']")
	WebElement tax_name;
	@FindBy(xpath = "//input[@name='rate']")
	WebElement tax_rate;
	@FindBy(xpath = "(//select[@name='inclusion_type'])")
	WebElement tax_type;
	@FindBy(xpath = "//small[text()='Charges']")
	WebElement charges_btn;
	@FindBy(xpath = "(//button[text()=' Create Charge'])[1]")
	WebElement create_Charge_btn;
	@FindBy(xpath = "//input[@placeholder='Charge Name']")
	WebElement charge_name;
	@FindBy(xpath = "//span[text()='Select Category']")
	WebElement charge_category;
	@FindBy(xpath = "//li[text()='Delivery Charges']")
	WebElement delivery_charge;
	@FindBy(xpath = "//li[text()='Payment Charges']")
	WebElement payment_charge;
	@FindBy(xpath = "//li[text()='Order Packing Charges']")
	WebElement order_packing_charge;
	@FindBy(xpath = "//li[text()='Custom Charges']")
	WebElement custom_charge;
	@FindBy(xpath = "//li[text()='Service Charges']")
	WebElement service_charge;
	@FindBy(xpath = "//select[@name='type']")
	WebElement charge_type;
	@FindBy(xpath = "//input[@placeholder='Value']")
	WebElement charge_value;
	@FindBy(xpath = "//label[text()='Online Store']")
	WebElement is_online;
	@FindBy(xpath = "//label[text()='Apply Automatically']")
	WebElement apply_automatically;
	@FindBy(xpath = "//input[@placeholder='Base Delivery(KMs)']")
	WebElement base_distance;
	@FindBy(xpath = "//input[@placeholder='Delivery Cost per KM']")
	WebElement additional_cost_per_km;
	@FindBy(xpath = "//a[text()=' ADD']")
	WebElement add_btn;
	@FindBy(xpath = "//small[text()='Price Categories']")
	WebElement pcategories_btn;
	@FindBy(xpath = "//button[text()=' Create Price Category']")
	WebElement create_pCategory_btn;
	@FindBy(xpath = "(//select[@name='category_type'])[5]")
	WebElement create_pCategorytype_btn;
	@FindBy(xpath = "(//input[@placeholder='Price Category Name'])[1]")
	WebElement pCategory_name;
	@FindBy(xpath = "(//select[@name='price_type'])[1]")
	WebElement pCategory_value_type;
	@FindBy(xpath = "(//input[@placeholder='Value'])[1]")
	WebElement pCategory_value;
	@FindBy(xpath = "//a//small[text()='Attribute Values']")
	WebElement attributes_btn;
	@FindBy(xpath = "(//button[text()=' Create'])[1]")
	WebElement create_attribute_btn;
	@FindBy(xpath = "//span[text()='Select Attribute']")
	WebElement select_attribute_btn;
	@FindBy(xpath = "//input[@role='searchbox']")
	WebElement search_attribute;
	@FindBy(xpath = "//ul/li[text()='weight']")
	WebElement weight_attribute;
	@FindBy(xpath = "//input[@name='value']")
	WebElement attribute_value;
	@FindBy(xpath = "//small[text()='Item Library']")
	WebElement item_library;
	@FindBy(xpath = "//a[text()=' Create Item']")
	WebElement create_item;
	@FindBy(xpath = "//input[@placeholder='Item Name']")
	WebElement item_name;
	@FindBy(xpath = "//span[text()='Select Category']")
	WebElement select_category_btn;
	@FindBy(xpath = "//div[@class='form-group']//span[text()='Select Brand']")
	WebElement select_brand_btn;
	@FindBy(xpath = "//li[text()='Biriyani']")
	WebElement category;
	@FindBy(xpath = "(//button[text()=' Add Variation'])[1]")
	WebElement add_variation;
	@FindBy(xpath = "//input[@placeholder='Variation Name']")
	WebElement variation_name;
	@FindBy(xpath = "(//select[@name='type'])[1]")
	WebElement variation_type;
	@FindBy(xpath = "//span[text()='Select Unit Measure Type']")
	WebElement uom_type;
	@FindBy(xpath = "//li[text()='weight']")
	WebElement weight_uom;
	@FindBy(xpath ="//input[@name='sku']")
	WebElement sku;
	@FindBy(xpath = "//select[@name='food_type']")
	WebElement food_type;
	@FindBy(xpath = "//a[@class='float-right btn btn-primary ld-ext-right js_variation-form-submitV2']")
	WebElement submit;
	@FindBy(xpath = "//button[text()=' Add Inventory']")
	WebElement add_inventory;
	@FindBy(xpath = "//select[@name='pricing_type']")
	WebElement pricing_type;
	@FindBy(xpath = "//input[@name='buying_price']")
	WebElement buying_price;
	@FindBy(xpath = "//input[@name='mrp']")
	WebElement mrp;
	@FindBy(xpath = "//input[@placeholder='Selling Price']")
	WebElement selling_price;
	@FindBy(xpath = "//label[text()='Selling Taxes']/following-sibling::div//input[@placeholder='Select Taxes']")
	WebElement selling_tax;
	@FindBy(xpath = "//label[text()='Buying Taxes']/following-sibling::div//input[@placeholder='Select Taxes']")
	WebElement buying_tax;
	@FindBy(xpath="(//span[@class='select2-selection__placeholder'])[2]")
	WebElement pcategory_choose;
	@FindBy(xpath = "//button[text()='Add']")
	WebElement pcategory_add;
	@FindBy(xpath = "//input[@placeholder='Stock']")
	WebElement stock;
	@FindBy(xpath = "(//input[@placeholder='Low Stock Alert'])")
	WebElement low_stock;
	@FindBy(xpath = "//label[text()='Track Online Inventory']")
	WebElement track_online;
	@FindBy(xpath = "//button[text()='OK']")
	WebElement ok_button;
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement yes_button;
	@FindBy(xpath = "(//button[text()='Save'])")
	WebElement save_btn;
	@FindBy(xpath = "//div/p/span[text()='Total Variation']")
	WebElement totalVariation_btn;
	@FindBy(xpath = "//a[text()='Attributes']")
	WebElement map_attribute_btn;
	@FindBy(xpath = "//button[@class='pull-right btn btn-outline-primary js_variation-attribute-modalV2']")
	WebElement add_attribute_btn;
	@FindBy(xpath = "//span[@title='Select Value']")
	WebElement select_attribute_value;
	@FindBy(xpath = "//ul//li[text()='weight']")
	WebElement map_attribute_value;
	@FindBy(xpath = "//span/ul/li")
	WebElement choose_attribute_value;
	@FindBy(xpath = "//button[text()='Save']")
	WebElement save_attribute_value;
	@FindBy(xpath = "//a[@class='js_item-form-load mr-2 btn btn-outline-primary btn-sm mb-2']")
	WebElement item_edit_btn;
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	WebElement tax_save_btn;
	@FindBy(xpath="//button[@class='iziToast-close']")
	WebElement toast_close;
	@FindBy(xpath="//button[@class='js_category btn btn-outline-primary btn-sm btn-block-xs mb-2']")
	WebElement category_edit;
	@FindBy(xpath="//a[@class='btn btn-outline-primary btn-sm shadow-none js_brand-form-load btn-block-xs mb-2 mx-2']")
	WebElement brand_edit;
	@FindBy(xpath="//a[@class='js_tax btn btn-outline-primary btn-sm btn-block-xs mb-2']")
	WebElement tax_edit;
	@FindBy(xpath="(//a[@class='js_price-category btn btn-outline-primary btn-sm btn-block-xs mb-2 mr-2'])[5]")
	WebElement pcategory_edit;
	@FindBy(xpath="(//input[@placeholder='Tax Name'])[2]")
	WebElement editTax_name;
	@FindBy(xpath="(//input[@name='rate'])[2]")
	WebElement editTax_rate;
	@FindBy(xpath = "(//select[@name='inclusion_type'])[2]")
	WebElement edit_tax_type;
	@FindBy(xpath="(//input[@placeholder='Price Category Name'])[6]")
	WebElement editPcategory_name;
	@FindBy(xpath="(//input[@placeholder='Value'])[6]")
	WebElement editPcategory_rate;
	@FindBy(xpath = "(//button[text()='Save'])[6]")
	WebElement pcategory_save_btn;
	@FindBy(xpath = "//a[@href='/item/discounts/']")
	WebElement discounts;
	@FindBy(xpath = "//button[@data-modal='#js_discount-create']")
	WebElement create_discount;
	@FindBy(xpath = "(//input[@placeholder='Name'])[1]")
	WebElement discount_name;
	@FindBy(xpath = "//input[@placeholder='Select Location']")
	WebElement discount_location;
	@FindBy(xpath = "//ul/li[@class='select2-results__option select2-results__option--highlighted']")
	WebElement discount_location_choose;
	@FindBy(xpath = "(//select[@class='form-control js_buy-criteria js_required'])[1]")
	WebElement buy_criteria;
	@FindBy(xpath = "(//select[@class='form-control js_required js_prerequisite-name'])[1]")
	WebElement buy_subtotal;
	@FindBy(xpath = "(//input[@class='form-control js_required js_number js_prerequisite-key'])[1]")
	WebElement prereq_value;
	@FindBy(xpath = "(//select[@class='form-control js_get-criteria js_required'])[1]")
	WebElement get_criteria;
	@FindBy(xpath = "(//select[@class='form-control js_required js_discount-key js_order-discount-type'])[1]")
	WebElement get_discount_type;
	@FindBy(xpath = "(//input[@class='form-control js_required js_number js_discount-key js_discount-value'])[1]")
	WebElement discount_value;
	@FindBy(xpath = "(//a[text()='Save '])[1]")
	WebElement discount_save_btn;
	@FindBy(xpath = "//a[@class='js_charge btn btn-outline-primary btn-sm btn-block-xs mb-2']")
	WebElement attribute_edit;
	@FindBy(xpath = "(//input[@name='value'])[2]")
	WebElement attribute_edit_value;
	@FindBy(xpath = "//a[text()='View']")
	WebElement item_view;
	@FindBy(xpath = "//div/button[@class='btn btn-outline-primary btn-sm mr-2 mb-2 js_item-inventory-btn']")
	WebElement inventroy_edit;
	@FindBy(xpath = "(//tbody/tr[2]/td/a)")
	WebElement modifier_link;*/
	
	@FindBy(xpath = "//a[text()=' Items']")
	WebElement itemMenu;
	@FindBy(xpath = "//small[text()='Categories']")  
	WebElement categoriesBtn;
	@FindBy(xpath = "//a[text()=' Create Category']")
	WebElement createCategoryBtn;
	@FindBy(xpath = "//input[@placeholder='Category Name']")
	WebElement categoryName;
	@FindBy(xpath = "//a//small[text()='Brands']")
	WebElement brandsBtn;
	@FindBy(xpath = "(//a[text()='Create Brand'])[1]")
	WebElement createBrandBtn;
	@FindBy(xpath = "//input[@placeholder='Brand Name']")
	WebElement brandName;
	@FindBy(xpath = "//small[text()='Taxes']")
	WebElement taxesBtn;
	@FindBy(xpath = "(//button[text()=' Create Tax'])[1]")
	WebElement createTaxBtn;
	@FindBy(xpath = "// input[@placeholder='Tax Name']")
	WebElement taxName;
	@FindBy(xpath = "//input[@name='rate']")
	WebElement taxRate;
	@FindBy(xpath = "(//select[@name='inclusion_type'])")
	WebElement taxType;
	@FindBy(xpath = "//small[text()='Charges']")
	WebElement chargesBtn;
	@FindBy(xpath = "(//button[text()=' Create Charge'])[1]")
	WebElement createChargeBtn;
	@FindBy(xpath = "//input[@placeholder='Charge Name']")
	WebElement chargeName;
	@FindBy(xpath = "//span[text()='Select Category']")
	WebElement chargeCategory;
	@FindBy(xpath = "//li[text()='Delivery Charges']")
	WebElement deliveryCharge;
	@FindBy(xpath = "//li[text()='Payment Charges']")
	WebElement paymentCharge;
	@FindBy(xpath = "//li[text()='Order Packing Charges']")
	WebElement orderPackingCharge;
	@FindBy(xpath = "//li[text()='Custom Charges']")
	WebElement customCharge;
	@FindBy(xpath = "//li[text()='Service Charges']")
	WebElement serviceCharge;
	@FindBy(xpath = "//select[@name='type']")
	WebElement chargeType;
	@FindBy(xpath = "//input[@placeholder='Value']")
	WebElement chargeValue;
	@FindBy(xpath = "//label[text()='Online Store']")
	WebElement isOnline;
	@FindBy(xpath = "//label[text()='Apply Automatically']")
	WebElement applyAutomatically;
	@FindBy(xpath = "//input[@placeholder='Base Delivery(KMs)']")
	WebElement baseDistance;
	@FindBy(xpath = "//input[@placeholder='Delivery Cost per KM']")
	WebElement additionalCostPerKm;
	@FindBy(xpath = "//a[text()=' ADD']")
	WebElement addBtn;
	@FindBy(xpath = "//small[text()='Price Categories']")
	WebElement pcategoriesBtn;
	@FindBy(xpath = "//button[text()=' Create Price Category']")
	WebElement createPCategoryBtn;
	@FindBy(xpath = "(//select[@name='category_type'])[5]")
	WebElement createPCategorytypeBtn;
	@FindBy(xpath = "(//input[@placeholder='Price Category Name'])[1]")
	WebElement pCategoryName;
	@FindBy(xpath = "(//select[@name='price_type'])[1]")
	WebElement pCategoryValueType;
	@FindBy(xpath = "(//input[@placeholder='Value'])[1]")
	WebElement pCategoryValue;
	@FindBy(xpath = "//a//small[text()='Attribute Values']")
	WebElement attributesBtn;
	@FindBy(xpath = "(//button[text()=' Create'])[1]")
	WebElement createAttributeBtn;
	@FindBy(xpath = "//span[text()='Select Attribute']")
	WebElement selectAttributeBtn;
	@FindBy(xpath = "//input[@role='searchbox']")
	WebElement searchAttribute;
	@FindBy(xpath = "//ul/li[text()='weight']")
	WebElement weightAttribute;
	@FindBy(xpath = "//input[@name='value']")
	WebElement attributeValue;
	@FindBy(xpath = "//small[text()='Item Library']")
	WebElement itemLibrary;
	@FindBy(xpath = "//a[text()=' Create Item']")
	WebElement createItem;
	@FindBy(xpath = "//input[@placeholder='Item Name']")
	WebElement itemName;
	@FindBy(xpath = "//span[text()='Select Category']")
	WebElement selectCategoryBtn;
	@FindBy(xpath = "//div[@class='form-group']//span[text()='Select Brand']")
	WebElement selectBrandBtn;
	@FindBy(xpath = "//li[text()='Biriyani']")
	WebElement category;
	@FindBy(xpath = "(//button[text()=' Add Variation'])[1]")
	WebElement addVariation;
	@FindBy(xpath = "//input[@placeholder='Variation Name']")
	WebElement variationName;
	@FindBy(xpath = "(//select[@name='type'])[1]")
	WebElement variationType;
	@FindBy(xpath = "//span[text()='Select Unit Measure Type']")
	WebElement uomType;
	@FindBy(xpath = "//li[text()='weight']")
	WebElement weightUom;
	@FindBy(xpath ="//input[@name='sku']")
	WebElement sku;
	@FindBy(xpath = "//select[@name='food_type']")
	WebElement foodType;
	@FindBy(xpath = "//a[@class='float-right btn btn-primary ld-ext-right js_variation-form-submitV2']")
	WebElement submit;
	@FindBy(xpath = "//button[text()=' Add Inventory']")
	WebElement addInventory;
	@FindBy(xpath = "//select[@name='pricing_type']")
	WebElement pricingType;
	@FindBy(xpath = "//input[@name='buying_price']")
	WebElement buyingPrice;
	@FindBy(xpath = "//input[@name='mrp']")
	WebElement mrp;
	@FindBy(xpath = "//input[@placeholder='Selling Price']")
	WebElement sellingPrice;
	@FindBy(xpath = "//label[text()='Selling Taxes']/following-sibling::div//input[@placeholder='Select Taxes']")
	WebElement sellingTax;
	@FindBy(xpath = "//label[text()='Buying Taxes']/following-sibling::div//input[@placeholder='Select Taxes']")
	WebElement buyingTax;
	@FindBy(xpath="(//span[@class='select2-selection__placeholder'])[2]")
	WebElement pcategoryChoose;
	@FindBy(xpath = "//button[text()='Add']")
	WebElement pcategoryAdd;
	@FindBy(xpath = "//input[@placeholder='Stock']")
	WebElement stock;
	@FindBy(xpath = "(//input[@placeholder='Low Stock Alert'])")
	WebElement lowStock;
	@FindBy(xpath = "//label[text()='Track Online Inventory']")
	WebElement trackOnline;
	@FindBy(xpath = "//button[text()='OK']")
	WebElement okButton;
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement yesButton;
	@FindBy(xpath = "(//button[text()='Save'])")
	WebElement saveBtn;
	@FindBy(xpath = "//div/p/span[text()='Total Variation']")
	WebElement totalVariationBtn;
	@FindBy(xpath = "//a[text()='Attributes']")
	WebElement mapAttributeBtn;
	@FindBy(xpath = "//button[@class='pull-right btn btn-outline-primary js_variation-attribute-modalV2']")
	WebElement addAttributeBtn;
	@FindBy(xpath = "//span[@title='Select Value']")
	WebElement selectAttributeValue;
	@FindBy(xpath = "//ul//li[text()='weight']")
	WebElement mapAttributeValue;
	@FindBy(xpath = "//span/ul/li")
	WebElement chooseAttributeValue;
	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveAttributeValue;
	@FindBy(xpath = "//a[@class='js_item-form-load mr-2 btn btn-outline-primary btn-sm mb-2']")
	WebElement itemEditBtn;
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	WebElement taxSaveBtn;
	@FindBy(xpath="//button[@class='iziToast-close']")
	WebElement toastClose;
	@FindBy(xpath="//button[@class='js_category btn btn-outline-primary btn-sm btn-block-xs mb-2']")
	WebElement categoryEdit;
	@FindBy(xpath="//a[@class='btn btn-outline-primary btn-sm shadow-none js_brand-form-load btn-block-xs mb-2 mx-2']")
	WebElement brandEdit;
	@FindBy(xpath="//a[@class='js_tax btn btn-outline-primary btn-sm btn-block-xs mb-2']")
	WebElement taxEdit;
	@FindBy(xpath="(//a[@class='js_price-category btn btn-outline-primary btn-sm btn-block-xs mb-2 mr-2'])[5]")
	WebElement pcategoryEdit;
	@FindBy(xpath="(//input[@placeholder='Tax Name'])[2]")
	WebElement editTaxName;
	@FindBy(xpath="(//input[@name='rate'])[2]")
	WebElement editTaxRate;
	@FindBy(xpath = "(//select[@name='inclusion_type'])[2]")
	WebElement editTaxType;
	@FindBy(xpath="(//input[@placeholder='Price Category Name'])[6]")
	WebElement editPCategoryName;
	@FindBy(xpath="(//input[@placeholder='Value'])[6]")
	WebElement editPCategoryRate;
	@FindBy(xpath = "(//button[text()='Save'])[6]")
	WebElement pcategorySaveBtn;
	@FindBy(xpath = "//a[@href='/item/discounts/']")
	WebElement discounts;
	@FindBy(xpath = "//button[@data-modal='#js_discount-create']")
	WebElement createDiscount;
	@FindBy(xpath = "(//input[@placeholder='Name'])[1]")
	WebElement discountName;
	@FindBy(xpath = "//input[@placeholder='Select Location']")
	WebElement discountLocation;
	@FindBy(xpath = "//ul/li[@class='select2-results__option select2-results__option--highlighted']")
	WebElement discountLocationChoose;
	@FindBy(xpath = "(//select[@class='form-control js_buy-criteria js_required'])[1]")
	WebElement buyCriteria;
	@FindBy(xpath = "(//select[@class='form-control js_required js_prerequisite-name'])[1]")
	WebElement buySubtotal;
	@FindBy(xpath = "(//input[@class='form-control js_required js_number js_prerequisite-key'])[1]")
	WebElement prereqValue;
	@FindBy(xpath = "(//select[@class='form-control js_get-criteria js_required'])[1]")
	WebElement getCriteria;
	@FindBy(xpath = "(//select[@class='form-control js_required js_discount-key js_order-discount-type'])[1]")
	WebElement getDiscountType;
	@FindBy(xpath = "(//input[@class='form-control js_required js_number js_discount-key js_discount-value'])[1]")
	WebElement discountValue;
	@FindBy(xpath = "(//a[text()='Save '])[1]")
	WebElement discountSaveBtn;
	@FindBy(xpath = "//a[@class='js_charge btn btn-outline-primary btn-sm btn-block-xs mb-2']")
	WebElement attributeEdit;
	@FindBy(xpath = "(//input[@name='value'])[2]")
	WebElement attributeEditValue;
	@FindBy(xpath = "//a[text()='View']")
	WebElement itemView;
	@FindBy(xpath = "//div/button[@class='btn btn-outline-primary btn-sm mr-2 mb-2 js_item-inventory-btn']")
	WebElement inventroyEdit;
	@FindBy(xpath = "(//tbody/tr[2]/td/a)")
	WebElement modifierLink;

	public WebElement getItemMenu() {
	    return waitforXpath("//a[text()=' Items']");
	}

	public WebElement getCategoriesBtn() {
	    return waitforXpath("//small[text()='Categories']");
	}

	public WebElement getCreateCategoryBtn() {
	    return waitforXpath("//a[text()=' Create Category']");
	}

	public WebElement getCategoryName() {
	    return waitforXpath("//input[@placeholder='Category Name']");
	}

	public WebElement getBrandsBtn() {
	    return waitforXpath("//a//small[text()='Brands']");
	}

	public WebElement getCreateBrandBtn() {
	    return waitforXpath("(//a[text()='Create Brand'])[1]");
	}

	public WebElement getBrandName() {
	    return waitforXpath("//input[@placeholder='Brand Name']");
	}

	public WebElement getTaxesBtn() {
	    return waitforXpath("//small[text()='Taxes']");
	}

	public WebElement getCreateTaxBtn() {
	    return waitforXpath("(//button[text()=' Create Tax'])[1]");
	}

	public WebElement getTaxName() {
	    return waitforXpath("// input[@placeholder='Tax Name']");
	}

	public WebElement getTaxRate() {
	    return waitforXpath("//input[@name='rate']");
	}

	public WebElement getTaxType() {
	    return waitforXpath("(//select[@name='inclusion_type'])");
	}

	public WebElement getChargesBtn() {
	    return waitforXpath("//small[text()='Charges']");
	}

	public WebElement getCreateChargeBtn() {
	    return waitforXpath("(//button[text()=' Create Charge'])[1]");
	}

	public WebElement getChargeName() {
	    return waitforXpath("//input[@placeholder='Charge Name']");
	}

	public WebElement getChargeCategory() {
	    return waitforXpath("//span[text()='Select Category']");
	}

	public WebElement getDeliveryCharge() {
	    return waitforXpath("//li[text()='Delivery Charges']");
	}

	public WebElement getPaymentCharge() {
	    return waitforXpath("//li[text()='Payment Charges']");
	}

	public WebElement getOrderPackingCharge() {
	    return waitforXpath("//li[text()='Order Packing Charges']");
	}

	public WebElement getCustomCharge() {
	    return waitforXpath("//li[text()='Custom Charges']");
	}

	public WebElement getServiceCharge() {
	    return waitforXpath("//li[text()='Service Charges']");
	}

	public WebElement getChargeType() {
	    return waitforXpath("//select[@name='type']");
	}

	public WebElement getChargeValue() {
	    return waitforXpath("//input[@placeholder='Value']");
	}

	public WebElement getIsOnline() {
	    return waitforXpath("//label[text()='Online Store']");
	}

	public WebElement getApplyAutomatically() {
	    return waitforXpath("//label[text()='Apply Automatically']");
	}

	public WebElement getBaseDistance() {
	    return waitforXpath("//input[@placeholder='Base Delivery(KMs)']");
	}

	public WebElement getAdditionalCostPerKm() {
	    return waitforXpath("//input[@placeholder='Delivery Cost per KM']");
	}

	public WebElement getAddBtn() {
	    return waitforXpath("//a[text()=' ADD']");
	}

	public WebElement getPCategoriesBtn() {
	    return waitforXpath("//small[text()='Price Categories']");
	}

	public WebElement getCreatePCategoryBtn() {
	    return waitforXpath("//button[text()=' Create Price Category']");
	}

	public WebElement getCreatePCategoryTypeBtn() {
	    return waitforXpath("(//select[@name='category_type'])[5]");
	}

	public WebElement getPCategoryName() {
	    return waitforXpath("(//input[@placeholder='Price Category Name'])[1]");
	}

	public WebElement getPCategoryValueType() {
	    return waitforXpath("(//select[@name='price_type'])[1]");
	}

	public WebElement getPCategoryValue() {
	    return waitforXpath("(//input[@placeholder='Value'])[1]");
	}

	public WebElement getAttributesBtn() {
	    return waitforXpath("//a//small[text()='Attribute Values']");
	}

	public WebElement getCreateAttributeBtn() {
	    return waitforXpath("(//button[text()=' Create'])[1]");
	}

	public WebElement getSelectAttributeBtn() {
	    return waitforXpath("//span[text()='Select Attribute']");
	}

	public WebElement getSearchAttribute() {
	    return waitforXpath("//input[@role='searchbox']");
	}

	public WebElement getWeightAttribute() {
	    return waitforXpath("//ul/li[text()='weight']");
	}

	public WebElement getAttributeValue() {
	    return waitforXpath("//input[@name='value']");
	}

	public WebElement getItemLibrary() {
	    return waitforXpath("//small[text()='Item Library']");
	}

	public WebElement getCreateItem() {
	    return waitforXpath("//a[text()=' Create Item']");
	}

	public WebElement getItemName() {
	    return waitforXpath("//input[@placeholder='Item Name']");
	}

	public WebElement getSelectCategoryBtn() {
	    return waitforXpath("//span[text()='Select Category']");
	}

	public WebElement getSelectBrandBtn() {
	    return waitforXpath("//div[@class='form-group']//span[text()='Select Brand']");
	}

	public WebElement getCategory() {
	    return waitforXpath("//li[text()='Biriyani']");
	}

	public WebElement getAddVariation() {
	    return waitforXpath("(//button[text()=' Add Variation'])[1]");
	}

	public WebElement getVariationName() {
	    return waitforXpath("//input[@placeholder='Variation Name']");
	}

	public WebElement getVariationType() {
	    return waitforXpath("(//select[@name='type'])[1]");
	}

	public WebElement getUomType() {
	    return waitforXpath("//span[text()='Select Unit Measure Type']");
	}

	public WebElement getWeightUom() {
	    return waitforXpath("//li[text()='weight']");
	}
	public WebElement getVolumeUom() {
	    return waitforXpath("//li[text()='weight']");
	}

	public WebElement getSku() {
	    return waitforXpath("//input[@name='sku']");
	}

	public WebElement getFoodType() {
	    return waitforXpath("//select[@name='food_type']");
	}

	public WebElement getSubmit() {
	    return waitforXpath("//a[@class='float-right btn btn-primary ld-ext-right js_variation-form-submitV2']");
	}

	public WebElement getAddInventory() {
	    return waitforXpath("//button[text()=' Add Inventory']");
	}

	public WebElement getPricingType() {
	    return waitforXpath("//select[@name='pricing_type']");
	}

	public WebElement getBuyingPrice() {
	    return waitforXpath("//input[@name='buying_price']");
	}

	public WebElement getMrp() {
	    return waitforXpath("//input[@name='mrp']");
	}

	public WebElement getSellingPrice() {
	    return waitforXpath("//input[@placeholder='Selling Price']");
	}

	public WebElement getSellingTax() {
	    return waitforXpath("//label[text()='Selling Taxes']/following-sibling::div//input[@placeholder='Select Taxes']");
	}

	public WebElement getBuyingTax() {
	    return waitforXpath("//label[text()='Buying Taxes']/following-sibling::div//input[@placeholder='Select Taxes']");
	}

	public WebElement getPCategoryChoose() {
	    return waitforXpath("(//span[@class='select2-selection__placeholder'])[2]");
	}

	public WebElement getPCategoryAdd() {
	    return waitforXpath("//button[text()='Add']");
	}

	public WebElement getStock() {
	    return waitforXpath("//input[@placeholder='Stock']");
	}

	public WebElement getLowStock() {
	    return waitforXpath("(//input[@placeholder='Low Stock Alert'])");
	}

	public WebElement getTrackOnline() {
	    return waitforXpath("//label[text()='Track Online Inventory']");
	}

	public WebElement getOkButton() {
	    return waitforXpath("//button[text()='OK']");
	}

	public WebElement getYesButton() {
	    return waitforXpath("//button[text()='Yes']");
	}

	public WebElement getSaveBtn() {
	    return waitforXpath("(//button[text()='Save'])");
	}

	public WebElement getTotalVariationBtn() {
	    return waitforXpath("//div/p/span[text()='Total Variation']");
	}

	public WebElement getMapAttributeBtn() {
	    return waitforXpath("//a[text()='Attributes']");
	}

	public WebElement getAddAttributeBtn() {
	    return waitforXpath("//button[@class='pull-right btn btn-outline-primary js_variation-attribute-modalV2']");
	}

	public WebElement getSelectAttributeValue() {
	    return waitforXpath("//span[@title='Select Value']");
	}

	public WebElement getMapAttributeValue() {
	    return waitforXpath("//ul//li[text()='weight']");
	}

	public WebElement getChooseAttributeValue() {
	    return waitforXpath("//span[@class='select2-results']/ul/li[text()='1']");
	}

	public WebElement getSaveAttributeValue() {
	    return waitforXpath("//button[text()='Save']");
	}

	public WebElement getItemEditBtn() {
	    return waitforXpath("//a[@class='js_item-form-load mr-2 btn btn-outline-primary btn-sm mb-2']");
	}

	public WebElement getTaxSaveBtn() {
	    return waitforXpath("(//button[text()='Save'])[2]");
	}

	public WebElement getToastClose() {
	    return waitforXpath("//button[@class='iziToast-close']");
	}

	public WebElement getCategoryEdit() {
	    return waitforXpath("//button[@class='js_category btn btn-outline-primary btn-sm btn-block-xs mb-2']");
	}

	public WebElement getBrandEdit() {
	    return waitforXpath("//a[@class='btn btn-outline-primary btn-sm shadow-none js_brand-form-load btn-block-xs mb-2 mx-2']");
	}

	public WebElement getTaxEdit() {
	    return waitforXpath("//a[@class='js_tax btn btn-outline-primary btn-sm btn-block-xs mb-2']");
	}

	public WebElement getPCategoryEdit() {
	    return waitforXpath("(//a[@class='js_price-category btn btn-outline-primary btn-sm btn-block-xs mb-2 mr-2'])[5]");
	}

	public WebElement getEditTaxName() {
	    return waitforXpath("(//input[@placeholder='Tax Name'])[2]");
	}

	public WebElement getEditTaxRate() {
	    return waitforXpath("(//input[@name='rate'])[2]");
	}

	public WebElement getEditTaxType() {
	    return waitforXpath("(//select[@name='inclusion_type'])[2]");
	}

	public WebElement getEditPCategoryName() {
	    return waitforXpath("(//input[@placeholder='Price Category Name'])[6]");
	}

	public WebElement getEditPCategoryRate() {
	    return waitforXpath("(//input[@placeholder='Value'])[6]");
	}

	public WebElement getPCategorySaveBtn() {
	    return waitforXpath("(//button[text()='Save'])[6]");
	}

	public WebElement getDiscounts() {
	    return waitforXpath("//a[@href='/item/discounts/']");
	}

	public WebElement getCreateDiscount() {
	    return waitforXpath("//button[@data-modal='#js_discount-create']");
	}

	public WebElement getDiscountName() {
	    return waitforXpath("(//input[@placeholder='Name'])[1]");
	}

	public WebElement getDiscountLocation() {
	    return waitforXpath("//input[@placeholder='Select Location']");
	}

	public WebElement getDiscountLocationChoose() {
	    return waitforXpath("//ul/li[@class='select2-results__option select2-results__option--highlighted']");
	}

	public WebElement getBuyCriteria() {
	    return waitforXpath("(//select[@class='form-control js_buy-criteria js_required'])[1]");
	}

	public WebElement getBuySubtotal() {
	    return waitforXpath("(//select[@class='form-control js_required js_prerequisite-name'])[1]");
	}

	public WebElement getPrereqValue() {
	    return waitforXpath("(//input[@class='form-control js_required js_number js_prerequisite-key'])[1]");
	}

	public WebElement getGetCriteria() {
	    return waitforXpath("(//select[@class='form-control js_get-criteria js_required'])[1]");
	}

	public WebElement getGetDiscountType() {
	    return waitforXpath("(//select[@class='form-control js_required js_discount-key js_order-discount-type'])[1]");
	}

	public WebElement getDiscountValue() {
	    return waitforXpath("(//input[@class='form-control js_required js_number js_discount-key js_discount-value'])[1]");
	}

	public WebElement getDiscountSaveBtn() {
	    return waitforXpath("(//a[text()='Save '])[1]");
	}

	public WebElement getAttributeEdit() {
	    return waitforXpath("//a[@class='js_charge btn btn-outline-primary btn-sm btn-block-xs mb-2']");
	}

	public WebElement getAttributeEditValue() {
	    return waitforXpath("(//input[@name='value'])[2]");
	}

	public WebElement getItemView() {
	    return waitforXpath("//a[text()='View']");
	}

	public WebElement getInventoryEdit() {
	    return waitforXpath("//div/button[@class='btn btn-outline-primary btn-sm mr-2 mb-2 js_item-inventory-btn']");
	}

	public WebElement getModifierLink() {
	    return waitforXpath("//tbody[@id='variation-content']/tr[2]/td/a");
	}

	public WebElement getIngredientLink() {
	    return waitforXpath("//tbody[@id='variation-content']/tr[3]/td/a");
	}
	public WebElement getRecipeLink() {
	    return waitforXpath("//tbody[@id='variation-content']/tr[4]/td/a");
	}
	public WebElement getMainItemLink() {
	    return waitforXpath("//tbody[@id='variation-content']/tr[1]/td/a");
	}
	public WebElement getIngredientRecipeLink() {
	    return waitforXpath("//ul/li/a[text()='Ingredients/Recipe']");
	}
	public WebElement getAddIngredientRecipeLink() {
	    return waitforXpath("//button[text()='Add Ingredient / Recipe']");
	}
	public WebElement getAddIngredientRecipeLink2() {
	    return waitforXpath("//button[text()=' Add Ingredient / Recipe']");
		//button[@class='float-right btn btn-outline-primary js_ingredients-form-btn']

	}
	public WebElement getIgredientRecipeType() {
	    return waitforXpath("(//select[@name='type'])");
	}
	public WebElement getSelectIgredient() {
	    return waitforXpath("//span/span[text()='Select Variation']");
	}
	public WebElement getChooseIgredient() {
	    return waitforXpath("//ul/li[text()='oil ingredient']");
	}
	public WebElement getChooseRecipe() {
	    return waitforXpath("//ul/li[text()='ginger garlic paste']");
	}
	public WebElement getIgredientValue() {
	    return waitforXpath("//input[@placeholder='Quantity']");
	}
	public WebElement getIngredienRecipetUomType() {
	    return waitforXpath("//select[@name='unit_measure_type']");
	}
	public WebElement getModifierMapLink() {
	    return waitforXpath("//ul/li/a[text()='Modifiers']");
	}
	public WebElement getAddModifier() {
	    return waitforXpath("//button[text()=' Add Modifier']");
	}
	public WebElement getModifierSetName() {
	    return waitforXpath("//input[@placeholder='Name']");
	}
	public WebElement getModifierOptions() {
	    return waitforXpath("//input[@placeholder='Select Variation']");
	}
	public WebElement getChooseModifierOptions() {
	    return waitforXpath("//ul/li[text()='modifier raitha']");
	}
	public WebElement getModifierPosition() {
	    return waitforXpath("//input[@name='position']");
	}
	public WebElement getIsMultiChoice() {
	    return waitforXpath("//input[@name='is_multi_choice']");
	}
	public WebElement getDefaultSelectFirstOption() {
	    return waitforXpath("//input[@name='is_required']");
	}
	public WebElement getMinimumOptions() {
	    return waitforXpath("//input[@placeholder='Minimum Options Selectable']");
	}
	public WebElement getMaximumOptions() {
	    return waitforXpath("//input[@placeholder='Maximum Options Selectable']");
	}
	public void changing_the_taxes_detail() throws IOException, InterruptedException {
		waitforclick(getEditTaxName()).clear();
		getEditTaxName().sendKeys(loadPropertyFile("inctaxname"));
		getEditTaxRate().clear();
		getEditTaxRate().sendKeys("5");
		getEditTaxType().click();
		selectByText("Include Tax in Item Price", getEditTaxType());
	}
	public void changing_the_pcategory_detail() throws IOException, InterruptedException {
		waitforclick(getEditPCategoryName()).clear();
		getEditPCategoryName().sendKeys("regression price category new");
		getEditPCategoryRate().clear();
		getEditPCategoryRate().sendKeys("25");
	}
}
