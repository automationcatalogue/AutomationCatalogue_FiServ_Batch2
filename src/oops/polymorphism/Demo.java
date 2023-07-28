package oops.polymorphism;

public class Demo {
    //instance method - method definition
    void print(){
        System.out.println("Core Java");
    }

    void print(int x){
        System.out.println("Advanced Java");
    }

    void print(int x, int y){
        int z=x+y;
        System.out.println("Addition of x,y is :"+z);
    }

    void print(float x, float y){
        float z=x-y;
        System.out.println("Subtractions of x,y is :"+z);
    }

    void print(double x, double y){
        double z=x+y;
        System.out.println("Addition of x,y is :"+z);
    }

    public static void main(String[] args) {
        Demo ob = new Demo();
        ob.print(5.236,10.567);
    }
}
