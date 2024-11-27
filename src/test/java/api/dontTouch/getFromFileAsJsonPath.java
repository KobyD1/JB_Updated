package api.dontTouch;

import io.restassured.path.json.JsonPath;


import java.io.File;

import static io.restassured.RestAssured.given;

public class getFromFileAsJsonPath {

    public static void main(String[] args) {

        // Creating a File instance
        String path ="C:\\Projects\\intellijProjects\\src\\test\\java\\api\\files\\";
        File jsonData = new File(path+"PetObject.json");

        given()
                .baseUri("https://petstore.swagger.io/v2")
                .contentType("application/json")
                .body(jsonData)

                .when()
                .post("/pet")

                .then()
                .assertThat()
                .statusCode(200)
                .log().all();

        JsonPath jsonPath =  given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/pet/121").jsonPath();
        Integer id = jsonPath.get("id");

        System.out.println("test end");

    }
}
