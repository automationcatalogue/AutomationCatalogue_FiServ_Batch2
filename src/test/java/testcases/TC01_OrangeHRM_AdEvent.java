package testcases;

import Utils.CommonUtils;
import Utils.Config;
import Utils.TestData;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import pages.OrangeHRM_HomePage;
import pages.OrangeHRM_LoginPage;

import java.io.File;

public class TC01_OrangeHRM_AdEvent {
    public static void main(String[] args) throws Exception{

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project Path is :"+projectPath);

        WebDriver driver = CommonUtils.launchBrowser("chrome");
        driver.get(Config.orangeHRM_URL);
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File(projectPath+"//Screenshots//OrangHRM_LoginPage.jpg");
        FileUtils.copyFile(src, dest);

        OrangeHRM_LoginPage.login_OrangeHRM(driver, TestData.orangeHRM_UserName, TestData.orangeHRM_Password);
        OrangeHRM_HomePage.verifyLogin(driver,Config.orangeHRM_HomePageURL);
        src = ts.getScreenshotAs(OutputType.FILE);
        dest = new File(projectPath+"//Screenshots//OrangHRM_HomePage.jpg");
        FileUtils.copyFile(src, dest);

        driver.findElement(By.xpath("(//span[text()='Onboarding'])[1]")).click();
        System.out.println("Onboarding link is clicked");

        Thread.sleep(15000);
        WebElement element_iframe = driver.findElement(By.xpath("//iframe[@id='noncoreIframe']"));
        driver.switchTo().frame(element_iframe);
        System.out.println("Switched into iframe");

        src = ts.getScreenshotAs(OutputType.FILE);
        dest = new File(projectPath+"//Screenshots//OrangHRM_OnboardingPage.pdf");
        FileUtils.copyFile(src, dest);

        driver.findElement(By.xpath("//i[text()='add']")).click();
        System.out.println("Add Event button is clicked");

        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@id='OhrmJob_name']")).sendKeys("Test Automation");

        src = ts.getScreenshotAs(OutputType.FILE);
        dest = new File(projectPath+"//Screenshots//OrangHRM_AddEventPage.png");
        FileUtils.copyFile(src, dest);

        driver.switchTo().defaultContent();
        System.out.println("Switched out of the frame");
    }
}
