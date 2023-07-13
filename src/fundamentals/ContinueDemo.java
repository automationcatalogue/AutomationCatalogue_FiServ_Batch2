package fundamentals;

public class ContinueDemo {
    public static void main(String[] args) {

        ContinueDemo ob1 = new ContinueDemo();

        for(int i=1;i<=10;++i){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
