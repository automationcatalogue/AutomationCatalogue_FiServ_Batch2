package StringHandling;

public class Demo12 {
    public static void main(String[] args) {
        int x=120;
        double y = 42342.32;

        String s1=String.valueOf(x);
        System.out.println(s1);

        String s2=String.valueOf(y);
        System.out.println(s2);

        int a= s2.length();
        System.out.println("s2 length is  :"+a);
        boolean b = s1.equals(s2);
        System.out.println(b);
    }
}
