package api.dontTouch;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class petsStoreFirstTest {
    public static void main(String[] args) {
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .get("/pet/1")

                .then()
                .assertThat().statusCode(200)
                .assertThat().body("name", equalTo("dog"));

        System.out.println("test end");
    }
}
