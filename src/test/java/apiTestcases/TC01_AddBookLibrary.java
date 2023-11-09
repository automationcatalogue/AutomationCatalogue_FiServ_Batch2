package apiTestcases;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import payLoads.Library;

public class TC01_AddBookLibrary {
    public static void main(String[] args) {
        RestAssured.baseURI="http://216.10.245.166";

        Response response = RestAssured.given().log().all().header("Content-Type","application/json")
                .body(Library.getPayLoadForAddBook("FiServ","53957800","Rahul"))
                .when().post("Library/Addbook.php");

        String responseBody = response.then().log().all().assertThat().statusCode(200).body("Msg", Matchers.equalTo("successfully added"))
                        .header("Server","Apache")
                                .extract().response().asString();

        System.out.println("Add Book Request is successful");
        System.out.println(responseBody);

        JsonPath js = new JsonPath(responseBody);
        String id = js.getString("ID");
        System.out.println("Created Book Id is :"+id);

    }
}
