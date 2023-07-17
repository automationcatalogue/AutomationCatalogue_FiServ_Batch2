package oops;

public class MethodDemo1 {
    //instance method - method definition
    //method without return type and without arguments
    void cubeLogic(){
        int x=5;
        int y=x*x*x;
        System.out.println("Cube of the given number is :"+y);
    }
    public static void main(String[] args) {
        System.out.println("Hello India!!!");

        MethodDemo1 ob1 = new MethodDemo1();
        ob1.cubeLogic();//method call statement

        sumOfArray();

        ob1.cubeLogic();

    }

    //class method - method definition
    //method without return type and without arguments
    static void sumOfArray(){
        int a[]={4,7,9,2,5,7,3};
        int total =0;
        for(int b:a){
            total=total+b;
        }
        System.out.println("Sum of All number in given array is :"+total);
    }
}
