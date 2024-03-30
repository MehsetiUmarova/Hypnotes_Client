package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientPage extends CommonPage {

    @FindBy(xpath = "//span[@data-test-id='loginScreen_logIn']")
    public WebElement login;
    @FindBy(css = "input[data-test-id='loginAsClientPage_email']")
    public WebElement email;
    @FindBy(css = "input[data-test-id='loginAsClientPage_password']")
    public WebElement password;
    @FindBy(css = "button[data-test-id='loginAsClientPage_loginButton']")
    public WebElement loginButton;
    @FindBy(css = "div.ant-message-notice-content")
    public WebElement loginSuccessfullyMessage;
    @FindBy(xpath = "//a[contains(text(),'Clients')]")
    public WebElement clients;
    @FindBy(css = "button[data-test-id='add_client_button_clientsPage']")
    public WebElement addClient;
    @FindBy(css = "#register_firstName")
    public WebElement firstName;
    @FindBy(css = "#register_lastName")
    public WebElement lastName;
    @FindBy(css = "#register_email")
    public WebElement emailbox;
    @FindBy(xpath = "(//div[@class='ant-form-item-explain-error'])[1]")
    public WebElement alertfirstNameAndLastName;
    @FindBy(css = "#register_email_help")
    public WebElement alertEmail;
    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement saveButton;
    @FindBy(css = "div.ant-message-notice-content")
    public WebElement successfullyAddedMessage;
    @FindBy(css = "[class*='ant-btn css-aqx16b ant-btn-primary ant-b']")
    public WebElement confirmTimeZone;
    @FindBy(css = "div.ant-message-notice-content")
    public WebElement fillAllRequiredFields;


}
