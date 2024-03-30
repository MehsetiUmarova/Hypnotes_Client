package stepDefinitions.apiStepDef;
import enums.USER_INFO;
import io.cucumber.java.en.Given;
import utilities.Api;
import static utilities.Api_utilities.response;
public class ApiStepdef {

    @Given("the user logs in with Therapist credentials")
    public void theUserLogsInWithTherapistCredentials() {
        Api api = new Api(USER_INFO.THERAPIST.getEmail(), USER_INFO.THERAPIST.getPassword());
        response.prettyPrint();

    }

//    @Then("User verify that status code is {int}")
//    public void userVerifyThatStatusCodeIs(int statusCode) {
//        assertEquals(statusCode,response.statusCode());
//        assertEquals(true,response.jsonPath().getBoolean("success") );
//    }
}
