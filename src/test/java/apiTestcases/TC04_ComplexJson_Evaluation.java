package apiTestcases;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import payLoads.Courses;

public class TC04_ComplexJson_Evaluation {
    public static void main(String[] args) {
        JsonPath js = new JsonPath(Courses.getPayLoadForCourses());
        //1.	Print No of courses returned by API
        int numberOfCourses = js.getInt("courses.size();");
        System.out.println("Total Number of Courses are :"+numberOfCourses);

        //2.	Print Purchase Amount
        int purchaseAmount = js.getInt("dashboard.purchaseAmount");
        System.out.println("Purchase Amount is :"+purchaseAmount);

        //3.	Print Title of the first course
        String firstTitle = js.getString("courses[0].title");
        System.out.println("First Title is :"+firstTitle);

        //4.	Print All course titles and their respective Prices
        for(int i=0;i<numberOfCourses;i++){
            String title = js.getString("courses["+i+"].title");
            int price = js.getInt("courses["+i+"].price");
            System.out.println("Course Title is :"+title+"\t"+"Price is :"+price);
        }

        //5.	Print no of copies sold by RPA Course
        for(int i=0;i<numberOfCourses;i++){
            String title = js.getString("courses["+i+"].title");
            if(title.equalsIgnoreCase("RPA")){
                int copies = js.getInt("courses["+i+"].copies");
                System.out.println("total Number of copies sold by RPA is :"+copies);
            }
        }

        //6.	Verify if Sum of all Course prices matches with Purchase Amount
        int sum = 0;
        for(int i=0;i<numberOfCourses;i++){
            int price = js.getInt("courses["+i+"].price");
            int copies = js.getInt("courses["+i+"].copies");
            sum = sum+(price*copies);
        }
        System.out.println("Sum of All Courses is "+sum);
        Assert.assertEquals(purchaseAmount, sum, "Purchase Amount is not matching Sum");
        System.out.println("Purchase Amount is matching Sum");
    }
}
