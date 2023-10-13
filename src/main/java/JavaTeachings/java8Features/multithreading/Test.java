package JavaTeachings.java8Features.multithreading;

public class Test {
    public static void main(String[] args) throws Exception{
        Runnable r = ()->{
            for(int i=0;i<10;++i){
                System.out.println("Child Thread "+i);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ie){

                }
            }
        };

        Thread t = new Thread(r);
        t.start();

        for(int i=0;i<10;++i){
            System.out.println("Main Thread :"+i);
            Thread.sleep(1000);
        }
    }
}
