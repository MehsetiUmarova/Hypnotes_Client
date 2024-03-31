package utilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static stepDefinitions.Hooks.*;

public class Api {
    public static RequestSpecification requestSpecification = RestAssured.given();

    public Api(String email, String password) {
        Map<String, String> mapBody = new HashMap<>();
        mapBody.put("username", email);
        mapBody.put("password", password);
        response = given()
                .contentType(ContentType.JSON)
                .body(mapBody)
                .post("https://test.hypnotes.net/api/login");

        PHPSESSID = response.cookies().get("PHPSESSID");
        // csrfToken = response.cookies().get("csrfToken");
        requestSpecification.header("content-type", "application/x-www-form-urlencoded");
        requestSpecification.header("cookie", "cookie", "PHPSESSID=" + PHPSESSID);
        requestSpecification.baseUri("https://test.hypnotes.net/api");
    }
}
