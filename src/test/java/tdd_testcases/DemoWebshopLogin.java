package tdd_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoWebshopLogin {

    @Test
    public void login_DemoWebshop() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://demowebshop.tricentis.com/login");
        System.out.println("Demo Webshop Application is loaded");

        driver.findElement(By.id("Email")).sendKeys("aarosagarch@gmail.com");
        System.out.println("aarosagarch@gmail.com is entered as a UserName");

        driver.findElement(By.id("Password")).sendKeys("Admin@123");
        System.out.println("Password is entered");

        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
        System.out.println("Login button is clicked");

        driver.quit();
    }
}
