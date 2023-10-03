package fundamentals;

public class IncrementAndDecrementDemo6 {
    public static void main(String[] args) {
        int a=45;
        int b = (a--) + (a--);
             // 45 (44) + 44 (43)
        System.out.println("Value of a is :"+a+" Value of b is :"+b);//43,89

        int x=5;
        int y=(x++) + (++x) + (--x);
            //5 (6) + 7 (7) + 6 (6)
        System.out.println("Value of x is :"+x+" value of Y is:"+y);//6, 18
    }
}
