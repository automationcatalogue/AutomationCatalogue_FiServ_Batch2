package java8Features.lambdaexpressions;

public class Test {
    public static void main(String[] args) {
        Interf ob1 = ()-> System.out.println("Hello World");
        ob1.m1();

        Interf1 ob2 = ()-> {
            int x=5, y=10;
            System.out.println(x+y);
        };

        Interf1 ob3 = ()-> {
            int x=5, y=10, z=15;
            System.out.println(x+y+z);
        };
        ob3.add();
    }
}
