package JavaTeachings.fundamentals;

public class WhileDemo2 {
    public static void main(String[] args) {
        int i=1;
        while(i<=20){
            if(i<=5){
                i=i+10;
                System.out.println("Core Java and i value is :"+i);
            }else{
                System.out.println("Advanced Java and i value is :"+i);
            }
            i=i+3;
        }
        System.out.println("Final Value is of i is :"+i);
    }
}
