package api.dontTouch;

import api.dontTouch.BaseApi;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class ParseJson extends BaseApi{
    public static void main(String[] args) throws InterruptedException {

        BaseApi.createPetByFile();
        JsonPath jsonPath = given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                 .get("pet/121")
                .jsonPath();

        int id    = jsonPath.get("id");
        String  name    = jsonPath.get("name");
        List photoUrls = jsonPath.get("photoUrls");
        Object category = jsonPath.get("category");
       String nameFromObject =  ((LinkedHashMap) category).get("name").toString();

        System.out.println("test end");
    }
}
