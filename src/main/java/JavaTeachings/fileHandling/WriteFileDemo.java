package JavaTeachings.fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteFileDemo {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:\\AutomationCatalogue\\Projects\\AutomationCatalogue_FiServ_Batch2\\Files\\FiServBatch2.txt");
        int n=fis.available();
        byte b[] = new byte[n];
        fis.read(b);
        FileOutputStream fos = new FileOutputStream("C:\\AutomationCatalogue\\Projects\\AutomationCatalogue_FiServ_Batch2\\Files\\Testing.txt", true);
        fos.write(b);
        fis.close();
        fos.close();

    }
}
