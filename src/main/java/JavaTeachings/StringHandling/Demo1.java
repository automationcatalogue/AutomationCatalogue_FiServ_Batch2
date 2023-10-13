package JavaTeachings.StringHandling;

public class Demo1 {
    static String s1="AutomationCatalogue";

    public static void main(String[] args) {
        s1.length();
        String s2="Fi-Serv Batch2";

        String s3 = s2.toUpperCase();
        System.out.println(s3);

        s3=Demo1.s1.toLowerCase();
        System.out.println(s3);
    }
}
