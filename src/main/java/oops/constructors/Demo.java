package oops.constructors;

public class Demo {
    int z=20;
    Demo(){//Default Constructor
        this(10);
        int x=10;
        if(x%2==0){
            System.out.println("Given number is Even!!!");
        }else{
            System.out.println("Given number is Odd!!!");
        }
    }

    public static void main(String[] args) {
        Demo ob1 = new Demo();
    }

    Demo(int x){//Parameterized constructor
        this(10, 20);
        int y=x * x * x;
        System.out.println("Cube of the given number is :"+y);
    }

    Demo(int x, int y){
        int z=x+y;
        System.out.println("Addition of x,y is  :"+z);
    }
}
