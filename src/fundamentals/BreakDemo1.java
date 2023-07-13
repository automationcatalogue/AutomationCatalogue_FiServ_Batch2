package fundamentals;

public class BreakDemo1 {
    public static void main(String[] args) {
        for(int i=1;i<=3;++i){
            for(int j=1;j<10;++j){
                if(j>=4){
                    break;
                }
                System.out.println(j);
            }
        }
    }
}
