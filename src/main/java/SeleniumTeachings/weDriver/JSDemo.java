package SeleniumTeachings.weDriver;

import Utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class JSDemo {
    public static void main(String[] args) throws Exception{
        WebDriver driver = CommonUtils.launchBrowser("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://automationteste-trials710.orangehrmlive.com/");
        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("document.getElementById('txtUsername').value='Admin'");
        System.out.println("UserName is entered");
        WebElement element = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        js.executeScript("arguments[0].value='Admin@123'",element);
        System.out.println("Password is entered");
        WebElement element_Login = driver.findElement(By.xpath("//button[@type='submit']"));
        js.executeScript("arguments[0].click()", element_Login);
        System.out.println("Login button is clicked");

        String title = js.executeScript("return document.title").toString();
        System.out.println("Tile of the Application is :"+title);

        String url = js.executeScript("return document.URL").toString();
        System.out.println("URL of the Application is :"+url);

        String domain = js.executeScript("return document.domain").toString();
        System.out.println("Domain of the Application is :"+domain);

        js.executeScript("history.go(0)");
        System.out.println("Chrome Browser is Refreshed/Reloaded");

        WebElement element_EmployeeManagement = driver.findElement(By.xpath("(//a[@data-automation-id='menu_pim_viewEmployeeList'])[1]"));
        js.executeScript("arguments[0].click();", element_EmployeeManagement);
        System.out.println("Employee Management Link is clicked");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[text()='add']")));

        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,50)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,100)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-75)");
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
        Thread.sleep(3000);
        WebElement element_EmployeeText = driver.findElement(By.xpath("//td[text()='Jenny  Fisher ']"));
        js.executeScript("arguments[0].scrollIntoView(true);",element_EmployeeText);

        String employeeName =  driver.findElement(By.xpath("//table[@id='employeeListTable']/tbody/tr[1]/td[3]")).getText();
        System.out.println("Employee Name is :"+employeeName);

        List<WebElement> list_Data = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr"));
        System.out.println("Total Number of Rows are :"+list_Data.size());

        List<WebElement> list_Columns = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr[10]/td"));
        System.out.println("Total Number of Columns are :"+list_Columns.size());

        List<WebElement> elements_Employees = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr/td[3]"));
        boolean isEmployeePresent = false;
        for(WebElement element_employee:elements_Employees){
            String name = element_employee.getText();
            if(name.contains("Goutam Ganesh")){
                isEmployeePresent=true;
                String location = element_employee.findElement(By.xpath(".//following-sibling::td[5]")).getText();
                System.out.println("Location of the Employee is :"+location);
                break;
            }
        }

        if(isEmployeePresent){
            System.out.println("Employee is found");
        }else{
            System.out.println("Employee is not found!!!");
        }
    }
}
