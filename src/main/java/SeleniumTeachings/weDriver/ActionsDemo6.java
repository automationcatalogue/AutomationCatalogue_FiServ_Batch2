package SeleniumTeachings.weDriver;

import Utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo6 {
    public static void main(String[] args) throws Exception{
        WebDriver driver = CommonUtils.launchBrowser("chrome");
        driver.get("https://demoqa.com/text-box");

        WebElement element_userName = driver.findElement(By.cssSelector("#userName"));
        WebElement element_email = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
        WebElement element_currentAddress = driver.findElement(By.cssSelector("form[id='userForm']>div:nth-child(3)>div:nth-child(2)>textarea"));
        WebElement element_permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        WebElement element_SubmitBtn = driver.findElement(By.xpath("//button[text()='Submit']"));

        Actions action = new Actions(driver);
        action.click(element_userName).sendKeys("AutomationCatalogue").build().perform();

        Thread.sleep(3000);
        action.sendKeys(element_email,"automation.cataglogue@gmail.com").build().perform();

        Thread.sleep(3000);
        element_currentAddress.sendKeys("H.No:15-18, Near tankbund, Hyderabad, India");

        Thread.sleep(3000);
        action.keyDown(element_currentAddress, Keys.CONTROL);
        action.sendKeys("a");

        Thread.sleep(3000);
        action.sendKeys("c");
        action.keyUp(Keys.CONTROL);
        action.build().perform();

        Thread.sleep(3000);
        action.keyDown(element_permanentAddress, Keys.CONTROL);
        action.sendKeys("v");
        action.keyUp(Keys.CONTROL);
        action.build().perform();

        Thread.sleep(3000);
        element_SubmitBtn.click();
    }
}
