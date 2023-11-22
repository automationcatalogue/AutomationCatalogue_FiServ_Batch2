package stepDefinitions;

import Utils.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.DemoWebShop_AddToCartPage;

import java.util.List;
import java.util.Map;

public class DemoWebShopSteps {

    private static String userName;

    @When("User enters {string} and {string} in DemoWebShop Application")
    public void enterUserName_Password(String userName, String pwd){
        WebDriver driver = BaseClass.getDriver();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(userName);
        System.out.println(userName+" is entered as UserName");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
        System.out.println("Password is entered");
        DemoWebShopSteps.userName = userName;
    }

    @When("User clicks on Login button in DemoWebShop Application")
    public void clickLogin_DemoWebShop(){
        WebDriver driver = BaseClass.getDriver();
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        System.out.println("Login button is clicked");
    }

    @Then("User validates email address in DemoWebShop Application")
    public void validateEmailAddress(){
        WebDriver driver = BaseClass.getDriver();
        String actualEmail = driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText();
        Assert.assertEquals(actualEmail,userName,"Email Address is not matched");
        System.out.println("Email Address is matched and Login is successful");
    }

    @Then("User Logout from DemoWebShop Application")
    public void clickLogout(){
        WebDriver driver = BaseClass.getDriver();
        driver.findElement(By.xpath("//a[text()='Log out']")).click();
        System.out.println("Logout button is clicked");
        driver.quit();
    }

    @When("User selects ProductCategory and added ProductName into Shopping Cart")
    public void user_selects_product_category_and_added_product_name_into_shopping_cart(DataTable dataTable) {
        WebDriver driver = BaseClass.getDriver();
        String productCategory = "", productName = "";
        List<Map<String, String>> list_TableData = dataTable.asMaps();
        for(Map<String, String> mapData:list_TableData){
            productCategory = mapData.get("ProductCategory");
            productName = mapData.get("ProductName");

            DemoWebShop_AddToCartPage.clickCategory(productCategory);
            driver.findElement(By.xpath("(//h2//a[text()='"+productName+"'])[1]/../..//input")).click();
            System.out.println(productName+ " is added into Shopping Cart");
        }
    }
    @When("User clicks on Shopping Cart link in DemoWebShop Application")
    public void user_clicks_on_shopping_cart_link_in_demo_web_shop_application() {
        WebDriver driver = BaseClass.getDriver();
        driver.findElement(By.xpath("//*[@id='topcartlink']/a/span[1]")).click();
        System.out.println("shopping cart link is clicked");
    }
    @When("User clicks on Checkout button by accepting terms")
    public void user_clicks_on_checkout_button_by_accepting_terms() {
        WebDriver driver = BaseClass.getDriver();
        driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
        System.out.println("Terms and conditions check-box clicked");
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        System.out.println("checkout button is clicked");
    }
    @When("User place order with default configuration in DemoWebShop Application")
    public void user_place_order_with_default_configuration_in_demo_web_shop_application() {
        WebDriver driver = BaseClass.getDriver();
        driver.findElement(By.xpath("//*[@id='billing-buttons-container']/input")).click();
        System.out.println("continue billing address");
        WebElement element_ShippingAddress = driver.findElement(By.xpath("//*[@id='shipping-buttons-container']/input"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",element_ShippingAddress);
        System.out.println("shipping address is clicked ");
        driver.findElement(By.xpath("//*[@id='shipping-buttons-container']/input")).click();
        System.out.println("continue Shipping address");
        driver.findElement(By.xpath("//*[@id='shipping-method-buttons-container']/input")).click();
        System.out.println("shipping method");
        driver.findElement(By.xpath("//input[@id='paymentmethod_1']")).click();
        System.out.println("money order is selected");
        driver.findElement(By.xpath("//*[@id='payment-method-buttons-container']/input")).click();
        System.out.println("continue to confirm");
        driver.findElement(By.xpath("//*[@id='payment-info-buttons-container']/input")).click();
        System.out.println("confirm order");
        driver.findElement(By.xpath("//*[@id='confirm-order-buttons-container']/input")).click();
        System.out.println("order is confirmed");
        String orderNumber = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]")).getText();
        System.out.println(orderNumber + " is generated");
    }


}
