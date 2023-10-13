package SeleniumTeachings.weDriver;

import Utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo2 {
    public static void main(String[] args) throws Exception{
        WebDriver driver = CommonUtils.launchBrowser("chrome");
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

        WebElement element= driver.findElement(By.cssSelector("#ide"));
        Select ob = new Select(element);
        ob.selectByVisibleText("NetBeans");
        ob.selectByIndex(0);
        ob.selectByValue("ij");

        String text = ob.getFirstSelectedOption().getText();
        System.out.println("First Selected option is :"+text);

        boolean b = ob.isMultiple();
        if(b){
            System.out.println("Drop-down is allowing multiple selections");
        }else{
            System.out.println("Drop-down is allowing single selection");
        }

        Thread.sleep(3000);
        ob.deselectByIndex(3);
        Thread.sleep(2000);
        ob.deselectByValue("ec");
        Thread.sleep(2000);
        ob.deselectByVisibleText("IntelliJ IDEA");
    }
}
