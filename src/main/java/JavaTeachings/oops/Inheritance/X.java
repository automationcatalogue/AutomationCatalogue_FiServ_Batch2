package JavaTeachings.oops.Inheritance;

public class X {
    //Default Constructor
    X(){
        this(10,20);
        System.out.println("Core Java!!!");
    }

    //Parameterized Constructor
    X(int a, int b){
        int c=a+b;
        System.out.println("Addition of a,b is :"+c);
    }
}
