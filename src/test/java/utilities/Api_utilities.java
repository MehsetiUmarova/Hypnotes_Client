package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class Api_utilities {
    public static Response response;

    public Api_utilities(String email, String password){
        String urlswagger = "https://test.hypnotes.net/api/login";
        Map<String, String> mapBody = new HashMap<>();
        mapBody.put("email", email);
        mapBody.put("password", password);


        response = given()
                .contentType(ContentType.JSON)
                .body(mapBody)
                .post("https://test.hypnotes.net/api/login");




    }
    //<T> T ==> Herhangi bir data tipi
    //ObjectMapper().readValue(json, cls) methodu birinci parametrede aldığı String
    // formatındaki Json datyı ijkinci parametrede belitilen Java objesine çevirir.

    public static <T> T convertJsonToJawa(String json, Class<T> cls) {

        try {
            return new ObjectMapper().readValue(json, cls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
