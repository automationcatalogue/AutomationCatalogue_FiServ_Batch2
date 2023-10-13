package JavaTeachings.fundamentals;

public class IncrementAndDecrementDemo7 {
    public static void main(String[] args) {
        int i=5;

        int j=(i--) + (++i) + (i--) + (--i) + (++i) + (++i) + (i--);
           //5 (4) +  5 (5) + 5 (4) + 3 (3) + 4 (4) + 5 (5) + 5 (4)
        System.out.println("Value of i is:"+i+" Value of j is :"+j);//4,32
    }
}
