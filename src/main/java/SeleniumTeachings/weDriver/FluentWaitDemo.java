package SeleniumTeachings.weDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitDemo {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        System.out.println("Start button is clicked");

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        String data = wait.until(new Function<WebDriver, String>() {
            public String apply(WebDriver driver){
                WebElement element = driver.findElement(By.xpath("//div[@id='finish']/h4"));
                String elementText = element.getText();
                if(elementText.equalsIgnoreCase("AutomationCatalogue!!!")){
                    return elementText;
                }else{
                    return null;
                }
            }
        });
        System.out.println("Element Text is :"+data);

    }
}
