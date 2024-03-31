package stepDefinitions.apiStepDef;

import com.github.javafaker.Faker;
import enums.USER_INFO;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static stepDefinitions.Hooks.PHPSESSID;

public class ApiMethods {
    static Response response;

    public static void TherapistLoginApi() {
        RequestSpecification requestSpecification = RestAssured.given();
        ResponseSpecification responseSpecification = RestAssured.expect();

        Response response;
        Map<String, String> mapBody = new HashMap<>();
        mapBody.put("username", USER_INFO.THERAPIST.getEmail());
        mapBody.put("password", USER_INFO.THERAPIST.getPassword());

        response = given()
                .contentType(ContentType.JSON)
                .body(mapBody)
                .post("https://test.hypnotes.net/api/login");
        PHPSESSID = response.cookies().get("PHPSESSID");
    }

    public static void AddClient() {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.header("cookie", "cookie", "PHPSESSID=" + PHPSESSID);
        requestSpecification.multiPart("firstName", new Faker().name().firstName());
        requestSpecification.multiPart("lastName", new Faker().name().lastName());
        requestSpecification.multiPart("email", new Faker().internet().emailAddress());
        requestSpecification.multiPart("timezone", "Asia/Baku");

        response = given()
                .spec(requestSpecification)

                .post("https://test.hypnotes.net/api/dashboard/client/add");
        response.prettyPrint();

    }

    public static void locationChange() {
        RequestSpecification requestSpecification = RestAssured.given();


        Map<String, String> mapBody = new HashMap<>();
        mapBody.put("username", USER_INFO.THERAPIST.getEmail());
        mapBody.put("password", USER_INFO.THERAPIST.getPassword());

        response = given()
                .contentType(ContentType.JSON)
                .body(mapBody)
                .post("https://test.hypnotes.net/api/login");
        PHPSESSID = response.cookies().get("PHPSESSID");

        requestSpecification.header("content-type", "application/x-www-form-urlencoded");
        requestSpecification.header("cookie", "cookie", "PHPSESSID=" + PHPSESSID);
        requestSpecification.baseUri("https://test.hypnotes.net/api");

        response = given()
                .spec(requestSpecification)
                .body("timezone: Asia/Baku")
                .post("/dashboard/getUser");
        response.prettyPrint();

    }

}
