package JavaTeachings.fundamentals;

public class BreakContinueDemo {
    public static void main(String[] args) {
        for(int i=1;i<=10;++i){
            if(i<5)
                continue;

            if(i>5)
                break;

            System.out.println(i);
        }
    }
}
