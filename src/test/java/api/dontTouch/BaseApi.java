package api.dontTouch;

import io.restassured.response.Response;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class BaseApi {



    public Response getPetsAny() throws InterruptedException {
        Response response = null;
try {
    for (int i = 1; i < 10; i++) {
        String suffix = "/pet/" + i;
         response = given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get(suffix);

        if (response.getStatusCode()==200) {
            break;
        }
        Thread.sleep(250);
    }
} catch (Exception e){

}

return response;
    }

    public static void createPetByFile(){
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
    }
}
