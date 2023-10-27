package SeleniumTeachings.weDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaitDemo4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://automatetest-trials710.orangehrmlive.com/");

        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Admin@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@type='submit']")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[@data-automation-id='menu_home']")));

        driver.findElement(By.xpath("//a[@data-automation-id='menu_pim_viewEmployeeList']")).click();
    }
}
