package Pages;

import org.openqa.selenium.support.PageFactory;
import CommonFunction.CommonClass;

public class StorePage extends CommonClass {

	public StorePage() {
		PageFactory.initElements(driver, this);
	}
}
