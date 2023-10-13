package JavaTeachings.java8Features.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sagar",4234234);
        Employee e2 = new Employee("Arun",567565);
        Employee e3 = new Employee("Akash",753533);
        Employee e4 = new Employee("Srinath",353453);
        Employee e5 = new Employee("Ravi",99675675);

        Comparator<Employee> c = (ob1,ob2) ->-ob1.empName.compareTo(ob2.empName);
        TreeSet<Employee> t = new TreeSet<Employee>(c);
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t);
    }
}
