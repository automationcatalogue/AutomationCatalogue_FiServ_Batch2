package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TC02_DemoWebShop_TotalOrders {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("aarosagarch@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Admin@123");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='account'])[1]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Orders' and @class='inactive']")).click();

        Thread.sleep(3000);
        List<WebElement> elements_AllOrders = driver.findElements(By.xpath("//div[@class='order-list']/div"));
        int totalOrdersCount = elements_AllOrders.size();
        System.out.println("Total Orders Count is :"+totalOrdersCount);

        List<WebElement> elements_AllOrderTotals = driver.findElements(By.xpath("//div[@class='order-list']/div/ul/li[3]"));
        double sum = 0;
        for(WebElement element_orderTotal:elements_AllOrderTotals){
            String orderTotal = element_orderTotal.getText();
            orderTotal = orderTotal.split(":")[1].trim();

            double orderValue = Double.parseDouble(orderTotal);
            sum+=orderValue;
        }
        System.out.println("Sum of all order purchases is :"+sum);

        LinkedHashMap<String, Double> map = new LinkedHashMap<String, Double>();
        List<WebElement> elements_AllOrderDates = driver.findElements(By.xpath("//div[@class='order-list']/div/ul/li[2]"));
        for(WebElement element_orderDate:elements_AllOrderDates){
            String orderDate = element_orderDate.getText();
            orderDate = orderDate.split(":")[1].trim().split(" ")[0].trim();

            String orderTotal =element_orderDate.findElement(By.xpath("./../li[3]")).getText();
            orderTotal = orderTotal.split(":")[1].trim();
            double orderValue = Double.parseDouble(orderTotal);

            if(map.containsKey(orderDate)) {
                double previousTotalOrderValue = map.get(orderDate);
                orderValue = orderValue+previousTotalOrderValue;
                map.put(orderDate, orderValue);
            }else{
                map.put(orderDate, orderValue);
            }
        }

        Set<Map.Entry<String, Double>> allEntries =  map.entrySet();
        for(Map.Entry<String, Double> entry:allEntries){
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }

    }
}
