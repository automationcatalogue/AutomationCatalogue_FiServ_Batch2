package SeleniumTeachings.weDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaitDemo2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.findElement(By.cssSelector(".main.section>div>div div div article div button:nth-of-type(1)")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Textbox3']")));

        driver.findElement(By.xpath("//input[@placeholder='Textbox1']")).sendKeys("Automation");

    }
}
