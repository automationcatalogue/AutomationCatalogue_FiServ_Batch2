package oops;

public class FactDemo {
    public static void main(String[] args) {
        int fact=1;
        for(int i=Test.y;i>=1;--i){
            fact = fact *i;
        }
        System.out.println("Factorial of a given number is :"+fact);
    }
}
