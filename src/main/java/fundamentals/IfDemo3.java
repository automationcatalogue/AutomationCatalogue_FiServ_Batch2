package fundamentals;

public class IfDemo3 {
    public static void main(String[] args) {
        int x=40, a,b;
        char ch='A';//65

        int z=(x<ch)?ch:x;//65
        System.out.println("Before If condition, value of z is :"+z);//65
        boolean flag =z>=50 && x>=0;
        if(flag){
            a=10;
            b=20;
            z=a+b;
            System.out.println("Addition of the a,b is :"+z);//30
        }

        System.out.println("Final Value of z is :"+z);//30
    }
}
