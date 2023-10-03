package oops.Inheritance;

public class B1 extends A1{
    int y=10;//instance variable

    int factLogic(int x){
        int fact=1;
        for(int i=1;i>=x;++i){
            fact = fact*i;
        }
        return fact;
    }
}
