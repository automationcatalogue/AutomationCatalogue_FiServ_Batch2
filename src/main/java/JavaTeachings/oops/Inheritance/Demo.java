package JavaTeachings.oops.Inheritance;

public class Demo {
    final int x=10;
    //final int y;

    void cube(){
        final int x=5;
        int y = x * x* x;
        System.out.println("Cube of the given number is :"+y);
    }

    public static void main(String[] args) {
        Demo ob1 = new Demo();
        System.out.println(ob1.x);
       // ob1.x = ob1.x+10;
    }
}
