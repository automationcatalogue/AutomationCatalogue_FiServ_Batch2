package JavaTeachings.oops;

public class Test4 {
    static int sumArrays(){
        int a[]={3,8,2,5,7,4};
        int total =0;
        for(int b:a){
            total=total+b;
        }
        return total;
    }

    public static void main(String[] args) {
        Test4.sumArrays();

    }
}
