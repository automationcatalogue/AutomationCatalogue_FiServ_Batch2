package JavaTeachings.fileHandling;

import java.io.FileInputStream;

public class ReadFileDemo {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:\\AutomationCatalogue\\Projects\\AutomationCatalogue_FiServ_Batch2\\Files\\FiServBatch2.txt");
        int n = fis.available();
        byte b[] = new byte[n];
        fis.read(b);
        String s1 = new String(b);
        System.out.println(s1);
    }
}
