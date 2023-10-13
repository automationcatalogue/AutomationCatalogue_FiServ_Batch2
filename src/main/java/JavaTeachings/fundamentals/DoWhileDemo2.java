package JavaTeachings.fundamentals;

public class DoWhileDemo2 {
    public static void main(String[] args) {
        int x=10;
        do{
            System.out.println("Hello World..!!!");
            if(x==30){
                x=90;
            }
            x=x+10;
        }while(x<=100);

        System.out.println("Loop programming..!!! and value of x is :"+x);
    }
}
