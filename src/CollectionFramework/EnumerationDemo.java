package CollectionFramework;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        String str = "I am learning Collection Framework and Collection are easy";
        String str1[]=str.split(" ");

        Vector<String> v = new Vector<String>(Arrays.asList(str1));
        System.out.println(v);

        Enumeration<String> e =v.elements();
        while(e.hasMoreElements()){
            Object ob = e.nextElement();
            System.out.println(ob);
        }
    }

}
