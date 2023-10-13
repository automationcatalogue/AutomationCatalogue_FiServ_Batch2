package JavaTeachings.CollectionFramework;

import java.util.*;

public class HSDemo1 {
    public static void main(String[] args) {
        String empNames[]={"Ravi","Srinath","Anupa","Gaurav"};
        ArrayList<String> al1 = new ArrayList<String>(Arrays.asList(empNames));
        System.out.println(al1);

        for(String s:al1){
            System.out.println(s);
        }
    }
}
