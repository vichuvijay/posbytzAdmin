package PageFactory;

import Pages.RegistrationPage;
import Pages.ReportsPage;
import Pages.RestaurantManagementPage;
import Pages.SalesPage;
import Pages.StorePage;
import Pages.AccountSettingsPage;
import Pages.AccountingPage;
import Pages.CommunicationPage;
import Pages.CustomersPage;
import Pages.DashboardPage;
import Pages.EmployeesPage;
import Pages.ExportPage;
import Pages.HomePage;
import Pages.ImportPage;
import Pages.InventoryManagementPage;
import Pages.ItemsPage;
import Pages.LoginPage;
import Pages.LoyaltyManagementPage;

public class PagesFactory {

	public RegistrationPage registerpage;
	public LoginPage loginpage;
	public HomePage homepage;
	public DashboardPage dashboardpage;
	public SalesPage salespage;
	public ReportsPage reportspage;
	public ItemsPage itemspage;
	public CustomersPage customerspage;
	public EmployeesPage employeespage;
	public InventoryManagementPage inventorymanagementpage;
	public RestaurantManagementPage restaurantmanagementpage;
	public LoyaltyManagementPage loyaltymanagementpage;
	public ImportPage importpage;
	public ExportPage exportpage;
	public AccountingPage accountingpage;
	public CommunicationPage communicationpage;
	public StorePage storepage;
	public AccountSettingsPage accountsettingspage;
	
	
	public RegistrationPage getRegisterpage() {
		return (registerpage == null)? registerpage = new RegistrationPage(): registerpage;
	}
	
	public LoginPage getLoginpage() {
		return (loginpage == null)? loginpage = new LoginPage(): loginpage	;
	}
	
	public HomePage getHomepage() {
		return (homepage == null)? homepage = new HomePage(): homepage;
	}
	
	public DashboardPage getDashboardpage() {
		return (dashboardpage == null)? dashboardpage = new DashboardPage(): dashboardpage;
	}

	public SalesPage getSalespage() {
		return (salespage == null)? salespage = new SalesPage(): salespage;
	}

	public ReportsPage getReportspage() {
		return (reportspage == null)? reportspage = new ReportsPage(): reportspage;
	}

	public ItemsPage getItemspage() {
		return (itemspage == null)? itemspage = new ItemsPage(): itemspage;
	}

	public CustomersPage getCustomerspage() {
		return (customerspage == null)? customerspage = new CustomersPage(): customerspage;
	}

	public EmployeesPage getEmployeespage() {
		return (employeespage == null)? employeespage = new EmployeesPage(): employeespage;
	}

	public InventoryManagementPage getInventorymanagementpage() {
		return (inventorymanagementpage == null)? inventorymanagementpage = new InventoryManagementPage(): inventorymanagementpage;
	}

	public RestaurantManagementPage getRestaurantmanagementpage() {
		return (restaurantmanagementpage == null)? restaurantmanagementpage = new RestaurantManagementPage(): restaurantmanagementpage;
	}

	public LoyaltyManagementPage getLoyaltymanagementpage() {
		return (loyaltymanagementpage == null)? loyaltymanagementpage = new LoyaltyManagementPage(): loyaltymanagementpage;
	}

	public ImportPage getImportpage() {
		return (importpage == null)? importpage = new ImportPage(): importpage;
	}

	public ExportPage getExportpage() {
		return (exportpage == null)? exportpage = new ExportPage(): exportpage;
	}

	public AccountingPage getAccountingpage() {
		return (accountingpage == null)? accountingpage = new AccountingPage(): accountingpage;
	}

	public CommunicationPage getCommunicationpage() {
		return (communicationpage == null)? communicationpage = new CommunicationPage(): communicationpage;
	}

	public StorePage getStorepage() {
		return (storepage == null)? storepage = new StorePage(): storepage;
	}

	public AccountSettingsPage getAccountsettingspage() {
		return (accountsettingspage == null)? accountsettingspage = new AccountSettingsPage(): accountsettingspage;
	}
}
