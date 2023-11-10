package apiTestcases;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import pojos.DeleteBook_Request;
import pojos.DeleteBook_Response;

public class TC07_Serialization_Deserialization_DeleteBookLibrary {
    public static void main(String[] args) {
        RestAssured.baseURI="http://216.10.245.166";

       // DeleteBook_Request ob = new DeleteBook_Request();
       // ob.setID("FiServ256731321");

        DeleteBook_Response ob1 = RestAssured.given().log().all().header("Content-Type","application/json")
                .body("{\n" +
                        "  \"ID\": \"FiServ256731321\"\n" +
                        "}").expect().defaultParser(Parser.JSON)
                .when().delete("/Library/DeleteBook.php").as(DeleteBook_Response.class);

        System.out.println(ob1.getMsg());

    }
}
