package SeleniumTeachings.weDriver;

import Utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo4 {
    public static void main(String[] args) throws Exception{
        WebDriver driver = CommonUtils.launchBrowser("chrome");
        driver.get("https://jqueryui.com/slider/");

        Actions action = new Actions(driver);
        WebElement element_iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(element_iframe);
        System.out.println("Switched into iframe");

        Thread.sleep(4000);

        WebElement element_Slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
        action.clickAndHold(element_Slider);
        action.moveByOffset(0,500);
        action.release();
        action.build().perform();
        System.out.println("Actions are performed");
    }
}
