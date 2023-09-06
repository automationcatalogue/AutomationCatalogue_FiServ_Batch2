package fileHandling;

import java.io.File;
import java.io.PrintStream;

public class Demo {
    public static void main(String[] args) throws Exception{
        File f = new File("C:\\AutomationCatalogue\\Projects\\AutomationCatalogue_FiServ_Batch2\\Files\\abcd.txt");
        f.createNewFile();
        boolean b1 = f.canWrite();
        System.out.println("File Write access :"+b1);

        boolean b2 = f.canRead();
        System.out.println("File Read access :"+b2);

        boolean b3 = f.canExecute();
        System.out.println("File Execute access :"+b3);
    }
}
