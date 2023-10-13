package JavaTeachings.MultiThreading;

public class TDemo4 implements Runnable{
    public void run(){
        String empName[]={"Soniya","Mohan","Lipsa","Arun","Rajakumar","Sagar","Automation","Catalogue"};
        for(String s:empName){
            System.out.println("Child Thread Task Code :"+s);

            try{
                Thread.sleep(1000);
            }catch (InterruptedException ie){

            }

        }
    }

    public static void main(String[] args) throws InterruptedException{
        Runnable r = new TDemo4();
        Thread t = new Thread(r);
        t.start();

        Runnable r1 = new TDemo4();
        Thread t1 = new Thread(r1);
        t1.start();

        for(int i=1;i<=10;i++){
            System.out.println("Main Thread Task Code :"+i);
            Thread.sleep(1000);
        }
    }
}
