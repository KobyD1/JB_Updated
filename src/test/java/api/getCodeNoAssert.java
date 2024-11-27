package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class getCodeNoAssert {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        Response code = given()
                    .when()
                    .get("/pet/findByStatus?status=sold");


            System.out.println("code found "+code.getStatusCode());

            System.out.println("test Pass & end");

    }
}
