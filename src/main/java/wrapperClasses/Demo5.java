package wrapperClasses;

public class Demo5 {
    public static void main(String[] args) {

        try{
            int x=15, y=0;
            int z=x/y;
            System.out.println(z);
        }catch (ArithmeticException ob1){
            System.out.println("Please provide second number is other than zero");
        }


        String cities[]={"Hyderabad","Chennai","Bangalore","Pune"};
        System.out.println(cities[4]);
    }
}
