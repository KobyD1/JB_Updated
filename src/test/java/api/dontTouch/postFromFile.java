package api.dontTouch;

import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class postFromFile {

    public static void main(String[] args) {

        // Creating a File instance
        String path ="C:\\Projects\\intellijProjects\\src\\test\\java\\api\\files\\";
        File jsonData = new File(path+"PetObject.json");

       Response response =  given()
                .baseUri("https://petstore.swagger.io/v2")
                .contentType("application/json")
                .body(jsonData)

                // WHEN
                .when()
                .post("/pet");

                // THEN
//                .then()
//                .assertThat()
//                .statusCode(200)
//                .body("name",equalTo("doggie"))

//                .log().all();

        System.out.println("test end");

    }
}
