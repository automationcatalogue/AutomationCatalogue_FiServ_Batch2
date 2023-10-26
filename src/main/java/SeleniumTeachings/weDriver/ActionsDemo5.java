package SeleniumTeachings.weDriver;

import Utils.CommonUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo5 {
    public static void main(String[] args) throws Exception{
        WebDriver driver = CommonUtils.launchBrowser("chrome");
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement element_rightButton = driver.findElement(By.xpath("//span[text()='right click me']"));
        WebElement element_doubleButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

        Actions action = new Actions(driver);
        action.doubleClick(element_doubleButton).perform();
        System.out.println("Double-click action is performed");
        Thread.sleep(3000);

        Alert al = driver.switchTo().alert();
        String text = al.getText();
        System.out.println("Alert Text is :"+text);

        al.accept();
        System.out.println("Alert is accepted");

        Thread.sleep(3000);
        action.contextClick(element_rightButton).perform();
        System.out.println("Right-click action is performed");

        Thread.sleep(3000);
        action.click(driver.findElement(By.xpath("//span[text()='Delete']"))).perform();
        System.out.println("Delete action is performed");
        al = driver.switchTo().alert();
        text = al.getText();
        System.out.println("Alert Text is :"+text);

        al.accept();
        System.out.println("Alert is accepted");
    }
}
