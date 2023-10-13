package JavaTeachings.fundamentals;

import JavaTeachings.Samples.Demo;

public class QA1 {
    public static void main(String[] args) {
        Demo ob1 = new Demo();
        System.out.println(ob1.a);

        System.out.println(Demo.b);

        ob1.show();

        Demo.display();
    }
}
