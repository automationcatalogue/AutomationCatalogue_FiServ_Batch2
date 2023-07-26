package oops.Inheritance;

public class A1 {

    int x=5;//instance variable

    void primeLogic(int n){
        int count=0;
        for(int i=1;i<n;++i){
            if(n%i==0){
                ++count;
            }
        }
        if(count==2){
            System.out.println("Given Number is Prime!!!");
        }else{
            System.out.println("Given Number is Not Prime!!!");
        }

    }
}
