package stepDefinitions.uiStepDefs;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.JS_utilities;
import utilities.ReusableMethods;

public class US_002_Add_Client extends CommonPage {
    Faker faker=new Faker();
    @When("the user clicks on the Clients button")
    public void theUserClicksOnTheClientsButton() {
        JS_utilities.scrollAndClickWithJS(getClientPage().clients);
        ReusableMethods.waitFor(1);
    }

    @And("the user clicks on the Add Client button")
    public void theUserClicksOnTheAddClientButton() {
        JS_utilities.clickElementByJS(getClientPage().addClient);
        ReusableMethods.waitFor(1);
    }

    @And("the user enters invalid first name {string}")
    public void theUserEntersFirstName(String name) {
        getClientPage().firstName.sendKeys(name);

    }
    @Then("the user verifies that firstname and lastname alerts are visible")
    public void theUserVerifiesThatFirstnameAndLastnameAlertsAreVisible() {
        String alertMessage = "This field cannot include numbers or special characters and have to include more than one character.";
        Assert.assertEquals(getClientPage().alertfirstNameAndLastName.getText(), alertMessage);
    }

    @And("the user enters invalid last name {string}")
    public void theUserEntersLastName(String lastname) {
        getClientPage().lastName.sendKeys(lastname);
    }
    @And("the user enters invalid {string}")
    public void theUserEntersInvalid(String email) {
        getClientPage().emailbox.sendKeys(email);
        ReusableMethods.waitFor(2);
    }

    @Then("the user verifies that email alert is visible")
    public void theUserVerifiesThatEmailAlertIsVisible() {
        ReusableMethods.verifyElementDisplayed(getClientPage().alertEmail);
        ReusableMethods.waitFor(3);

    }
    @And("the user enters valid firstname")
    public void theUserEntersValidFirstname() {
        getClientPage().firstName.sendKeys(faker.name().firstName());
    }
    @And("the user enters valid lastname")
    public void theUserEntersValidLastname() {
        getClientPage().lastName.sendKeys(faker.name().lastName());
    }
    @And("the user enters valid email")
    public void theUserEntersValidEmail() {
        getClientPage().emailbox.sendKeys(faker.internet().emailAddress());
        ReusableMethods.waitFor(3);
    }

    @Then("the user clicks save button")
    public void theUserClicksSaveButton() {
        JS_utilities.scrollAndClickWithJS(getClientPage().saveButton);
        ReusableMethods.waitFor(2);
    }
    @And("the user confirm the selected Time Zone")
    public void theUserConfirmTheSelectedTimeZone() {
        getClientPage().confirmTimeZone.click();
        ReusableMethods.waitFor(3);
    }
    @Then("the user verify that successfully added message is visible")
    public void theUserVerifyThatSuccessfullyAddedMessageIsVisible() {
        Assert.assertTrue(getClientPage().successfullyAddedMessage.getText().contains("New Client is successfully added."));
    }

    @Then("user verifies that Fill All The Required Fields message is visible")
    public void userVerifiesThatFillAllTheRequiredFieldsMessageIsVisible() {
        ReusableMethods.verifyElementDisplayed(getClientPage().fillAllRequiredFields);
    }
}
