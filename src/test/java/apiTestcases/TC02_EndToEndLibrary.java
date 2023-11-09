package apiTestcases;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import payLoads.Library;

public class TC02_EndToEndLibrary {
    public static void main(String[] args) {
        RestAssured.baseURI="http://216.10.245.166";
        String response = addBook("FiServ","58239432","Akash");
        String bookId = getJsonResponseData(response,"ID");
        System.out.println("Created Book Id is :"+bookId);

        response = getBook(bookId,200);
        validateJsonResponseData(response,"[0].author","Akash");

        response = deleteBook(bookId,200);
        validateJsonResponseData(response,"msg","book is successfully deleted");

        getBook(bookId,404);
    }

    //To Add a Book
    public static String addBook(String isbn, String aisle, String authorName){
        System.out.println("******************************POST METHOD******************************");
        String responseBody = RestAssured.given().log().all().header("Content-Type","application/json")
                .body(Library.getPayLoadForAddBook(isbn,aisle,authorName))
                .when().post("Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200)
                .extract().response().asString();
        return responseBody;
    }

    //To Retrieve a Book
    public static String getBook(String bookId, int responseStatusCode){
        System.out.println("******************************GET METHOD******************************");
        String responseBody = RestAssured.given().log().all().header("Content-Type","application/json")
                .queryParam("ID",bookId)
                .when().get("Library/GetBook.php")
                .then().log().all().assertThat().statusCode(responseStatusCode)
                .extract().response().asString();
        return responseBody;
    }

    //To Validate Response Body Method
    public static void validateJsonResponseData(String responseBody, String actualPath, String expectedValue){
        JsonPath jsonPath = new JsonPath(responseBody);
        String actualValue = jsonPath.getString(actualPath);
        Assert.assertEquals(actualValue, expectedValue,"Actual Value "+actualValue+" is not matching with Expected Value "+expectedValue);
        System.out.println("Actual Value "+actualValue+" is matching with Expected Value "+expectedValue);
    }

    //To Retrieve Response Body Method
    public static String getJsonResponseData(String responseBody, String actualPath){
        JsonPath jsonPath = new JsonPath(responseBody);
        String actualValue = jsonPath.getString(actualPath);
        System.out.println("Response Body Data is :");
        return actualValue;
    }

    //Delete Book
    public static String deleteBook(String book_id, int expectedStatusCode){
        System.out.println("************** DELETE METHOD *********************");
        String response=RestAssured.given().log().all()
                .header("Content-Type","application/json")
                .body(Library.getPayLoadForDeleteBook(book_id))
                .when().delete("Library/DeleteBook.php")
                .then().log().all().assertThat().statusCode(expectedStatusCode).extract().response().asString();
        return response;
    }

}
