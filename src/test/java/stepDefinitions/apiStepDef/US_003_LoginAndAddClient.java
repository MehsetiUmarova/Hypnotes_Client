package stepDefinitions.apiStepDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.apiStepDef.ApiMethods.response;

public class US_003_LoginAndAddClient {

    @Given("the user logs in with Therapist credentials")
    public void theUserLogsInWithTherapistCredentials() {
       ApiMethods.TherapistLoginApi();


    }
    @And("the user adds new client with Api")
    public void theUserAddsNewClientWithApi() {
        ApiMethods.AddClient();
    }
    @Then("User verify that status code is {int}")
    public void userVerifyThatStatusCodeIs(int statusCode) {
        assertEquals(statusCode,response.statusCode());
        assertEquals(true,response.jsonPath().getBoolean("success") );

    }


}
