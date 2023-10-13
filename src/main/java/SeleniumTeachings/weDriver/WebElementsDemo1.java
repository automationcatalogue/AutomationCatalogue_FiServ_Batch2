package SeleniumTeachings.weDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebElementsDemo1 {
    public static void main(String[] args) throws InterruptedException{
       // WebDriver driver = new ChromeDriver();
        //System.out.println("Chrome Browser is loaded");

        WebDriver driver = new FirefoxDriver();
        System.out.println("Firefox Browser is loaded");

        driver.get("https://automatetest-trials710.orangehrmlive.com/auth/login");
        System.out.println("OrangeHRM URL is loaded");

        driver.manage().window().maximize();
        System.out.println("Chrome Browser window is maximized");

        WebElement element_UserName = driver.findElement(By.name("txtUsername"));
        element_UserName.sendKeys("Admin");
        System.out.println("Admin is entered as a UserName");

        driver.findElement(By.className("password-input")).sendKeys("Admin@123");
        System.out.println("Password is clicked");

        driver.findElement(By.tagName("button")).click();
        System.out.println("Login button is clicked");

        Thread.sleep(8000);
        String s1 = driver.getCurrentUrl();
        if(s1.contains("client/#/dashboard")){
            System.out.println("Login is Successful");
        }else{
            System.out.println("Login is Not Successful");
        }

        driver.findElement(By.partialLinkText("Employee List")).click();
        System.out.println("Employee List is link is clicked");

        Thread.sleep(12000);
        driver.findElement(By.id("addEmployeeButton")).click();
        System.out.println("Add Employee button is clicked");

        Thread.sleep(12000);
        WebElement element_firstName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/oxd-decorator/div/div[2]/div/div[1]/div/div/div/oxd-employee-name-input/div/input[1]"));
        element_firstName.sendKeys("Automation");
        Thread.sleep(2000);
        element_firstName.clear();
        Thread.sleep(2000);
        String firstName="Testing";
        element_firstName.sendKeys(firstName);
        System.out.println("FirstName is entered");

        String lastName="Selenium";
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
        System.out.println("LastName is entered");

        driver.findElement(By.xpath("//button[@data-id='location']/div/div/div")).click();
        System.out.println("Location drop-down is clicked");

        driver.findElement(By.xpath("//span[@class='text'][text()='India Office']")).click();
        System.out.println("India Office is clicked");

        driver.findElement(By.xpath("//button[@type='button'][@ng-if='vm.showSaveButton']")).click();
        System.out.println("Next button is clicked");

        Thread.sleep(8000);
        driver.findElement(By.xpath("//form[@id='pimPersonalDetailsForm']/materializecss-decorator[4]/div/sf-decorator[2]/div/div/input")).click();
        System.out.println("Marital Status drop-down is clicked");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Married']")).click();
        System.out.println("Married is selected");

        boolean isNextPresent = driver.findElement(By.xpath("//button[@translate='Next']")).isDisplayed();
        if(isNextPresent){
            driver.findElement(By.xpath("//button[@translate='Next']")).click();
            System.out.println("Next button is displayed and clicked");
        }else{
            System.out.println("Next button is not displayed");
        }

        Thread.sleep(8000);
        driver.findElement(By.xpath("//label[text()='Region']/../div/button/div/div/div")).click();
        System.out.println("Region drop-down is clicked");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Region-2']")).click();
        System.out.println("Region-2 drop-down is clicked");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()='FTE']/../div/button/div/div/div")).click();
        System.out.println("FTE drop-down is clicked");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='0.75']")).click();
        System.out.println("0.75 is selected as FTE");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()='Temporary Department']/../div/button/div/div/div")).click();
        System.out.println("Temporary Department drop-down is clicked");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Sub unit-2']")).click();
        System.out.println("Sub unit-2 is selected as Temporary Department");

        WebElement element = driver.findElement(By.xpath("//button[@ng-show='vm.showFinishButton']"));
        boolean b = element.isEnabled();
        if(b){
            element.click();
            System.out.println("Save button is enabled and clicked");
        }else{
            System.out.println("Save button is not enabled");
        }

        Thread.sleep(20000);
        String actualName = driver.findElement(By.xpath("//div[text()='Full Name: ']/span")).getText();
        String expectedName = firstName+" "+lastName;
        if(actualName.equalsIgnoreCase(expectedName)){
            System.out.println("Add Employee testcase is successful");
        }else{
            System.out.println("Add Employee testcase is failed");
        }

        String empId = driver.findElement(By.xpath("//div[text()='Employee Id: ']/span")).getText();
        System.out.println("empID is :"+empId);

        Thread.sleep(6000);
        driver.quit();
    }
}
