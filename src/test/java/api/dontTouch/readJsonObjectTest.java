package api.dontTouch;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.restassured.response.Response;

import java.io.Reader;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class readJsonObjectTest {
    public static void main(String[] args) throws InterruptedException {
        BaseApi base = new BaseApi ();
       Response response =  base.getPetsAny();


        JsonObject obj = new JsonParser().parse((Reader) response).getAsJsonObject();
        String name = obj.get("name").getAsString();
    }
    }
