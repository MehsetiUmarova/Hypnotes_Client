package stepDefinitions.apiStepDef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static utilities.Api_utilities.response;
public class ApiStepdef {

    @Given("the user logs in with Therapist credentials")
    public void theUserLogsInWithTherapistCredentials() {
       ApiMethods.TherapistLoginApi();
       ApiMethods.AddClient();

    }

    @Then("User verify that status code is {int}")
    public void userVerifyThatStatusCodeIs(int statusCode) {
        assertEquals(statusCode,response.statusCode());
        assertEquals(true,response.jsonPath().getBoolean("success") );

    }

}
