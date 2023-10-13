package JavaTeachings.innerclasses;

public class Test1 {
    public static void main(String[] args) {
        X ob1 = new X();
        System.out.println(ob1.a);
        ob1.show();
        System.out.println(X.b);
        X.display();

        X.Y ob2 = new X.Y();
        System.out.println(ob2.c);
        ob2.print();

        X.Y.test();
        System.out.println(X.Y.d);
    }
}
