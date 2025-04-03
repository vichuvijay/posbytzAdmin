package CommonFunction;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonClass {

	public Properties properties = null;
	public static WebDriver driver;
	public String parentWindow = null;
	public Wait<WebDriver> wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	public  Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(20))
            .pollingEvery(Duration.ofMillis(500))
            .ignoring(NoSuchElementException.class);
	Thread toastMessageThread;
	Thread currentThread ;
	Set<String> windowHandles;
	public WebElement element;
	//public String originalHandle =null;
	

	public String loadPropertyFile(String keys) throws IOException {

		properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream("./AdminConfig.properties");
		properties.load(fileInputStream);
		return (String) properties.get(keys);
	}
	public  void log() {
		@SuppressWarnings("unused")
		Logger logger = LogManager.getLogger(CommonClass.class);
		   PropertyConfigurator.configure("log4j.properties");

	}
	public void movetonewtab(String parentWindow) {
		windowHandles = driver.getWindowHandles();
		// System.out.println(parentWindow);
		// System.out.println(windowHandles);

		for (String newtab : windowHandles) {
			if (!newtab.equals(parentWindow)) {
				driver.switchTo().window(newtab);
				// System.out.println("moved to new tab");
				break;
				// driver.close(); //closing child window
				// driver.switchTo().window(parentWindow); //cntrl to parent window
			}
		}

	}

	public String parentwindowid() {
		parentWindow = driver.getWindowHandle();
		return parentWindow;
	}
	public void windowHandle() {
		Set<String> childwindow = driver.getWindowHandles();
		for (String newWindows : childwindow) {
			driver.switchTo().window(newWindows);
			//hello
		}
	}
	public void thread(String status) {
		toastMessageThread = new Thread(() -> {
			try {
				waitForToastMessage(status);
			} catch (InterruptedException e) {
				System.out.println("error in starting thread");
			}
		});
		toastMessageThread.start();
		System.out.println("Started thread");
	}
	

	public void launchBrowser() throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("autofill.profile_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		 driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loadUrl(loadPropertyFile("adminurl"));

	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public int randomEmail() {
		Random randomGen = new Random();
		int nextInt = randomGen.nextInt(10000000);

		return nextInt;
	}
	public long randomNumber(long s) {
		Random randomGen = new Random();
		return randomGen.nextLong(s);
	}

	/**
	 * @Description To take screen shot
	 * @return byte[]
	 */

	// 1. get screen shot
	public byte[] getScreenShot() {

		TakesScreenshot screenShot = (TakesScreenshot) driver;
		byte[] b = screenShot.getScreenshotAs(OutputType.BYTES);

		return b;

	}

	// 2. maximize
	/**
	 * @Description used to maximize window
	 */
	public void maximize() {
		driver.manage().window().maximize();
	}

	// 3.getTitle
	/**
	 * @Description used to get title
	 * @return String
	 */
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	// 4.getCurrentUrl
	/**
	 * @Description used to get the current url
	 * @return String
	 */
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	// 5.getText
	/**
	 * @Description used to get text from webpage
	 * @param object
	 * @return String
	 */
	public static String getText(WebElement webElement) {
		String text = webElement.getText();
		return text;
	}

	// 6.getAttribute
	/**
	 * @Description used to get value
	 * @param element
	 * @return String
	 */
	public String getAttribute(WebElement element) {
		String text = element.getAttribute("value");
		return text;
	}

	// 7.findLocatorById
	/**
	 * @Description used to find locator by id
	 * @param attributeValue
	 * @return WebElement
	 */
	public WebElement findLocatorById(String attributeValue) {
		WebElement findElement = driver.findElement(By.id(attributeValue));
		return findElement;
	}

	// 8.findLocatorByName
	/**
	 * @Description used to find locator by name
	 * @param attributeValue
	 * @return WebElement
	 */
	public WebElement findLocatorByName(String attributeValue) {
		WebElement findElement = driver.findElement(By.name(attributeValue));
		return findElement;
	}

	// 9.findLocatorByClassName
	/**
	 * @Description used to find locator by class name
	 * @param attributeValue
	 * @return WebElement
	 */
	public WebElement findLocatorByClassName(String attributeValue) {
		WebElement findElement = driver.findElement(By.className(attributeValue));
		return findElement;
	}

	// 10.findLocatorByXpath
	/**
	 * @Description used to find locator by xpath
	 * @param attributeValue
	 * @return WebElement
	 */
	public WebElement findLocatorByXpath(String attributeValue) {
		WebElement findElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(attributeValue)));
		return findElement;
	}

	// 11.Sleep
	/**
	 * @Description used to sleep
	 * @param milliseconds
	 * @throws InterruptedException
	 */

	public void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	// 12.dragAndDrop
	/**
	 * @Description used to drag and drop
	 * @param source
	 * @param target
	 */
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target);
	}

	// 13.contextClick(rightclick)
	/**
	 * @Description used to perform click
	 * @param element
	 */
	public void contextClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	// 14.robot keyPress
	/**
	 * @Description used to press the key
	 * @param keycode
	 * @throws AWTException
	 */
	public void robotKeyPress(int keycode) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(keycode);
	}

	// 15.KeyDown
	/**
	 * @Description used to move the key down
	 * @param key
	 */
	public void keyDown(CharSequence key) {
		Actions actions = new Actions(driver);
		actions.keyDown(key);
	}

	// 16.KeyUp
	/**
	 * @Description used to move the key up
	 * @param key
	 */
	public void keyUp(CharSequence key) {
		Actions actions = new Actions(driver);
		actions.keyUp(key);
	}

	// 17.Accept Alert
	/**
	 * @Description used to accept the alert
	 */
	public void acceptAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	// 18.Dismiss Alert
	/**
	 * @Description used to dismiss the alert
	 */
	public void dismissAlert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	public void scrollBy(int x, int y) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy(" + x + ", " + y + ")");

	}

	// 19.JavaScript print text
	/**
	 * @Description used to print text using js
	 * @param element
	 * @return Object
	 */
	public Object printTextJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object executeScript = executor.executeScript("return arguemnt[0].getAttribute('value')", element);
		return executeScript;
	}

	// 20.JavaScript click
	/**
	 * @Description used to perform click using js
	 * @param element
	 */
	public void clickjs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("argument[0],click()", element);
	}

	// 21.Scroll Down JavaScript
	/**
	 * @Description used scroll down using js
	 * @param driver2
	 * @return 
	 */
	public WebElement scrollDownJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", element);
		return element;
	}

	public void scrollToBottom() {
	    JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public void scrollToTop() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
    }
	// 22.Scroll Up JavaScript
	/**
	 * @Description used to scroll up using js
	 * @param element
	 */
	public void scrolUpJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	// 23.Take Screenshot
	/**
	 * @Description used to take screenshot
	 * @return File
	 */
	public File screenShot() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		return file;
	}

	// 24.Take ScreenShot for WebElement
	/**
	 * @Description used to take screenshot for webelement
	 * @param element
	 * @return File
	 */
	public File screenshotWebElement(WebElement element) {
		File file = element.getScreenshotAs(OutputType.FILE);
		return file;
	}

	// 25.Create new File
	/**
	 * @Description used to create new file
	 * @param location
	 * @return File
	 */
	public File newFile(String location) {
		File f = new File(location);
		return f;
	}

	// 26.Copy and Paste File
	/**
	 * @Description used to copy the pasted file
	 * @param sourcelocation
	 * @param destlocation
	 * @throws IOException
	 */
	public void copypastefile(String sourcelocation, String destlocation) throws IOException {
		File s = new File(sourcelocation);
		File d = new File(destlocation);
		FileUtils.copyFile(s, d);
	}

	// 27.Launch url using Navigation
	/**
	 * @Description used to navigate url
	 * @param url
	 */
	public void urlNavigation(String url) {
		driver.navigate().to(url);
	}

	// 28.To move Backward in Navigation
	/**
	 * @Description used to navigate back
	 */
	public void moveback() {
		driver.navigate().back();
	}

	// 29.To move Forward
	/**
	 * @Description used to navigate forward
	 */
	public void moveforward() {
		driver.navigate().forward();
	}

	// 30.To Refresh
	/**
	 * @Description used to navigate refresh
	 */
	public void refresh() {
		driver.navigate().refresh();
	}

	// 31.Select By Value in Drop Down
	/**
	 * @Description used to select value by dropdown
	 * @param value
	 * @param element
	 */
	public void selectByValue(String value, WebElement element) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	// 32.Select By Index in Drop Down
	/**
	 * @Description used to select index by dropdown
	 * @param element
	 * @param index
	 */
	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	// 33.Select By Text in Drop Down
	/**
	 * @Description used to select text by dropdown
	 * @param text
	 * @param element
	 */
	public void selectByText(String text, WebElement element) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// 34.get Options in Drop Down
	/**
	 * @Description used to select options in dropdown
	 * @param element
	 * @return List<WebElement>
	 */
	public List<WebElement> getoptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	// 35.get all options in Drop down
	/**
	 * @Description used to select all options in dropdown
	 * @param element
	 */
	public void gettAllOptions(WebElement element) {
		Select select = new Select(element);
		select.getAllSelectedOptions();
		
	}

	// 36.get First option
	/**
	 * @Description used to select first option
	 * @param element
	 * @return 
	 */
	public String getFirstOption(WebElement element) {
		Select select = new Select(element);
		String text = select.getFirstSelectedOption().getText();
		return text;
	}

	// 37.is multiple
	/**
	 * @Description used to select multiple values
	 * @param element
	 * @return boolean
	 */
	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	// 38.deselectByIndex
	/**
	 * @Description used to deselect value by index
	 * @param element
	 * @param index
	 */
	public void deselectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	// 39.deselect all
	/**
	 * @Description used to deselect all values
	 * @param element
	 */
	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	// 40.deselect By Value
	/**
	 * @Description used to deselect value
	 * @param element
	 * @param value
	 */
	public void deselectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	// 41.deselectByText
	/**
	 * @Description used to deselect value by text
	 * @param element
	 * @param text
	 */
	public void deselectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	// 42.SwitchToFrameById
	/**
	 * @Description used to switch frame by id
	 * @param NameOrId
	 */
	public void SwitchToFrameByNameOrId(String NameOrId) {
		driver.switchTo().frame(NameOrId);
	}

	// 43.SwitchToFrameByIndex
	/**
	 * @Description used to switch frame by index
	 * @param index
	 */
	public void SwitchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	// 44.switchToFrameByWebElement
	/**
	 * @Description used to switch frame by element
	 * @param frameElement
	 */
	public void switchToFrameByWebElement(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	// 45.defaultContent
	/**
	 * @Description used to switch default content
	 */
	public void defaultContent() {
		driver.switchTo().defaultContent();
	}

	// 46.close
	/**
	 * @Description used to close all windows
	 */
	public void closeWindow() {

		try {
			driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public WebElement waitforclick(WebElement ss) {
	    int attempts = 0;
		String xpath=ss.toString().split(":")[2].strip().substring(0,ss.toString().split(":")[2].strip().length()-1);
	    while (attempts < 3) 
	    {
	            // Wait for the element to be visible and clickable
	           // wait.until(ExpectedConditions.elementToBeClickable(s));
	          //  wait.until(ExpectedConditions.visibilityOf(s));
	            // Check if the element is covered by any other element (overlays, etc.)
	            if (isElementNotCovered(ss)) {
	                return ss;
	            }
	            else {
	                // Fallback: Use JavaScript click if element is covered
	            	System.out.println("1111Element is covered by another element, retrying with JavaScript click...");
	            	try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
	            	try
	            	{
	            		JavascriptExecutor executor = (JavascriptExecutor) driver;
	            		executor.executeScript("arguments[0].click();", ss);
		                return ss;
	            	}
	            	catch (Exception e) {
						if (e instanceof org.openqa.selenium.StaleElementReferenceException||e instanceof StaleElementReferenceException ) {
							System.out.println(	"StaleElementReferenceException occurred, re-fetching element and retrying...");
							// Get a fresh reference to the element by re-locating it
							WebElement s =wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(xpath))));
							attempts++; // Increment attempts to retry
							return s;
						} 
						else if (e instanceof org.openqa.selenium.NoSuchElementException) {
							System.out.println("NoSuchElementException occurred, retrying...");
							try {
								wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
							} catch (org.openqa.selenium.TimeoutException ae) {
								wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
								attempts++; // Increment attempts to retry
								continue;
							}
							WebElement s = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))); 
							attempts++; // Increment attempts to retry
							return s;
						} 
						else if (e instanceof org.openqa.selenium.ElementClickInterceptedException) {
							System.out.println("ElementClickInterceptedException occurred, attempting to click with JavaScript...");
							JavascriptExecutor executor = (JavascriptExecutor) driver;
							executor.executeScript("arguments[0].click();", element);
							WebElement s = driver.findElement(By.xpath(xpath)); // Re-find the element by its locator
							attempts++; // Increment attempts to retry
							return s;
						} 
						else if (e instanceof org.openqa.selenium.TimeoutException) {

							System.out.println("TimeoutException occurred, retrying...");
							WebElement s = driver.findElement(By.xpath(xpath)); // Re-find the element by its locator
							attempts++; // Increment attempts to retry
							return s;
						} 
						else if (e instanceof org.openqa.selenium.ElementNotInteractableException) {

							System.out.println("ElementNotInteractableException occurred, retrying...");
							WebElement s = driver.findElement(By.xpath(xpath)); // Re-find the element by its locator
							attempts++; // Increment attempts to retry
							return s;
						}
						attempts++; // Increment attempts to retry
						return driver.findElement(By.xpath(xpath));

					}
	    }	
	 }
	    System.out.println("Max retry attempts reached. Could not click the element.");
    	return driver.findElement(By.xpath(xpath)); // Return null if all retries fail	
	}
	

	private boolean isElementNotCovered(WebElement element) {
	    // Check if the element is not covered by another element using JavaScript
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    Boolean isCovered = (Boolean) js.executeScript(
	        "var elem = arguments[0];" +
	        "var rect = elem.getBoundingClientRect();" +
	        "return (rect.top < 0 || rect.left < 0 || rect.bottom > window.innerHeight || rect.right > window.innerWidth);" +
	        "return !elem || (elem.offsetWidth === 0 || elem.offsetHeight === 0);", element);
	    
	    return !isCovered; // If false, the element is not covered and is ready for interaction
	}

	
	

	
	public WebElement waitforstale(WebElement s) throws InterruptedException {
		try {
			return wait.until(ExpectedConditions.elementToBeClickable(s));
		} catch (StaleElementReferenceException ae) {
			
			sleep(2000);
			refresh();
			try {
				return wait.until(ExpectedConditions.elementToBeClickable(s));
			} catch (NoSuchElementException aee) {
				return wait.until(ExpectedConditions.elementToBeClickable(s));
			}
			}
	}
	public WebElement waitforvisible(By s) {
		
			 return wait.until(ExpectedConditions.visibilityOfElementLocated(s));
		
	}
	public WebElement waitforpresence(Object locator) {
		if (locator instanceof By) {
			return   fwait.until(ExpectedConditions.presenceOfElementLocated((By) locator));
        } else if (locator instanceof WebElement) {
        	System.out.println("wait for presence ");
        	return fwait.until(ExpectedConditions.visibilityOf((WebElement) locator));
        } else if (locator instanceof String) {
			return  fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( (String) locator)));
        }
        else {
            throw new IllegalArgumentException("Locator must be of type By, WebElement, or String");
        }
	}

	public WebElement waitforXpath(String attributeValue) {
	    int attempts = 0;
		String xpath=attributeValue;
        System.out.println("came to string xapth");
	    while (attempts < 3) 
	    {
	           // Wait for the element to be visible and clickable
				System.out.println("came to loop");
				try {
					wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));
					break;
				} catch (Exception e) {
					if (e instanceof org.openqa.selenium.StaleElementReferenceException||e instanceof StaleElementReferenceException ) {
						System.out.println(	"StaleElementReferenceException occurred, re-fetching element and retrying...");
						// Get a fresh reference to the element by re-locating it
						WebElement s =wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(xpath))));
						attempts++; // Increment attempts to retry
						return s;
					} 
					else if (e instanceof org.openqa.selenium.NoSuchElementException) {
						System.out.println("NoSuchElementException occurred, retrying...");
						try {
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
						} catch (org.openqa.selenium.TimeoutException ae) {
							attempts++; // Increment attempts to retry
							continue;
						}
						WebElement s = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))); 
						attempts++; // Increment attempts to retry
						return s;
					} 
					else if (e instanceof org.openqa.selenium.ElementClickInterceptedException) {
						System.out.println("ElementClickInterceptedException occurred, attempting to click with JavaScript...");
						JavascriptExecutor executor = (JavascriptExecutor) driver;
						executor.executeScript("arguments[0].click();", element);
						WebElement s = driver.findElement(By.xpath(xpath)); // Re-find the element by its locator
						attempts++; // Increment attempts to retry
						return s;
					} 
					else if (e instanceof org.openqa.selenium.TimeoutException) {

						System.out.println("TimeoutException occurred, retrying...");
						WebElement s = driver.findElement(By.xpath(xpath)); // Re-find the element by its locator
						attempts++; // Increment attempts to retry
						return s;
					} 
					else if (e instanceof org.openqa.selenium.ElementNotInteractableException) {

						System.out.println("ElementNotInteractableException occurred, retrying...");
						WebElement s = driver.findElement(By.xpath(xpath)); // Re-find the element by its locator
						attempts++; // Increment attempts to retry
						return s;
					}
					attempts++; // Increment attempts to retry
					return driver.findElement(By.xpath(xpath));

				}
	         
	  //  System.out.println("not able to find and interact with the element");
	}
    	return  driver.findElement(By.xpath(xpath));

	}	    	
	
	

	// 47.quit
	/**
	 * @Description used to quit window
	 */
	public void quit() {
		try {
			driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// 48.wait
	/**
	 * @Description used to wait method
	 * @throws InterruptedException
	 */
	 public void waitForElements(List<WebElement> elementList){
	        //Generic wait script which can be used for all list elements.
	        //Waits for max 10 seconds
		
	 }

	// 49.clear
	/**
	 * @Description used to clear method
	 * @param element
	 */
	public void clearMethod(WebElement element) {
		element.clear();
		
	}
	
	public void closeToastMessage() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='iziToast-close']"))).click();

	}
	

	 public void refreshElement(WebElement element) {
	        try {
	            // Perform the action
	            element.click();
	        } catch (StaleElementReferenceException e) {
	            // Refresh the element
	            element = driver.findElement(By.xpath("your_xpath_locator"));
	            // Perform the action again
	            element.click();
	        }
	 }
	 
	 public void waitForToastMessage(String status) throws InterruptedException {
			// System.out.println("checking the Toast message presence");
			String stts = status;
			currentThread = Thread.currentThread(); // Get a reference to the current thread
			while (!currentThread.isInterrupted()) {
				try {
					// System.out.println("waiting for visible");
					WebElement crisp = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@aria-label='Close chat']")));
					try {
						crisp.click();	
						System.out.println("closed the crisp");
					}catch(Exception e) {
					}
					WebElement minicrisp = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"crisp-chatbox\"]/div/a/span[1]/span/span[1]/span[1]/span")));
					try {
						minicrisp.click();	
						System.out.println("closed the crisp");
					}catch(Exception e) {
					}
					WebElement toastMessageclose = wait.until(
							ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='iziToast-close']")));
					// Handle the toast message (e.g., close it)
					toastMessageclose.click();
					
					// Example: Click on the toast message to close it
					// System.out.println("Toast message closed.");
					if (stts == "end") {
						// Interrupt the thread to stop it
						currentThread.interrupt();
						System.out.println("thread closed");
					}
				} catch (Exception e) {
					sleep(800); // System.out.println("Waiting for toast message...");
				}
			}
		}
	 
	 
	 public Boolean waitforinvisible(Object locator) {
			if (locator instanceof By) {

				 wait.until(ExpectedConditions.visibilityOf(check(locator)));
					System.out.println(check(locator).toString());
					closeToastMessage();
				return   wait.until(ExpectedConditions.invisibilityOf(check(locator)));
	        }
			else if (locator instanceof WebElement) {
	        	return wait.until(ExpectedConditions.invisibilityOf(check(locator)));
	        }
			// if (locator instanceof String)
	        else {
				return 	 wait.until(ExpectedConditions.invisibilityOf(check(locator)));
	        }
		} 
	 
//	 public void switchToThirdTab( ) {
//	        // Get all window handles
//	        originalHandle = driver.getWindowHandle();
//	        
//	        Set<String> handles = driver.getWindowHandles();
//
//	        // Switch to the third tab
//	        for (String handle : handles) {
//	            if (!handle.equals(originalHandle)) {
//	                driver.switchTo().window(handle);
//	                break;
//	            }
//	        }
//	    }
	 
	  public static void switchToWindow(int index) {
	        String[] windowHandles = driver.getWindowHandles().toArray(new String[0]);
	        driver.switchTo().window(windowHandles[index]);
	    }
	
	 
	 
	 public WebElement check(Object locator) {
		 
		  if (locator instanceof WebElement) {
				try {

					return fwait.until(ExpectedConditions.visibilityOf((WebElement) locator));
				} catch (TimeoutException e) {
					return fwait.until(ExpectedConditions.visibilityOf((WebElement) locator));
				}
			 }
		  else if (locator instanceof String) {
			  try {

					return fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( (String) locator)));
				} catch (TimeoutException e) {
					return fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( (String) locator)));
				}
		  }
		  else {
			  return (fwait.until(ExpectedConditions.visibilityOfElementLocated((By) locator)));
		  }
		}
	}
					