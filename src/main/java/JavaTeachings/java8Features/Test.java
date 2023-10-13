package JavaTeachings.java8Features;

public class Test {
    public static void main(String[] args) {
       Interf1 ob1 = new Interf1() {
           public void m1() {
               System.out.println("Hello World...");
           }
       };
       ob1.m1();
    }
}
