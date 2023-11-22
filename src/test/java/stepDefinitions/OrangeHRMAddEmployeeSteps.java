package stepDefinitions;

import Utils.BaseClass;
import Utils.CommonUtils;
import Utils.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OrangeHRMAddEmployeeSteps {

    @Given("User launches OrangeHRM application in {string} browser")
    public void user_launches_orange_hrm_application_in_chrome_browser(String browserName) {
        WebDriver driver = CommonUtils.launchBrowser(browserName);
        driver.get(Config.orangeHRM_URL);
        System.out.println("Orange HRM Application is opened in chrome browser");
        new BaseClass(driver);
    }

    @When("User entered {string} and {string} as credentials")
    public void user_entered_and_as_credentials(String userName, String password) {
        WebDriver driver = BaseClass.getDriver();
        driver.findElement(By.id("txtUsername")).sendKeys(userName);
        System.out.println(userName+" is entered as UserName");
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        System.out.println(password+"Password is entered");
    }

    @When("User clicks on Employee Management link")
    public void user_clicks_on_employee_management_link() {
        WebDriver driver = BaseClass.getDriver();
        //driver.findElement(By.xpath("")).click();
        //System.out.println("Employee Management link");
    }
    @When("User clicks on Add Employee button")
    public void user_clicks_on_add_employee_button() {

    }
    @When("User enters {string} and {string} and {string} and click on Next button")
    public void user_enters_and_and_and_click_on_next_button(String string, String string2, String string3) {

    }
    @When("User selects {string} and {string} and click on Next button")
    public void user_selects_and_and_click_on_next_button(String string, String string2) {

    }
    @When("User selects {string} and {string} and {string} and clicks on Save button")
    public void user_selects_and_and_and_clicks_on_save_button(String string, String string2, String string3) {

    }
    @Then("User verifies New EmployeeName and Employee ID")
    public void user_verifies_new_employee_name_and_employee_id() {

    }


}
