package JavaTeachings.oops.Inheritance;

public class B extends A{//Sub class

    int y=20;//instance variable

    //instance method - method definition
    int factLogic(int x){
        int fact=1;
        for(int i=1;i>=x;++i){
            fact = fact*i;
        }
        return fact;
    }
}
