package JavaTeachings.CollectionFramework;

import java.util.ArrayList;

public class ALDemo1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        int l=al.size();
        System.out.println("Size of the ArrayList :"+l);

        boolean b = al.isEmpty();
        System.out.println(b);

        al.add("Automation");
        al.add(500);
        al.add('H');
        al.add(56.23);
        al.add(890);
        al.add(500);
        al.add(null);

        Employee ob1 = new Employee();
        Employee ob2 = new Employee();

        al.add(ob1);
        al.add(ob2);
        System.out.println(al);

        boolean b1 = al.contains('U');
        System.out.println(b1);

        Object ob[]=al.toArray();
        System.out.println("************Array Values************");
        for(Object obj: ob){
            System.out.println(obj);
        }

    }
}
