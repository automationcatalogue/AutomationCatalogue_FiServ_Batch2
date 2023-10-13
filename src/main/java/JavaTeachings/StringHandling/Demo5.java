package JavaTeachings.StringHandling;

public class Demo5 {
    public static void main(String[] args) {
        char ch[]={'a','u','t','o','m','a','t','i','o','n'};
        String s1 = new String(ch);
        System.out.println(s1);

        String s2="Padmaraj";
        char ch1[]=s2.toCharArray();
        System.out.println(ch1[3]);
    }
}
