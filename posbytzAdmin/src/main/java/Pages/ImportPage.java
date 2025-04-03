package Pages;

import org.openqa.selenium.support.PageFactory;
import CommonFunction.CommonClass;

public class ImportPage extends CommonClass {
	
	public ImportPage() {
		PageFactory.initElements(driver, this);
	}

}
