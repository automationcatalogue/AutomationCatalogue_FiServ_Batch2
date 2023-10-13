package JavaTeachings.StringHandling;

public class Demo7 {
    public static void main(String[] args) {
        String s1 = "      TajMahal    Agra    ";
        String s2 ="tajahal agra";
        System.out.println(s1);

        String s3=s1.trim();
        System.out.println(s3);

        boolean b = s3.equalsIgnoreCase(s2);
        System.out.println(b);
    }
}
