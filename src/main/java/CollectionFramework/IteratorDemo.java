package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        String str = "I am learning Collection Framework and Collection are easy";
        String str1[] = str.split(" ");

        ArrayList<String> al = new ArrayList<String>(Arrays.asList(str1));
        System.out.println(al);
        String finalString="";
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            String s=itr.next();
            if(s.toLowerCase().startsWith("a") || s.toLowerCase().startsWith("e") || s.toLowerCase().startsWith("i") || s.toLowerCase().startsWith("o") || s.toLowerCase().startsWith("u")){
                itr.remove();
            }else{
                finalString=finalString+" "+s;
            }
        }
        System.out.println(finalString);
    }
}
