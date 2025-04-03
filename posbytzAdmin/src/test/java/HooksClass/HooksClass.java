package HooksClass;

import java.io.IOException;
import CommonFunction.CommonClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends CommonClass{

	
	@Before
	public void openBrowser() throws IOException, InterruptedException {
		
		launchBrowser();
	}
	
//	@After
//	public void closeBrowser(Scenario scenario) {
//		thread("end");
//		driver.quit();
//	}
}
