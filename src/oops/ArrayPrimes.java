package oops;

public class ArrayPrimes {
    public static void main(String[] args) {
        int a[]={7, 12, 15, 17, 9,21};
        int sumPrime =0;
        for(int b:a){
            int count=0;
            for(int i=1;i<=b;++i){
                if(b%i==0){
                    ++count;
                }
            }
            if(count==2){
                sumPrime=sumPrime+b;
                System.out.println("Given number is Prime!!!"+b);
            }
        }
        System.out.println("Sum of All Prime number is :"+sumPrime);
    }
}
