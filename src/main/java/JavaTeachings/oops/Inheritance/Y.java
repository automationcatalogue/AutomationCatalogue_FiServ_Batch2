package JavaTeachings.oops.Inheritance;

public class Y extends X{
    //Default Constructor
    Y(){
        //super();
        System.out.println("Advanced Java!!!");
    }

    //Parameterized Constructor
    Y(int a, int b){
        this();
        int c=a*b;
        System.out.println("Multiplication of a,b is :"+c);
    }
}
