package utilities;

import io.restassured.http.ContentType;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static stepDefinitions.Hooks.*;

public class Api {
    public Api(String email, String password) {
       // String urlswagger = "https://test.hypnotes.net/api/login";
        Map<String, String> mapBody = new HashMap<>();
        mapBody.put("email", email);
        mapBody.put("password", password);


        response = given()
                .contentType(ContentType.JSON)
                .body(mapBody)
                .post("https://test.hypnotes.net/api/login");
        PHPSESSID = response.cookies().get("PHPSESSID");
        csrfToken = response.cookies().get("csrfToken");
    }
}
