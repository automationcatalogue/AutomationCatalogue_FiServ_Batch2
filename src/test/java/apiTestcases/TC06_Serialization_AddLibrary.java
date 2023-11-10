package apiTestcases;

import io.restassured.RestAssured;
import pojos.AddLibrary;

public class TC06_Serialization_AddLibrary {
    public static void main(String[] args) {
        AddLibrary ob = new AddLibrary();
        ob.setName("Rest Assured API Testing for Batch2 by Sagar");
        ob.setIsbn("FiServ");
        ob.setAisle("256731321");
        ob.setAuthor("SArun");

        RestAssured.baseURI="http://216.10.245.166";
        String response = RestAssured.given().log().all().header("Content-Type","application/json")
                .queryParam("Location","Hyderabad")
                .body(ob)
                .when().post("Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200).extract().response().asString();
        System.out.println(response);
    }
}
