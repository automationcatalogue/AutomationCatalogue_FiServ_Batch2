package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args)  throws Exception{
        Employee e1 = new Employee();
        FileOutputStream fos = new FileOutputStream("C:\\AutomationCatalogue\\Projects\\AutomationCatalogue_FiServ_Batch2\\Files\\ObjectData.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e1);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("C:\\AutomationCatalogue\\Projects\\AutomationCatalogue_FiServ_Batch2\\Files\\ObjectData.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee e2 = (Employee) ois.readObject();
        System.out.println(e2.empNo+"--"+e2.empName+"--"+ e2.empSalary+"--"+e2.empAddress);
        ois.close();
        fos.close();

    }
}
