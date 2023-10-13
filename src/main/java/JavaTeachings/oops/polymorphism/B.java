package JavaTeachings.oops.polymorphism;

public class B extends A{
    static void print(int x){
        int count=0;
        for(int i=1;i<=x;++i){
            if(x%i==0){
                ++count;
            }
        }
        if(count==2){
            System.out.println("Given number is Prime !!! "+x);
        }else{
            System.out.println("Given number is Not Prime !!! "+x);
        }
    }

    void fact(int x){
        int fact=1;
        for(int i=x;i>=1;--i){
            fact = fact*i;
        }
        System.out.println("Factorial of a given number is :"+fact);
    }
}
