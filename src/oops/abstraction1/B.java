package oops.abstraction1;

public class B implements A{

    public void show(){
        int x=10;
        if(x%2==0){
            System.out.println("Given number is Even!!!");
        }else{
            System.out.println("Given number is Odd!!!");
        }
    }

    void print(){
        System.out.println("Core Java!!!");
    }
}
