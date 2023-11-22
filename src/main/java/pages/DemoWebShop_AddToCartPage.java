package pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoWebShop_AddToCartPage {
    public static void clickCategory(String productCategory){
        WebDriver driver = BaseClass.getDriver();
        if(productCategory.equalsIgnoreCase("Books")){
            driver.findElement(By.xpath("//div[@class='header-menu']/ul/li/a")).click();
            System.out.println("Books category is clicked");
        }else if(productCategory.contains("Computers")){
            driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[contains(text(),'Computers')]")).click();
            System.out.println("Computers category is clicked");

            String subCategory = productCategory.split("-")[1];
            if(subCategory.equalsIgnoreCase("Desktop")){
                driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[contains(text(),'Desktops')]")).click();
            }else if(subCategory.equalsIgnoreCase("Notebooks")){
                driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[contains(text(),'Notebooks')]")).click();
            }else if(subCategory.equalsIgnoreCase("Accessories")){
                driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[contains(text(),'Accessories')]")).click();
            }
            System.out.println(subCategory+" SubCategory is clicked");

        }else if(productCategory.contains("Electronics")){
            driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[contains(text(),'Electronics')]")).click();
            System.out.println("Electronics category is clicked");

            String subCategory = productCategory.split("-")[1];
            if(subCategory.equalsIgnoreCase("Cell phones")){
                driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[contains(text(),'Cell phones')]")).click();
                System.out.println("Cell phones subcategory is clicked");
            }

        }else if(productCategory.equalsIgnoreCase("Apparel & Shoes")){
            driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[contains(text(),'Apparel & Shoes')]")).click();
            System.out.println("Apparel & Shoes category is clicked");
        }else if(productCategory.equalsIgnoreCase("Digital downloads")){
            driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[contains(text(),'Digital downloads')]")).click();
            System.out.println("Digital downloads category is clicked");
        }else if(productCategory.equalsIgnoreCase("Jewelry")){
            driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[contains(text(),'Jewelry')]")).click();
            System.out.println("Jewelry category is clicked");
        }else if(productCategory.equalsIgnoreCase("Gift Cards")){
            driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[contains(text(),'Gift Cards')]")).click();
            System.out.println("Gift Cards category is clicked");
        }
    }
}
