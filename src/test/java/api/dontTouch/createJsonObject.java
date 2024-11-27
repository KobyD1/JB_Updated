package api.dontTouch;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;

public class createJsonObject {

//json to create (pet)

    /**



    {
    "id": 0,
        "category": {
    "id": 0,
            "name": "string"
},
    "name": "doggie",
        "photoUrls": [
    "string1","string2"
  ],
    "tags": [
    {
        "id": 0,
            "name": "string"
    }

  ],
    "status": "available"
}

     */

    public static void main(String[] args) {

        JSONArray photoUrls = new JSONArray();
        photoUrls.add("element_1");
        photoUrls.add("element_2");
        photoUrls.add("element_3");

        JSONObject tagObject = new JSONObject();
        tagObject.put("id", 12);
        tagObject.put("name", "tag1");
        JSONArray tags = new JSONArray();
        tags.add(tagObject);

        JSONObject pet = new JSONObject();
        pet.put("id", 12);
        pet.put("name", "dog");
        pet.put("photoUrls", photoUrls);
        pet.put("tags", tags);
        pet.put("status", "sold");

        Integer id  =  given()
                .contentType("application/json")
                .body(pet)
                .baseUri("https://petstore.swagger.io/v2")

                .when().post("/pet")
                        .path("id");

        given()
                .contentType("application/json")
                .body(pet)
                .baseUri("https://petstore.swagger.io/v2")

                .when().post("/pet")

                .then()
                .statusCode(200);
        System.out.println("test completed & pass");
    }
}
