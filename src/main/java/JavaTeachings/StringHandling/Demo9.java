package JavaTeachings.StringHandling;

public class Demo9 {
    public static void main(String[] args) {
        String s1 = "Fi-Serv Batch2 Automation learning is interesting";
        String s2 = s1.substring(12);
        System.out.println(s2);

        String s3 = s1.substring(17,25);
        System.out.println(s3);

        String s4 = s3.concat(" "+s2);
        System.out.println(s4);

    }
}
