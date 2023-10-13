package JavaTeachings.oops.polymorphism;

public class A {
    static void print(int x){
        if(x%2==0){
            System.out.println("Given number x is Even!!! "+x);
        }else{
            System.out.println("Given number x is Odd!!! "+x);
        }
    }

    void cube(int x){
        int y=x*x*x;
        System.out.println("Cube of the given number is :"+y);
    }
}
