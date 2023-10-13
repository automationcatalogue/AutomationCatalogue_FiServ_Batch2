package JavaTeachings.oops.abstraction1;

public class C implements A{
    public void show(){
        int count=0, x=11;
        for(int i=0;i<=x;i++){
            if(x%i==0){
                ++count;
            }
        }
        if(count==2){
            System.out.println("Given number is Prime!!!");
        }else{
            System.out.println("Given number is not Prime!!!");
        }
    }

    void print(){
        System.out.println("Advanced Java!!!");
    }
}
