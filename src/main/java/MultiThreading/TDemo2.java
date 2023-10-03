package MultiThreading;

public class TDemo2 extends Thread{

    public void run(){
        Thread t = Thread.currentThread();
        t.setPriority(MAX_PRIORITY);
        String empName[]={"Soniya","Mohan","Lipsa","Arun","Rajakumar"};
        for(String s:empName){
            System.out.println("Child Thread Task Code :"+s);
        }
    }

    public static void main(String[] args) {
        TDemo2 ob = new TDemo2();
        ob.start();
        Thread t = Thread.currentThread();
        t.setPriority(MIN_PRIORITY);
        for(int i=1;i<=1000;++i){
            System.out.println("Main Thread Task Code :"+i);
        }
    }

}
