package JavaTeachings.oops;

public class Demo {
    int x=5;

    public static void main(String[] args) {
        Demo ob1 = new Demo();
        Demo ob2 = new Demo();
        ob1.x = ob1.x+2;
        ob1.show();
        ob2.show();
    }

    void show(){
        System.out.println(x);
    }
}
