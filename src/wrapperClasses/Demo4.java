package wrapperClasses;

public class Demo4 {
    public static void main(String[] args) {
        String order="Amazon order number is :TZ35A0";

        String s[]=order.split(":");
        System.out.println(s[1]);

        int x=Integer.parseInt(s[1]);
        x=x+100;
        System.out.println(x);
    }
}
