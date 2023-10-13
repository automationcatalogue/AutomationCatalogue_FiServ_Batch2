package JavaTeachings.fundamentals;

public class NonPrimeDemo {
    public static void main(String[] args) {
        int n=1;
        for(int nonPrimeCount=1;nonPrimeCount<=10;++n){

            int count=0;
            for(int i=1;i<=n;++i){
                if(n%i==0){
                    ++count;
                }
            }
            if(count>2){
                System.out.print(n+",");
                ++nonPrimeCount;
            }

        }
    }
}
