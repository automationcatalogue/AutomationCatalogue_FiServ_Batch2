package weDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        System.out.println("Chrome Browser is loaded");

        driver.get("https://automatetest-trials710.orangehrmlive.com/");
        System.out.println("OrangeHRM website is loaded");

        String s1 = driver.getTitle();
        System.out.println("Title of the page is :"+s1);

        //driver.manage().window().maximize();
        WebDriver.Options op = driver.manage();
        WebDriver.Window win = op.window();
        win.maximize();
        System.out.println("Chrome Browser window is maximized");

        String url = driver.getCurrentUrl();
        System.out.println("URL is :"+url);

        String pageSource = driver.getPageSource();
        System.out.println("Page Source is :"+pageSource);

        driver.navigate().to("https://www.linkedin.com/");
        System.out.println("LinkedIn Website is loaded");

        s1=driver.getTitle();
        System.out.println("LinkedIn title is:"+s1);

        Thread.sleep(5000);
        driver.navigate().back();
        System.out.println("OrangeHRM URL is loaded");
        Thread.sleep(5000);
        driver.navigate().forward();
        System.out.println("LinkedIn Website is loaded");
        Thread.sleep(5000);

        driver.quit();

    }
}
