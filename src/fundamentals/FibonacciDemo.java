package fundamentals;

public class FibonacciDemo {
    public static void main(String[] args) {
        int a=0, b=1;
        int sum=0;
        System.out.print(a+","+b+",");
        for(;sum<=100;){
            sum=a+b;
            if(sum<=100){
                System.out.print(sum+",");
            }
            a=b;
            b=sum;
        }
    }
}
