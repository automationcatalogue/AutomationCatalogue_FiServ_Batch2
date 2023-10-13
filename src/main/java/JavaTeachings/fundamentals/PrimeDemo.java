package JavaTeachings.fundamentals;

public class PrimeDemo {
    public static void main(String[] args) {

        PrimeDemo ob1 = new PrimeDemo();

        int n=7;
        int i=1;
        int count=0;

        while(i<=n){
            if(n%i==0){
                count++;
            }
            ++i;
        }
        if(count==2){
            System.out.println("Given Number is Prime :"+n);
        }else{
            System.out.println("Given Number is Not Prime "+n);
        }
    }
}
