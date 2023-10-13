package JavaTeachings.oops;

public class Test5 {
    int max (int a, int b){
        int max=0;
        if(a>b){
            max=a;
        }else {
            max=b;
        }
        return max;
    }

    public static void main(String[] args) {
        Test5 ob1 = new Test5();
        int q=ob1.max(10,4);
        System.out.println("Max value is :"+q);
    }
}
