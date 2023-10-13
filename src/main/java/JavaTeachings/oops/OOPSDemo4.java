package JavaTeachings.oops;

public class OOPSDemo4 {
    int x=10;//instance variable

    public static void main(String[] args) {
        OOPSDemo4 ob1 = new OOPSDemo4();
        int y = ob1.x * ob1.x * ob1.x;
        System.out.println("Cube of the given number is :"+y);
    }
}
