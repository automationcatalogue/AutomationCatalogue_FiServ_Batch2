package fundamentals;

public class IncrementAndDecrementDemo3 {
    public static void main(String[] args) {
        int x=10, y=10;
        System.out.println(++x);//11
        System.out.println(y++);//10
        System.out.println("Value of y is :"+y);//11

        int a=10, b=10;
        ++a;
        System.out.println(a);//11
        b++;
        System.out.println(b);//11
    }
}
