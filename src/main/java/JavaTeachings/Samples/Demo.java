package JavaTeachings.Samples;

public class Demo {
    public int a=10;//instance variable
    public static int b=20;//class variable

    public void show(){//instance method
        System.out.println("Core Java!!!");
    }

    public static void display(){//class method
        System.out.println("Advanced Java!!!");
    }

    public static void main(String[] args) {
        Demo ob1 = new Demo();
        System.out.println(ob1.a);

        System.out.println(Demo.b);

        ob1.show();

        Demo.display();
    }

}
