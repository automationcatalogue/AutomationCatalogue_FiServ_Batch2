package weDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.out.println("Chrome Browser is loaded");

        driver.get("https://automatetest-trials710.orangehrmlive.com/");
        System.out.println("OrangeHRM website is loaded");

        String s1 = driver.getTitle();
        System.out.println("Title of the page is :"+s1);

        driver.manage().window().maximize();
        By locator_UserName = By.name("txtUsername");
        WebElement element_UserName = driver.findElement(locator_UserName);
        element_UserName.sendKeys("Admin");
        System.out.println("UserName is entered");

        driver.findElement(By.id("txtPassword")).sendKeys("Admin@123");
        System.out.println("Password is entered");

        driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div[4]/button")).click();
        System.out.println("Login button is clicked");

    }
}
