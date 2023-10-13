package JavaTeachings.oops.Inheritance;

public class B2 extends A2{
    int y=20;
    int test=200;

    public static void main(String[] args) {
        B2 ob = new B2();
        ob.show();
    }

    void show(){
        System.out.println(this.y);
        System.out.println(this.x);
        System.out.println(this.test);
        System.out.println(super.test);
    }
}
