package api;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class getJsonBudy {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
          String  nameByPath = given()
                .when()
                .get("/pet/3")
                .path("name");
        System.out.println("The value of name is "+nameByPath);
        System.out.println("test Pass & end");

    }
}
