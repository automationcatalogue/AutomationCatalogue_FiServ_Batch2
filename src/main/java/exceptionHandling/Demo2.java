package exceptionHandling;

import java.io.FileInputStream;

public class Demo2 {
    String s1="100";
    String s2="0";

    public static void main(String[] args) {
        Demo2 ob = new Demo2();

        try{
            int x = Integer.parseInt(ob.s1);
            int y = Integer.parseInt(ob.s2);
            int z=x/y;
            System.out.println("Z value is :"+z);
        } catch (NumberFormatException ob2){
            System.out.println("NumberFormat exception is occurred");
            ob.s1 = ob.s1.substring(1);
            ob.s2 = ob.s2.substring(1);

            int x = Integer.parseInt(ob.s1);
            int y = Integer.parseInt(ob.s2);
            int z=x/y;
            System.out.println("Z value is :"+z);

        }catch (ArithmeticException ob3){
            System.out.println("Arithmetic exception is occurred, please use default value of y is 2");
            int x = Integer.parseInt(ob.s1);
            int y=2;
            int z=x/y;
            System.out.println("Z value is :"+z);
        }catch (Exception ob4){
            System.out.println("Hello World");
        }

    }
}
