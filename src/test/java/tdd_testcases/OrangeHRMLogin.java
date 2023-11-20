package tdd_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMLogin {

    @Test
    public void login_OrangeHRM() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://automationdata-trials710.orangehrmlive.com/");
        System.out.println("OrangeHRM Application is loaded");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        System.out.println("Admin is entered as UserName");

        driver.findElement(By.id("txtPassword")).sendKeys("Admin@123");
        System.out.println("Password is entered");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Login button is clicked");

        driver.quit();
    }
}
