package SeleniumTeachings.weDriver;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelDemo {
    public static void main(String[] args) throws Exception{
        String projectPath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(projectPath+"//TestData//TestData.xlsx");

        XSSFWorkbook wbk  = new XSSFWorkbook(fis);
        XSSFSheet sh = wbk.getSheet("OrangeHRM_AddEmployee");
        XSSFRow row = sh.getRow(3);
        XSSFCell cell = row.getCell(2);
        String data = cell.getStringCellValue();
        System.out.println(data);

        String empNumber = "198456";
        XSSFRow row1 = sh.getRow(1);
        if(row1==null){
            row1 = sh.createRow(1);
        }

        XSSFCell cell11=row1.getCell(11);
        if(cell11==null){
            cell11 = row1.createCell(11);
        }
        cell11.setCellValue(empNumber);

        FileOutputStream fos = new FileOutputStream(projectPath+"//TestData//TestData.xlsx");
        wbk.write(fos);
        fos.close();
        fis.close();
    }
}
