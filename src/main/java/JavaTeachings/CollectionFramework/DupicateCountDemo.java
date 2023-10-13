package JavaTeachings.CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DupicateCountDemo {
    public static void main(String[] args) {
        String str="Core Java learning is easy and Collections are part of Core Java and Advanced Java is another Java";

        String str1[]=str.split(" ");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for(String s2:str1){
            Integer count=map.get(s2);
            if(map.containsKey(s2)){
                map.put(s2,count+1);
            }else{
                map.put(s2,1);
            }
        }
        System.out.println(map);

        Set<Map.Entry<String, Integer>> allEntries = map.entrySet();
        for(Map.Entry<String, Integer> entry:allEntries){
            Integer count = entry.getValue();
            if(count>=2){
                System.out.println(entry.getKey()+"-"+entry.getValue());
            }
        }
    }

}
