package JavaTeachings.MultiThreading;

public class Customer1 extends Thread{
    Bank b1;

    public Customer1(Bank ob1){
        b1=ob1;
    }

    public void run() {
        try {
            b1.withdraw(8000.00f);
        }catch (InterruptedException ie){

        }
    }
}
