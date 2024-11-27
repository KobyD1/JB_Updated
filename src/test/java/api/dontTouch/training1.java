package api.dontTouch;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class training1 {
    public static void main(String[] args) {
         given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/store/inventory")
                 .then()
                .assertThat()
                .statusCode(200)
                .body("available",equalTo(467));


              //  .assertThat().body("name", equalTo("dog"));

        System.out.println("Test end");

    }




}
