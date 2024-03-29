package stepDefinitions.uiStepDefs;

import enums.USER_INFO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CommonPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_001 extends CommonPage {

    @Given("user goes to home page")
    public void userGoesToHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("the user login with Therapist credentials")
    public void theUserLoginWithTherapistCredentials() {
        JS_utilities.clickElementByJS(getClientPage().login);
        ReusableMethods.waitFor(2);
        getClientPage().email.sendKeys(USER_INFO.THERAPIST.getEmail());
        getClientPage().password.sendKeys(USER_INFO.THERAPIST.getPassword());
        JS_utilities.clickElementByJS(getClientPage().loginButton);
        ReusableMethods.waitFor(3);
    }


}
