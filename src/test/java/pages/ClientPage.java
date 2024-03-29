package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utilities.ReusableMethods.waitForVisibility;

public class ClientPage extends CommonPage {

@FindBy(xpath = "//span[@data-test-id='loginScreen_logIn']")
    public WebElement login;

@FindBy(css = "input[data-test-id='loginAsClientPage_email']")
    public WebElement email;
@FindBy(css = "input[data-test-id='loginAsClientPage_password']")
    public WebElement password;
@FindBy(css = "button[data-test-id='loginAsClientPage_loginButton']")
    public WebElement loginButton;
 @FindBy(xpath ="//a[contains(text(),'Clients')]")
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
    @FindBy(xpath = "(//div[@class='ant-form-item-explain-error'])[2]")
    public WebElement alertEmail;



}
