package SeleniumTeachings.weDriver;

import Utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo3 {
    public static void main(String[] args) throws Exception{
        WebDriver driver = CommonUtils.launchBrowser("chrome");
        driver.get("https://www.gap.com/");

        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//a[@data-divisionname='Boys']"));

        action.moveToElement(element).perform();
        System.out.println("Mouse hover action is performed on Boys menu");

        Thread.sleep(4000);
        action.click(driver.findElement(By.xpath("//a[@aria-label='categories jeans']"))).perform();
        System.out.println("Jeans link is clicked");
    }
}
