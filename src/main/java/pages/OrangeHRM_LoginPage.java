package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRM_LoginPage {

    public static void login_OrangeHRM(WebDriver driver, String userName, String password){
        WebElement element_UserName = driver.findElement(By.name("txtUsername"));
        element_UserName.sendKeys(userName);
        System.out.println(userName+" is entered as a UserName");

        driver.findElement(By.className("password-input")).sendKeys(password);
        System.out.println(password+" is entered");

        driver.findElement(By.tagName("button")).click();
        System.out.println("Login button is clicked");
    }
}
