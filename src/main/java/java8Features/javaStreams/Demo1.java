package java8Features.javaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(15);
        al.add(50);
        al.add(25);
        al.add(10);
        al.add(30);
        al.add(20);
        System.out.println(al);

        List<Integer> al3 = al.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(al3);

        List<Integer> al4 = al.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(al4);

        long oddCount = al.stream().filter(i->i%2!=0).count();
        System.out.println("Number of odd values in ArrayList is :"+oddCount);

        List<Integer> al5 = al.stream().sorted().collect(Collectors.toList());
        System.out.println(al5);

        List<Integer> al6 = al.stream().sorted((I1, I2)->(I1<I2)?1:(I1>I2)?-1:0).collect(Collectors.toList());
        System.out.println(al6);

    }
}
