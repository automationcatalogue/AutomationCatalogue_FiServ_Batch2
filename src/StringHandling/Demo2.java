package StringHandling;

public class Demo2 {
    String s1="Hello India";
    static String s2 ="Core java";

    public static void main(String[] args) {
        String s3="Java Program is Interesting and CoreJava and Advanced Java is are two modules";

        char ch = s3.charAt(11);
        System.out.println(ch);

        Demo2 ob1 = new Demo2();
        char ch1=ob1.s1.charAt(8);
        System.out.println(ch1);

        String s4 =Demo2.s2.replace('a','z');
        System.out.println(s4);

        s4=s3.replaceAll("Java","Python");
        System.out.println(s4);

        s4=s3.replaceFirst("is","was");
        System.out.println(s4);
    }
}
