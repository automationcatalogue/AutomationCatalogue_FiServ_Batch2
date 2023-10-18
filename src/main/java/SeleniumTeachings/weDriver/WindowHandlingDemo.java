package SeleniumTeachings.weDriver;

import Utils.CommonUtils;
import Utils.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowHandlingDemo {
    public static void main(String[] args) throws Exception{
        WebDriver driver = CommonUtils.launchBrowser("chrome");
        driver.get(Config.amazon_URL);

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptops");
        System.out.println("Laptops keyword is entered");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).submit();

        Thread.sleep(10000);
        String parentWindowSession = driver.getWindowHandle();
        System.out.println("ParentWindowSession is :"+parentWindowSession);

        driver.findElement(By.xpath("//span[@data-component-type='s-search-results']/div/div[3]//h2//span")).click();
        System.out.println("First Result of Laptops is clicked");

        Thread.sleep(6000);
        driver.switchTo().window(parentWindowSession);
        System.out.println("Switched back to Parent Window");

        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles");
        System.out.println("Mobile keyword is entered");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).submit();

        Thread.sleep(6000);
        driver.findElement(By.xpath("//span[@data-component-type='s-search-results']/div/div[3]//h2//span")).click();
        System.out.println("First Result of Mobiles is clicked");

        Thread.sleep(4000);
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Number of Opened windows are :"+allWindows.size());

        driver.switchTo().window(parentWindowSession);
        System.out.println("Again Switched back to parent window");

        driver.close();
        System.out.println("Parent Window session is closed");

        Thread.sleep(4000);
        allWindows = driver.getWindowHandles();
        System.out.println("Number of Opened windows are :"+allWindows.size());

        for(String currentWindow:allWindows){
            driver.switchTo().window(currentWindow);
            String url = driver.getCurrentUrl();
            if(url.contains("keywords=Laptops")){
                System.out.println("Switched to Laptops session");
                break;
            }
        }


    }
}
