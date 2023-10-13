package JavaTeachings.oops.abstraction;

public class Test extends Demo{
    void show(){
        int x=10;
        if(x%2==0){
            System.out.println("Given number is Even!!!");
        }else{
            System.out.println("Given number is Odd!!!");
        }
    }

    void fact(int x){
        int fact=1;
        for(int i=x;i>=1;--i){
            fact = fact * i;
        }
        System.out.println("factorial of a given number is :"+fact);
    }
}
