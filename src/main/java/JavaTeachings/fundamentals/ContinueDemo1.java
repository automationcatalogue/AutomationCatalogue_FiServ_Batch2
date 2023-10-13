package JavaTeachings.fundamentals;

public class ContinueDemo1 {
    public static void main(String[] args) {
        for(int i=1;i<=3;++i){
            for(int j=1;j<=10;j++){
                if(j>=3){
                    continue;
                }
                System.out.println(j);
            }
        }
    }
}
