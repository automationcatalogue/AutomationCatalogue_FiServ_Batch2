package JavaTeachings.StringHandling;

public class Demo {
    public static void main(String[] args) {
        String ob = new String();
        System.out.println(ob);

        String ob2 = new String("Hello India");
        System.out.println(ob2);

        int l =ob2.length();
        System.out.println("Length of the given String is :"+l);

        boolean b =ob.isEmpty();
        System.out.println(b);

        b=ob2.isEmpty();
        System.out.println(b);
    }
}
