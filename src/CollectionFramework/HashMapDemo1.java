package CollectionFramework;

import java.util.*;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Hyderabad",'H');
        map.put("Testing",500);
        map.put("Automation","Catalogue");
        map.put("Chennai",'C');
        map.put("Delhi",908.456);

        System.out.println(map);
        Object ob = map.get("Chennai");
        System.out.println(ob);

        Object ob1 = map.containsKey("Automation");
        System.out.println(ob1);

        Object ob2 =map.remove("Automation");
        System.out.println(ob2);

        map.replace("Chennai",'C',"Z");
        System.out.println(map);

        String empNames[]={"Mohan","Arun","Akash","Shital","Sagar"};
        Integer empAge[]={35,44,65,23,99};
        LinkedHashMap map2 = new LinkedHashMap();
        for(int i=0;i<empNames.length;++i){
            map2.put(empNames[i],empAge[i]);
        }
        System.out.println(map2);

        map.putAll(map2);
        System.out.println(map);
        Set<String> set =  map.keySet();
        System.out.println(set);

        Collection<Object> c=   map.values();
        System.out.println(c);

        Set<Map.Entry<String, Object>> allEntries =  map.entrySet();
        for(Map.Entry<String, Object> entry:allEntries){
            String s1=entry.getKey();
            Object ob3 = entry.getValue();
            System.out.println(s1+"--"+ob3);
        }

        HashMap<Integer,ArrayList<Object>> map3 = new HashMap<>();

        ArrayList<Object> al9= new ArrayList<>();
        al9.add("Sagar");
        al9.add("Hyderabad");
        al9.add('M');

        ArrayList<Object> al10= new ArrayList<>();
        al10.add("Arun");
        al10.add("Chennai");
        al10.add('M');

        map3.put(101,al9);
        map3.put(102,al10);
        System.out.println(map3);


    }
}
