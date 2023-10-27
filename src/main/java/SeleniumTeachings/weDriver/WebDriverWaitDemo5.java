package SeleniumTeachings.weDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaitDemo5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://automatetest-trials710.orangehrmlive.com/");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Admin@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.titleContains("Employee Management"));
        wait.until(ExpectedConditions.urlContains("client/#/dashboard"));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@data-automation-id='menu_pim_viewEmployeeList'])[3]")));;

        driver.findElement(By.xpath("(//a[@data-automation-id='menu_pim_viewEmployeeList'])[3]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='addEmployeeButton']/i")));
        driver.findElement(By.xpath("//a[@id='addEmployeeButton']/i")).click();

        driver.navigate().refresh();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='employeeListTable']/tbody/tr[1]/td[3]")));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//table[@id='employeeListTable']/tbody/tr[1]/td[3]")))));
        driver.findElement(By.xpath("//table[@id='employeeListTable']/tbody/tr[1]/td[3]")).getText();


        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h5[text()='Add Employee']"),"Add Employee"));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='first-name-box']")));
        driver.findElement(By.xpath("//input[@id='first-name-box']")).sendKeys("Automation");

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[@data-id='location']//following-sibling::div/div/ul/li")));


    }
}
