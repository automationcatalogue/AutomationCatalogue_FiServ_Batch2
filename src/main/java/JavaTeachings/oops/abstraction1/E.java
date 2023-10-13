package JavaTeachings.oops.abstraction1;

public class E implements A{
    public void show(){
        int x=5;
        int y=x*x*x;
        System.out.println("Cube of the given number is :"+y);
    }

    void print(){
        System.out.println("Python!!!");
    }
}
