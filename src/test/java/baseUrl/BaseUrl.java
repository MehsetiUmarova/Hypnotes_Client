package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utilities.Api_utilities;


public class BaseUrl {

    public static RequestSpecification spec;

    public static void apiSetup(String email, String password){
//        spec=new RequestSpecBuilder()
//                .setContentType(ContentType.JSON)
//                .addHeader("csrfToken","csrf " + Api_utilities(email, password))
//                .setBaseUri("https://test.hypnotes.net/api/")
//                .setRelaxedHTTPSValidation()
//                .build();
    }
}
