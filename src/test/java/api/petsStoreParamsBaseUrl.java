package api;

import io.restassured.RestAssured;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class petsStoreParamsBaseUrl {
    public static void main(String[] args) {
        List<String> states = Arrays.asList("sold","available");

        states.forEach(state->{
            System.out.println("test for "+state);

                     given()
                     .baseUri("https://petstore.swagger.io/v2")
                    .pathParams("state",state)
                    .when()
                    .get("/pet/findByStatus?status={state}")
                    .then().assertThat().statusCode(200);
            System.out.println("test Pass & end");

        });
    }
}
