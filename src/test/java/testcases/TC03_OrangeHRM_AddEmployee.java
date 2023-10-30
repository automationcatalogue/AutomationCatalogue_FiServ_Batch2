package testcases;

import Utils.CommonUtils;
import Utils.TestData;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.time.Duration;
import java.util.Map;
import java.util.Properties;


public class TC03_OrangeHRM_AddEmployee {
    public static void main(String[] args) throws Exception{
        String projectPath = System.getProperty("user.dir");
        //Properties prop = new Properties();
        //FileInputStream fis_Properties = new FileInputStream(projectPath+"//TestData//TestData_Batch2.properties");
        //prop.load(fis_Properties);

        //String browser = prop.getProperty("browserName");
        Yaml yaml = new Yaml();
        FileInputStream fis_yaml = new FileInputStream(projectPath+"//TestData//TestData_Batch2.yaml");
        Map<String, String> map = yaml.load(fis_yaml);


        String browser = map.get("browserName");

        //WebDriver driver = CommonUtils.launchBrowser(browser);
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("requireWindowFocus",true);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        options.merge(caps);


        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        FileInputStream fis = new FileInputStream(projectPath+"//TestData//TestData.xlsx");
        XSSFWorkbook wbk = new XSSFWorkbook(fis);
        XSSFSheet sh = wbk.getSheet("OrangeHRM_AddEmployee");

        //String url = prop.getProperty("orangeHRM_URL");
        String url = map.get("orangeHRM_URL");
        driver.get(url);
        System.out.println(url + " OrangeHRM URL is loaded");

        driver.manage().window().maximize();
        System.out.println("Chrome Browser window is maximized");

        WebElement element_UserName = driver.findElement(By.name("txtUsername"));
        XSSFRow row =sh.getRow(1);
        XSSFCell cell = row.getCell(2);
        String userName = cell.getStringCellValue();
        element_UserName.sendKeys(userName);
        System.out.println(userName+" is entered as a UserName");

        String password = sh.getRow(1).getCell(3).getStringCellValue();
        driver.findElement(By.className("password-input")).sendKeys(password);
        System.out.println("Password is entered");

        driver.findElement(By.tagName("button")).click();
        System.out.println("Login button is clicked");


        String s1 = driver.getCurrentUrl();
        if(s1.contains("client/#/dashboard")){
            System.out.println("Login is Successful");
        }else{
            System.out.println("Login is Not Successful");
        }

        driver.findElement(By.partialLinkText("Employee List")).click();
        System.out.println("Employee List is link is clicked");

/**
        driver.findElement(By.id("addEmployeeButton")).click();
        System.out.println("Add Employee button is clicked");


        WebElement element_firstName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/oxd-decorator/div/div[2]/div/div[1]/div/div/div/oxd-employee-name-input/div/input[1]"));
        element_firstName.sendKeys("Automation");

        element_firstName.clear();

        String firstName=sh.getRow(1).getCell(4).getStringCellValue();
        element_firstName.sendKeys(firstName);
        System.out.println("FirstName is entered");

        String lastName=sh.getRow(1).getCell(5).getStringCellValue();
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
        System.out.println("LastName is entered");

        driver.findElement(By.xpath("//button[@data-id='location']/div/div/div")).click();
        System.out.println("Location drop-down is clicked");

        String location = sh.getRow(1).getCell(6).getStringCellValue();
        CommonUtils.selectDropdown(By.xpath(""), location);

        driver.findElement(By.xpath("//button[@type='button'][@ng-if='vm.showSaveButton']")).click();
        System.out.println("Next button is clicked");


        driver.findElement(By.xpath("//form[@id='pimPersonalDetailsForm']/materializecss-decorator[4]/div/sf-decorator[2]/div/div/input")).click();
        System.out.println("Marital Status drop-down is clicked");


        String maritalStatus = sh.getRow(1).getCell(7).getStringCellValue();
        CommonUtils.selectDropdown(By.xpath(""),maritalStatus);

        boolean isNextPresent = driver.findElement(By.xpath("//button[@translate='Next']")).isDisplayed();
        if(isNextPresent){
            driver.findElement(By.xpath("//button[@translate='Next']")).click();
            System.out.println("Next button is displayed and clicked");
        }else{
            System.out.println("Next button is not displayed");
        }


        driver.findElement(By.xpath("//label[text()='Region']/../div/button/div/div/div")).click();
        System.out.println("Region drop-down is clicked");


        By locator_region = By.xpath("");
        String region = sh.getRow(1).getCell(8).getStringCellValue();
        CommonUtils.selectDropdown(locator_region, TestData.orangeHRM_Region);


        driver.findElement(By.xpath("//label[text()='FTE']/../div/button/div/div/div")).click();
        System.out.println("FTE drop-down is clicked");


        String fte = sh.getRow(1).getCell(10).getStringCellValue();
        driver.findElement(By.xpath("//span[text()='0.75']")).click();
        System.out.println("0.75 is selected as FTE");


        driver.findElement(By.xpath("//label[text()='Temporary Department']/../div/button/div/div/div")).click();
        System.out.println("Temporary Department drop-down is clicked");


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


        String actualName = driver.findElement(By.xpath("//div[text()='Full Name: ']/span")).getText();
        String expectedName = firstName+" "+lastName;
        if(actualName.equalsIgnoreCase(expectedName)){
            System.out.println("Add Employee testcase is successful");
        }else{
            System.out.println("Add Employee testcase is failed");
        }

        String empId = driver.findElement(By.xpath("//div[text()='Employee Id: ']/span")).getText();
        System.out.println("empID is :"+empId);
**/
        String empID="5698523";
        //prop.setProperty("empID", empID);
        //prop.setProperty("browserName", "Chrome");
        //FileOutputStream fos = new FileOutputStream(projectPath+"//TestData//TestData_Batch2.properties");
        //prop.store(fos,"empID is updated");
        //fos.close();
        map.put("EmployeeID", empID);
        map.put("browserName","Safari");

        FileWriter fw = new FileWriter(projectPath+"//TestData//TestData_Batch2.yaml");
        yaml.dump(map, fw);
        fw.close();
        driver.quit();
    }
}
