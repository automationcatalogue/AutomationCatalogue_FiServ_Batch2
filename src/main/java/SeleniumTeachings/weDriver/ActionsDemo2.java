package SeleniumTeachings.weDriver;

import Utils.CommonUtils;
import Utils.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo2 {
    public static void main(String[] args) {
        WebDriver driver = CommonUtils.launchBrowser("chrome");
        driver.get("https://jqueryui.com/droppable/");

        WebElement element_iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(element_iframe);
        System.out.println("Switched into iframe");

        Actions action = new Actions(driver);
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement dest = driver.findElement(By.id("droppable"));

        //action.dragAndDrop(src, dest).perform();
        //action.dragAndDropBy(src,50,60).perform();
        action.clickAndHold(src);
        action.release(dest);
        action.build().perform();
        System.out.println("Drag and Drop action is completed");
    }
}
