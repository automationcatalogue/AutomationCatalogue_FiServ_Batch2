package StringHandling;

public class Demo13 {
    public static void main(String[] args) {
        String number = "OrderNumber:423432 Gift";
        String s=number.split(":")[1].split(" ")[0];
        System.out.println(s);
    }
}
