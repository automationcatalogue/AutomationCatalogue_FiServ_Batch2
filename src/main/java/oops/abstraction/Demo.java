package oops.abstraction;

abstract public class Demo {

    //Non-abstract method
    void cube(int x){
        int y=x*x*x;
        System.out.println("Cube of the given number is :"+y);
    }

    //abstract method
    abstract void show();
}
