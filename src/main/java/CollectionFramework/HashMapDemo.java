package CollectionFramework;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        Object ob = map.put(1,"Core Java");
        System.out.println(ob);
        System.out.println(map);

        map.put(2,"Advanced Java");
        map.put(3,"Python");
        map.put(4,"Selenium");
        map.put(5,"JavaScript");
        System.out.println(map);

        ob=map.put(3,"Ruby");
        System.out.println(ob);
        System.out.println(map);

        int s=map.size();
        System.out.println(s);

        System.out.println(map.isEmpty());

        map.put("City","Hyderabad");
        map.put(45.26,'H');
        System.out.println(map);

    }
}
