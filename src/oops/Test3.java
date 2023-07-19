package oops;

public class Test3 {
    //instance method - method definition
    float factorialLogic(){
        int x=5;
        int fact=1;
        for(int i=x;i>0;--i){
            fact = fact*i;
        }
        return 34.78f;
    }

    public static void main(String[] args) {
        System.out.println("Core Java!!!");
        Test3 ob = new Test3();
        float x=ob.factorialLogic();
        System.out.println("Fact value!!! "+x);
    }
}
