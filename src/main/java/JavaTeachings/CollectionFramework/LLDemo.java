package JavaTeachings.CollectionFramework;

import java.util.LinkedList;

public class LLDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("Hyderabad");
        ll.add(99);
        ll.add(null);
        ll.add(99);
        ll.add(56.23);
        ll.add(new Employee());
        ll.add(false);

        System.out.println(ll);

        Object o1=ll.getFirst();
        System.out.println(o1);

        Object o2 = ll.getLast();
        System.out.println(o2);
    }
}
