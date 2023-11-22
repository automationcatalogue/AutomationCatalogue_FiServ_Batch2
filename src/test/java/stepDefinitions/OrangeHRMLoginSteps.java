package stepDefinitions;

import JavaTeachings.innerclasses.C;
import Utils.BaseClass;
import Utils.CommonUtils;
import Utils.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class OrangeHRMLoginSteps {

    @Given("User is opened {string} browser")
    public void openBrowser(String browserName){
        WebDriver driver = CommonUtils.launchBrowser(browserName);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Chrome browser is opened");
        new BaseClass(driver);
    }

    @Given("User is opened {string} Application URL")
    public void launchApplication(String appName){
        WebDriver driver = BaseClass.getDriver();
        if(appName.equalsIgnoreCase("OrangeHRM")){
            driver.get(Config.orangeHRM_URL);
        }else if(appName.equalsIgnoreCase("DemoWebShop")){
            driver.get(Config.demoWebShop_URL);
        }
        System.out.println(appName+" Application URL is loaded");
    }

    @When("User is entered {string} as UserName")
    public void enterUserName(String userName){
        WebDriver driver = BaseClass.getDriver();
        driver.findElement(By.id("txtUsername")).sendKeys(userName);
        System.out.println(userName+" is entered as UserName");
    }

    @And("User is entered {string} as Password")
    public void enterPassword(String password){
        WebDriver driver = BaseClass.getDriver();
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        System.out.println(password+"Password is entered");
    }

    @When("User clicks on Login button")
    public void clickLogin(){
        WebDriver driver = BaseClass.getDriver();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Login button is clicked");
    }

    @Then("User verifies Home Page title")
    public void assertTitle(){
        WebDriver driver = BaseClass.getDriver();
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,"Employee Management","Title is not matched");
        System.out.println("Title is matched");
    }

    @And("User is entered Invalid Password")
    public void enterInvalidPassword(){
        WebDriver driver = BaseClass.getDriver();
        driver.findElement(By.id("txtPassword")).sendKeys("Test@123");
        System.out.println("Password is entered");
    }

    @Then("User verifies Invalid credentials message")
    public void verifyInvalidCredentialsMessage(){
        WebDriver driver = BaseClass.getDriver();
        String message = driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
        Assert.assertTrue(message.contains("Invalid Credentials"),"Invalid Login functionality is not working");
        System.out.println("Invalid Login functionality is working");
    }
}
