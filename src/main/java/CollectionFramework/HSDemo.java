package CollectionFramework;

import java.util.HashSet;

public class HSDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        boolean b = hs.add("AutomationCatalogue");
        System.out.println(b);
        System.out.println(hs);
        hs.add(999);
        hs.add('G');
        hs.add(false);
        hs.add(78.45);
        hs.add(null);
        hs.add(new Employee());

        b=hs.add(999);
        System.out.println(b);

        System.out.println(hs);
    }
}
