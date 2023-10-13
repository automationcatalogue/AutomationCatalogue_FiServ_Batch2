package JavaTeachings.oops;

public class OOPSDemo3 {

    int a=100;//instance variable

    public static void main(String[] args) {
        int x=50;//local variable
        System.out.println(x);

        OOPSDemo3 ob1 = new OOPSDemo3();
        System.out.println(ob1.a);//by using object reference

        System.out.println(new OOPSDemo3().a);//by using Object

        System.gc();
    }
}
