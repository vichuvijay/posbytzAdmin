package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import CommonFunction.CommonClass;
public class RegistrationPage extends CommonClass {
    
    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[text()='Register Now!']")
    WebElement btn_registernow;
    @FindBy(xpath = "//*[@name='sub_business_type_id']")
    WebElement cli_businessType;
    @FindBy(xpath = "//*[text()='Restaurant']")
    WebElement sel_businessType;
    @FindBy(xpath = "//*[@placeholder='Your email']")
    WebElement txt_email;
    @FindBy(id = "business-phone")
    WebElement txt_mobileNo;
    @FindBy(id = "js_register")
    WebElement btn_registerbutton;
    @FindBy(xpath = "(//span[text()='This field is required.'])[1]")
    WebElement txt_signuprequiredmsg;
    @FindBy(id = "email-error")
    WebElement txt_existemail;
    
    @FindBy(xpath = "//*[@id='email-error']")
    WebElement txt_invalidemail;
    
    @FindBy(xpath = "//*[@id='business-phone-error']")
    WebElement txt_invalidmobilenumber;
    
    @FindBy(xpath = "//h4")
    WebElement registertext;
    
    public WebElement getbtn_registernow() {
        return waitforXpath("//*[text()='Register Now!']");
    }
    public WebElement get_registeraccount() {
        return waitforXpath("//h4");
    }
    public WebElement getCli_businessType() {
        return waitforXpath("//*[@name='sub_business_type_id']");
    }
    public WebElement getSel_businessType() {
        return waitforXpath("//*[text()='Restaurant']");
    }
    public WebElement getTxt_email() {
        return waitforXpath("//*[@placeholder='Your email']");
    }
    public WebElement getTxt_mobileNo() {
        return txt_mobileNo;
    }
    public WebElement getBtn_registerbutton() {
        return btn_registerbutton;
    }
    public WebElement getTxt_signuprequiredmsg() {
        return waitforXpath("(//span[text()='This field is required.'])[1]");
    }
    public WebElement getTxt_existemail() {
        return waitforXpath("email-error");
    }
    public WebElement getTxt_invalidemail() {
        return waitforXpath("//*[@id='email-error']");
    }
    
    public WebElement getTxt_invalidmobilenumber() {
        return waitforXpath("//*[@id='business-phone-error']");
    }
}