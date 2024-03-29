package stepDefinitions.uiStepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.JS_utilities;
import utilities.ReusableMethods;

public class US_002 extends CommonPage {
    @When("the user clicks on the Clients button")
    public void theUserClicksOnTheClientsButton() {
        JS_utilities.scrollAndClickWithJS(getClientPage().clients);
        ReusableMethods.waitFor(5);
    }

    @And("the user clicks on the Add Client button")
    public void theUserClicksOnTheAddClientButton() {
        JS_utilities.clickElementByJS(getClientPage().addClient);
        ReusableMethods.waitFor(5);
    }

    @And("the user enters invalid firstName")
    public void theUserEntersInvalidFirstName() {
        getClientPage().firstName.sendKeys("123");
        //getClientPage().firstName.sendKeys(faker.name().firstName());
        ReusableMethods.waitFor(5);
    }

    @Then("the user verifies that firstname or lastname alerts is visible alert")
    public void theUserVerifiesThatFirstnameAndLastnameAlertsAreVisibleAlert() {
        String alertMessage = "This field cannot include numbers or special characters and have to include more than one character.";
        Assert.assertEquals(getClientPage().alertfirstNameAndLastName.getText(), alertMessage);
    }

    @And("the user enter invalid lastname")
    public void theUserEnterInvalidLastname() {
        getClientPage().lastName.sendKeys("abc/");
    }
}