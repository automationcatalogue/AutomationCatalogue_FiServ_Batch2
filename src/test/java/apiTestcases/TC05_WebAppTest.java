package apiTestcases;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import payLoads.WebApp;

public class TC05_WebAppTest {
    public static void main(String[] args) {
        JsonPath js = new JsonPath(WebApp.getPayLoadForWebApp());

        //Print number of Servlets in a given JSON file
        int numberOfServlets = js.getInt("web-app.servlet.size()");
        System.out.println("Number Of Servlets are :"+numberOfServlets);

        //print all the servlet-name & It’s servlet-class from a JSON file
        for(int i=0;i<numberOfServlets;i++){
            String servletName=js.getString("web-app.servlet["+i+"].servlet-name");
            String servletClass=js.getString("web-app.servlet["+i+"].servlet-class");
            System.out.println(servletName+"\t"+servletClass);
        }

        //Print only the Servlet-name which has init-param tag
        for(int i=0;i<numberOfServlets;i++){
            String initParam = js.getString("web-app.servlet["+i+"].init-param");
            if(initParam!=null){
                String servletName=js.getString("web-app.servlet["+i+"].servlet-name");
                System.out.println(servletName);
            }
        }

        //Assert the datalogLocation value “/usr/local/tomcat/logs/dataLog.log” of cofaxTools
        String expectedData="/usr/local/tomcat/logs/dataLog.log";
        String actualData="";
        for(int i=0;i<numberOfServlets;i++){
            String servletName=js.getString("web-app.servlet["+i+"].servlet-name");
            if(servletName.equalsIgnoreCase("cofaxTools")){
                actualData=js.getString("web-app.servlet["+i+"].init-param.dataLogLocation");
                break;
            }
        }
        Assert.assertEquals(actualData,expectedData,"Data Log Location attributes are not updated correctly");
    }
}
