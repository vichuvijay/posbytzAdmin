package Pages;

import org.openqa.selenium.support.PageFactory;

import CommonFunction.CommonClass;

public class DashboardPage extends CommonClass {
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

}
