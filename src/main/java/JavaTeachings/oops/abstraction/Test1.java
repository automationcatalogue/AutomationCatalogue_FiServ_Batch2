package JavaTeachings.oops.abstraction;

public class Test1 implements Demo1{
    int y=10;
    public void show(){
        int x=5;
        int y=x*x*x;
        System.out.println("Cube of the given number is :"+y);
    }

    void display(){
        System.out.println("Advanced Java");
    }
}
