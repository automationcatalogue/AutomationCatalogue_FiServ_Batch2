package JavaTeachings.MultiThreading;

public class Demo {
    public static void main(String[] args) {
        Bank ob = new Bank();

        Customer1 c1 = new Customer1(ob);
        c1.start();

        Customer2 c2 = new Customer2(ob);
        c2.start();
    }
}
