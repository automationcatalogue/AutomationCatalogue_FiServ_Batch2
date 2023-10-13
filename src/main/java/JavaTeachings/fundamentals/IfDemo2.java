package JavaTeachings.fundamentals;

public class IfDemo2 {
    public static void main(String[] args) {
        int x=10;
        System.out.println("Before If statement");

        if(x++<11 && x!=10){
            x=x+5;
            System.out.println("Value of x inside the if condition is :"+x);
        }

        System.out.println("Hello World!!");
        System.out.println("Value of x is :"+x);
    }
}
