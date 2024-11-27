package api.dontTouch;

import static io.restassured.RestAssured.given;

public class gettingKeyValueString {
    public static void main(String[] args) {
                String name =  given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/pet/1")
                        .path("name");


        System.out.println("name found "+ name);

        System.out.println("test end");
    }
}
