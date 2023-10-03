package exceptionHandling;

public class Demo3 {

    public void cube(int a) throws NegativeNumberException{
        if(a>=0){
            int b=a*a*a;
            System.out.println("Cube of the number is :"+b);
        }else{
            throw new NegativeNumberException();
        }
    }

    public static void main(String[] args){
        Demo3 ob = new Demo3();
        ob.cube(5);
    }
}
