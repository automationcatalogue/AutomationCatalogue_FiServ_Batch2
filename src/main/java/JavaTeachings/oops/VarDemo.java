package JavaTeachings.oops;

public class VarDemo {
    int x=5;//instance variable
    static int y=10;//class variable

    public static void main(String[] args) {
        VarDemo ob1 = new VarDemo();
        VarDemo ob2 = new VarDemo();

        ob1.x = ob1.x+2;
        ob1.y = ob1.y+2;

        System.out.println(ob1.x);
        System.out.println(ob1.y);
        System.out.println(ob2.x);
        System.out.println(ob2.y);
    }
}
