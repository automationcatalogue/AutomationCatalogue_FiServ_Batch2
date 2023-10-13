package JavaTeachings.java8Features;

public class Demo implements Interf{
    public void prime(){
        int x=11, count=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                ++count;
            }
        }
        if(count==2){
            System.out.println("Given number is Prime");
        }else{
            System.out.println("Given number is not Prime");
        }
    }

    void cube(){
        int x=5;
        int y=x*x*x;
        System.out.println("Cube is :"+y);
    }
}
