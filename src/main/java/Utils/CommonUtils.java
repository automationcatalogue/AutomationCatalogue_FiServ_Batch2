package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CommonUtils {
    private static WebDriver driver;
    private static String dateTime;
    public static WebDriver launchBrowser(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
            System.out.println("Chrome Browser is launched");
        }else if(browserName.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
            System.out.println("Firefox Browser is launched");
        }else if(browserName.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
            System.out.println("Edge Browser is launched");
        }else if(browserName.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
            System.out.println("Safari Browser is launched");
        }else if(browserName.equalsIgnoreCase("ie") || browserName.equalsIgnoreCase("internetexplorer")){
            driver = new InternetExplorerDriver();
            System.out.println("IE Browser is launched");
        }else{
            System.out.println("Invalid Browser Name (or) Browser Name value is Empty");
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static void selectDropdown(By locator_dropdown, String expectedValue){
        List<WebElement> elements_values = driver.findElements(locator_dropdown);
        for(WebElement element:elements_values){
            String actualValue = element.getText();
            if(actualValue.equalsIgnoreCase(expectedValue)){
                element.click();
                System.out.println(actualValue+" is selected from the drop-down");
                break;
            }
        }
    }

    public static String generateFolderNameWithTmeStamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy_HHmmss");
        dateTime = now.format(formatter);
        return dateTime;
    }

    public static String generateScreenshotsFolder(String projectPath) {
        String dateTime = CommonUtils.generateFolderNameWithTmeStamp();
        String screenshotsPath = projectPath + "\\screenshots\\" + dateTime;
        File file = new File(screenshotsPath);
        file.mkdir();
        System.out.println("New Folder for Screenshots is created with timestamp " + dateTime);
        return screenshotsPath;
    }
}
