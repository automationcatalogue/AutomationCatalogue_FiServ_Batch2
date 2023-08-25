package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class ALDemo2 {
    public static void main(String[] args) {
        String empNames[]={"Ravi","Rahul","Gayathri","Akash","Sudharshan"};
        Integer salaries[]={50000,25000,60000,30000};
        String cities[]={"Chennai","Pune","Hyderabad","bangalore","noida"};

        ArrayList al1 = new ArrayList(Arrays.asList(empNames));
        System.out.println(al1);

        ArrayList al2 = new ArrayList(Arrays.asList(salaries));
        System.out.println(al2);

        ArrayList al3 = new ArrayList(Arrays.asList(cities));
        System.out.println(al3);

        al1.remove("Rahul");
        System.out.println(al1);

        al1.addAll(al2);
        System.out.println(al1);
        al1.addAll(al3);
        System.out.println(al1);
        al1.removeAll(al2);
        System.out.println(al1);

        boolean b=al1.containsAll(al2);
        System.out.println(b);
        al1.retainAll(al3);
        System.out.println(al1);

        Object obj1=al1.get(4);
        System.out.println(obj1);

        al1.set(3,100);
        System.out.println(al1);

        al1.add(2,'L');
        System.out.println(al1);

        int z=al1.indexOf("Hyderabad");
        System.out.println(z);



    }
}
