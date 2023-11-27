package stepDefinitions;

import Utils.BaseClass;
import Utils.CommonUtils;
import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class CucumberHooks {
    private static String screenshotsFolderPath;
    @Before
    public void before(Scenario scenario){
        System.out.println("Executing "+scenario.getName());
        String projectPath = System.getProperty("user.dir");
        screenshotsFolderPath = CommonUtils.generateScreenshotsFolder(projectPath);
    }

    @After
    public void after(Scenario scenario){
        WebDriver driver = BaseClass.getDriver();
        driver.quit();
        System.out.println("Terminating driver instance!!!");
        String scenarioStatus = scenario.getStatus().toString();
        System.out.println("Scenario Status is :"+scenarioStatus);
    }

    @BeforeStep
    public void beforeStep(){
        System.out.println("Core Java!!!!");
    }

    @AfterStep
    public void afterStep() throws Exception{
        WebDriver driver = BaseClass.getDriver();
        String projectPath = System.getProperty("user.dir");
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File(screenshotsFolderPath+"//OrangeHRM_"+CommonUtils.generateFolderNameWithTmeStamp()+".jpg");
        FileUtils.copyFile(src, dest);
    }

}
