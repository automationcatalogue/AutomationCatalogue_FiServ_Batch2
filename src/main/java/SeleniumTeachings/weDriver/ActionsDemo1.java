package SeleniumTeachings.weDriver;

import Utils.CommonUtils;
import Utils.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.OrangeHRM_HomePage;

public class ActionsDemo1 {
    public static void main(String[] args) throws Exception{
        WebDriver driver = CommonUtils.launchBrowser("chrome");
        driver.get(Config.orangeHRM_URL);

        Actions action = new Actions(driver);
        WebElement element_userName = driver.findElement(By.id("txtUsername"));

        action.sendKeys(element_userName,"Admin").perform();
        System.out.println("Admin is entered as a UserName");

        action.sendKeys(Keys.TAB).perform();
        System.out.println("TAB button is pressed");

        action.sendKeys("Admin@123").perform();
        System.out.println("Password is entered");

        action.click(driver.findElement(By.xpath("//button[@type='submit']"))).perform();
        System.out.println("Login button is clicked");

        OrangeHRM_HomePage.verifyLogin(driver,"client/#/dashboard");
    }
}
