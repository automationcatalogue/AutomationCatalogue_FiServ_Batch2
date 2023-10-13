package JavaTeachings.innerclasses;

public class Test {
    public static void main(String[] args) {
        A ob1 = new A();
        System.out.println(ob1.x);
        ob1.show();

        A.B ob2 = ob1.new B();
        System.out.println(ob2.y);
        ob2.display();

        

    }
}
