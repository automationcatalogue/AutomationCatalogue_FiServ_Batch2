package StringHandling;

public class Demo4 {
    public static void main(String[] args) {
        byte b[]={99,100,65,76,115};
        String s1 = new String(b);
        System.out.println(s1);

        String name="Anitha";
        byte b1[]=name.getBytes();
        for(byte b2: b1){
            System.out.println(b2);
        }

    }
}
