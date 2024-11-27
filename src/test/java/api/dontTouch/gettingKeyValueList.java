package api.dontTouch;

import java.util.List;

import static io.restassured.RestAssured.given;

public class gettingKeyValueList {
    public static void main(String[] args) {
               List<String> photoUrls =  given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/pet/1")
                        .path("photoUrls");

        System.out.println(photoUrls.get(0).toString());
        System.out.println("test end");
        String name =  given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/pet/1")
                .path("name");
        System.out.println("the value of name is "+ name);

    }
}
