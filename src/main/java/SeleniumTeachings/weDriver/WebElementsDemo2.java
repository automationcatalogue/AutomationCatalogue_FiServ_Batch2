package SeleniumTeachings.weDriver;

import Utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDemo2 {
    public static void main(String[] args) throws Exception{
        WebDriver driver = CommonUtils.launchBrowser("Firefox");

        driver.manage().window().maximize();
        System.out.println("Chrome browser is maximized");

        driver.get("https://www.amazon.in/");
        System.out.println("Amazon website is loaded");

        WebElement element_Search = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox'][placeholder='Search Amazon.in']"));
        element_Search.sendKeys("Laptops");
        System.out.println("Laptops is entered");

        element_Search.submit();
        System.out.println("Search keyword is submitted");

        Thread.sleep(8000);
        //boolean selected = driver.findElement(By.xpath("//li[@aria-label='All Prime']//input")).isSelected();
        //if(!selected){
          //  driver.findElement(By.xpath("//li[@aria-label='All Prime']//input")).click();
            //System.out.println("All Prime check-box is clicked");
        //}

        String attr1= driver.findElement(By.cssSelector("#nav-logo-sprites")).getAttribute("class");
        System.out.println("class attribute value is :"+attr1);

        String attr2= driver.findElement(By.cssSelector("#nav-logo-sprites")).getAttribute("href");
        System.out.println("href attribute value is :"+attr2);

        String color = driver.findElement(By.cssSelector(".a-color-state.a-text-bold")).getCssValue("color");
        System.out.println("Color is :"+color);

        String fontSize = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getCssValue("font-size");
        System.out.println("Font-Size is :"+fontSize);

        String tagName = driver.findElement(By.cssSelector(".a-color-state.a-text-bold")).getTagName();
        System.out.println("tagName is :"+tagName);

        Point p = driver.findElement(By.xpath("(//span[@data-component-type='s-product-image'])[1]")).getLocation();
        int x=p.getX();
        System.out.println("X-Co ordinate value is :"+x);

        int y=driver.findElement(By.xpath("(//span[@data-component-type='s-product-image'])[1]")).getLocation().getY();
        System.out.println("Y-Co ordinate value is :"+y);

        int height = driver.findElement(By.xpath("(//span[@data-component-type='s-product-image'])[1]")).getSize().getHeight();
        System.out.println("Height of the webelement is "+height);

        int width = driver.findElement(By.xpath("(//span[@data-component-type='s-product-image'])[1]")).getSize().getWidth();
        System.out.println("Width of the webelement is "+width);

    }
}
