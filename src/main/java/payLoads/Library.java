package payLoads;

public class Library {
    public static String getPayLoadForAddBook(String isbn, String aisle, String authorName){
        String requestBody = "{\n" +
                "  \"name\":\"Rest API Test Automation Learning\",\n" +
                "  \"isbn\":\""+isbn+"\",\n" +
                "   \"aisle\":\""+aisle+"\",\n" +
                "   \"author\":\""+authorName+"\"\n" +
                "}\n";
        return requestBody;
    }

    public static String getPayLoadForDeleteBook(String bookId){
        String requestBody = "{\n" +
                "   \"ID\": \""+bookId+"\"\n" +
                "}\n";
        return requestBody;
    }
}
