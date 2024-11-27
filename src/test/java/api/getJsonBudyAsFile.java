package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class getJsonBudyAsFile {

    public static void main(String[] args) {


       Response  reesponse =
               (Response) RestAssured
                       .given()
                       .baseUri("https://restful-booker.herokuapp.com/")
                       .basePath("booking")
                       .when()
                       .get()
                       .then();


    }}
                        // Extract response as List>
                        // Since the response in a List of Map format.

//        System.out.println("Total bookings : " + responseBody.size());
//
//        System.out.println("All booking ids are: ");
//
//        for (Map booking : responseBody) {
//            System.out.println(booking.get("bookingid"));
//        }
//    }


//List<Person> persons = given()
//        .when()
//        .get("/person")
//        .then()
//        .extract()
//        .body()
//        // here's thpublic static void main(String[] args) {
//
//		List> responseBody = null;
//
//		responseBody =
//		RestAssured
//			.given()
//				.baseUri("https://restful-booker.herokuapp.com/")
//				.basePath("booking")
//			.when()
//				.get()
//			.then()
//				.extract()
//				.body()
//				// Extract response as List>
//				// Since the response in a List of Map format.
//				.as(new TypeRef>>() {});
//
//		System.out.println("Total bookings : "+ responseBody.size());
//
//		System.out.println("All booking ids are: ");
//
//		for(Map booking : responseBody)
//		{
//			System.out.println(booking.get("bookingid"));
//		}
//
//	}e magic
//        .jsonPath().getList(".", Person.class);