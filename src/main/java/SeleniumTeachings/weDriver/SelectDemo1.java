package SeleniumTeachings.weDriver;

import Utils.CommonUtils;
import Utils.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDemo1 {
    public static void main(String[] args) throws Exception{
        WebDriver driver = CommonUtils.launchBrowser("chrome");
        driver.get(Config.amazon_URL);

        WebElement element_search = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        Select ob = new Select(element_search);
        ob.selectByIndex(9);
        System.out.println("9th position value is selected from drop-down");

        Thread.sleep(2000);
        ob.selectByValue("search-alias=electronics");
        System.out.println("Electronics value is selected from drop-down");

        Thread.sleep(2000);
        ob.selectByVisibleText("Music");
        System.out.println("Music is selected from the drop-down");

        boolean b = ob.isMultiple();
        if(b){
            System.out.println("Drop-down is allowing multiple selections");
        }else{
            System.out.println("Drop-down is allowing single selection");
        }

        List<WebElement> elements_options = ob.getOptions();
        for(WebElement ele:elements_options){
            String optionText =ele.getText();
            System.out.println(optionText);
        }
    }
}
