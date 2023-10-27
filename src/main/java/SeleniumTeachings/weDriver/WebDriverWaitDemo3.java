package SeleniumTeachings.weDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaitDemo3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='gw-card-layout-abcd']/div[contains(@id,'desktop-grid')]")));

        String str= driver.findElement(By.xpath("//div[@id='desktop-grid-6' or @id='desktop-btf-grid-3']//h2")).getText();
        System.out.println("6th Grid header text is :"+str);
    }
}
