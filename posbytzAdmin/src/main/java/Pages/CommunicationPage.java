package Pages;

import org.openqa.selenium.support.PageFactory;

import CommonFunction.CommonClass;

public class CommunicationPage extends CommonClass {
	
	public CommunicationPage() {
		PageFactory.initElements(driver, this);
	}

}
