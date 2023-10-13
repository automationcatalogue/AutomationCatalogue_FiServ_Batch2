package JavaTeachings.MultiThreading;

public class TDemo3 extends Thread{
    public void run() {
        String empName[]={"Soniya","Mohan","Lipsa","Arun","Rajakumar","Sagar","Automation","Catalogue"};
        for(String s:empName){
            System.out.println("Child Thread Task Code :"+s);

            try{
                Thread.sleep(1000);
            }catch (InterruptedException ie){

            }

        }
    }

    public static void main(String[] args)  throws Exception{
        TDemo3 ob = new TDemo3();
        ob.start();

        for(int i=1;i<=10;i++){
            System.out.println("Main Thread task "+i);
            Thread.sleep(1000);

            if(i==5){
                ob.suspend();
            }

            if(i==10){
                ob.resume();
            }
        }
    }
}
