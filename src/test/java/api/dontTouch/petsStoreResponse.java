package api.dontTouch;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.given;

public class petsStoreResponse {
    public static void main(String[] args) {
//                Response response =  given()
//                .baseUri("https://petstore.swagger.io/v2")
//                .when()
//                .get("/pet/findByStatus?status=available");
//
//                int statusCode = response.getStatusCode();
//                ResponseBody body= response.getBody();

        System.out.println("test end");

        JsonPath jsonPath= given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/pet/1").jsonPath();

        Integer id = jsonPath.get("id");

    }
}
