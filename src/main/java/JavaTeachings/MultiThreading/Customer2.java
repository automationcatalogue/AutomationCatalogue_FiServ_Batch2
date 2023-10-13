package JavaTeachings.MultiThreading;

public class Customer2 extends Thread{
    Bank b2;

    public Customer2(Bank ob2){
        b2=ob2;
    }

    public void run(){
        b2.deposit(5000.00f);
    }
}
