package stepDefinitions.uiStepDefs;

import enums.USER_INFO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JS_utilities;
import utilities.ReusableMethods;

public class US_001_Login extends CommonPage {
    @Given("the user is on the home page")
    public void theUserIsOnTheHomePage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the user logs in with client credentials")
    public void theUserLogsInWithClientCredentials() {
        JS_utilities.clickElementByJS(getClientPage().login);
        ReusableMethods.waitFor(1);
        getClientPage().email.sendKeys(USER_INFO.THERAPIST.getEmail());
        getClientPage().password.sendKeys(USER_INFO.THERAPIST.getPassword());
        JS_utilities.clickElementByJS(getClientPage().loginButton);
        ReusableMethods.waitFor(1);
    }
    @And("Login successfully message should be visible")
    public void loginSuccessfullyMessageShouldBeVisible() {
        ReusableMethods.verifyElementDisplayed(getClientPage().loginSuccessfullyMessage);
    }
    @Then("the user should be logged in successfully")
    public void theUserShouldBeLoggedInSuccessfully() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }


}
