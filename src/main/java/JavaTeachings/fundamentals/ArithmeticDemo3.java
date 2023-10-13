package JavaTeachings.fundamentals;

public class ArithmeticDemo3 {
    public static void main(String[] args) {
        int x=50, y=70, z;
        z=x+y;
        System.out.println("Value of z is :"+z);//120
        x=90;
        y=10;
        z=z+y;
        System.out.println("Value of z is :"+z);//130

        x=x-y;//subtraction
        System.out.println("Value of x is :"+x);//80

        y=z*x;//multiplication
        System.out.println("value of is :"+y);//130*80=10400

        y=y/2;
        System.out.println("value of is :"+y);//5200

        x=19;
        y=3;
        x=x%y;
        System.out.println("outcome of the % is :"+x);//1

        System.out.println(53%10);//3
    }
}
