package api.dontTouch;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class postPutBodyAssertExample {

    public static void main(String[] args) {



        JSONObject order = new JSONObject();
        order.put("id", 7);
        order.put("petId", 0);
        order.put("quantity", 1);
        order.put("status", "placed");
        order.put("shipDate", "2024-03-18T14:10:34.924Z");
        order.put("complete", true);


                 given()
                .contentType("application/json")
                .body(order)
                .baseUri("https://petstore.swagger.io/v2")

                .when().post("/store/order")
                .then()
                .body("id",equalTo(7))
                .statusCode(200);
        System.out.println("test end");

    }
}
