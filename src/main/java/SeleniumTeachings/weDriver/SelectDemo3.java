package SeleniumTeachings.weDriver;

import Utils.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class SelectDemo3 {
    public static void main(String[] args) throws Exception{
        // WebDriver driver = new ChromeDriver();
        //System.out.println("Chrome Browser is loaded");

        WebDriver driver = new FirefoxDriver();
        System.out.println("Firefox Browser is loaded");

        driver.get("https://automatetest-trials710.orangehrmlive.com/auth/login");
        System.out.println("OrangeHRM URL is loaded");

        driver.manage().window().maximize();
        System.out.println("Chrome Browser window is maximized");

        WebElement element_UserName = driver.findElement(By.name("txtUsername"));
        element_UserName.sendKeys("Admin");
        System.out.println("Admin is entered as a UserName");

        driver.findElement(By.className("password-input")).sendKeys("Admin@123");
        System.out.println("Password is clicked");

        driver.findElement(By.tagName("button")).click();
        System.out.println("Login button is clicked");

        Thread.sleep(8000);
        String s1 = driver.getCurrentUrl();
        if(s1.contains("client/#/dashboard")){
            System.out.println("Login is Successful");
        }else{
            System.out.println("Login is Not Successful");
        }

        driver.findElement(By.partialLinkText("Employee List")).click();
        System.out.println("Employee List is link is clicked");

        Thread.sleep(12000);
        driver.findElement(By.id("addEmployeeButton")).click();
        System.out.println("Add Employee button is clicked");

        Thread.sleep(12000);
        WebElement element_firstName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/oxd-decorator/div/div[2]/div/div[1]/div/div/div/oxd-employee-name-input/div/input[1]"));
        element_firstName.sendKeys("Automation");
        Thread.sleep(2000);
        element_firstName.clear();
        Thread.sleep(2000);
        String firstName="Testing";
        element_firstName.sendKeys(firstName);
        System.out.println("FirstName is entered");

        String lastName="Selenium";
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
        System.out.println("LastName is entered");

        driver.findElement(By.xpath("//button[@data-id='location']/div/div/div")).click();
        System.out.println("Location drop-down is clicked");

        Thread.sleep(2000);
        List<WebElement> elements_locations = driver.findElements(By.xpath("//button[@data-id='location']/../div/div/ul/li/a/span"));
        for(WebElement element_location:elements_locations){
            String actualLocation = element_location.getText();
            if(actualLocation.equalsIgnoreCase(TestData.orangeHRM_Location)){
                element_location.click();
                System.out.println(actualLocation+" is selected as a Location");
                break;
            }
        }
    }
}
