package Pages;

import org.openqa.selenium.support.PageFactory;

import CommonFunction.CommonClass;

public class AccountingPage extends CommonClass {
		
		public AccountingPage() {
			PageFactory.initElements(driver, this);
		}
}
