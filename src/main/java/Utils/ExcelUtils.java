package Utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelUtils {
    static FileInputStream fis;
    static  XSSFWorkbook wbk;
    static XSSFSheet sh;
    static XSSFRow row;
    static XSSFCell col;
    static String excelPath;

    public static XSSFWorkbook setExcelFilePath() throws Exception{
        String projectPath = System.getProperty("user.dir");
        excelPath = projectPath+"\\TestData\\TestData.xlsx";
        fis = new FileInputStream(excelPath);
        wbk = new XSSFWorkbook(fis);
        return wbk;
    }

    public static String getCellData(String sheetName, int rowNum, int colNum){
        sh = wbk.getSheet(sheetName);
        row = sh.getRow(rowNum);
        if(row==null){
            row = sh.createRow(rowNum);
        }
        col = row.getCell(colNum);
        if(col==null){
            col = row.createCell(colNum);
        }
        String excelData = col.getStringCellValue();
        return excelData;
    }

    public static int getRowNumber(String testId, String sheetName){
        sh = wbk.getSheet(sheetName);
        int rowSize= sh.getLastRowNum();
        int finalRowNumber=0;
        for(int i=0;i<rowSize;i++){
            String actualTestId = sh.getRow(i).getCell(Config.col_TestId).getStringCellValue();
            if(actualTestId.equals(testId)){
                finalRowNumber=i;
                break;
            }
        }
        System.out.println("TestId "+testId+" is found in the row number "+finalRowNumber+" for sheetName "+sheetName);

        return finalRowNumber;
    }

    public static void setCellData(String data, String sheetName, int rowNum, int colNum) throws Exception{
        sh = wbk.getSheet(sheetName);
        row = sh.getRow(rowNum);
        if(row==null){
            row = sh.createRow(rowNum);
        }
        col = row.getCell(colNum);
        if(col==null){
            col = row.createCell(colNum);
        }
        col.setCellValue(data);
        FileOutputStream fos = new FileOutputStream(excelPath);
        wbk.write(fos);
        fos.close();
    }

    public static int getRowUsed(String sSheetName) throws Exception {
        sh = wbk.getSheet(sSheetName);
        try {
            int iRowCount = sh.getLastRowNum();
            return iRowCount;
        } catch (Exception e) {
            System.out.println("Error in excel file in the method: getRowUsed");
            throw (e);
        }
    }

    public static void closeExcelFile() throws Exception{
        fis.close();
    }
}
