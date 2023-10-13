package JavaTeachings.oops;

public class Test6 {
    int sumArrays(int a[]){
        int total=0;
        for(int b:a){
            total = total+b;
        }
        return total;
    }

    public static void main(String[] args) {
        int a[]={2,4,3,6,11,21};
        Test6 ob1 = new Test6();
        int sum= ob1.sumArrays(a);
        ob1.evenOdd(sum);
    }

    void evenOdd(int s){
        Test6 ob2 = new Test6();
        if(s%2==0){
            ob2.cube(s);
        }else{
            ob2.prime(s);
        }
    }

    void cube(int d){
        int e=d*d*d;
        System.out.println("Cube of the given number is :"+e);
    }

    void prime(int x){
        int count=0;
        for(int i=1;i<=x;++i){
            if(x%i==0){
                ++count;
            }
        }
        if(count==2){
            System.out.println("Given number is Prime!!!");
        }else{
            System.out.println("Given number is Not Prime!!!");
        }
    }
}
