package JavaTeachings.fundamentals;

public class FactDemo {
    public static void main(String[] args) {
        int fact=1;
        for(int n=6;n>=1;--n){
            fact= fact *n;
        }
        System.out.println("Factorial of a given number is "+fact);
    }
}
