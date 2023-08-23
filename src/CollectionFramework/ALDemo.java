package CollectionFramework;

import java.util.ArrayList;

public class ALDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(150);
        al.add("India");
        al.add(99);
        al.add(56.23);
        al.add('K');
        al.add(true);
        al.add(null);
        al.add("Testing");
        al.add(99);

        System.out.println(al);
        int l = al.size();
        System.out.println("Size of the ArrayList is :"+l);

        boolean b = al.isEmpty();
        System.out.println(b);

        al.clear();
        System.out.println(al);

        b = al.isEmpty();
        System.out.println(b);

    }
}
