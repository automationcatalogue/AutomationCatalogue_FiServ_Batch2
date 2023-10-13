package JavaTeachings.fundamentals;

public class NestedIfDemo {
    public static void main(String[] args) {
        int a=543;
        System.out.println("Hello India....!!!");
        boolean flag = a<=0;
        if(flag){
            System.out.println("Positive number");
            if(a%2==0){
                System.out.println("Even number");
            }
        }else if (a>=500){
            System.out.println("Negative number");
            if(a>=5000){
                System.out.println("Number which is greater than -50");
            }else{
                System.out.println("Number which is less than -50");
            }
        }
    }
}
