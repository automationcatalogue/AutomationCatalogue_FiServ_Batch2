package JavaTeachings.oops;

public class MethodDemo2 {
    //instance method - method definition
    //method without return type and with arguments
    void evenOdd(int x){
        if(x%2==0){
            System.out.println("Given number is Even!!!");
        }else{
            System.out.println("Given number is Odd!!!");
        }
    }

    //class method - method definition
    //method without return type and with arguments
    static void addSum(int x, float y, char z){
        float total =x+y+z;
        System.out.println("Total of 3 number is "+total);
    }
}
