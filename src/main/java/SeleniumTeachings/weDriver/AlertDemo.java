package SeleniumTeachings.weDriver;

import Utils.CommonUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertDemo {
    public static void main(String[] args) throws Exception{
        WebDriver driver = CommonUtils.launchBrowser("chrome");
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        Thread.sleep(4000);

        driver.switchTo().frame("login_page");
        System.out.println("Switched into iframe");

        driver.findElement(By.linkText("CONTINUE")).click();
        System.out.println("CONTINUE button is clicked");
        Thread.sleep(4000);
        Alert al =driver.switchTo().alert();
        System.out.println(al.getText());

        al.accept();
        System.out.println("OK button is clicked on the Alert");

        int x=10;
        float y=x;

        float a=5.236f;
        int b=(int)a;
    }
}
