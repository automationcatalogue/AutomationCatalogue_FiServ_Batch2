package StringHandling;

public class Demo8 {
    public static void main(String[] args) {
        String s1="Core Java and Advanced Java are two important Java modules";
        boolean b = s1.startsWith("Java");
        System.out.println(b);

        b=s1.startsWith("Java",5);
        System.out.println(b);

        boolean b1=s1.endsWith("tant modules");
        System.out.println(b1);

        int a=s1.indexOf("Java",10);
        System.out.println(a);

        a=s1.lastIndexOf("Python");
        System.out.println(a);

    }
}
