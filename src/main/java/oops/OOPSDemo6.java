package oops;

public class OOPSDemo6 {
    static int a=99;

    public static void main(String[] args) {

        int b=100;//local variable
        System.out.println(b);

        System.out.println(a);//directly

        System.out.println(OOPSDemo6.a);//By using class name

        System.out.println(new OOPSDemo6().a);//By using Object

        OOPSDemo6 ob1 = new OOPSDemo6();
        System.out.println(ob1.a);//By using Object Reference
    }
}
