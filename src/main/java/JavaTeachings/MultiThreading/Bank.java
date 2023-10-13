package JavaTeachings.MultiThreading;

public class Bank {
    float balance =5000.00f;

    synchronized void withdraw(float amount) throws InterruptedException{
        System.out.println("Thread1 is started to withdraw");
        if(balance<amount){
            System.out.println("Waiting for a deposit");
            wait();
            System.out.println("Waiting is completed");
        }
        balance=balance-amount;
        System.out.println("Thread1 withdraw is completed");
    }

    synchronized void deposit(float amount){
        System.out.println("Thread2 is started to deposit");
        balance=balance+amount;
        System.out.println("Thread2 Deposit is completed");
        notify();
        System.out.println("Notification sent to Thread1");
    }
}
