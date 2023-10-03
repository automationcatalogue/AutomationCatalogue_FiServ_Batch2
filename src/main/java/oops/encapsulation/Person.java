package oops.encapsulation;

public class Person {
    private int age;

    void setAge(int x){
        if(x>=100){
            age=100;
        }else if(x<=0){
            age=0;
        }else{
            age=x;
        }
    }

    int getAge(){
        return age;
    }
}
