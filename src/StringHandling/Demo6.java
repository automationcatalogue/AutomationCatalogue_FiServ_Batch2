package StringHandling;

public class Demo6 {
    public static void main(String[] args) {
        String s1 = "Tajmahal";
        String s2 = "tajmahal ";

        boolean b= s1.equals(s2);
        System.out.println(b);

        b = s1.equalsIgnoreCase(s2);
        System.out.println(b);

    }
}
